import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] list = new int[8001];
        int n = 0;
        int total = 0;
        for (int i = 0; i < N; i++) {
            n = Integer.parseInt(br.readLine());
            list[n + 4000]++;
            total += n;
        }
        // 1
        bw.write(Math.round((float) total / N) + "\n");
        // 2
        int center = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > 0) {
                center += list[i];
                if (center >= (N / 2) + 1) {
                    bw.write((i - 4000) + "\n");
                    break;
                }
            }
        }
        // 3
        int[] freq = {0, 0, 0};
        for (int i = 0, j = 0; i < list.length; i++) {
            if (list[i] != 0) {
                j++;
                if (freq[0] == list[i] && freq[1] < list[i]) {
                    freq[1] = list[i];
                    freq[2] = i;
                }
                if (freq[0] < list[i]) {
                    freq[0] = list[i];
                    freq[2] = i;
                }
                if (j == N) break;
            }
        }
        bw.write(freq[2] - 4000 + "\n");
        // 4
        int[] minmax = {0, 0};
        for (int i = 0; i < list.length; i++) {
            if (list[i] != 0) {
                minmax[0] = i;
                break;
            }
        }
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i] != 0) {
                minmax[1] = i;
                break;
            }
        }
        bw.write(Math.abs(minmax[1] - minmax[0]) + "\n");
        bw.flush();
    }
}