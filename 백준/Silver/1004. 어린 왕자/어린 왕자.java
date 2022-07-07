import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer in;
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] start = new int[2];
        int[] end = new int[2];
        int[] point = new int[2];
        double radius = 0;
        double[] distance = new double[2];
        for (int i = 0; i < T; i++) {
            in = new StringTokenizer(br.readLine());
            start[0] = Integer.parseInt(in.nextToken());
            start[1] = Integer.parseInt(in.nextToken());
            end[0] = Integer.parseInt(in.nextToken());
            end[1] = Integer.parseInt(in.nextToken());
            int n = Integer.parseInt(br.readLine());
            int res = 0;
            for (int j = 0; j < n; j++) {
                in = new StringTokenizer(br.readLine());
                point[0] = Integer.parseInt(in.nextToken());
                point[1] = Integer.parseInt(in.nextToken());
                radius = Integer.parseInt(in.nextToken());
                distance[0] = Math.sqrt(Math.pow(Math.abs(start[0] - point[0]), 2) + Math.pow(Math.abs(start[1] - point[1]), 2));
                distance[1] = Math.sqrt(Math.pow(Math.abs(end[0] - point[0]), 2) + Math.pow(Math.abs(end[1] - point[1]), 2));
                if (distance[0] < radius && distance[1] < radius) continue;

                if (distance[0] < radius || distance[1] < radius) {
                    res++;
                }
            }
            out.append(res).append("\n");
        }
        System.out.println(out);
    }
}