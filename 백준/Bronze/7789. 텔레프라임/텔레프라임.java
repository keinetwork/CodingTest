import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] prime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        str[1] += str[0];
        int num1 = Integer.parseInt(str[0]);
        int num2 = Integer.parseInt(str[1]);
        prime = new boolean[num2 + 1];
        setPrime(num2);
        if (prime[num1] || prime[num2]) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    static void setPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            for (int j = i * i; j <= num; j += i) {
                prime[j] = true;
            }
        }
    }
}