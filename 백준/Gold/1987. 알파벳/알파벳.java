import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int R,C;
    static char[][] board;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int max = 0;
    static boolean[] visited = new boolean[26];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new char[R][C];
        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            board[i] = line.toCharArray();
        }

        dfs(0,0,1);
        System.out.println(max);
    }

    static void dfs(int x, int y, int count) {
        visited[board[x][y]-'A'] = true;
        for (int i = 0; i <4 ; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if ((0<= nx && 0<= ny) && (nx < R && ny < C) && (!visited[board[nx][ny]-'A'])){
                dfs(nx, ny, count+1);
            }
        }
        visited[board[x][y]-'A'] = false;
        max = Math.max(max, count);
    }
}