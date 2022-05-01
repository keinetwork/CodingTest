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
		for (int i = 0; i < N; i++) {
			int[] S = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int total = 0;
			for (int j = 1; j <= S[0]; j++) {
				total += S[j];
			}
			double avg = total / (double) S[0];
			int count = 0;
			for (int k = 1; k <= S[0]; k++) {
				if (S[k] > avg) {
					count++;
				}
			}
			float rate = count * 100.0f / S[0];
			bw.write(String.format("%.3f", rate) + "%\n");
		}
		bw.flush();
		bw.close();
	}
}