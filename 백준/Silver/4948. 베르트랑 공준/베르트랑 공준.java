import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static final int MAX = 123456 * 2;
    static boolean[] isPrime = new boolean[MAX + 1];
    static int[] prime = new int[21790];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = setPrime();
        int n = Integer.parseInt(br.readLine());
        while (n != 0) {
            int idx1 = binarySearch(n, size);
            int idx2 = binarySearch(n * 2, size);
            if (prime[idx2] == n * 2) {
                idx2++;
            } else if (prime[idx1] == n) {
                idx1++;
            }
            bw.write(Integer.toString(idx2 - idx1) + "\n");
            n = Integer.parseInt(br.readLine());
        }
        br.close();
        bw.flush();
        bw.close();
    }

    public static int binarySearch(int num, int size) {
        int start = 1;
        int end = size - 1;
        while (start <= end) {
            int center = (start + end) / 2;
            if (prime[center] >= num) {
                end = center - 1;
            } else {
                start = center + 1;
            }
        }
        return start;
    }

    public static int setPrime() {
        int idx = 1;
        isPrime[0] = true;
        isPrime[1] = true;
        double sqrt = Math.sqrt(MAX);

        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) continue;
            prime[idx++] = i;
            if (i > sqrt) continue;
            for (int j = i * i; j <= MAX; j += i) {
                isPrime[j] = true;
            }
        }
        return idx;
    }
}