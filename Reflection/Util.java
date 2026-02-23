import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Util {
    public static void printClassInfo(Class c) {
        System.out.println("Class name: " + c.getName());
        System.out.println("Package name: " + c.getPackageName());
        System.out.println("Is array: " + c.isArray());
        System.out.println("Is interface: " + c.isInterface());

        Class sc = c.getSuperclass();
        if(sc != null) {
            System.out.println("Base class: " + sc.getName());
        }

        System.out.println("*** Methods ***");
        Method [] methods = c.getMethods();
        for(Method method : methods) {
            System.out.print(method.getReturnType().getName() + " ");
            System.out.print(method.getName());
            System.out.print(" (" );
            Parameter [] parameters = method.getParameters();
            for(Parameter p : parameters) {
                System.out.print(p.getType().getName() + " " + p.getName() + ", ");
            }
            System.out.println(" ) " );
        }

        System.out.println();
        System.out.println("*** Constructors ***");
        Constructor [] constructors = c.getConstructors();
        for(Constructor cons : constructors) {
            System.out.print(cons.getName() + "(");
            Parameter [] parameters = cons.getParameters();
            for(Parameter p : parameters) {
                System.out.print(p.getType().getName() + " " + p.getName() + ", ");
            }
            System.out.println(" ) " );
        }

        System.out.println("*** Fields ***");
        Field [] fields = c.getFields();
        for(Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }

        System.out.println("---------------------------");
    }
}
