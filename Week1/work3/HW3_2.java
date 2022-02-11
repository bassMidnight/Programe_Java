import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double Principal = sc.nextDouble();

        System.out.print("Enter Interate (0.03, 0.05) : ");
        double Interate = sc.nextDouble();

        Interate += 1 ;
        double result = 0.0;

        for(int i = 1 ; i <= 5 ; i++){
            result = Principal * Interate ;
            Principal += Interate;
            System.out.println("Year " + i + " : " + result);
        }

    }    
}
