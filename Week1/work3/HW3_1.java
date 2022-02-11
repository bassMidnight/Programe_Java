import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cel : ");
        double Cel = sc.nextDouble() ;
        double Fa = ((9f/5f)*Cel) + 32;
        System.out.println("Fa = " + Fa);

    }
}
