package lab3.singleton;

public class Service {

  private static final Service INSTANCE = new Service();

  private Service(){}

  public static Service getInstance(){
    return INSTANCE;
  }

  public void action(){
    System.out.println("print smth");
  }

}
