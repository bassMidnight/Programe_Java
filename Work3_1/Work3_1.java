import java.util.Scanner;

import javax.swing.InputMap;

public class Work3_1 {
    public static void main(String[] args) {

        Work3_1_cal C_F = new Work3_1_cal();
        Double Inp_C = C_F.inp_C();
        C_F.CalC_toF(Inp_C);
        System.out.println(C_F.Show_F());
        

    }

}
