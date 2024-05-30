// Perfectly working solution but won't run on Leetcode, because Time Limit Exceeded
//        int low = 100;
//        int high = 300;
//
//        List<Integer> list = new ArrayList<>();
//        String set = "123456789";
//        for(int i=low; i<=high; i++) {
//            String check = String.valueOf(i);
//            if(set.contains(check)) {
//                list.add(i);
//            }
//        }
//        System.out.println(list);

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits_1291 {
    public static void main(String[] args) {
        int low = 100;
        int high = 300;

        //Sliding Window Approach
        List<Integer> list = new ArrayList<>();
        String str = "123456789";
        int startIndex = (int) Math.log10(low) + 1;
        int endIndex = (int) Math.log10(high) + 1;

        for(int i=startIndex; i<=endIndex; i++) {
            for(int j=0; j<=9-i; j++) {
                String sub = str.substring(j, j+i);
                int subNum = Integer.parseInt(sub);

                if(subNum>=low && subNum<=high) {
                    list.add(subNum);
                }
            }
        }

        System.out.println(list);

    }
}