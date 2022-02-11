import java.util.Scanner;

public class Workshop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Innumber ;
        System.out.print("Enter number : ");
        Innumber = sc.nextInt();

        int num1 = Innumber / 1000 ;
        int num2 = (Innumber / 100) % 10;
        int num3 = (Innumber / 10) % 10;
        int num4 = Innumber % 10 ;

        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 );


    }    
}
