import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        Util.printClassInfo(Product.class);
        Util.printClassInfo(String.class);
        Util.printClassInfo(Runnable.class);

        Product p1 = new Product();
        System.out.println(p1.getClass() == Product.class);
        System.out.println();

        Util.printClassInfo(System.class);

        int [] arr = new int[0];
        Util.printClassInfo(arr.getClass());

        Shape s = new Circle(100, 100, 50);
        ((Circle)s).setR(60);
        Util.printClassInfo(s.getClass());
        //((Rect)s).setW(90); //Exception

//        Product p1 = new Product();
//        Product p2 = new Product(9098, "Some Product", 1234);
//
//        Method mDisplay = p1.getClass().getMethod("display");
//        mDisplay.invoke(p1); //p1.display()
//        mDisplay.invoke(p2); //p2.display()
//
//        Method mSetId = Product.class.getMethod("setId", int.class);
//        mSetId.invoke(p1, new Object[]{ 5689 } );
//        p1.display();
//
//        System.out.println();
//
//        Method mInit = Product.class.getMethod(
//                "init",
//                new Class[] {int.class, String.class, float.class}
//        );
//        mInit.invoke(p1, new Object[]{555, "laptop", 90912});
//        p1.display();
//
//        System.out.println("***************************");
//
//        Constructor productDefaultCons = Product.class.getConstructor();
//        Product p3 = (Product) productDefaultCons.newInstance();
//        p3.display();
//
//        Constructor productParamCons = Product.class.getConstructor(
//                new Class[] {int.class, String.class, float.class}
//        );
//        Product p4 = (Product) productParamCons.newInstance(
//                new Object[]{2322, "Cell Phone", 12340}
//        );
//        p4.display();

    }
}
