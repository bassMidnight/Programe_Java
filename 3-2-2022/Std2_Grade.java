import java.util.Scanner;

public class Std2_Grade {
    public static void main(String[] args) {
        String Std_id1 = "" ; 
        String Std_id2 = "" ;
        Double Std1_comp = 0.0;
        Double Std2_comp = 0.0;
        String Std1_Grade = "";
        String Std2_Grade = "";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Id std1 : ");
        Std_id1 = sc.next();
        System.out.print("Enter Grade Compro Std1 : ");
        Std1_comp = sc.nextDouble();
        System.out.print("Enter Grade Std1 (A B D)");
        Std1_Grade = sc.nextLine();

        System.out.print("Enter Id std2 : ");
        Std_id2 = sc.next();
        System.out.print("Enter Grade Compro Std1 : ");
        Std2_comp = sc.nextDouble();
        System.out.print("Enter Grade Std2 (A B D)");
        Std2_Grade = sc.nextLine();

    }
}
