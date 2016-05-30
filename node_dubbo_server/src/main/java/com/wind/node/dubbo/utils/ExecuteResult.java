package com.wind.node.dubbo.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: hacker
 * Date: 5/30/16
 * Time: 3:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExecuteResult<T> implements Serializable {
    private static final long serialVersionUID = 7365417829056921958L;
    private T result;
    private String successMessage;
    private List<String> errorMessages = new ArrayList();
    private Map<String, String> fieldErrors = new HashMap();
    private List<String> warningMessages = new ArrayList();

    public ExecuteResult() {
    }

    public String getSuccessMessage() {
        return this.successMessage;
    }

    public void setSuccessMessage(String successMessage) {
        this.successMessage = successMessage;
    }

    public boolean isSuccess() {
        return this.errorMessages.isEmpty() && this.fieldErrors.isEmpty();
    }

    public T getResult() {
        return this.result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public void setErrorMessages(List<String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public Map<String, String> getFieldErrors() {
        return this.fieldErrors;
    }

    public void setFieldErrors(Map<String, String> fieldErrors) {
        this.fieldErrors = fieldErrors;
    }

    public List<String> getWarningMessages() {
        return this.warningMessages;
    }

    public void setWarningMessages(List<String> warningMessages) {
        this.warningMessages = warningMessages;
    }

    public void addErrorMessage(String errorMessage) {
        this.errorMessages.add(errorMessage);
    }

    public void addFieldError(String field, String errorMessage) {
        this.fieldErrors.put(field, errorMessage);
    }

    public void addWarningMessage(String warningMessage) {
        this.warningMessages.add(warningMessage);
    }
}