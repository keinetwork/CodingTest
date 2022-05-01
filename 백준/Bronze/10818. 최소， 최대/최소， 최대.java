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

		int N = Integer.parseInt(bf.readLine());
		int min=1000000;
		int max=-1000000;
		StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
		for(int i=0; i<N; i++) {
			int C = Integer.parseInt(st.nextToken());

			if(C < min) min = C;
			if(C > max) max = C;
		}
		bw.write(min+" "+max + "\n");
		bw.flush();
		bw.close();
	}
}