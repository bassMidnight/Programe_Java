import java.util.Scanner;

public class Workshop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Principal = 0.0 , Interate = 0.0 , result = 0.0;
        System.out.print("Enter Principal : ");
        Principal = sc.nextDouble();
        System.out.print("Enter Interate (ex : 0.07) : ");
        Interate = sc.nextDouble();
        Interate += 1.0;

        for(int i = 1 ; i <= 5 ; i++){
            result = Principal * Interate ;
            System.out.println("Year " + i + " result : " + result );
            Principal = result ;
        }
    }
}
