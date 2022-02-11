import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student : ");
        int std = sc.nextInt();
        System.out.print("Enter Hr. : ");
        double Hr = sc.nextDouble();

        double result , cost;

        if(std == 1){
            cost = 500;
        }else if(std == 2){
            cost = 450;
        }else if(std == 3){
            cost = 400;
        }else if(std == 4){
            cost = 350;
        }else if(std == 5){
            cost = 300;
        }else{
            System.out.println("Out of student!!!");
            return;
        }

        result = cost * Hr;
        System.out.println("Result per one  "+result+" Bath");

        result = std * cost * Hr;
        System.out.println("Result all "+result+" Bath");

        
    }
    
}
