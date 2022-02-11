import java.util.Scanner;

public class calculate {
    public static void main(String[] args) {
        double num1 = 0.0 , num2 = 0.0 , result = 0.0;
        char oper ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculater Programe");
        System.out.println("Enter Number 1");
        num1 = sc.nextDouble();

        System.out.println("Enter operater");
        System.out.println("+ - * / %");
        oper = sc.next().charAt(0);

        if(oper != '%'){
            System.out.println("Enter Number 2");
            num2 = sc.nextDouble(); 
        }
        

        switch (oper) {
            case '+':
                result = num1+num2;
                break;

            case '-':
                result = num1-num2;    
                break;
                
            case '*':
                result = num1*num2;
                break;

            case '/':
                result = num1/num2;
                break;

            case '%':
                result = num1/100;
                break;

            default:
                break;
        }

        System.out.println("Result is " + result);


    }
}
