
package begindemo;
import java.util.Scanner;
public class PassFailed {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int num;
        System.out.println("Enter the value");
        num=input.nextInt();
        
        
     if (num>=30 && num<=100){
         System.out.println("Pass");
         
     }
     else{
         System.out.println("Failed");
     }
     
    
    
    
    }
    
}
