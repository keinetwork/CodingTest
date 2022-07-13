import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        arr = new int[M];
        visit = new boolean[N];
        dfs(N, M, 0);
        System.out.println(out);
    }

    public static void dfs(int N, int M, int depth) {
        if (depth == M) {
            for (int val : arr) {
                out.append(val).append(' ');
            }
            out.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1);
                visit[i] = false;
            }
        }
    }
}