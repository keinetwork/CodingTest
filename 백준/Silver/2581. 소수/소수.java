import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        boolean[] nprime = new boolean[N + 1];
        nprime[0] = true;
        nprime[1] = true;
        double sqrtmax = Math.sqrt(N);
        int total = 0, min = N;
        for (int i = 2; i <= sqrtmax; i++) {
            for (int j = i + i; j <= N; j += i) {
                if (nprime[j] == false)
                    nprime[j] = true;
            }

        }

        for (int i = M; i <= N; i++) {
            if (nprime[i] == false) {
                total += i;
                if (i < min) min = i;
            }
        }

        if (total > 0) {
            System.out.println(total);
            System.out.println(min);
        } else {
            System.out.println(-1);

        }
    }
}