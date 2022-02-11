import java.util.Currency;

public class Work4_1_Cal {

    private int Start_num , End_num;

    Work4_1_Cal(){

    }

    public void Inp_Startnum(int num){
        this.Start_num = num;
    }

    public void Inp_Stopnum(int num){
        this.End_num = num;
    }

    public void cal_num(){
        int count = 0;
        for (int i = this.Start_num; i <= this.End_num ; i++) {
            if(i % 5 == 0){
                System.out.print(i + "\t");
                count++;
            }
            if(count == 5){
                System.out.println();
                count = 0;
            }
            
        }
    }

    
}
