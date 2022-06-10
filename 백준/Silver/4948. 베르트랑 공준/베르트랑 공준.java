import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int n = 0;
        int max = 0;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            list.add(n);
            if (n > max) max = n;
        }
        max *= 2;
        boolean[] prime = new boolean[max + 1];
        prime[0] = true;
        prime[1] = true;
        double sqrt = Math.sqrt(max);
        for (int i = 2; i <= sqrt; i++) {
            for (int j = i + i; j <= max; j += i) {
                if (prime[j] == false)
                    prime[j] = true;
            }
        }

        for (Integer l : list) {
            n = l * 2;
            int count = 0;
            for (int i = l + 1; i <= n; i++) {
                if (prime[i] == false) count++;
            }
            bw.write(Integer.toString(count) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}