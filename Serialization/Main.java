import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       /* Student student = new Student(123, "XYZ", 45.56f);
        Util.storeStudent(student);

        Student student1 = Util.readStudent();
        System.out.println(student1);*/

        Student student1 = new Student(123, "XYZ", 45.56f);
        //Student student2 = new Student(345, "CVG", 85.56f);

        //Util.serializeStudent(student1);
        //Util.serializeStudent(student2);


        Student s1 = Util.deSerializeStudent();
        //Student s2 = Util.deSerializeStudent()

        System.out.println(s1);

        /*ArrayList<Student> students = Util.fetchStudents();
        for (Student s : students) {
            System.out.println(s);
        }*/

    }
}
