package com.neoteric.InterfaceAndAbstract;

public class InterfaceTest {

    public static void main(String[] args){


        ExportAccountSummaryService excelExportAccountSummary = new ExcelExportAccountSummary();

        excelExportAccountSummary.export(new AccountSummary());

        ExportAccountSummaryService pdfExportAccountSummary = new PDFExportAccountSummary();

        pdfExportAccountSummary.export(new AccountSummary());
    }
}
