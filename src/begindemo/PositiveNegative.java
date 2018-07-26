
package begindemo;
import java.util.Scanner;
public class PositiveNegative {
public static void main (String []args){
    Scanner input= new Scanner (System.in);
    int num;
    System.out.println("Enter the No");
    num=input.nextInt();
    
    
    if(num >0){
        System.out.println("positive value");
        
    }
    else if(num<0){
        System.out.println("Negative value");
    }
    
}

    
}
