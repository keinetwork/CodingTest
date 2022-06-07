import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] str = br.readLine().split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);
        int[] list = new int[N];
        int tail = 0;
        for (int i = 2; i <= N; i++) {
            boolean check = true;
            double sqrt = Math.sqrt(i);

            for (int j = 0; j < list.length; j++) {
                if (list[j] == 0 || list[j] > sqrt) {
                    break;
                }
                if (i % list[j] == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                list[tail++] = i;
                if (i >= M) {
                    bw.write(Integer.toString(i) + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}