import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] n = new int[N+1];
        boolean[][] dp = new boolean[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            n[i] = Integer.parseInt(st.nextToken());
            dp[i][i] = true;
            if(n[i-1]==n[i]) dp[i-1][i] = true;
        }

        for (int i = N-2; i >=1 ; i--) {
            for (int j = i+2; j <= N ; j++) {
                if(n[i]==n[j] && dp[i+1][j-1]){
                    dp[i][j] = true;
                }
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            if(dp[start][end]){
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}