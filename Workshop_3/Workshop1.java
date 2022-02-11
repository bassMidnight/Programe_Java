
import java.util.Scanner;

public class Workshop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter C : ");
        double cel = sc.nextFloat();

        double F = ((9.0/5.0) * cel) + 32.0;

        System.out.print("F : " + F);

    }
}
