import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        Main main = new Main();
        int ans = main.result(N, K);
        System.out.println(ans);
    }

    public int result(int N, int K) {
        int maxP = -1;
        int[] ans = new int[K];
        for (int i = 0; i < K; i++, maxP++) {
            ans[i] = i + 1;
            N -= i + 1;
        }
        if (N < 0) return -1;
        while (N > 0) {
            for (int i = 0; i < K; i++) {
                if (N == 0) return ans[maxP] - ans[(maxP + 1) % K];
                if (N < K) {
                    for (int j = 0; j < K; j++) {
                        int index = (maxP + 1 + j) % K;
                        if (ans[index] + N > ans[maxP]) {
                            return ans[index] + N - ans[(maxP + 1) % K];
                        }
                    }
                }
                ans[i] += K;
                N -= K;
                maxP = ++maxP % K;
            }
        }
        return ans[maxP] - ans[(maxP + 1) % K];
    }
}
