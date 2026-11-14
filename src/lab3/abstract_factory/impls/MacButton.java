package lab3.abstract_factory.impls;

import lab3.abstract_factory.inters.Button;

public class MacButton implements Button {

  @Override
  public void onClick() {
    System.out.println("Вы нажали кнопку на МАКЕ");
  }
}
