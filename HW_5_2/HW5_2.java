import java.util.Scanner;

import javax.swing.InputMap;

public class HW5_2 {
    
    int count = 0 ; 
    public static void main(String[] args) {
        long Int_inp;
        Scanner sc = new Scanner(System.in);
        HW5_2 Tester1 = new HW5_2();
        
        System.out.print("Enter input");
        Int_inp = sc.nextInt();
        System.out.println(Tester1. countDigit(Int_inp));
    
    }

    public int  countDigit(int num){

        num /= 10;
        this.count++;
        if(num != 0){
            return  countDigit(num);
        }else{
            return this.count;
        }
    }
}
