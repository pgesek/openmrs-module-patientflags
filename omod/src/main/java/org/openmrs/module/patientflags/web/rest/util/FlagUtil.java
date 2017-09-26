package org.openmrs.module.patientflags.web.rest.util;

import java.util.ArrayList;
import java.util.List;

import org.openmrs.Patient;
import org.openmrs.module.patientflags.web.rest.wrapper.FlagBean;
import org.openmrs.module.patientflags.web.rest.wrapper.PatientBean;
import org.openmrs.module.patientflags.Flag;

/**
 * @author Stélio Moiane
 *
 */
public class FlagUtil {

    public static PatientBean patientConverter(final Patient patient) {

        final PatientBean patientBean = new PatientBean(patient.getUuid(),
                patient.getGivenName() + "  " + patient.getMiddleName() + " " + patient.getFamilyName());

        patientBean.setId(patient.getId());

        return patientBean;
    }

    public static List<FlagBean> flagsConverter(final List<Flag> flags) {

        final List<FlagBean> flagsBean = new ArrayList<FlagBean>();

        for (final Flag flag : flags) {
            flagsBean.add(new FlagBean(flag.getName(), flag.getMessage()));
        }

        return flagsBean;
    }
}
