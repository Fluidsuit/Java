public class Util {

    public static void fun1(Holder<Integer> hi) {
        System.out.println("fun1: " + hi.getData());
    }

    public static void fun2(Holder<String> hs) {
        System.out.println("fun2: " + hs.getData());
    }

    //fun2 accepts any type Holder object
    public static void fun3(Holder ho) {
        System.out.println(ho.getData().getClass().getName());
        System.out.println("fun3: " + ho.getData());
        System.out.println("------------------");
    }

    public static void fun4(Holder<?> h) {
        System.out.println("fun4: " + h.getData());
        System.out.println("***************");
    }

    public static void fun5(Holder<? extends Number> h) {
        System.out.println("fun5: " + h.getData());
    }


    public void demo1(Pair<Integer, String> p) {
        System.out.println("demo1: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo2(Pair<String, Float> p) {
        System.out.println("demo2: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo3(Pair<Integer, Integer> p) {
        System.out.println("demo3: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo4(Pair p) {
        System.out.println("demo4: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }


    public void demo5(Pair<?, ?> p) {
        System.out.println("demo5: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo6(Pair<?, String> p) {
        System.out.println("demo6: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo7(Pair<String, ?> p) {
        System.out.println("demo7: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo8(Pair<String, ? extends Number> p) {
        System.out.println("demo8: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

    public void demo9(Pair<? extends Number, ? extends String> p) {
        System.out.println("demo9: ");
        System.out.println(p.getKey() + " - " + p.getVal());
        System.out.println("----------------");
    }

}
