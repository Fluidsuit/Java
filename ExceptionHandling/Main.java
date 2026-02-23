public class Main {
    public static void main1(String[] args) {

        int num1 = 10, num2 = 2;
        int res;

        try {
            res = num1 / num2;
            System.out.println("res = " + res);

            try {
                int[] arr = new int[]{10, 20, 30};
                System.out.println(arr[7]);
            }
            catch (NullPointerException ne) {
                System.out.println(ne.getMessage());
            }
            /*catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println("Inner: Invalid index");
            }*/

            String str = "Something";
            System.out.println(str.length());
        }
        catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println(ae.getMessage());
            System.out.println("Can not divide by 0...");
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae.getMessage());
            System.out.println("Outer: Array index invalid");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
            e.printStackTrace();
        }


        System.out.println("End of main");
    }

    public static void main(String[] args) throws NegativeSalException{
        Emp e1 = new Emp(101, "AA", 1000);

        e1.setSalNew(2000);

        try {
            e1.setSalNew(-1000);
        } catch (NegativeSalException e) {
            System.out.println(e.getMessage());
        }

        try {
            //e1.setSal(-100);
            e1.setSalNew(-100);
        }
        catch(NegativeSalException ne) {
            System.out.println("My action...");
            System.out.println(ne.getMessage());
        }
        System.out.println(e1);
    }
}
