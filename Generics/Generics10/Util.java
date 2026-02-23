public class Util {

    public static void sort(Comparable [] arr) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(arr[j].compareTo(arr[j+1]) >= 1) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }



    public static <T> void sort(T [] arr, Comparator<T> comparator) {
        int passes = arr.length - 1;
        int comps = arr.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(comparator.compare(arr[j], arr[j+1]) >= 1) {
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sortProducts(Product [] products) {

        int passes = products.length - 1;
        int comps = products.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(products[j].getId() > products[j+1].getId()) {
                    Product temp = products[j];
                    products[j] = products[j+1];
                    products[j+1] = temp;
                }
            }
        }

    }

    public static void sortStudentsByRoll(Student [] students) {

        int passes = students.length - 1;
        int comps = students.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(students[j].getRoll() > students[j+1].getRoll()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

    }

    public static void sortStudentsByMarks(Student [] students) {

        int passes = students.length - 1;
        int comps = students.length - 1;

        for(int i = 0; i < passes; i++) {
            for(int j = 0; j < (comps - i); j++) {
                if(students[j].getMarks() > students[j+1].getMarks()) {
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

    }
}
