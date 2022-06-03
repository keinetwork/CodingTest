import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.print(solution(N));
    }

    private static String solution(int n) {
        int left = 1;
        int right = 1;

        if (n > 1) right++;
        boolean up = false;
        for (int i = 2; i < n; i++) {
            if (up && left == 1) {
                right++;
                up = false;
                continue;
            }
            if (up == false && right == 1) {
                left++;
                up = true;
                continue;
            }
            if (up) {
                left--;
                right++;
            } else {
                left++;
                right--;
            }
        }
        return String.format("%d/%d", left, right);
    }
}
