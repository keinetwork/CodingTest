import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += Math.pow(in.nextInt(), 2);
        }
        System.out.println(res % 10);
    }
}