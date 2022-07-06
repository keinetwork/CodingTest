import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        StringBuilder sb = new StringBuilder();
        int x, y, h;

        while (true) {
            in = new StringTokenizer(br.readLine());
            x = Integer.parseInt(in.nextToken());
            y = Integer.parseInt(in.nextToken());
            h = Integer.parseInt(in.nextToken());

            if (x == 0 && y == 0 && h == 0) {
                break;
            }

            sb.append(get(x * x, y * y, h * h)).append("\n");
        }

        System.out.println(sb);
    }

    public static String get(int x2, int y2, int h2) {
        if (x2 + y2 == h2) {
            return "right";
        } else if (x2 + h2 == y2) {
            return "right";
        } else if (x2 == y2 + h2) {
            return "right";
        } else {
            return "wrong";
        }
    }
}