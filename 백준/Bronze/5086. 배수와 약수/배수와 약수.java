import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer in;
        while (true) {
            in = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(in.nextToken());
            int b = Integer.parseInt(in.nextToken());
            if (a == 0) break;

            if (b % a == 0) {
                bw.write("factor\n");
            } else if (a % b == 0) {
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }
        }
        bw.flush();
    }
}