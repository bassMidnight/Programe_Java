import java.util.Scanner;

class BMI{
    public static void main(String[] args) {
        boolean flag = true;
        int money ; 
        int TEN = 0 , FIVE = 0 , TWO = 0 , ONE = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your money");
        money = sc.nextInt();

        while(flag == true){
            if(money >= 10){
                TEN++;
		        money -= 10;
            }
            if(money >= 5){
                FIVE++;
		        money -= 5;
            }
            if(money >= 2){
                TWO++;
		        money -= 2;
            }
            if(money >= 1){
                ONE++;
		        money -= 1;
            }
            if(money == 0){
                flag = false;
            }
        }

        System.out.print("TEN : " + TEN + " FIVE : " + FIVE + " TWO : " + TWO + " ONE : " + ONE);
    }
}