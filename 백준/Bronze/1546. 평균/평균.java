import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		int[] S = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int max = 0;
		double total = 0;
		for (int i = 0; i < N; i++) {
			if (S[i] > max)
				max = S[i];
		}
		for (int i = 0; i < N; i++) {
			total += (S[i] * 100.0 / max);
		}

		bw.write(total / N + "\n");
		bw.flush();
		bw.close();
	}
}