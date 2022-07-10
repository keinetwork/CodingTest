import java.io.IOException;
import java.util.Scanner;

public class Main {
    final static int MOD = 10007;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        if (K > N / 2) {
            K = N - K;
        }

        int M = N - K;
        int a = 1;
        int b = 1;
        for (int i = N; i > M; i--) {
            a = (a * i) % MOD;
        }

        for (int i = K; i > 1; i--) {
            b = (b * i) % MOD;
        }
        while (a % b != 0) {
            a += MOD;
        }
        System.out.println(a / b);
    }
}