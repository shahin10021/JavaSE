package begindemo;
import java.util.Scanner;
public class RadiusDemo {
public static void main (String []args){
    
    Scanner input= new Scanner(System.in);
    double radius, area;
    
    System.out.println("Enter the value");
    radius=input.nextDouble();
    
    
    area= 3.1416* radius* radius;
    System.out.println("area ="+area);
    
}    
}
