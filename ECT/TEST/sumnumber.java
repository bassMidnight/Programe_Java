import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class sumnumber {
    public static void main(String[] args) {
        int start_num = 1 , end_num = 0, sum_number = 0 ;
        double count = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number : ");
        start_num = sc.nextInt();
        System.out.print("Enter end number : ");
        end_num = sc.nextInt();

        while(start_num <= end_num){
            sum_number += start_num;
            start_num++;
            count++;
        }
        count--;
        
        System.out.println("Sum : " + sum_number);
        System.out.println(count + " Avg : " + (sum_number/count));
    }
}
