import java.util.Scanner;

public class Lab4_8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double meter;
        System.out.print("Enter Distance km : ");
        double km = sc.nextDouble(); 

        meter = km * 1000;

        System.out.print("Enter Speed kmph : ");
        double kmph = sc.nextDouble();

        double li = meter/500 ;
        double hr = km/kmph;

        /* System.out.println("Time : " + hr + " hr"); */

         System.out.println("Distance : " + li + " li");
        
        double shi = hr/2 ;
        System.out.println("Finish time : " + shi + " shi"); 
       
    }
    
}