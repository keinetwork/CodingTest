import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(GCD(A, B));
    }

    // greatest common divisor
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }

}
