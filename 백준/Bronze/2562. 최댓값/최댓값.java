import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max=0;
		int maxC=0;
		String str;
		int count=0;
		while((str=bf.readLine())!=null) {
			int C = Integer.parseInt(str);
			count++;
			if(C > max) {
				max = C;
				maxC = count;
			}			
		}
		bw.write(max+" "+maxC + "\n");
		bw.flush();
		bw.close();
	}
}