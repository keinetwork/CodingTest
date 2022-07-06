import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] position = new int[3][2];
        double[] distance = new double[3];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            distance[0] = 0;
            position[1][0] = Integer.parseInt(st.nextToken());
            position[1][1] = Integer.parseInt(st.nextToken());
            distance[1] = Integer.parseInt(st.nextToken()); //  0
            position[2][0] = Integer.parseInt(st.nextToken());
            position[2][1] = Integer.parseInt(st.nextToken());
            distance[2] = Integer.parseInt(st.nextToken()); // 30
            Arrays.sort(distance);

            position[0][0] = Math.abs(position[1][0] - position[2][0]); //40
            position[0][1] = Math.abs(position[1][1] - position[2][1]); // 0
            distance[0] = Math.sqrt(Math.pow(position[0][0], 2) + Math.pow(position[0][1], 2));
//            System.out.println(distance[0] + "," + distance[1] + "," + distance[2]);

            if (distance[0] == 0 &&
                    distance[2] == distance[1]) {
                sb.append(-1).append("\n");
            } else if (distance[0] == (distance[2] + distance[1]) ||
                    distance[0] == (distance[2] - distance[1])) {
                sb.append(1).append("\n");
            } else if (distance[0] < (distance[2] + distance[1]) &&
                    distance[0] > (distance[2] - distance[1])) {
                sb.append(2).append("\n");
            } else if (distance[0] > (distance[2] + distance[1]) ||
                    distance[0] < (distance[2] - distance[1])) {
                sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}