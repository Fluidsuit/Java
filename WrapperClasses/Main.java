public class Main {
    public static void main(String[] args) {
        int i;

        Object obj = 10; //java will auto box the int into an object of Integer
        //obj = new Integer(10); //Okay
        obj = Integer.valueOf(10);

        Object [] container = new Object[5];
        container[0] = "Vishal";
        container[1] = 'A'; //auto boxing
        //container[1] = new Character('A'); //Okay
        container[1] = Character.valueOf('A');

        Holder holder = new Holder("Pune");
        holder.setObj(12.12); //Double

        Integer iObj = Integer.valueOf(100);
        Integer iObj1 = 200;

        int iVal = iObj.intValue();
        iVal = iObj; //Auto unboxing
    }
}
