import java.util.Scanner;

public class HW3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (xxxx) : ");
        int num = sc.nextInt();
        //1234
        int num1 = num/1000;
        int num2 = (num%1000)/100; 
        int num3 = (num%100)/10; 
        int num4 = num%10; 

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 );
    }
}
