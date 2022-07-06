import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] point = new int[3];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            point[0] = Integer.parseInt(st.nextToken());
            if (point[0] == 0) break;
            point[1] = Integer.parseInt(st.nextToken());
            point[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(point);
            if (point[0] * point[0] + point[1] * point[1] == point[2] * point[2]) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.flush();
    }
}