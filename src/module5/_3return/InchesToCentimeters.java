package module5._3return;

public class InchesToCentimeters 
{
  public static void inchesToCentimeters(double inches)
      {
          double centimeters = inches * 2.54;
          System.out.println(centimeters);
      }

      public static void main(String[] args)  
      {
          inchesToCentimeters(10);
          inchesToCentimeters(12.5);
      }
}
