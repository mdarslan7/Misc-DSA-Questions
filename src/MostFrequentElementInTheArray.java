public class MostFrequentElementInTheArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3};
        int maxSum = 1;
        int currSum = 1;
        int currElement = arr[0];
        int mostFrequent = -1;

        for(int i=1; i<arr.length; i++) {
            if(arr[i] == currElement) {
                currSum++;
                if(maxSum < currSum) {
                    maxSum = currSum;
                    mostFrequent = arr[i];
                }
            } else {
                currElement = arr[i];
                currSum = 1;
            }
        }

        System.out.println("Most frequent element is: " + mostFrequent);
    }
}
