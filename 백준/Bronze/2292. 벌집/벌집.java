import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int count = 0;
        int diff = 0;
        while (true) {
            diff = (count * 6) + 1;
            if (N <= diff) {
                count++;
                break;
            }
            N = N - (count * 6);
            count++;
        }
        System.out.println(count);
    }
}
