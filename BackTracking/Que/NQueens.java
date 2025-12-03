import java.util.ArrayList;
import java.util.List;

public class NQueens {

    // Main function to test the N-Queens solution
    public static void main(String[] args) {
        int n = 4;  // Change this to any N
        List<List<String>> board = new ArrayList<>();
        
        // Initialize the board with '.' (empty spaces) for each row
        for (int i = 0; i < n; i++) {
            List<String> row = new ArrayList<>();
            // Fill each row with "."
            for (int j = 0; j < n; j++) {
                row.add(".");
            }
            board.add(row);
        }

        solveNQueen(board, 0, n);
    }

    // Function to solve N-Queens problem using backtracking
    public static void solveNQueen(List<List<String>> board, int row, int n) {
        if (row == n) {
            printBoard(board); // Print the board when a solution is found
            System.out.println("-----------");
            return; // Continue searching for other solutions (don't return true)
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board.get(row).set(col, "Q"); // Place queen at (row, col)

                // Recur to place the rest of the queens
                solveNQueen(board, row + 1, n);

                board.get(row).set(col, "."); // Backtrack: Remove the queen
            }
        }
    }

    // Function to check if placing a queen at (row, col) is safe
    public static boolean isSafe(List<List<String>> board, int row, int col, int n) {
        // Check column for another queen
        for (int i = 0; i < row; i++) {
            if (board.get(i).get(col).equals("Q")) {
                return false;
            }
        }

        // Check upper-left diagonal for another queen
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }

        // Check upper-right diagonal for another queen
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board.get(i).get(j).equals("Q")) {
                return false;
            }
        }

        return true; // Safe to place the queen
    }

    // Function to print the current state of the board
    public static void printBoard(List<List<String>> board) {
        for (List<String> row : board) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
