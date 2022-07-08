import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        StringBuilder out = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        in = new StringTokenizer(br.readLine());
        int ring = Integer.parseInt(in.nextToken());
        for (int i = 1; i < N; i++) {
            int a = Integer.parseInt(in.nextToken());
            int g = gcd(ring, a);
            out.append(ring / g + "/" + a / g + "\n");
        }
        System.out.println(out);
    }

    // 최대공약수 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}