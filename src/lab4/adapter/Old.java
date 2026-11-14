package lab4.adapter;


public class Old {

  static class LegacyPrinter{
    public void print(String[] args){

      for(String arg : args){
        System.out.println("legacy printer printed: " + arg);
      }
    }
  }


  static class ReportService{

    private final LegacyPrinter printer;

    public ReportService(LegacyPrinter legacyPrinter){
      this.printer = legacyPrinter;
    }

    public void exportReport(String[] docs){

      System.out.println(" --- starting export report --- ");
      printer.print(docs);
      System.out.println(" --- ended to export report --- ");

    }
  }

  public static void main(String[] args){
    ReportService service = new ReportService(new LegacyPrinter());
    service.exportReport(new String[]{"file1.txt", "file2.txt", "file3.txt", "report_final.xlsx"});
  }



}
