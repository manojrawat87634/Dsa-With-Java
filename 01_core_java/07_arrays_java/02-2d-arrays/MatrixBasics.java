public class MatrixBasics {

    public static void main(String[] args) {

        // Declaration & Initialization
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Rows and Columns
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Rows: " + rows);
        System.out.println("Columns: " + cols);

        // Accessing elements
        System.out.println("Element at (0,0): " + matrix[0][0]);
        System.out.println("Element at (2,1): " + matrix[2][1]);
    }
}
