import java.util.Scanner;

/**
 * Lab4_9
 */
public class Lab4_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hr , rate , total;

        System.out.print("Enter number of hours (1.5): ");
        hr = sc.nextDouble();

        if(hr >= 6){
            rate = 10;
        }else if(hr >= 3){
            rate = 15;
        }else{
            rate = 20;
        }

        total = hr*rate;

        System.out.println("Total = " + total + "B.");
    }
    
}