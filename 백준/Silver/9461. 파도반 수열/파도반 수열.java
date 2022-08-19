import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <T ; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(call(N)).append("\n");            
        }
        System.out.print(sb);
    }
    static long call(int N){
        if(N==1) return 1;
        if(N==2) return 1;
        if(N==3) return 1;
        long[] dp = new long[N+1];
        dp[1] =1;
        dp[2] =1;
        dp[3] =1;
        for (int i = 4; i <=N ; i++) {
            dp[i] = dp[i-2] + dp[i-3];
        }
        return dp[N];
    }
}
