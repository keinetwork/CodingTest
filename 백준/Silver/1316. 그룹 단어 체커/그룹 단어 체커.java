import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int[] alpabet = new int[26];
            boolean isGroup = true;
            int prev = -1;
            for (int cur = br.read(); cur > 10; cur = br.read()) {
                cur -= 97;
                if (cur != prev) {
                    if (alpabet[cur] != 0) {
                        isGroup = false;
                    } else {
                        alpabet[cur]++;
                        prev = cur;
                    }
                }
            }
            if (isGroup) result++;
        }
        System.out.println(result);
    }
}