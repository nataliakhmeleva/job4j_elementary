package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report = new JSONReport();
        HtmlReport report1 = new HtmlReport();
        String text = report.generate("name", "body");
        System.out.println(text);
        String text1 = report1.generate("Report's name", "Report's body");
        System.out.println(text1);
    }

}
