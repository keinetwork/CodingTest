import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer in = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(in.nextToken());
            int M = Integer.parseInt(in.nextToken());
            if (N > M / 2) {
                N = M - N;
            }
            long a = 1;
            long b = 1;
            for (int j = M - N + 1; j <= M; j++) {
                a *= j;
            }
            for (int j = 2; j <= N; j++) {
                b *= j;
            }
            out.append(a / b).append("\n");
        }
        System.out.println(out);
    }
}