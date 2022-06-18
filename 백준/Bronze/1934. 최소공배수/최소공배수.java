import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine(), " ");
        int T = Integer.parseInt(token.nextToken());
        for (int i = 0; i < T; i++) {
            token = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            bw.write(LCM(A, B) + "\n");
        }
        bw.flush();
    }

    // greatest common divisor
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
