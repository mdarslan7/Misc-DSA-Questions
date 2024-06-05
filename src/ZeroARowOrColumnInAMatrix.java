import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ZeroARowOrColumnInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 0, 8},
                {9, 10, 11, 12}
        };

        // First pass: identify the rows and columns to be zeroed
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Second pass: zero out identified rows and columns
        for (int row : rows) {
            Arrays.fill(matrix[row], 0);
        }

        for (int col : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][col] = 0;
            }
        }

        // Print the result
        System.out.println(Arrays.deepToString(matrix));
    }
}
