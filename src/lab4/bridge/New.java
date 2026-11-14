package lab4.bridge;

import javax.swing.RootPaneContainer;

public class New {

  interface Format{
    String getName();
  }

  static class PdfFormat implements Format{

    @Override
    public String getName() {
      return "формат PDF";
    }
  }

  static class XlsxFormat implements Format{

    @Override
    public String getName() {
      return "формат EXCEL";
    }
  }

  static class HtmlFormat implements Format{

    @Override
    public String getName() {
      return "формат HTML";
    }
  }



  static abstract class Report{

    private final Format format;

    public Report(Format format){
      this.format = format;
    }

    public abstract String getReportName();

    void exportReport() {
      System.out.println("отчет по " + getReportName() +  " выдан в " + format.getName());
    }
  }

  static class SaleReport extends Report{

    public SaleReport(Format format){
      super(format);
    }

    @Override
    public String getReportName() {
      return "отчет по продажам";
    }
  }

  static class WarehouseReport extends Report{

    public WarehouseReport(Format format){
      super(format);
    }

    @Override
    public String getReportName() {
      return "отчет по складам";
    }
  }

  public static void main(String[] args){
    SaleReport saleReport = new SaleReport(new HtmlFormat());
    saleReport.exportReport();
  }

}
