import java.util.Scanner;

public class Work3_2 {
    
    public static void main(String[] args) {
        
        Double Principal ;
        Double Interate ;

        Scanner sc = new Scanner(System.in);
        Work3_2_Cal money1 = new Work3_2_Cal();

        System.out.print("Enter Principal : ");
        Principal = sc.nextDouble();

        System.out.print("Enter Interate (0.07): ");
        Interate = sc.nextDouble();

        money1.Inp_Principal(Principal);
        money1.Inp_Interate(Interate);
        money1.Cal_money();
        System.out.println("Result \t\t\t"+money1.Show_money());

    }
}
