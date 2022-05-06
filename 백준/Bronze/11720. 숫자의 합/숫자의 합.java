import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        byte[] bt = scanner.next().getBytes();
        int sum = 0;
        for(int i=0; i<bt.length; i++) {
            sum += (int)(bt[i]-'0');
        }

      System.out.println(sum);		
	}
}