import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        double num1 , num2 ;
        Scanner sc = new Scanner(System.in);

        System.out.print("num1 : ");
        num1 = sc.nextDouble();
        System.out.print("num2 : ");
        num2 = sc.nextDouble();

        if(num1 < num2 ){
            System.out.println(num1 + " < " + num2);
        }else if(num1 > num2){
            System.out.println(num1 + " > " + num2);
        }else if(num1 == num2){
            System.out.println(num1 + " == " + num2);
        }else{
            System.out.println("ERR");;
        }
        
    }
}
