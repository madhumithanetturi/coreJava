package com.neoteric.InterfaceAndAbstract;

public class PDFExportAccountSummary implements ExportAccountSummaryService {

    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println(" export to pdf is done ");
        return " Date exported to pdf is done ";
    }
}
