import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = 0;
		int B = 42;
		Set<Integer> st = new HashSet<>();
		for (int i = 0; i < 10; i++) {
			A = Integer.parseInt(bf.readLine());
			st.add(A % B);
		}
		bw.write(st.size() + "\n");

		bw.flush();
		bw.close();
	}
}