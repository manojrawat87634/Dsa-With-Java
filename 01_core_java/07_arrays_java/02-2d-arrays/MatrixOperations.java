public class MatrixOperations {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = 0;
        int max = matrix[0][0];
        int min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                int value = matrix[i][j];
                sum += value;

                if (value > max) {
                    max = value;
                }

                if (value < min) {
                    min = value;
                }
            }
        }

        System.out.println("Sum of all elements: " + sum);
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
