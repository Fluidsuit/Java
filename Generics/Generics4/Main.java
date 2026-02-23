public class Main {

    public static void main(String[] args) {

    }


    public static void main1(String[] args) {

        Holder<Integer> hi = new Holder<Integer>(10);
        Holder<Float> hf = new Holder<Float>(12.12f);
        Holder<String> hs = new Holder<String>("Pune BitCode");
        Holder<Boolean> hb = new Holder<Boolean>(true);

        Util.fun1(hi);
        //Util.fun1(hf);
        //Util.fun2(hi);
        Util.fun2(hs);

        System.out.println("----------------");

        Util.fun3(hi);
        Util.fun3(hs);
        Util.fun3(hf);

        System.out.println("---- fun4 ----");
        Util.fun4(hi);
        Util.fun4(hs);
        Util.fun4(hf);
        Util.fun4(hb);

        System.out.println("---- fun5 ----");
        Util.fun5(hi);
        //Util.fun5(hs);
        Util.fun5(hf);
        //Util.fun5(hb);

    }
}


