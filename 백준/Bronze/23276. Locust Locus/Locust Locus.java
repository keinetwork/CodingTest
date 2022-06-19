import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < K; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            int y = Integer.parseInt(token.nextToken());
            int c1 = Integer.parseInt(token.nextToken());
            int c2 = Integer.parseInt(token.nextToken());
            ans = Math.min(ans, y + LCM(c1, c2));
        }
        System.out.println(ans);
    }

    // greatest common divisor
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple (a*b/GCD(a,b)) oerverflow
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
