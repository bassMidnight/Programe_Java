import java.util.Scanner;

public class Work4_2_Cal {
    private String num ;
    private int Allnum, Odd, Even, Zero;
    
    Scanner sc = new Scanner(System.in);

    
    Work4_2_Cal(){

    }

    public void Inp_num(String num){
        this.num = num;
    }


    public int Num_toStr(String num){
        this.Allnum = num.length();
        return this.Allnum;
    }

    public void Num_cal(){
        String Anum = this.num;
        char char_temp ;
        for(int i = 0 ; i < this.Allnum ; i++){
            char_temp = Anum.charAt(i);
            int n = Character.getNumericValue(char_temp);
            //System.out.println(n);
            if(n == 0){
                this.Zero++;
            }else if(n%2 == 0){
                this.Odd++;
            }else{
                this.Even++;
            }
        }
    }

    public int Show_Odd(){
        return this.Odd;
    }
    public int Show_Even(){
        return this.Even;
    }
    public int Show_Zero(){
        return this.Zero;
    }

}
