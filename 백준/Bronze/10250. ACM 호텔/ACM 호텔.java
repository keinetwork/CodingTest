import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String room = assign(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            System.out.println(room);
        }
    }

    public static String assign(int H, int W, int N) {
        return String.format("%d%02d", ((N - 1) % H) + 1, (N - 1) / H + 1);
    }
}