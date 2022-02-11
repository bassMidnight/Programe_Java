import javax.swing.JOptionPane;

public class HW5_1_cal {
    private Double Dou_row;
    private int Int_Sum = 0;
    private Double Dou_Avg = 0.0;

    public void Set_row(){
        String Str_row = JOptionPane.showInputDialog("Enter Row :" );
        this.Dou_row = Double.parseDouble(Str_row);
    }

    public int Get_Score(){
        
        for (int i = 1; i <= this.Dou_row; i++) {
            String Raw_Score = JOptionPane.showInputDialog("Enter Score" + i + " :" );
            int Score = Integer.parseInt(Raw_Score);
            this.Int_Sum = Int_Sum + Score;
        }
        return this.Int_Sum;
        
    }

    public void Cal_Avg(int sum){
        this.Dou_Avg = sum / this.Dou_row;
    }

    public void Show_Sum(){
        JOptionPane.showMessageDialog( null, "Average : " + this.Dou_Avg ,"Average", JOptionPane.INFORMATION_MESSAGE );
    }

   
}
