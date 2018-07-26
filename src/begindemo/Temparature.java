
package begindemo;
 import java.util.Scanner;
public class Temparature {
    /*public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double farn,cels;
        System.out.println("enter the value");
    
    farn=input.nextDouble();
    System.out.println("faren hight value ="+farn);
        
    
    cels=1.8*farn-32;
        System.out.println("farnheight value to cels convart"+cels);
    }*/
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double cels,farn;
        System.out.println("Enter the value =");
        
        
        cels=input.nextDouble();
        System.out.println("its cels value =");
        
        farn=1.8*cels+32;
        System.out.println("convert to fahrenheit ="+farn);
    }
}
