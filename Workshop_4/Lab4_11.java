import java.util.Scanner;

/**
 * Lab4_9
 */
public class Lab4_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , temp ;
        int count = 1 ;

        System.out.print("Enter a number : ");
        num = sc.nextInt();
        temp = num;
        for (int i = 1; i <= num; i++) {
            temp = i%10;
            if(temp >= 1 && temp <= 5){
                System.out.print(i + " ");
            }

            if(temp % 10 == 0){
                System.out.println(" I Love You");
            }
        }
    }
    
}