package lab4.bridge;

public class Old {

  static abstract class Report{
    abstract void exportReport();
  }

  static class SaleReportXlsx extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по продажам выдан в EXCEL");
    }
  }

  static class SaleReportHtml extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по продажам выдан в HTML");
    }
  }

  static class SaleReportPdf extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по продажам выдан в PDF");
    }
  }

  static class WarehouseReportXlsx extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по складам выдан в EXCEL");
    }
  }

  static class WarehouseReportHtml extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по складам выдан в HTML");
    }
  }

  static class WarehouseReportPdf extends Report{

    @Override
    void exportReport() {
      System.out.println("отчет по складам выдан в PDF");
    }
  }


  public static void main(String[] args){
    WarehouseReportPdf wPdf = new WarehouseReportPdf();
    wPdf.exportReport();
  }



}
