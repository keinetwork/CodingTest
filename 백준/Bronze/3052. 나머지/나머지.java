import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int A = 0;
		int B = 42;
		Set<Integer> st = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			A = Integer.parseInt(bf.readLine());
			st.add(A % B);
		}
		System.out.println(st.size());
	}
}