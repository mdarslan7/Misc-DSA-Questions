import java.util.Arrays;

public class LargestNumber_179 {
     static int compare(int a, int b) {
        String c = Integer.toString(a);
        String d = Integer.toString(b);

        String temp = c;
        c = c+d;
        d = d+temp;

        a = Integer.parseInt(c);
        b = Integer.parseInt(d);

        if(a > b) {
            return 0;
        }
        else {
            return 1;
        }
     }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                int res = compare(arr[j], arr[j+1]);
                if(res == 1) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        String ans = "";
        for(int i=0; i<arr.length; i++) {
            String x = Integer.toString(arr[i]);
            ans += x;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(ans);
    }
}
