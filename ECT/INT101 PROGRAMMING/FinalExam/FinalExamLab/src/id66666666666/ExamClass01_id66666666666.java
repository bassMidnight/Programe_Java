/*
Student ID:
Student name: 
*/


package id66666666666;


public class ExamClass01_id66666666666 {
    // 3 points create an object of the SomeWhere class using your name and some location
    public static void main(String[] args) {
        Person person = new Person("asdasd", "asd");
        Location location = new Location(2.3, 4.5);
        SomeWhere someWhere1 = new SomeWhere(person, location);
        
        SomeWhere someWhere2 = new SomeWhere(new Person("asdasd", "asdasd"), new Location(545.2, 122.5));
        
        ExamClass02_id66666666666 test = new ExamClass02_id66666666666();
        System.out.println(test.toString());
    }
}
