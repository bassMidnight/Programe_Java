import java.util.Scanner;

public class WK4_3_Cal {
    
    private String S_num ;
    private int count = 0 ;
    private double avg = 0.0 , num = 0.0 , sum = 0.0;
    private boolean Flag = true;

    Scanner sc = new Scanner(System.in);

    WK4_3_Cal(){
        Set_num();
    }


    public void Set_num(){

        while (Flag) {

            System.out.print("Enter number ( q for quit ) : ");
            this.S_num = sc.next();

            if ( this.S_num.equals("q") || this.S_num.equals("Q") ) {
                Cal_Avg();  
                Get_result();
                Flag = false;
               
            }else{
                this.num = Double.parseDouble(this.S_num);  
                Set_sum(this.num);
                /* System.out.println("sum is : "+this.sum); */
                Set_count();
            }

        }
        
    }

    public void Set_sum(Double num){
        this.sum += num;
    }

    public void Set_count(){
        this.count++;
    }

    public void Cal_Avg(){
        this.avg = this.sum / this.count ;
    }

    public void Get_result(){
        System.out.println("Average is " + this.avg);
    }


} 
