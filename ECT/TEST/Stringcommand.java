import java.lang.ProcessBuilder.Redirect.Type;
import java.util.jar.Attributes.Name;

import javax.print.attribute.standard.MediaSize.NA;

public class Stringcommand {
    public static void main(String[] args) {
        String Name = "Atsawin" ;
        String Sname = new String("Buadam");

        System.out.println(Name);
        System.out.println(Sname);

        //ต่อสตริง
        /*
        String Full_Name = Name + Sname;
        System.out.println(Full_Name);
        System.out.println(Full_Name.concat(".com"));
        */

        //ความยาว
        /*
        int num = Name.length();
        System.out.println(num);
        */

        //Address Index
        //System.out.println(Name.charAt(1));

        //เปรียบเทียบ T F
        /*
        String word1 = "Atsawin";
        String word2 = "atsawin";
        boolean result = word1.equals(word2);
        System.out.println(result);

        boolean result_ignore = word1.equalsIgnoreCase(word2); 
        System.out.println(result_ignore);
        */

        //เช็คตัวเริ่มต้น
        /*
        String fullname = "Mr.Atsawin";
        boolean result = fullname.startsWith("Mr");
        System.out.println(result);
        */

        //เช็คตัวลงท้าย
        /*
        String county = "155646TH";
        boolean result = county.endsWith("TH");
        System.out.println(result);
        */

        //find index
        /*
        String fullname = "Atsawin Buadam";
        System.out.println(fullname.indexOf("B"));
        */

        //replace
        /*
        String year = "Happy new year 2000";
        String message = year.replace("2000", "2020");
        System.out.println(message);
        */

        //split string
        /*
        String data ="num1,num2,num3,num4";
        String [] new_data = data.split(",");
        for(int i = 0 ; i <= new_data.length;i++){
            System.out.println(new_data[i]);
        }
        */

        //Sub string
        /*
        String name = "Atsawin";
        String word = name.substring(0,3);
        System.out.println(word)
        */

        //Str  to Char
        /*
        String name = "Atsawin";
        char [] alphabet = name.toCharArray(); 
        for(int i = 0 ; i <= alphabet.length ; i++){
            System.out.println(alphabet[i]);
        }
        */

        //Char to Str
        /*
        char [] name = {'A','B','C','D'};
        String data = String.copyValueOf(name);
        System.out.println(data);
        */

        //filter String 
        /*
        String name = "    Atsawin   ";
        System.out.println(name.length());
        System.out.println(name);
    
        String new_name = name.trim();
        System.out.println(new_name.length());
        System.out.println(new_name);
        */

        //Upper_Lower
        /*
        String name = "AtsaWin";
        String Upper = name.toUpperCase();
        String Lower = name.toLowerCase();

        System.out.println("defualt = " + name);
        System.out.println("Upper = " + Upper);
        System.out.println("Lower = " + Lower);
        */

        //number change to Str
        /*
        int num = 100;
        String result = String.valueOf(num);

        System.out.println(result);
        */

        
     
    }
}
