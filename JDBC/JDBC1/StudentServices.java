public class StudentServices {

    public static void addStudent(Student s){
        StudentDAO stuDAO= new StudentDAOImpl();
        stuDAO.addStudent(s);
    }
    public static Student getStudentById(int id){
        StudentDAO stuDAO= new StudentDAOImpl();
     Student s=stuDAO.getStudentById(id);
         return s;
    }
    public static void getAllStudent(){
        StudentDAO stuDAO= new StudentDAOImpl();
        stuDAO.getAllStudent();
    }
    public static void updateStudent(int id,int marks){
        StudentDAO stuDAO= new StudentDAOImpl();
        stuDAO.updateStudentMarks(id,marks);
    }
    public static void deleteStudent(int id){
        StudentDAO stuDAO= new StudentDAOImpl();
        stuDAO.deleteStudent(id);
    }
}
