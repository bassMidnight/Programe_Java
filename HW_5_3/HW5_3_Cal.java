public class HW5_3_Cal {

    private String OutPut = "";

    public void printChar(int num){
        
        for (int i = 1; i <= num; i++) {
             this.OutPut += "*"; 
        }
        this.OutPut += "\n";

    }

    public void Show_Graph(){
        for (int i = 0; i < 100; i++) System.out.print("-");
        System.out.println();
        System.out.println(this.OutPut);
    }


}
