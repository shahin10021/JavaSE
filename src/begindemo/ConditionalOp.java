
package begindemo;
import java.util.Scanner;
public class ConditionalOp {
    public static void main(String[] args) {
        
    
Scanner input= new Scanner(System.in);    
int num1, num2, result;
        System.out.println("Enter the value");
        
        num1=input.nextInt();
        num2=input.nextInt();
        
        result=(num1>num2)? num1: num2 ;
        System.out.println("Showed the number"+result);





    }

}
