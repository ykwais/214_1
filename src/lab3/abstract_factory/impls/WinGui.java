package lab3.abstract_factory.impls;

import lab3.abstract_factory.inters.Button;
import lab3.abstract_factory.inters.GUI;
import lab3.abstract_factory.inters.Widget;

public class WinGui implements GUI {

  @Override
  public Button getButton() {
    return new WinButton();
  }

  @Override
  public Widget getWidget() {
    return new WinWidget();
  }
}
