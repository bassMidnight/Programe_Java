import java.util.Scanner;

class Std_Data{

    private int ID, Tel;
    private String Fname , Lname;

    Scanner sc = new Scanner(System.in);
    public void Set_Fname(String Fname){
        this.Fname = Fname ;
    }

    public void Get_Fname(){
        System.out.println(this.Fname);
    }

}