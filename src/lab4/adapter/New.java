package lab4.adapter;

public class New {

  interface Printer{
    void print(String[] docs);
    void printWithEmail(String[] docs, String email);
  }

  static class LegacyPrinter{
    public void print(String[] args){

      for(String arg : args){
        System.out.println("legacy printer printed: " + arg);
      }
    }
  }

  static class LegacyPrinterAdapter implements Printer{

    private final LegacyPrinter legacyPrinter;

    public LegacyPrinterAdapter(LegacyPrinter legacyPrinter){
      this.legacyPrinter = legacyPrinter;
    }


    @Override
    public void print(String[] docs) {
      System.out.println("-- job adapter --");
      legacyPrinter.print(docs);
      System.out.println("-- finish job --");
    }

    @Override
    public void printWithEmail(String[] docs, String email) {
      System.out.println("-- job adapter --");
      legacyPrinter.print(docs);
      sendEmail(email);
      System.out.println("-- finish job --");
    }

    private void sendEmail(String email){
      //senderService.send(email)
    }
  }


  static class ReportService{

    private final Printer printer;

    public ReportService(Printer printer){
      this.printer = printer;
    }

    public void exportReport(String[] docs){

      System.out.println(" --- starting export report --- ");
      printer.printWithEmail(docs, "af@gmail.com");
      System.out.println(" --- ended to export report --- ");

    }
  }

  public static void main(String[] args){
    ReportService service = new ReportService(new LegacyPrinterAdapter(new LegacyPrinter()));
    service.exportReport(new String[]{"file1.txt", "file2.txt", "file3.txt", "report_final.xlsx"});
  }





}
