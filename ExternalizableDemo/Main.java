public class Main {
    public static void main(String[] args) {

        System.err.println("this is error!");
        System.out.println( System.err.getClass().getName());


        Product product = new Product(
                101,
                "Some product",
                1000,
                "https://bitcode.in/products/image.jpg"
        );

        //Util.serializeProduct(product);

        Product product1 = Util.deSerializeProduct();
        System.out.println(product1);

    }
}
