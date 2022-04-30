import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(bf.readLine());

		StringTokenizer st;
		for (int i = 1; i <= A; i++) {
			st = new StringTokenizer(bf.readLine());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());

			bw.write("Case #" + i + ": " + (B + C) + "\n");
		}
		bw.flush();
		bw.close();
	}
}