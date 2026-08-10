/* public class oops{
    public static void main(String[] args){
        System.out.println("Hello world");
    }
}


 */

/**
 * oops
 */
public class oops {

    public static void main(String[] args) {

        Student student1=new Student();

        student1.roll=123;
        student1.name="Prabhas";
        student1.marks=89;
        

        System.out.println(student1.roll);
        System.out.println(student1.name);
        System.out.println(student1.marks);



        
    }
}

class Student{
    int roll;
    String name;
    float marks=85;
}