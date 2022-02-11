import java.util.Scanner;

public class RunAvg {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avg std1 = new Avg();
        std1.setnum();
        std1.Cal_Avg();
        System.out.println(std1.Show_Avg());
        
    }

   
}
