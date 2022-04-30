import java.util.Scanner;

public class Main {
	static int cal(int A, int B, int C) {
		if (A == B && B == C) {
			return 10000 + 1000 * A;
		}
		if (A == B || A == C) {
			return 1000 + 100 * A;
		}
		if (B == C) {
			return 1000 + 100 * B;
		}
		if (A > B && A > C) {
			return 100 * A;
		}
		if (B > C && B > A) {
			return 100 * B;
		}
		if (C > A && C > B) {
			return 100 * C;
		}
		return 0;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int price = cal(A, B, C);

		System.out.println(price);
	}
}