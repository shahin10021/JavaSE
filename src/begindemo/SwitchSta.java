
package begindemo;
import java.util.Scanner;
public class SwitchSta {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int year;
        System.out.println("Enter the value");
        year=input.nextInt();
        switch (year) {      
            case 11:
                System.out.println("care 11");
                break;
            case 12:
                System.out.println("case 12");
                break;
            case 15:
                System.out.println("case 15");
                break;
            default:
                System.out.println("other");
    }
}
}
