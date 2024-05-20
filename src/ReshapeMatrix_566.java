public class ReshapeMatrix_566 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int length = 2;
        int[][] fin = new int[2][2];
        for(int i=0; i<fin.length; i++) {
            for(int j=0; j<fin[i].length; j++, b++) {
                if(b > length-1) {
                    b = 0;
                    a++;
                }
                System.out.println(a + " " + b);
            }
        }
    }
}
