import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int fin = Integer.parseInt(bf.readLine());
		int cicle = -1;
		int count = 0;

		int A = fin / 10;
		int B = fin % 10;
		while (fin != cicle) {
			count++;
			int C = (A + B) % 10;
			cicle = B * 10 + C;
			A = cicle / 10;
			B = cicle % 10;
		}
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}