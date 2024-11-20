package com.neoteric.Exception;

public enum PaymentStatus {

    FAILED("12","Transaction is Failed"),
    INSUFFICIENT_BALANCE("12","Transaction is Success");

    private String label;
    private String code;

    PaymentStatus(String label, String code) {
        this.label = label;
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return  code;
    }
}
