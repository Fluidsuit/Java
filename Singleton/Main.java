public class Main {
    public static void main(String[] args) {

        //Maths m1 = new Maths();
        Maths m1 = Maths.getInstance();
        System.out.println(m1.hashCode());
        System.out.println("res = " + m1.add(10, 20));

        //some code goes here

        //Maths m2 = new Maths();
        Maths m2 = Maths.getInstance();
        System.out.println(m2.hashCode());
        System.out.println("res = " + m2.sub(10, 20));

        //Some code goes here

        //Maths m3 = new Maths();
        Maths m3 = Maths.getInstance();
        System.out.println(m3.hashCode());
        System.out.println("res = " + m3.add(11, 20));

    }
}
