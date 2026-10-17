package lab2;

import lab2.cars.JapanCar;
import lab2.cars.Subaru;
import lab2.cars.Toyota;

public class Lab2 {
  public static void main(String[] args){

    Toyota t3 = new Toyota("yellow");
    System.out.println(t3);

    Toyota t4 = new Toyota("yellow");
    System.out.println(t4);
    if(t3.equals(t4)) {
      System.out.println("equals");
    } else {
      System.out.println("not equals");
    }

    System.out.println(t4.getClass());

    Subaru sub1 = new Subaru(789, "blue", 65, true);
    System.out.println(sub1.toString());

    t4.drive();

    sub1.drive();


    Toyota fromSubaru = (Toyota) sub1;

    fromSubaru.drive();


    JapanCar car = new Toyota();

    car.drive();

  }

}
