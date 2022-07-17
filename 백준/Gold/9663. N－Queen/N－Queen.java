import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int answer = 0;
    static int[][] queen;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        queen = new int[N][2];
        dfs(0);
        System.out.println(answer);
    }

    public static boolean check(int depth, int y) {
        for (int i = 0; i < depth; i++) {
            // 수평검사
//            if (queen[i][0] == depth) return false;
            // 수직 검사
            if (queen[i][1] == y) return false;
            // 대각선 검사
            if ((queen[i][0] - depth) == (queen[i][1] - y)) return false;
            if ((queen[i][0] - depth) == (y - queen[i][1])) return false;

        }
        return true;
    }

    public static void dfs(int depth) {
        if (depth == N) {
            answer++;
            return;
        }
        queen[depth][0] = depth;
        for (int y = 0; y < N; y++) {
            if (check(depth, y)) {
                queen[depth][1] = y;
                dfs(depth + 1);
            }
        }
    }
}