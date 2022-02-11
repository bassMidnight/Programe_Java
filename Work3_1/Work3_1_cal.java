import java.util.Scanner;

public class Work3_1_cal {
    private Double F ;
    private Double C ;
    
    Scanner sc = new Scanner(System.in);

    Work3_1_cal(){
    }

    public Double inp_C(){
        System.out.print("Enter C : ");
        this.C = sc.nextDouble();
        return this.C;
    }

    public void CalC_toF(Double C){
        this.F = (9.0/5.0)*C + 32.0;
    }

    public String Show_F(){
        String message = this.C + " Covert to F = " + this.F;
        return message;
    }

    
}
