import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double result , h , w ;
        
        System.out.print("Enter HIGHT (cm) : ");
        h = sc.nextDouble();
        System.out.print("Enter WIGHT (kg) : ");
        w = sc.nextDouble();

        h /= 100;
        System.out.println("HIGHT " + h + " m.");
        System.out.println("WIGHT " + w + " kg.");

        result = w / (h*h);
        System.out.println("BMI " + result);

        if(result >= 30){
            System.out.println("Over 3 ");
        }else if(result >= 25){
            System.out.println("Over 2");
        }else if(result >= 23){
            System.out.println("Over 1");
        }else if(result >= 18.50){
            System.out.println("Normal");
        }else{
            System.out.println("Low");
        }



    }
}
