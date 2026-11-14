package lab3.fabric_method;

import lab3.fabric_method.impls.Board;

public class SeaLogistics extends Logistics{

  @Override
  public Transport getTransport() {
    return new Board();
  }
}
