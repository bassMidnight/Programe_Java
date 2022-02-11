import java.util.Scanner;

public class Work4_1 {
    public static void main(String[] args) {
        Work4_1_Cal row1 = new Work4_1_Cal();
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter start number : ");
        num = sc.nextInt();
        row1.Inp_Startnum(num);
        System.out.print("Enter stop number : ");
        num = sc.nextInt();
        row1.Inp_Stopnum(num);

        row1.cal_num();
    }
}
