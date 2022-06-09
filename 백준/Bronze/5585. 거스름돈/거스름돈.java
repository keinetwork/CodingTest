import java.util.Scanner;
public class Main {

	public static void main(String[] args) {	// Greedy algorithm 탐욕 알고리짐, 최선알고리즘
		Scanner scanner = new Scanner(System.in);
		int pay = scanner.nextInt();
		
		int[] money = {500, 100, 50, 10, 5, 1};
		
		int total = 1000 - pay;
		int result = 0;
		
		for( int m : money) {
			if(total < m) continue;
			
			result += total / m;
			total = total % m;
		}
		
		System.out.println(result);
	}

}
