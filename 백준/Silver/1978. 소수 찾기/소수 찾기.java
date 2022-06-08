import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer token = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(token.nextToken());
            if (num[i] > max) max = num[i];
        }
        boolean[] nprime = new boolean[max + 1];
        nprime[0] = true;
        nprime[1] = true;
        double sqrtmax = Math.sqrt(max);
        for (int i = 2; i <= sqrtmax; i++) {
            for (int j = i + i; j <= max; j += i) {
                if (nprime[j] == false)
                    nprime[j] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (nprime[num[i]] == false) count++;
        }
        System.out.println(count);

    }
};