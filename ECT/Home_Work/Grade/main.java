import java.util.Scanner;

import javax.xml.validation.Schema;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double HW_Score = -1.0;
        while (HW_Score < 0 || HW_Score > 20) {
            System.out.print("Enter Home Work Score 0-20 : ");
            HW_Score = sc.nextDouble();
        }

        Double Mid_Score = -1.0;
        while(Mid_Score > 40 || Mid_Score < 0){
            System.out.print("Enter Mid term Score 0-40 : ");
            Mid_Score = sc.nextDouble();
        }
    
        Double Final_Score = -1.0;
        while(Final_Score > 40 || Final_Score < 0){
            System.out.print("Enter Final Score 0-40 : ");
            Final_Score = sc.nextDouble();
        }

        double val = sum_score(HW_Score,Mid_Score,Final_Score);
        char grade_res = grade(val);

        System.out.println("Score : "+val);
        System.out.println("Grade : "+grade_res);


/*
        System.out.print("Enter Home Work Score 0-20");
        Double HW_Score = sc.nextDouble();
        while(HW_Score >= 20 || HW_Score < 0){
            Double HW_Score = sc.nextDouble();
        }

        System.out.print("Enter Mid term Score 0-40");
        Double Mid_Score = sc.nextDouble();
        while(Mid_Score >= 20 || Mid_Score < 0){
            Double Mid_Score = sc.nextDouble();
        }

        System.out.print("Enter Final Score 0-40");
        Double Final_Score = sc.nextDouble();
        while(Final_Score >= 20 || Final_Score < 0){
            Double Final_Score = sc.nextDouble();
        }

*/
    }

}
