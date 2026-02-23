public class Outer {
    private int out;

    public Outer(int out) {
        this.out = out;
    }

    public void display() {
        System.out.println("out = " + out);
    }

    public int getOut() {
        return out;
    }

    public void setOut(int out) {
        this.out = out;
    }

    //class Inner is a non-static member of Outer
    //The class Inner will have existence when you create an object of Outer
    public class Inner  {
        private int in;

        public Inner(int in) {
            this.in = in;
        }

        public void display() {
            Outer.this.display();
            System.out.println("in = " + in + " out = " + out);
        }

        public int getIn() {
            return in;
        }

        public void setIn(int in) {
            this.in = in;
        }

        public void incrementOut() {
            out++;
        }
    }
}

/*
* Non-static inner class object will be internally containing a reference to the
* outer class object using which it is created.
*
* Non-static inner class can access the members of outer class
*/
