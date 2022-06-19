import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < K; i++) {
            int y = scanner.nextInt();
            int c1 = scanner.nextInt();
            int c2 = scanner.nextInt();
            int ap = y + LCM(c1, c2);
            if (ans > ap) ans = ap;
        }
        System.out.println(ans);
    }

    // greatest common divisor
    static int GCD(int a, int b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    // least common multiple (a*b/GCD(a,b)) oerverflow
    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
