import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 3628800};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        in = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(in.nextToken());
        int K = Integer.parseInt(in.nextToken());
        if (K > N / 2) {
            K = N - K;
        }
        System.out.println(fact[N] / fact[K] / fact[N - K]);
    }
}