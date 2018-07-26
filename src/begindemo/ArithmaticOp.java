
package begindemo;
import java.util.Scanner;
public class ArithmaticOp {
    public static void main (String []args){
    
        
       Scanner input= new Scanner(System.in);
       int abc, abc1, result;
       
       System.out.println("Enter the first number");
       abc=input.nextInt();
       System.out.println("Enter the Second number");
       abc1=input.nextInt();
       
       result= abc+abc1;
       System.out.println("Addition= "+result);
       
       result= abc-abc1;
       System.out.println("Enter the Substraction= "+result);
       
       double result2 = (double) abc / abc1;
       System.out.println("Enter the Division= "+result2);
       
       result= abc*abc1;
       System.out.println("Enter the Multiplication= "+ result);
       
       double result3= (double)abc%abc1;
       System.out.println("Enter the Modul= "+result3);
       
       
    }
    
}
