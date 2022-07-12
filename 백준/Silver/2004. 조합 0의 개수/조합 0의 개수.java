import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(in.nextToken());
        int M = Integer.parseInt(in.nextToken());

        int cnt2 = count2(N) - count2(M) - count2(N - M);
        int cnt5 = count5(N) - count5(M) - count5(N - M);
        System.out.println(Math.min(cnt2, cnt5));
    }

    public static int count5(int num) {
        int count = 0;
        while (num >= 5) {
            count += (num / 5);
            num /= 5;
        }
        return count;
    }

    public static int count2(int num) {
        int count = 0;
        while (num >= 2) {
            count += (num / 2);
            num /= 2;
        }
        return count;
    }

}