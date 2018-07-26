
package begindemo;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        System.out.println("Enter the Charecter");
        ch=input.next().charAt(0);
        if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("Its Vowel");    
        }
        else{
            System.out.println("Its Consonant");
        }
    }}
        
        
        
        
  
    
    

