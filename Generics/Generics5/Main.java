public class Main {
    public static void main(String[] args) {
        Holder1<String> hs1 = new Holder1<String>("some string");
        Pair1<String, Integer> p1 = new Pair1<String, Integer>("city", 1);

        //new Holder<String>();
        new Holder<Byte>();
        new Holder<Double>();
    }
}
