public class KokoEatingBananas_875 {
    public static void main(String[] args) {
        int[] arr = {805306368, 805306368, 805306368};
        int h = 1000000000;

        long start = 1;
        long end = 1000000000;

        while(start <= end) {
            long mid = start + (end-start)/2;
            if(canEatBananas(arr, mid, h))
                end = mid - 1;
            else
                start = mid + 1;
        }

        System.out.println("start: " + (int) start);
    }

    static boolean canEatBananas(int[] arr, long k, int h) {
        long hours = 0;

        for (int i = 0; i < arr.length; i++) {
            long div = arr[i] / k;
            hours += div;
            if (arr[i] % k != 0) hours++;
        }

        return hours <= h;
    }
}
