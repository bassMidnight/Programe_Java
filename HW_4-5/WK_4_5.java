import java.util.Scanner;

public class WK_4_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WK_4_5_Cal std1 = new WK_4_5_Cal();

        System.out.print("Enter Yuor Answer : ");
        std1.Set_Ans(sc.next());
        System.out.print("Enter Right Answer : ");
        std1.Set_Rans(sc.next());
        System.out.println(std1.Cal_Result());
        
    }
    
}
