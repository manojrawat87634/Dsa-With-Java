public class ThreeDArray {

    public static void main(String[] args) {

        // 3D Array: [blocks][rows][columns]
        int[][][] arr = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        System.out.println("3D Array Elements:");

        for (int i = 0; i < arr.length; i++) {              // blocks
            for (int j = 0; j < arr[i].length; j++) {       // rows
                for (int k = 0; k < arr[i][j].length; k++) {// columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total blocks: " + arr.length);
    }
}
