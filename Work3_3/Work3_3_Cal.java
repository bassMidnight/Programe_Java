public class Work3_3_Cal {
    
    private int number;
    Work3_3_Cal(){

    }

    public void Inp_num(int number){
        this.number = number;
    }

    public void Cal_num(){
        int num1 = this.number/1000;
        int num2 = (this.number/100)%10;
        int num3 = (this.number/10)%10;
        int num4 = this.number%10;

        System.out.println(num1+" "+num2+" "+num3+" "+num4);
    }

    
}
