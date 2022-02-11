
public class Work3_2_Cal {

    private Double Principal ;
    private Double Interate ;
    private Double Result;

    Work3_2_Cal(){

    }

    public void Inp_Principal(Double Principal){
        this.Principal = Principal;
    }

    public void Inp_Interate(Double Interate){
        this.Interate = Interate;
    }

    public void Cal_money(){
        System.out.println("Year\t\t\tMoney" );
        for (int i = 1; i <= 5; i++) {
            this.Principal += this.Principal*this.Interate;
            System.out.println(i + "\t\t\t" + this.Principal);
        }
        this.Result = this.Principal;
    }

    public double Show_money(){
        return this.Result;
    }


}
