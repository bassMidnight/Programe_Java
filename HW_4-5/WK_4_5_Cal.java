public class WK_4_5_Cal {
    
    private String Str_Ans;
    private String Str_Rans;
    private String result ;

    public void Set_Ans(String Str_Ans){
        this.Str_Ans = Str_Ans;
    }

    public void Set_Rans(String Str_Rans){
        this.Str_Rans = Str_Rans;
    }


    public String Cal_Result(){
        int count = 0;
        if(this.Str_Ans.length() == this.Str_Rans.length()){

            for (int i = 0; i < this.Str_Rans.length(); i++) {
                
                if(Str_Ans.charAt(i) == Str_Rans.charAt(i)){
                    count++;
                }

            }

        }else{
            count = -1;
        }

        if(count != -1){
            this.result = String.valueOf(count);
        }else{
            this.result = "Answer is not match!!!";
        }

        return this.result;
    }



}
