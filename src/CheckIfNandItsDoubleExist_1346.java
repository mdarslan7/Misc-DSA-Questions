import java.util.Arrays;

public class CheckIfNandItsDoubleExist_1346 {
    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            int target = arr[i] * 2;
            int ans = binarySearch(arr, target);
            if(ans != -1) {
                System.out.println(true);
                System.exit(0);
            }
        }
        System.out.println(false);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }
}
