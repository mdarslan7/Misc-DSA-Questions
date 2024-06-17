public class ReachANumber_754 {
    public static void main(String[] args) {
        int target = 2;
        int sum = 0 ,steps = 0;

        target = Math.abs(target);
        while(sum< target){
            sum+=steps;
            steps++;
        }

        while(((sum-target)%2!=0)){
            sum+=steps;
            steps++;
        }
        System.out.println(steps - 1);
    }
}
