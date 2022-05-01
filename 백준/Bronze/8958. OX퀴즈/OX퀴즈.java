import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(bf.readLine());
		int[] ret = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			String S = bf.readLine();
			sum = 0;
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == 'O') {
					ret[i] += ++sum;
				} else {
					sum = 0;
				}
			}
			bw.write(ret[i] + "\n");
		}

		bw.flush();
		bw.close();
	}
}