package lab3.abstract_factory;

import lab3.abstract_factory.inters.Button;
import lab3.abstract_factory.inters.GUI;
import lab3.abstract_factory.inters.Widget;

public class Application {

  private Button button;
  private Widget widget;

  public Application(GUI gui){
    this.widget = gui.getWidget();
    this.button = gui.getButton();
  }

  public void run(){
    System.out.println("starting");
    System.out.println("нажмите кнопку");
    button.onClick();
    widget.action();
    System.out.println("bye-bye");
  }

}
