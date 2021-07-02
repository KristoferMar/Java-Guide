package com.appdev.cic.RestAPI.model;

import java.io.Serializable;

public class SKATErrorResponse implements Serializable {

    private Object meta;
    private Object[] errors;

    public SKATErrorResponse(Object meta, Object[] skatErrors) {
        this.meta = meta;
        this.errors = skatErrors;
    }


    public Object getMeta() {
        return meta;
    }

    public void setMeta(Object meta) {
        this.meta = meta;
    }

    public Object[] getErrors() {
        return errors;
    }

    public void setErrors(Object[] errors) {
        this.errors = errors;
    }
}
