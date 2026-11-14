package lab3.fabric_method;

import lab3.fabric_method.impls.Plane;

public class AirLogistics extends Logistics{

  @Override
  public Transport getTransport() {
    return new Plane();
  }
}
