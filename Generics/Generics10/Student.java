public class Student implements Comparable{
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Object obj) {
        Student s = (Student) obj;
        if(this.marks > s.marks) {
            return 1;
        }
        if(this.marks < s.marks) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}


class StudentComparatorByMarks implements Comparator<Student>{
    public int compare(Student s1, Student s2) {
        if(s1.getMarks() > s2.getMarks()) {
            return 1;
        }
        if(s1.getMarks() < s2.getMarks()) {
            return -1;
        }
        return 0;
    }
}

class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}