public class Employee {
    private int id;
    private String name;
    private int sal;
    private Date dob;

    public Employee(int id, String name, int sal, int day, int month, int year) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        dob = new Date(day, month, year);
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(sal);
        System.out.println(dob.getDay() + " - " + dob.getMonth() + " - " + dob.getYear());
    }

    public void setDob(int day, int month, int year) {
        if(year <= 2007) {
            dob.setDay(day);
            dob.setMonth(month);
            dob.setYear(year);
        }
    }

    public Date getDob() {
        return new Date(dob.getDay(), dob.getMonth(), dob.getYear());
        /*return dob;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
}
