import java.io.*;

public class Util {

    public static final String FILE_PATH_S =
            "/Users/vishal/java/serialized_products.bin";

    public static void serializeProduct(Product product) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(FILE_PATH_S)
            );

            System.out.println("Inside sp: ");
            System.out.println("out (ref to OOS): " + out.hashCode());
            System.out.println("product (ref to Product) : " + product.hashCode());
            System.out.println("---------------------");

            out.writeObject(product);

            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Product deSerializeProduct() {
        try {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(FILE_PATH_S)
            );
            Product product = (Product) in.readObject();

            System.out.println("------------");
            System.out.println("inside: deSer: ");
            System.out.println("in: " + in.hashCode());
            System.out.println("Product: " + product.hashCode());

            in.close();

            return product;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
