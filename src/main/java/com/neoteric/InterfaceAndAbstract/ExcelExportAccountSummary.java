package com.neoteric.InterfaceAndAbstract;

public class ExcelExportAccountSummary implements ExportAccountSummaryService {


    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println(" Export to excel is done ");
        return "Date exported to excel is done ";
    }
    public void test(){

    }




}
