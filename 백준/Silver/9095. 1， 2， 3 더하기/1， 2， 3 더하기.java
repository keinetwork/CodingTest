import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int factorialFunc(int data) {
        if (data == 1) {
            return 1;
        } else if (data == 2) {
            return 2;
        } else if (data == 3) {
            return 4;
        } else if (data < 1) {
            return 0;
        }
        return factorialFunc(data - 1) + factorialFunc(data - 2) + factorialFunc(data - 3);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int f = factorialFunc(n);
            System.out.println(f);
        }
    }
}