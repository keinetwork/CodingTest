import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T ; i++) {
            int N = Integer.parseInt(br.readLine());
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <N ; j++) {
                int n = Integer.parseInt(st.nextToken());
                min = Math.min(min, n);
                max = Math.max(max, n);
            }
            System.out.println(String.format("%d %d", min, max));
        }
    }
}
