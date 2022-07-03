import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        for (int j = 0; j < M; j++) {
            int T = Integer.parseInt(br.readLine());
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[T];
            for (int i = 0; i < T; i++) {
                arr[i] = Integer.parseInt(token.nextToken());
            }

            long lcm = LCM(arr[0], arr[1]);
            for (int i = 2; i < T; i++) {
                lcm = LCM(lcm, arr[i]);
            }
            if (lcm > Math.pow(10, 9)) {
                System.out.println("More than a billion.");
            } else {
                System.out.println(lcm);
            }
        }
    }

    // greatest common divisor
    static long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple
    static long LCM(long a, long b) {
        return (a / GCD(a, b) * b);
    }
}