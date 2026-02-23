public class Main {
    public static void main(String[] args) {

        Data dataofajay = new Data(200);
        dataofajay.display();
        dataofajay.setData(500);
        dataofajay.display();
        dataofajay.data1("Data from data class");
        dataofajay.data2(10);
        dataofajay.data3("ajay",1);

        System.out.println();

        Info infoofajay = new Info(200);
        infoofajay.display();
        infoofajay.setInfo(500);
        infoofajay.display();
        infoofajay.data1("Info from info class");
        infoofajay.data2(10);
        infoofajay.data3("Ajay" ,10);

        System.out.println();

        Person p1 = dataofajay;
        p1.data1("Person cLass");
        p1.data2(10);
        p1.data3("ajay from person class" , 1);
//        Person p2 = infoofajay;
    }
}