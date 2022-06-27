import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            list[i] = val;
        }
        Arrays.sort(list);
        for (int i = 0; i < N; i++) {
            bw.write(Integer.toString(list[i]));
            bw.newLine();
        }
        bw.flush();
    }
}