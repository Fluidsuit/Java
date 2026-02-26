import java.sql.Connection;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1;
        int ch;
        do {
            System.out.println("1.Add Student:");
            System.out.println("2.Get Student by Id:");
            System.out.println("3.Get All Student:");
            System.out.println("4.Update Student:");
            System.out.println("5.Delete Student:");

            System.out.println("Enter Your Choice:");
            ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    int id, marks;
                    String name, email;

                    System.out.print("Enter id:");
                    id = sc.nextInt();

                    System.out.print("Enter name:");
                    name = sc.next();

                    System.out.print("Enter email:");
                    email = sc.next();

                    System.out.print("Enter marks:");
                    marks = sc.nextInt();

                    Student s = new Student(id, name, email, marks);
                    StudentServices.addStudent(s);
                }
                case 2 -> {
                    int id;
                    System.out.print("Enter id:");
                    id = sc.nextInt();
                    Student s=StudentServices.getStudentById(id);
                    System.out.println("Id: " + s.getId());
                    System.out.println("Name: " + s.getName());
                    System.out.println("Email:" + s.getEmail());
                    System.out.println("Marks:" + s.getMarks());
                }

                case 3 -> {
                    StudentServices.getAllStudent();
                }

                case 4 -> {
                    int id, marks;
                    System.out.print("Enter id:");
                    id = sc.nextInt();
                    System.out.print("Enter marks:");
                    marks = sc.nextInt();
                    StudentServices.updateStudent(id, marks);
                }

                case 5 -> {
                    int id;
                    System.out.print("Enter id:");
                    id = sc.nextInt();
                    StudentServices.deleteStudent(id);
                }
            }
            System.out.println("Do you wanna Continue?(y/n):");
            String temCh1 = sc.next();
            ch1 = temCh1.charAt(0);

        } while (ch1 == 'y'|| ch1 == 'Y');
    }
}