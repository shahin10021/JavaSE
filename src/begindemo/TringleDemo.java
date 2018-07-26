
package begindemo;
import java.util.Scanner;
public class TringleDemo {

public static void main (String [] args){
    Scanner input= new Scanner (System.in);
    
    
    
    double base, height, area;
    System.out.println("Enter the value");
    
    
    base=input.nextDouble();
    System.out.println("Enter Base "+base);
    
    height=input.nextDouble();
    System.out.println("Enter Height"+height);
    
    area = 0.5* base * height;
    System.out.println("Tringle total "+area);
    
}    
    
        
    
}
