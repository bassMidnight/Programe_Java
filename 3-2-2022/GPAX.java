import java.util.Scanner;

public class GPAX {
    public static void main(String[] args) {
        char sub1_Std1, sub2_Std1, sub3_Std1 ;
        char sub1_Std2, sub2_Std2, sub3_Std2 ;
        /* int Id_Std1 , Id_Std2; */
        Double GPAX_Std1 , GPAX_Std2;

        Scanner sc = new Scanner(System.in);

        /* System.out.print("Enter ID Std1 : ");
        int Id_Std1 = sc.nextInt();
        System.out.print("Enter ID Std2 : ");
        int Id_Std2 = sc.nextInt();   */

        System.out.print("Enter GPA Subj1 Subj2 Subj3 (A B F) : ");
        String AllGrade_Std1 = sc.nextLine();
        
        System.out.print("Enter GPA Subj1 Subj2 Subj3 (A B F) : ");
        String AllGrade_Std2 = sc.nextLine();


        sub1_Std1 = AllGrade_Std1.charAt(0);
        sub2_Std1 = AllGrade_Std1.charAt(2);
        sub3_Std1 = AllGrade_Std1.charAt(4);

        sub1_Std2 = AllGrade_Std2.charAt(0);
        sub2_Std2 = AllGrade_Std2.charAt(2);
        sub3_Std2 = AllGrade_Std2.charAt(4);
        
        GPAX_Std1 = GPAX_Cal(sub1_Std1,sub2_Std1,sub3_Std1);
        GPAX_Std2 = GPAX_Cal(sub1_Std2,sub2_Std2,sub3_Std2);

        /* System.out.println("ID1 : " + Id_Std1);  */
        System.out.println("Sub1 : " + sub1_Std1);
        System.out.println("Sub2 : " + sub2_Std1);
        System.out.println("Sub3 : " + sub3_Std1);
        System.out.println("GPAX_Std1 : " + GPAX_Std1);

        /* System.out.println("ID2 : " + Id_Std2);  */
        System.out.println("Sub1 : " + sub1_Std2);
        System.out.println("Sub2 : " + sub2_Std2);
        System.out.println("Sub3 : " + sub3_Std2);
        System.out.println("GPAX_Std2 : " + GPAX_Std2);

    }
    
    public static Double GPAX_Cal(char sub1, char sub2, char sub3){

        Double GPAX_result = (char_to_Int(sub1)+char_to_Int(sub2)+char_to_Int(sub3))/3;
        return GPAX_result;
    }

    public static Double char_to_Int(char sub){
        Double res = 0.0;
        if(sub == 'A'){
            res = 4.0;
        }else if(sub == 'B'){
            res = 3.0;
        }else if(sub == 'C'){
            res = 2.0;
        }else if(sub == 'D'){
            res = 1.0;
        }else if(sub == 'F'){
            res = 0.0;
        }
        //System.out.println("Res : "+res);
        return res;
    }

    
}
