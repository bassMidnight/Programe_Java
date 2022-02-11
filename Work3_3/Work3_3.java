import java.util.Scanner;

public class Work3_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Work3_3_Cal num1 = new Work3_3_Cal();

        System.out.print("Enter Number : ");
        num1.Inp_num(sc.nextInt());
        num1.Cal_num();
    }
}
