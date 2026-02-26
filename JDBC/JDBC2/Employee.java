public class Employee {
    private int empNo;
    private String name;
    private String job;
    private int managerId;
    private String hireDate;
    private int sal;
    private int comm;
    private int deptNo;

    public Employee(int empNo, String name, String job, int managerId, String hireDate, int sal, int comm, int deptNo) {
        this.empNo = empNo;
        this.name = name;
        this.job = job;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.sal = sal;
        this.comm = comm;
        this.deptNo = deptNo;
    }

    public int getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(int deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empNo=" + empNo +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", managerId=" + managerId +
                ", hireDate='" + hireDate + '\'' +
                ", sal=" + sal +
                ", comm=" + comm +
                '}';
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getComm() {
        return comm;
    }

    public void setComm(int comm) {
        this.comm = comm;
    }
}
