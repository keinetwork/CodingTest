import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder[] ageSb = new StringBuilder[201];
        for (int i = 0; i < 201; i++) {
            ageSb[i] = new StringBuilder("");
        }
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int age = Integer.parseInt(st.nextToken());
            ageSb[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }
        for (StringBuilder sb : ageSb) {
            if (sb.length() > 0) {
                bw.write(sb.toString());
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
