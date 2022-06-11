import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static boolean[] isPrime = new boolean[10001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        setPrime();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int h = n / 2;
            int l = n / 2;
            while (isPrime[h] || isPrime[l]) {
                h++;
                l--;
            }
            bw.write(Integer.toString(l) + " " + Integer.toString(h) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static void setPrime() {
        isPrime[0] = true;
        isPrime[1] = true;
        double sqrt = Math.sqrt(isPrime.length);
        for (int i = 2; i <= sqrt; i++) {
            if (isPrime[i])
                continue;
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
    }
}