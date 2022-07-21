import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        long M = in.nextInt();
        System.out.println(Math.abs(M - N));
    }
}