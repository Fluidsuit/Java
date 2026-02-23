public class Main {
    public static void main(String[] args) {
        //Outer.Inner in1 = new Outer.Inner(110); //Error
        //Outer.out = 10; //out is not a static member

        Outer o1 = new Outer(100);
        o1.display();

        System.out.println();

        Outer.Inner in11 = o1.new Inner(110);
        in11.display();
        Outer.Inner in12 = o1.new Inner(120);
        in12.display();

        System.out.println();
        in11.incrementOut();
        o1.display();
        System.out.println();

        System.out.println();

        Outer o2 = new Outer(200);
        o2.display();

        Outer.Inner o21 = o2.new Inner(210);
        o21.display();
        Outer.Inner o22 = o2.new Inner(220);
        o22.display();
    }
}
