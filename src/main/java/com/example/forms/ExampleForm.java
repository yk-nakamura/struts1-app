package com.example.forms;

import org.apache.struts.action.ActionForm;

public class ExampleForm extends ActionForm {
    private String exampleField;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExampleField() {
        return exampleField;
    }

    public void setExampleField(String exampleField) {
        this.exampleField = exampleField;
    }
}