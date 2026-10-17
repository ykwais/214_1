package lab2.cars;

public class Subaru extends Toyota {

  private boolean isApposite;

  public Subaru(int mileage, String color, int litreage, boolean isApposite){
    super(mileage, color, litreage);
    this.isApposite = isApposite;
  }

  public boolean isApposite(){
    return this.isApposite;
  }

  @Override
  public String toString(){
    return "Subaru{mileage=" + getMileage()
           +", color="+ getColor()
           + ", litrage=" + getLitreage() +
            ", apposite=" + this.isApposite +
           "}";

  }


  @Override
  public String soundOfMotor(){
    return "mimimimiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiuuu";
  }

}
