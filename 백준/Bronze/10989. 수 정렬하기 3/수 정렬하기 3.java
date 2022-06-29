import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[10001];
        for (int i = 0; i < N; i++) {
            list[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i < 10001; i++) {
            for (int j = 0; j < list[i]; j++) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
        }
        bw.flush();
    }
}