import java.lang.module.FindException;
import java.util.Scanner;

public class WK_4_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String strOrig = "";
        String strNeed = "";
        System.out.print("enter original message : ");
        strOrig = sc.nextLine();

        System.out.print("enter word for find : ");
        strNeed = sc.nextLine();

        int srtOrg_le = strOrig.length();
        int strNeed_le = strNeed.length();

        int pos = 0;
        int count = 0;
        int num_c = 0;
        int i = 0;
        
        while(pos < srtOrg_le){
            //ลูบตัวข้อความต้นแบบ

            if (strOrig.charAt(pos) == strNeed.charAt(i)) {
                //มีตัวอักษรเหมือนกัน
                num_c++ ;
                i++;

                if(num_c == strNeed_le){
                    //ตัวอักษรเหมือนกันตามจำนวนของข้อคามที่ต้องการ
                    count++;
                    i = 0;
                    num_c = 0;
                }

            }
            //เลื่อนตำแหน่งอ่านตัวอักษร
            ++pos;
            
            
           
        }

        System.out.println("res : " + count);

    }
    
}
