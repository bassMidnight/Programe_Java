import java.util.Scanner;

public class tranBank {
    public static void main(String[] args) {
       //บัตร  1000 500 100 50 20

       int money ; 
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter money : ");
       money = sc.nextInt();
        
        if(money >= 1000.00){
            System.out.println("get 1000 " + (money / 1000));   
            money %= 1000 ;
            //System.out.println("change " + money);
        }

        if(money >= 500){
            System.out.println("get 500 " + (money / 500));
            money %= 500;
            //System.out.println("change " + money);
        }

        if(money >= 100){
            System.out.println("get 100 " + (money / 100));
            money %= 100;
            //System.out.println("change " + money);
        }

        if(money >= 50){
            System.out.println("get 50 " + (money / 50));
            money %= 50;
            //System.out.println("change " + money);
        }

        if(money >= 20){
            System.out.println("get 20 " + (money / 20));
            money %= 20;
            //System.out.println("change " + money);
        }
        System.out.println("change " + money);
    }
}
