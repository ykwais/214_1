package lab3.fabric_method;


import lab3.fabric_method.impls.Truck;

public abstract class Logistics {

  public Transport getTransport(){
    return new Truck();
  }

  public void planDelivery(){

    System.out.println("оформили заказ");
    System.out.println("отправили в СЦ");
    System.out.println("передали в доставку");
    Transport transport = getTransport();
    transport.delivery();
    System.out.println("оставьте отзыв");


  }

}
