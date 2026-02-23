public class Main {
    public static void main(String[] args) {

        Stack<Integer> si = new Stack<Integer>(4);

        si.push(10);
        si.push(20);
        System.out.println(si.pop());
        System.out.println(si.pop());
        System.out.println(si.pop());


        Stack<String> ss = new Stack<String>(5);
        ss.push("AA");
        ss.push("BB");
        ss.push("CC");

        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());
        System.out.println(ss.pop());

    }
}
