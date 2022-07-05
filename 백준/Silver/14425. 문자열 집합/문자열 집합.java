import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] S = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }
        int res = 0;
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            for (int j = 0; j < S.length; j++) {
                if (S[j].equals(s)) {
                    res++;
                    break;
                }
            }
        }
        System.out.println(res);
    }
}