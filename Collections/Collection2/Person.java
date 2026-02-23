import java.util.Comparator;

public class Person {
    private int aadhar;
    private String name;

    public Person(int aadhar, String name) {
        this.aadhar = aadhar;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "aadhar=" + aadhar +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAadhar() {
        return aadhar;
    }

    public void setAadhar(int aadhar) {
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAadhar() > o2.getAadhar()) {
            return 1;
        }
        if(o1.getAadhar() < o2.getAadhar()) {
            return -1;
        }
        return 0;
    }
}