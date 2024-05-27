import java.util.Arrays;

public class ReshapeMatrix_566 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}};

        int r = 2;
        int c = 2;

        int a = 0;
        int b = 0;
        int[][] fin = new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++, b++) {
                if(b > mat[0].length-1 && mat.length > 1) {
                    b = 0;
                    a++;
                }
                fin[i][j] = mat[a][b];
            }
        }

        for(int[] arr: fin) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
