public class Info {

    private int info;

    public Info(int info) {
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void display(){
        System.out.println("Info = " + info);
    }

    public void data1(String d1) {
        System.out.println("Data1 = " + d1);
    }

    public void data2(int d2) {
        System.out.println("Data2 = " + d2);
    }

    public void data3(String data3, int intdata3) {
        System.out.println("Data3 = " + data3 + " " + intdata3);
    }
}
