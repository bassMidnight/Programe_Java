import javax.swing.JOptionPane;
public class WK_5_3_Cal {
        private int value;
        private String output = "";
        private String s1, s2;
        private int x, y;

        WK_5_3_Cal(){
            Set_data();
            Cal_data();
            loop_20();
            Show_Result();
        }

        public void Set_data(){
            s1 = JOptionPane.showInputDialog("Enter fist of random" );
            s2 = JOptionPane.showInputDialog("Enter last of random" );
        }

        public void Cal_data(){
            x = Integer.parseInt(s1);
            y = Integer.parseInt(s2);
        }
        
        public void loop_20(){

            for ( int counter = 1; counter <= 20; counter++ ) {
                value = randnum(x ,y);
                // 1-10
                //value = 1 + ( int ) ( Math.random() * 10 );
                output += value + " ";
               
                if ( counter % 5 == 0 )
                output += "\n";
            }

        }

        public void Show_Result(){
            JOptionPane.showMessageDialog( null, output, "20 Random Numbers from 1 to 6", JOptionPane.INFORMATION_MESSAGE );
            System.exit( 0 );
        }
       
        public static int randnum(int x ,int y){
            y -= x; 
            return x + ( int ) ( Math.random() * (y+1) );
        }


}
