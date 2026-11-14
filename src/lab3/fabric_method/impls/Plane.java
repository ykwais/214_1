package lab3.fabric_method.impls;

import lab3.fabric_method.Transport;

public class Plane implements Transport {

  @Override
  public void delivery() {
    System.out.println("доставка выполнена с помощью " + this.getClass().getSimpleName());
  }
}
