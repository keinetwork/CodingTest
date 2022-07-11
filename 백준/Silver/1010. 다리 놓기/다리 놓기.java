import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int[][] dp = new int[30][30];
        for (int a = 0; a < 30; a++) {
            for (int b = 0; b <= a; b++)
                if (b == 0 || a == b) {
                    dp[a][b] = 1;
                } else {
                    dp[a][b] = dp[a - 1][b - 1] + dp[a - 1][b];
                }
        }
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(in.nextToken());
            int M = Integer.parseInt(in.nextToken());
            out.append(dp[M][N]).append("\n");
        }
        System.out.println(out);
    }
}