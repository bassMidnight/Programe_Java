import java.util.Scanner;

public class Book {

    public static void main(String[] args) {
        double W = 0.0 ,rate = 0.0, overW = 0.0, total = 0.0, sent = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (Kg.) : ");
        W = sc.nextDouble();
        W *= 1000;

        if(W > 0){

            if(W <= 2000){
                rate = 0.25;
            }else{
                rate = 0.35;
                W -= 2000;
                overW += 500;
            }

        }


        System.out.println("Enter 1: Normal delivery");
        System.out.println("Enter 2: fast delivery");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                    sent = 0;
                break;
            case 2:
                    sent = 50;
                break;
        
            default:
                break;
        }


        total = (rate * W) + overW + sent;
        System.out.print("PRiECE : " + total + " Bath");
        

    }   

}