import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B[] = new int[A];
		int C[] = new int[A];
		for (int i = 0; i < A; i++) {
			B[i] = scanner.nextInt();
			C[i] = scanner.nextInt();
		}
		for (int i = 0; i < A; i++) {
			System.out.println(B[i] + C[i]);
		}
	}
}