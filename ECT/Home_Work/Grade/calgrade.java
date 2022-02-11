public class calgrade {
 
    public static double sum_score (double HW_Score ,double Mid_Score ,double Final_Score){
        double sum;
         sum = HW_Score + Mid_Score + Final_Score ;
         return sum ; 
    }

    public static char grade(Double sum){
        char grade_;
        if(sum >= 90){
            grade_ = 'A';
        }else if(sum <= 80){
            grade_ = 'B';
        }else if(sum <= 70){
            grade_ = 'C';
        }else if(sum <= 60){
            grade_ = 'D';
        }else{
            grade_ = 'F';
        }

        return grade_ ;
    }
}
