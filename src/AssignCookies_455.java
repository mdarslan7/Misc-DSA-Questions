import java.util.Arrays;
public class AssignCookies_455 {
    public static void main(String[] args) {
        //Brute Force
        int[] g = {1, 2, 3};
        int[] s = {1, 1};

        Arrays.sort(g);
        Arrays.sort(s);

        int cookies = 0;
        for(int i=0; i<s.length; i++) {
            for(int j=0+cookies; j<g.length; j++) {
                if(s[i] >= g[j]) {
                    cookies++;
                    break;
                }
            }
        }

        System.out.println(cookies);
    }
}
