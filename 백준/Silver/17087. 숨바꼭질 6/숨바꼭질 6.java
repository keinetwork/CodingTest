import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(token.nextToken());
        int S = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(br.readLine(), " ");
        int[] pivot = new int[N];
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(token.nextToken());
            pivot[i] = Math.abs(S - A);
        }

        int gcd = pivot[0];
        for (int i = 0; i < N; i++) {
            gcd = Euclidean(gcd, pivot[i]);
        }
        System.out.println(gcd);
    }

    static int Euclidean(int a, int b) {
        int r = a % b;
        if (r == 0) {
            return b;
        }
        return Euclidean(b, r);
    }
}
