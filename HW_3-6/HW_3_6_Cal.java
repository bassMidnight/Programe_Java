import java.util.Scanner;

import org.w3c.dom.TypeInfo;

public class HW_3_6_Cal {
    
    Scanner sc = new Scanner(System.in);

    private String Str_val = "" , Str_Std_Id = "";
    private double Dou_compro = 0.0;
    private char Chr_Grade1 , Chr_Grade2 , Chr_Grade3 ;


    HW_3_6_Cal(){

    }

    public void Set_Val(int i ){
        System.out.print("Enter Info student " + i + " : ");
        this.Str_val = sc.nextLine();
    }

    public void Sub_Str_Val(){

        String[] part = this.Str_val.split(" ");
        /* 
        System.out.println("Id : " + part[0]);
        System.out.println("Grade comp : " + part[1]);
        System.out.println("Grade 1 : " + part[2]);
        System.out.println("Grade 2 : " + part[3]);
        System.out.println("Grade 3 : " + part[4]); 
        */

        this.Str_Std_Id = part[0];
        this.Dou_compro = Double.parseDouble(part[1]);
        this.Chr_Grade1 = part[2].charAt(0);
        this.Chr_Grade2 = part[3].charAt(0);
        this.Chr_Grade3 = part[4].charAt(0);

        System.out.println("--------------------------");

        System.out.println("Id : " + this.Str_Std_Id);
        System.out.println("Grade comp : " + this.Dou_compro);
        System.out.println("Grade 1 : " + this.Chr_Grade1);
        System.out.println("Grade 2 : " + this.Chr_Grade2);
        System.out.println("Grade 3 : " + this.Chr_Grade3);

        System.out.println("--------------------------");

    }

    public String Get_ID(){
        return this.Str_Std_Id;
    }

    public double Get_comp(){
        return this.Dou_compro;
    }

    public char Get_Grade1(){
        return this.Chr_Grade1;
    }

    public char Get_Grade2(){
        return this.Chr_Grade2;
    }

    public char Get_Grade3(){
        return this.Chr_Grade3;
    }

    public void Cal_Comp(String ID1 , String ID2 , double comp1 , double comp2 ,
        char Grade1_1 , char Grade1_2 ,char Grade2_1 , char Grade2_2 ,char Grade3_1 , char Grade3_2){
        if(comp1 > comp2){
            System.out.println("Select :" + ID1); 
        }else if(comp1 < comp2){
            System.out.println("Select :" + ID2); 
        }else{
            Cal_Grade1(ID1, ID2,Grade1_1, Grade1_2, Grade2_1, Grade2_2, Grade3_1, Grade3_2);
        }
    }

    public void Cal_Grade1(String ID1, String ID2, char Grade1_1 , char Grade1_2 ,char Grade2_1 , char Grade2_2 ,char Grade3_1 , char Grade3_2){
        if(Cal_Grade_toInt(Grade1_1) > Cal_Grade_toInt(Grade1_2)){
            System.out.println("Select : " + ID1);
        }else if(Cal_Grade_toInt(Grade1_1) < Cal_Grade_toInt(Grade1_2)){
            System.out.println("Select : " + ID2);
        }else{
            Cal_Grade2(ID1, ID2, Grade2_1, Grade2_2, Grade3_1, Grade3_2);
        }
    }

    public void Cal_Grade2(String ID1, String ID2, char Grade2_1 , char Grade2_2 ,char Grade3_1 , char Grade3_2){
        if(Cal_Grade_toInt(Grade2_1) > Cal_Grade_toInt(Grade2_2)){
            System.out.println("Select : " + ID1);
        }else if(Cal_Grade_toInt(Grade2_1) < Cal_Grade_toInt(Grade2_2)){
            System.out.println("Select : " + ID2);
        }else{
            Cal_Grade3(ID1, ID2, Grade3_1, Grade3_2);
        }
    }

    private void Cal_Grade3(String ID1, String ID2,char Grade3_1 , char Grade3_2){
        if(Cal_Grade_toInt(Grade3_1) > Cal_Grade_toInt(Grade3_2)){
            System.out.println("Select : " + ID1);
        }else if(Cal_Grade_toInt(Grade3_1) < Cal_Grade_toInt(Grade3_2)){
            System.out.println("Select : " + ID2);
        }else{
            System.out.println("Select twice!!");
        }
    }

    public int Cal_Grade_toInt(char Grade){

        if(Grade == 'A'){
            return 4;
        }else if (Grade == 'B') {
            return 3;
        }else if (Grade == 'C') {
            return 2;
        }else if (Grade == 'D') {
            return 1;
        }else
            return 0;
        }
        
        
    }

