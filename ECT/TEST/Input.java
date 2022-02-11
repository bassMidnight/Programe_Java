import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //รับ่ค่าข้อมูล

        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine(); //รับค่าString

        System.out.println("Enter your Birth year : ");
        int year = sc.nextInt();    //รับค่าInt

        System.out.println("Name is " + name);
        System.out.println("Year is " + year);
        
    }
}
