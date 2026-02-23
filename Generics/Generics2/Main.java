public class Main {
    public static void main(String[] args) {

        //create object hs of Holder for type String
        Holder<String> hs = new Holder<String>("Pune");
        //hs.setData(123);
        String str = hs.getData();
        System.out.println(str);
        hs.setData("Mum");

        //create object hi of Holder for type Integer
        Holder<Integer> hi = new Holder<Integer>(1234);
        //hi.setData("some string");
        hi.setData(3456);
        int i = hi.getData();
        System.out.println("i = " + i);

        Holder h = new Holder(90);
        System.out.println();

        Pair<Integer, String> p1 = new Pair<Integer, String>(30, "Blue");
        System.out.println(p1);

        Pair<String, int []> p2 =
                new Pair<String, int[]>(
                        "vishal",
                        new int[]{10, 20, 30}
                );
        System.out.println(p2.getKey());
        for(int num  : p2.getVal()) {
            System.out.println(num);
        }
        System.out.println(p2);

    }
}


class Stack<T> {
    
}