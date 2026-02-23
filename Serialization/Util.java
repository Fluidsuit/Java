import java.io.*;
import java.util.ArrayList;

public class Util {

    private static final String FILE_PATH = "/Users/vishal/java/student.txt";
    private static final String FILE_PATH1 = "/Users/vishal/java/student_s.txt";

    public static void storeStudent(Student student) {
        try {
            DataOutputStream dout = new DataOutputStream(
                    new FileOutputStream(FILE_PATH)
            );

            dout.writeInt(student.getRoll());
            dout.writeUTF(student.getName());
            dout.writeFloat(student.getMarks());

            dout.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Student readStudent() {
        try {
            DataInputStream din = new DataInputStream(
                    new FileInputStream(FILE_PATH)
            );

            Student student = new Student(
                    din.readInt(),
                    din.readUTF(),
                    din.readFloat()
            );

            din.close();

            return student;

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serializeStudent(Student student) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(FILE_PATH1)
            );
            out.writeObject(student);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Student deSerializeStudent() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(FILE_PATH1)
            );

            Student student = (Student) in.readObject();

            in.close();

            return student;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Student> fetchStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(FILE_PATH1)
            );


            Student student = (Student) in.readObject();
            students.add(student);



            in.close();

            return students;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void printClassInfo1(Class<Product> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printClassInfo'");
    }

    public static void printClassInfo(Class<Product> class1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printClassInfo'");
    }
}

