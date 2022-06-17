import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Math.abs(Integer.parseInt(token.nextToken()));
        int S = Math.abs(Integer.parseInt(token.nextToken()));

        if (N > S) {    // 큰수가 a, 작은수 b
            System.out.println(GCD(N, S));
            System.out.println(LCM(N, S));
        } else {
            System.out.println(GCD(S, N));
            System.out.println(LCM(S, N));
        }
    }

    // greatest common divisor
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

}
