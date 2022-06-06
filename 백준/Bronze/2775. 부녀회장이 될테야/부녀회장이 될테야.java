import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int[] zen = people(k, n);
            System.out.println(zen[n - 1]);
        }
    }

    public static int[] people(int k, int n) {
        int[] zen = null;
        if (k == 0) {
            zen = new int[n];
            for (int i = 0; i < n; i++) {
                zen[i] = i + 1;
            }
            return zen;
        }
        zen = people(k - 1, n);

        for (int i = 1; i < n; i++) {
            zen[i] = zen[i - 1] + zen[i];
        }
        return zen;
    }

}
