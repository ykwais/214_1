package lab3.abstract_factory.impls;

import lab3.abstract_factory.inters.Widget;

public class MacWidget implements Widget {

  @Override
  public void action() {
    System.out.println("вызов виджета МАКА");
  }
}
