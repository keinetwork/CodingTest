import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                bw.write(Integer.toString(i) + "\n");
                N /= i;
            }
        }
        if (N != 1) bw.write(Integer.toString(N) + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}