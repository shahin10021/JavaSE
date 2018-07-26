
package begindemo;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CapitalSmall {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
   char ch;
        System.out.println("Enter the Value");
   
        try {
            
            ch = (char) System.in.read();
            if('a' <= ch && ch<= 'z') {
            System.out.println ("small");
            }
            else if('A' <= ch && ch<= 'Z'){
                System.out.println("capital");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(CapitalSmall.class.getName()).log(Level.SEVERE, null, ex);
            
        }
   
       {
         
        
            
        
           }
           
   
    }
}
