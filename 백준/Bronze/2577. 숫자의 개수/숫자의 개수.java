import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(bf.readLine());
		int B = Integer.parseInt(bf.readLine());
		int C = Integer.parseInt(bf.readLine());
		Integer D = A * B * C;
		String str = D.toString();
		int[] ret = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < str.length(); i++) {
			int N = (int) (str.charAt(i)-'0');
			ret[N] += 1;
		}
		
		for(int p : ret) {
			bw.write(p + "\n");	
		}
		
		bw.flush();
		bw.close();
	}
}