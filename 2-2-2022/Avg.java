import java.util.Scanner;

public class Avg {
    private Double sum = 0.0; 
    private Double count = 0.0;
    private Double Avg;
    private String num ;

    Scanner sc = new Scanner(System.in);

    public Avg(){

    }

    public boolean check_q(String num){
        if(num.equals("q")){
            return(false);
        }else{
            //not  q
            return(true);
        }
    }

    public void setnum(){
        boolean Flag = true;

        do {
            System.out.print("Enter number (q for quit)  : ");
            this.num = sc.next();
            if(check_q(num)){
                //System.out.println("IF");
                int num_Int = Integer.parseInt(num);
                this.sum += num_Int;
                count_data();
            }else{
                //System.out.println("ELSE");
                Flag = false;
            }
        } while (Flag);

    }

    public void count_data(){
        this.count++ ;  
    }

    public void Cal_Avg(){
        this.Avg = this.sum / this.count;
    }

    public Double Show_Avg(){
       return(this.Avg);
    }
}
