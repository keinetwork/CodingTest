import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        System.out.println(res % 10);
    }
}