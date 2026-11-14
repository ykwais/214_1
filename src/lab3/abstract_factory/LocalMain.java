package lab3.abstract_factory;

import lab3.abstract_factory.impls.MacGui;
import lab3.abstract_factory.impls.WinGui;
import lab3.abstract_factory.inters.GUI;

public class LocalMain {

  private static String os = System.getProperty("os.name");

  public static GUI getGui(){
    return switch (os){
      case "Windows 11" -> new WinGui();
      case "macOS 27.0" -> new MacGui();
      default -> throw new UnsupportedOperationException("пока не поддерживаем другие ОС");
    };
  }

  public static void main(String[] args){
    Application app = new Application(getGui());
    app.run();
  }

}
