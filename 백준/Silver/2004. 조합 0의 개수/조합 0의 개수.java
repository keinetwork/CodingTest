import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long M = in.nextLong();

        // 각각의 승수를 구해준다.
        long count5 = five_power_n(N) - five_power_n(N - M) - five_power_n(M);
        long count2 = two_power_n(N) - two_power_n(N - M) - two_power_n(M);

        System.out.println(Math.min(count5, count2));

    }

    // 5의 승수를 구하는 함수 
    static long five_power_n(long num) {
        int count = 0;

        while(num >= 5) {
            count += (num / 5);
            num /= 5;
        }
        return count;
    }

    // 2의 승수를 구하는 함수
    static long two_power_n(long num) {
        int count = 0;

        while(num >= 2) {
            count += (num / 2);
            num /= 2;
        }
        return count;
    }

}