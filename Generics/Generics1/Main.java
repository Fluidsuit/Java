/**
 * The problem
 */
public class Main {
    public static void main(String[] args) {

        HolderInt holderInt = new HolderInt(100);
        System.out.println(holderInt.getData());
        //holderInt.setData("Some string");

        holderInt.setData(200);

        HolderString holderString = new HolderString("BitCode");
        System.out.println(holderString.getData());

        //*** New approach **//

        Holder h1 = new Holder(200);
        int i = (int) h1.getData();
        System.out.println("i = " + i);

        Holder h2 = new Holder("Pune");
        String str = (String) h2.getData();
        System.out.println("str = " + str);

        //some code here

        h1.setData("Pune");
        h2.setData(2000);

        //some code here

        int j = (int) h1.getData();
        System.out.println("j = " + j);

        String str1 = (String) h2.getData();

    }
}
