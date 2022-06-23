import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        str[1] += str[0];
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);

        if (!isPrime(num1) || !isPrime(num2)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static boolean isPrime(int num) {
        double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}