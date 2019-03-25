package com.james;

import java.util.ArrayList;
import java.util.List;

public class ReportTester {
    public static void main(String[] args) {
        Report financeReport = new FinanceReport();//父類別可參照子類別物件
        Report healthReport = new HealthReport();//父類別可參照子類別物件
        List<Report> reports = new ArrayList<>();//父類別可參照子類別物件
        reports.add(financeReport);
        reports.add(healthReport);

        for (Report report : reports) {
            report.load();
            report.print();
        }
    }
}
