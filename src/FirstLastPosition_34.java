import java.util.Arrays;

public class FirstLastPosition_34 {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = sortedSearch(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] sortedSearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        int tag1 = -1, tag2 = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;

            if (nums[mid] < target) {
                start = mid + 1;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                tag1 = nums[mid];
                if(nums[mid-1] == tag1)
                    tag2 = mid-1;
                else
                    tag2 = mid+1;

                tag1 = mid;
                if(tag1 > tag2) {
                    int temp = tag1;
                    tag1 = tag2;
                    tag2 = temp;
                }

                return new int[] {tag1, tag2};
            }
        }

        return new int[] {-1, -1};
    }
}
