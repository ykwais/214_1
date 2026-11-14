package lab3.singleton;

public class LocalMain {
  public static void main(String[] args){

    Service service = Service.getInstance();

    service.action();

  }

}
