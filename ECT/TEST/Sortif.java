import java.util.Scanner;

public class Sortif {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1 ;
        String result ;

        System.out.print("Enter Num1 : ");
        num1 = sc.nextDouble();

        result = ( num1%2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(num1 + result);


    }
}
