import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        int chk  ;
        double raw ; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 : C -> F ");
        System.out.println("Enter 2 : F -> C ");
        System.out.print("Enter : ");
        chk = sc.nextInt();

        if(chk == 1){
            
            System.out.print("Enter C : ");
            raw = sc.nextDouble();

            double F = ((raw * 9)/5)+32;
            System.out.println(raw + " C = " + F +" F"); 

        }else if (chk == 2){

            System.out.print("Enter F : ");
            raw = sc.nextDouble();

            double C = (raw - 32 ) * 5/9;
            System.out.println(raw + " F = " + C +" C"); 

        }

    }
}
