public class Emp {
    private int id;
    private String name;
    private int sal;

    public Emp(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
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
        try {
            if(sal <= 0) {
                //throw new ArithmeticException("Negative sal " + sal);
                throw new NegativeSalException(id, sal, "Invalid sal amount!");
            }
            this.sal = sal;
        }
        catch (NegativeSalException ne) {
            System.out.println(ne);
        }
        /*catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }*/
    }

    public void setSalNew1(int sal) throws NegativeSalException{
        try {
            if(sal <= 0) {
                //throw new ArithmeticException("Negative sal " + sal);
                throw new NegativeSalException(id, sal, "Invalid sal amount!");
            }
            this.sal = sal;
        }
        catch (NegativeSalException ne) {
            System.out.println(ne);
            throw  ne;
        }
        /*catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }*/
    }

    public void setSalNew(int sal) throws NegativeSalException{
        if(sal <= 0) {
            //throw new ArithmeticException("Negative sal " + sal);
            throw new NegativeSalException(id, sal, "Invalid sal amount!");
        }
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
