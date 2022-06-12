import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }
        int[] fibonacci = new int[3];
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i % 3] = fibonacci[(i - 1) % 3] + fibonacci[(i - 2) % 3];
        }
        System.out.println(fibonacci[n % 3]);
    }
}