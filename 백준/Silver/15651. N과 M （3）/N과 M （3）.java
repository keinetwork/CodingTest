import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static char[] answer;
    public static StringBuilder out = new StringBuilder();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        N = Integer.parseInt(in.nextToken());
        M = Integer.parseInt(in.nextToken());
        answer = new char[M * 2];
        for (int i = 0; i < M - 1; i++)
            answer[2 * i + 1] = ' ';

        answer[2 * M - 1] = '\n';
        dfs(0);
        System.out.println(out);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            out.append(answer);
            return;
        }

        for (int i = 0; i < N; i++) {
            answer[2 * depth] = (char) (i + '1');
            dfs(depth + 1);
        }

    }
}