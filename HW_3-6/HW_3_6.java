public class HW_3_6 {
    
    public static void main(String[] args) {
        HW_3_6_Cal Std1 = new HW_3_6_Cal();
        HW_3_6_Cal Std2 = new HW_3_6_Cal();

        Std1.Set_Val(1);
        Std2.Set_Val(2);

        Std1.Sub_Str_Val();
        Std2.Sub_Str_Val();

        Std1.Cal_Comp( Std1.Get_ID() , Std2.Get_ID() , Std1.Get_comp() , Std2.Get_comp() ,
        Std1.Get_Grade1(), Std2.Get_Grade1(), Std1.Get_Grade2(), Std2.Get_Grade2(), Std1.Get_Grade3(), Std2.Get_Grade3());

    }
}
