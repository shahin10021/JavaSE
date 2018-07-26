
package begindemo;
import java.util.Scanner;
public class Operator {
    public static void main (String []args){
        
        
        Scanner input= new Scanner(System.in);
        
        int num1, num2, result;
        
        System.out.println("Enter the First Number");
        num1=input.nextInt();
        System.out.println("Enter the Second Number");
        num2=input.nextInt();
        
        result = num1+num2;
        System.out.println("addition= " +result);
        
        result = num1-num2;
        System.out.println("Substraction= "+result);
        
        result = num1*num2;
        System.out.println("Multiplication= "+result);
        
        result = num1/num2;
        System.out.println("Division= "+result);
        
        result = num1%num2;
        System.out.println("module= "+result);
        
        
        
        
        
        
    }
    
}
