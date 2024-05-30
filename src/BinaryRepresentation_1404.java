//Brute force approach, not accepted on Leetcode
public class BinaryRepresentation_1404 {
    public static void main(String[] args) {
        int num = 1101;

        int n, temp = 0;
        int count = 0;
        while(num > 0) {
            n = num % 10;
            temp += n * Math.pow(2, count);
            num = num/10;
            count++;
        }

        count = 0;
        while(temp > 1) {
            count++;
            if(temp % 2 == 0) {
                temp /= 2;
            } else {
                temp += 1;
            }
        }

        System.out.println(temp);
        System.out.println(count);
    }
}
