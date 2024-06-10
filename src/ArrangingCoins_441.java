public class ArrangingCoins_441 {
    public static void main(String[] args) {
        int coins = 8;
        int steps = 0;

        //making sure that we are only getting inside the loop and
        //constructing a row when when we have equal to or greater
        //number of coins than required in ith row
        for(int i=1; coins>=i; i++) {
            coins -= i;
            steps++;
        }

        System.out.println(steps);

        // Correct Logic but Time Limit Exceeded
//        int coins = 5;
//        int steps = -1;
//
//        for(int i=1; coins>0; i++) {
//            for(int j=1; j<=i; j++) {
//                coins--;
//                if(coins == 0 && j != i) {
//                    steps = --i;
//                    break;
//                }
//
//                if(coins == 0 && j == i) {
//                    steps = i;
//                    break;
//                }
//            }
//        }
//
//        System.out.println("Loop Terminated!");
//        System.out.println(steps);
    }
}
