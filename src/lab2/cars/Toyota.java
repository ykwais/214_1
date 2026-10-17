package lab2.cars;

import java.util.Objects;

public class Toyota implements JapanCar {

  private int mileage;
  private String color;
  private int litreage;

  public Toyota(int mileage, String color, int litreage){
    this.litreage = litreage;
    this.color = color;
    this.mileage = mileage;
  }

  public Toyota(String color){
    this.color = color;
  }

  public Toyota(){
    this.litreage = 55;
    this.color = "orange";
    this.mileage = 90;
  }

  public int getMileage(){
    return this.mileage;
  }

  public void setMileage(int newMileage){
    this.mileage = newMileage;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public int getLitreage() {
    return litreage;
  }

  public void setLitreage(int litreage) {
    this.litreage = litreage;
  }

  public int drive100(){
    this.mileage += 100;
    return this.mileage;
  }

  public int drive100(int addedMiles){
    this.mileage += addedMiles;
    return this.mileage;
  }

  public String drive100(double miles){
    this.mileage += 100;
    return "drive 100 miles";
  }

  @Override
  public String toString(){
    return "Toyota{mileage=" + this.mileage
           +", color="+ this.color
    + ", litrage=" + this.litreage + "}";

  }

  @Override
  public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || this.getClass() != o.getClass()) return false;
    Toyota oth = (Toyota) o;
    return this.mileage == oth.getMileage()
        && this.litreage == oth.getLitreage()
        && Objects.equals(this.color, oth.getColor());
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.litreage, this.mileage, this.color);
  }


  @Override
  public void drive(){
    System.out.println("start engine");
    System.out.println(soundOfMotor());
    System.out.println("success drived");
  }

  @Override
  public String soundOfMotor(){
    return "ratatatatta";
  }



}
