import javax.swing.JOptionPane;
public class WK_5_4 {
    public static void main(String[] args) {
        int Int_Start, Int_Stop;
        String str_Start , Str_Stop;

        str_Start = JOptionPane.showInputDialog("Enter First number :" );
        Int_Start = Integer.parseInt(str_Start);

        Str_Stop = JOptionPane.showInputDialog("Enter last number :" );
        Int_Stop = Integer.parseInt(Str_Stop); 

        int sum = (Sumation(Int_Start,Int_Stop)-1);
        String output = " Sum of "+ Int_Start +" to " + Int_Stop + " is " + sum;
        JOptionPane.showMessageDialog( null, output,
            "Sumation", JOptionPane.INFORMATION_MESSAGE ); 
        System.exit(0);

        System.out.println("sum : " + sum);
    }

    public static int Sumation(int start, int stop)
    {   
        if (start <= stop) {
            System.out.println("start : " + start);
            return ( start + Sumation( start + 1 , stop) );
        }
        else return (1);
    }
}