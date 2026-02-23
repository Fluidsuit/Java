public class Data implements Person{

    private int data;

    public Data(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public void data1(String d1) {
        System.out.println("Data1 = " + d1);
    }

    @Override
    public void data2(int d2) {
        System.out.println("Data2 = " + d2);
    }

    @Override
    public void data3(String data3, int intdata3) {
        System.out.println("Data3 = " + data3 + " " + intdata3);
    }

    public void display(){
        System.out.println("Data = " + data);
    }
}
