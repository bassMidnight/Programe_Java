import java.util.Scanner;

public class Work4_3_Cal {

    private int num;
    private String msg;
    Scanner sc = new Scanner(System.in);


    Work4_3_Cal(){
        Inp_Prime();
        Cal_Prime();
        Show_result();
        
    }

    public void Inp_Prime(){
        System.out.println("Enter number : ");
        this.num = sc.nextInt();
    }

    public void Cal_Prime(){

        int i = this.num;
        if((i==1 || i%2 == 0 || i%3 == 0 || i%5==0 || i%7==0)  && (i!=2 && i!=3 && i!=5 && i!=7)){
            msg = "Not prime!!";
        }else{
            msg = "Prime!!";
        }

    }

    public void Show_result(){
        System.out.print(msg);
    }
    
}
