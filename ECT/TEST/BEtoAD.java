import java.util.Scanner;

public class BEtoAD {
    public static void main(String[] args) {
        int chk , year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 : BE -> AD");
        System.out.println("Press 2 : AD -> BE");
        System.out.print("Enter : ");
        chk = sc.nextInt();

        if(chk == 1){

            System.out.println("Enter BE : ");
            year = sc.nextInt();

            int result = year - 543;
            System.out.println("AD is " + result);

        }else if(chk == 2){

            System.out.println("Enter AD : ");
            year = sc.nextInt();

            int result = year + 543;
            System.out.println("BE is " + result);

        }else{
            System.out.println("ERR");
        }
        System.out.println("End Program");
    
}
}
