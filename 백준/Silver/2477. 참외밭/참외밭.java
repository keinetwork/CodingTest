import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int melon = Integer.parseInt(br.readLine());
        StringTokenizer in;
        // 3, 1, 3, 1, 4, 2
        // 1, 2 / 3, 4
        int[][] driection = new int[6][2];
        int[][] max = new int[4][2];
        int find = 0;
        for (int i = 0; i < 6; i++) {
            in = new StringTokenizer(br.readLine());
            driection[i][0] = Integer.parseInt(in.nextToken());
            driection[i][1] = Integer.parseInt(in.nextToken());
            if (driection[i][0] == 1 && driection[i][1] > max[0][1]) {
                max[0][0] = i;
                max[0][1] = driection[i][1];
            }
            if (driection[i][0] == 2 && driection[i][1] > max[1][1]) {
                max[1][0] = i;
                max[1][1] = driection[i][1];
            }
            if (driection[i][0] == 3 && driection[i][1] > max[2][1]) {
                max[2][0] = i;
                max[2][1] = driection[i][1];
            }
            if (driection[i][0] == 4 && driection[i][1] > max[3][1]) {
                max[3][0] = i;
                max[3][1] = driection[i][1];
            }
        }
        int maxArea = 0;
        int minArea = 0;
        if (max[3][1] > max[2][1]) {
            if (max[1][1] > max[0][1]) {
                // 북,서
                maxArea = max[3][1] * max[1][1];
                int d = max[1][0];
                minArea = driection[(d + 2) % 6][1] * driection[(d + 3) % 6][1];
            } else {
                // 동,북
                maxArea = max[3][1] * max[0][1];
                int d = max[3][0];
                minArea = driection[(d + 2) % 6][1] * driection[(d + 3) % 6][1];
            }
        } else {
            if (max[1][1] > max[0][1]) {
                // 서, 남
                maxArea = max[2][1] * max[1][1];
                int d = max[2][0];
                minArea = driection[(d + 2) % 6][1] * driection[(d + 3) % 6][1];
            } else {
                // 남, 동
                maxArea = max[2][1] * max[0][1];
                int d = max[0][0];
                minArea = driection[(d + 2) % 6][1] * driection[(d + 3) % 6][1];
            }
        }
        System.out.println((maxArea - minArea) * melon);
    }

}