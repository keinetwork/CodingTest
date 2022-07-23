import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        StringBuilder out = new StringBuilder();
        int N = Integer.parseInt(in.nextToken());
        int M = Integer.parseInt(in.nextToken());
        int[][] A = new int[N][M];
        for (int i = 0; i < N; i++) {
            in = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(in.nextToken());
            }
        }
        for (int i = 0; i < N; i++) {
            in = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int b = A[i][j] + Integer.parseInt(in.nextToken());
                out.append(b).append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
    }
}