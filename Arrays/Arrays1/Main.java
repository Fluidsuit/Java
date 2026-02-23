public class Main {
    public static void main(String[] args) {

        //int[] arr = new int[5];
        //int[] arr = new int[] {11, 22, 33, 44, 55};
        /*int[] arr = {11, 22, 33, 44, 55};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println(arr.getClass().getName());*/

        //2-D arrays
        int [][] arr = new int[4][3];

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
