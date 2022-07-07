import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer in = new StringTokenizer(br.readLine());
        int[] res = new int[2];
        res[0] = Integer.MAX_VALUE;
        if (N != 1) {
            for (int i = 0; i < N; i++) {
                int a = Integer.parseInt(in.nextToken());
                res[0] = Math.min(a, res[0]);
                res[1] = Math.max(a, res[1]);
            }
        } else {
            res[0] = res[1] = Integer.parseInt(in.nextToken());
        }
        System.out.println(res[0] * res[1]);
    }
}