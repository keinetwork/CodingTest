import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        for (int i = 0; i < C; i++) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);
            System.out.println(assign(H, W, N));
        }
    }

    public static String assign(int H, int W, int N) {
        int f = ((N - 1) % H) + 1;
        int n = (N - 1) / H + 1;
        return Integer.toString(f * 100 + n);
    }
}