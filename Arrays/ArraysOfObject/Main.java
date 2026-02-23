import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //2
//        Book [] books = new Book[4];
//
//        books[0] = new Book(34908, "Java in Depth");
//        books[1] = new Book(1238, "Java for Expert");
//        books[2] = new Book(90569, "I Like Java");
//        books[3] = new Book(23290, "I hate Java!");
//
//        for(int i = 0; i < books.length; i++) {
//            //System.out.println(books[i]);
//            books[i].display();
//        }
//
//        System.out.println("--------------------------");
//
//        String bookName;
//        int srNo;
//        Scanner scanner = new Scanner(System.in);
//
//        for(int i = 0; i < books.length; i++) {
//            System.out.println("Enter srno and book name: ");
//            srNo = scanner.nextInt();
//            scanner.nextLine();
//            bookName = scanner.nextLine();
//            books[i] = new Book(srNo, bookName);
//        }
//
//        for(int i = 0; i < books.length; i++) {
//            //System.out.println(books[i]);
//            books[i].display();
//        }


        //1
        System.out.println("Command line arguments: ");
        for(int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);

        String [] names = new String[4];
//        for(int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }

        System.out.println();

        System.out.println("Enter names: ");
        for(int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }

        System.out.println();
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
