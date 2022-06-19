import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int m = 1; m < N; m++) {
            if (N == m + divide(m)) {
                ans = m;
                break;
            }
        }
        System.out.println(ans);
    }

    public static int divide(int a) {
        int ans = a % 10;
        for (int i = 0; i < 6; i++) {
            a = a / 10;
            if (a == 0) break;
            ans += (a % 10);
        }
        return ans;
    }
}
