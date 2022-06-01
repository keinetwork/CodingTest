import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();

        int[] dial = {3, 3, 3, 4, 4, 4,
                5, 5, 5, 6, 6, 6, 7, 7, 7,
                8, 8, 8, 8, 9, 9, 9, 10, 10, 10, 10};
        int tTime = 0;
        for (int i = 0; i < str.length; i++) {
            int a = str[i] - 'A';
            tTime += dial[a];
        }
        System.out.println(tTime);
    }
}