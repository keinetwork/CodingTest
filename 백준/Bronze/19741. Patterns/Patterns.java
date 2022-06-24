import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] divisors = new int[N * N + 1];
        for (int i = 2; i <= N * N; i++) {
            for (int j = i; j < divisors.length; j += i) {
                divisors[j]++;
            }
        }
        for (int i = 1; i <= N * N; i++) {
            if (divisors[i] < K) {
                bw.write("*");
            } else {
                bw.write(".");
            }
            if (i % N == 0)
                bw.newLine();
        }
        bw.flush();
    }
}