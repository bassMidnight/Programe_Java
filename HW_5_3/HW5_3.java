import java.util.Scanner;

public class HW5_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HW5_3_Cal Tester = new HW5_3_Cal();

        boolean flag = true;

        while (flag) {
            System.out.print("Enter number : ");
            int num = sc.nextInt();
            if(num > -1){
                Tester.printChar(num);
            }else{
                flag = false;
            }
            
        }

        Tester.Show_Graph();
        
    }



}
