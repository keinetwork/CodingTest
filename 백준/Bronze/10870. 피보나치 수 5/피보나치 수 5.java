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
        int pre = 0, cur = 1, swap = 0;
        for (int i = 1; i < n; i++) {
            swap = cur;
            cur += pre;
            pre = swap;
        }
        System.out.println(cur);
    }
}