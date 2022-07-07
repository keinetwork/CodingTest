import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        in = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(in.nextToken());
        int H = Integer.parseInt(in.nextToken());
        int X = Integer.parseInt(in.nextToken());
        int Y = Integer.parseInt(in.nextToken());
        int P = Integer.parseInt(in.nextToken());
        int[] point = new int[2];
        int radius = H / 2;
        double distance = 0;
        int res = 0;
        for (int i = 0; i < P; i++) {
            in = new StringTokenizer(br.readLine());
            point[0] = Integer.parseInt(in.nextToken()) - X;
            point[1] = Integer.parseInt(in.nextToken()) - Y;
            if (point[0] >= 0 && point[0] <= W && point[1] >= 0 && point[1] <= H) {
                res++;
                continue;
            }

            distance = Math.pow(Math.abs(point[0]), 2) + Math.pow(Math.abs(point[1] - radius), 2);
            if (radius * radius >= distance) {
                res++;
                continue;
            }

            distance = Math.pow(Math.abs(point[0] - W), 2) + Math.pow(Math.abs(point[1] - radius), 2);
            if (radius * radius >= distance) {
                res++;
                continue;
            }
        }
        System.out.println(res);
    }
}