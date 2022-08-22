import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	static int sum = 0;
	
	public static int solution(int[] input) {
		
		for(int i=0;i<8;i++) {
			for(int j=i+1;j<9;j++) {
				if((sum-input[i]-input[j] == 100)) {
					input[i] = input[j] = 100;
					return 0;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] input = new int[9];
		for(int i=0;i<9;i++) {
			input[i] = Integer.parseInt(br.readLine());
			sum += input[i];
		}
		
		solution(input);
		
		Arrays.sort(input);
		
		for(int i=0;i<7;i++) {
			System.out.println(input[i]);
		}
	}
}