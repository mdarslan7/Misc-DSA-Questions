public class SequentialDigits_1291 {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;
        for(int i=low; i<=high; i++) {
            String numberStr = String.valueOf(i);
            int[] digits = new int[numberStr.length()];
            for (int j = 0; j < numberStr.length(); j++) {
                digits[j] = Character.getNumericValue(numberStr.charAt(j));
            }
            boolean flag = false;
            int cur = digits[0];
            for(int k=1; k<digits.length; k++) {
                if(cur + 1 == digits[k]) {
                    flag = true;
                }
                else {
                    flag = false;
                    break;
                }
                cur = digits[k];
            }

//            System.out.println(Arrays.toString(digits));
//            System.out.println("final: " + flag);a
            if(flag) {
                int result = 0;
                for (int digit : digits) {
                    result = result * 10 + digit;
                }
                System.out.println(result);
            }
        }
    }
}