 
public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(100, 100);
        p1.display();
        System.out.println(p1);

        String s1 = new String("BitCode");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());

        System.out.println();

        String s2 = "java"; //String s2 = new String("java");
        System.out.println(s2);
        System.out.println(s2.length());
        System.out.println(s2.toUpperCase());
        System.out.println();

        System.out.println( "This is a string".length() );

        //Strings are immutable
        String s3 = "Vishal";
        String s4 = "Vishal";

        System.out.println(s3 == s4);

        String s5 = "I love India!";
        String s6 = "love Ind";
        String s7 = s5.substring(2, 10);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s6 == s7);
    }
}
