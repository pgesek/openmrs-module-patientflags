package org.openmrs.module.patientflags.web.rest.wrapper;

import java.io.Serializable;

/**
 * @author Stélio Moiane
 *
 */
public class FlagBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private String message;

    public FlagBean(final String name, final String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return this.name;
    }

    public String getMessage() {
        return this.message;
    }
}
