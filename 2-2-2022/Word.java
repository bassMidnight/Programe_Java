import java.security.DrbgParameters.Reseed;
import java.security.cert.PKIXBuilderParameters;
import java.util.concurrent.LinkedBlockingDeque;

public class Word {
    private String message;
    private String Look_for;
    private int count;

    public Word(){
    }

    public Word(String message , String look_for){
        this.message = message;
        this.Look_for = look_for;
    }

    public set_message(String message){
        this.message = message;
    }
    public set_lookfor(String look_for){
        this.Look_for = look_for;
    }

    public set_count(){
        String Temp = "";
        int count_in = 0;
        for(int i = 0 ; i <= message.length() ; i++){
            //
            if((message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') || (message.charAt(i) <= 'a' && message.charAt(i) >= 'z')) {
                Temp = Temp + message.charAt(i);
                count_in = i ;
            }else{
                if(Temp.equals(Look_for) && count_in+1 == i){
                    this.count++;
                }
            }
            
        }
        
    }

    public get_message(){
        return(this.message);
    }
    public get_lookfor(){
        return(this.Look_for);
    }
    public get_count(){
        return(this.count);
    }

    public Tostring(){
        return("message : "+  this.message +"\n look for : " + this.Look_for + "count : " + toString(this.count) );
    }


}
