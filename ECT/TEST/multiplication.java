import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int number ;
        double result;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        number = sc.nextInt();
        
        System.out.println("multiplication table");
        System.out.println("number \t\t multi \t= \t result");
        for(int i =1 ; i <= 12 ; i++){
            result = number * i;
            System.out.println(number +"\t * \t" + i + "\t = \t" + result);

        }
    }
}
