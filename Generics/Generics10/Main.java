public class Main {
    public static void main(String[] args) {

        Product [] products = new Product[5];
        products[0] = new Product(101, "Laptop", 3456);
        products[1] = new Product(345, "Projector", 4590);
        products[2] = new Product(54, "TV", 2341);
        products[3] = new Product(99, "Cell phone", 1200);
        products[4] = new Product(230, "Smart Watch", 1800);

        Util.sort(products, new ProductComparatorByPrice());

        for(int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }

        System.out.println();

        Student [] students = new Student[5];
        students[0] = new Student(45, "DR", 56);
        students[1] = new Student(34, "CV", 90);
        students[2] = new Student(23, "AB", 65);
        students[3] = new Student(55, "OP", 44);
        students[4] = new Student(12, "QW", 87);

        Util.sort(students, new StudentComparatorByName());

        for(Student student : students) {
            System.out.println(student);
        }

        //Error
        //Util.sort(students, new ProductComparatorByPrice());


    }
}
