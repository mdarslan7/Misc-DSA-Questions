import java.util.Scanner;

public class SearchOfAnEasyProblem_CF {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int people = sc.nextInt();

        int[] responses = new int[people];
        for(int i=0; i<responses.length; i++) {
            responses[i] = sc.nextInt();
        }

        boolean flag = false;
        for(int i=0; i<responses.length; i++) {
            if(responses[i] == 1) {
                flag = true;
                System.out.println("HARD");
                break;
            }
        }

        if(!flag) {
            System.out.println("EASY");
        }
    }
}
