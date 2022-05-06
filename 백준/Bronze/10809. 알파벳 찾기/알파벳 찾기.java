import java.util.Scanner;

public class Main {
	static int afb = 26;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		int[] bt = new int[afb];
		for (int i = 0; i < afb; i++) {
			bt[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			int index = (int) (str.charAt(i) - 'a');
			if (index < afb && bt[index] == -1) {
				bt[index] = i;
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < afb; i++) {
			sb.append(bt[i] + " ");
		}
		sb.deleteCharAt(sb.length() - 1);

		System.out.println(sb);
	}
}