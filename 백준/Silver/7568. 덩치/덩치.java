import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine(), " ");
            xy[i][0] = Integer.parseInt(token.nextToken());
            xy[i][1] = Integer.parseInt(token.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int ans = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                if (xy[i][0] < xy[j][0] && xy[i][1] < xy[j][1]) {
                    ans++;
                }
            }
            bw.write(ans + " ");
        }
        bw.flush();
    }
}