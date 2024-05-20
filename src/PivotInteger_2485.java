public class PivotInteger_2485 {
    public static void main(String[] args) {
        int left = 1;
        int right = 8;
        int s1 = 0, s2 = 0;

        while(left < right) {
            s1 += left;
            s2 += right;

            System.out.println(s1 + " " + s2);

            if(s1 == s2) {
                System.out.println("Found it " + s1);
            }

            left++;
            right--;
        }
    }
}
