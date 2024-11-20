package com.neoteric.CombOfAbstractInterfaceAndException;

public class Beneficiary {

    private String account;

    private  String ifcCode;

    private Double limit;

    private String status;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIfcCode() {
        return ifcCode;
    }

    public void setIfcCode(String ifcCode) {
        this.ifcCode = ifcCode;
    }

    public Double getLimit() {
        return limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
