import java.util.Scanner;

public class Work4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Work4_2_Cal N1 = new Work4_2_Cal();

        System.out.print("Enter number : ");
        String num = sc.next();
        N1.Inp_num(num);
        
        N1.Num_toStr(num);
        N1.Num_cal();
        System.out.println("Odd : " + N1.Show_Odd());
        System.out.println("Even : " + N1.Show_Even());
        System.out.println("Zero : " + N1.Show_Zero());

    }
}
