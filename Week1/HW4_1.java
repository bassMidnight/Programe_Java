import java.util.Scanner;

public class HW4_1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter min number : ");
        int min = sc.nextInt();
        System.out.print("Enter max number : ");
        int max = sc.nextInt();
        
        for(int res = min ; res <= max ; res++){
            if((res % 3 == 0) && (res % 5 == 0)) {
                System.out.print(res + "\t");
                ++count;
                
                if(count % 5 == 0){
                    System.out.println();
                }
            }

            

        }

    }

}
