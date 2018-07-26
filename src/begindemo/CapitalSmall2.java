
package begindemo;
import java.util.Scanner;
public class CapitalSmall2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    char ch;
        System.out.println("Enter the Value");
        
        
        ch = input.next().charAt(0);
        
        if (ch >='a' && ch <='z'){
            System.out.println("Small");
        } 
        else if (ch>='A' && ch<= 'Z'){
            System.out.println("Capital");
        }
    
    
    
    }
    
}
