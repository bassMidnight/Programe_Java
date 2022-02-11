import java.security.Principal;
import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

import javax.print.event.PrintEvent;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 ;

        System.out.print("Enter Num1 : ");
        num1 = sc.nextDouble();

        /*
        System.out.println("Enter Num2 : ");
        num2 = sc.nextDouble();
        */

        double result = num1 % 2;
        if(result == 0){
            System.out.println(num1 + " : Even Number ");
        }else{
            System.out.println(num1 + " : Odd Number");
        }
    }
}
