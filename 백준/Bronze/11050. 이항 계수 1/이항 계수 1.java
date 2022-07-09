import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        in = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(in.nextToken());
        int K = Integer.parseInt(in.nextToken());
        if (K > N / 2) {
            K = N - K;
        }
        System.out.println(bino_coef_dynamic(N, K));
    }
    public static int bino_coef_dynamic(int n, int k) {
        int[][] arr = new int[n + 1][k + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                if (j == 0 || j == i)
                    arr[i][j] = 1;
                else
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return arr[n][k];
    }
}