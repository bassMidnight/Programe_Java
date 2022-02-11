import javax.swing.JOptionPane;
public class WK_5_2_Cal {
    double number1, number2, number3;
    String s1, s2, s3;
    String output;
    double min , max;

    public void Set_data() {
        
        this.s1 = JOptionPane.showInputDialog("Enter first floating-point value" );
        this.s2 = JOptionPane.showInputDialog("Enter second floating-point value" );
        this.s3 = JOptionPane.showInputDialog("Enter third floating-point value" );
        // convert user input to double values
        
    }

    public void Cal_Dou(){
        this.number1 = Double.parseDouble( this.s1 );
        this.number2 = Double.parseDouble( this.s2 );
        this.number3 = Double.parseDouble( this.s3 );

        this.max = maximum(this.number1, this.number2, this.number3);
        this.min = minimum(this.number1, this.number2, this.number3);
    }

    public void Get_data(){
        output = "number1: " + this.number1 + "\nnumber2: " + this.number2 ;
        output += "\nnumber3: " + this.number3 + "\nmaximum is: " + this.max;
        output += "\nminimum is: " + this.min;
        JOptionPane.showMessageDialog( null, output);
        System.exit(0);
    }


    public static double maximum( double x, double y, double z ){
        return Math.max( x, Math.max( y, z ) );
    } // end method maximum

    public static double minimum( double x, double y, double z ){
        return Math.min( x, Math.min( y, z ) );
    } // end method minimum
} 
