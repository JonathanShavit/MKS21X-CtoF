// both should have a double(the temperature) as a parameter. they should also both be type double, since they need to return another double(also temperature)

public class CtoFTester{
  public static void main(String[] args){
    System.out.println(CtoF(-40.0));
    System.out.println(CtoF(37.0));
    System.out.println();
    System.out.println(FtoC(-40.0));
    System.out.println(FtoC(98.6));
  }

  public static double CtoF(double c){
    return c * 9.0 / 5.0 + 32;
  }

  public static double FtoC(double f){
    return (f - 32) * 5.0 / 9.0;
  }
}
