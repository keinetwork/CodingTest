import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int BREAK = 0;
        if (0 >= C - B) {
            BREAK = -1;
        } else {
            BREAK = (A / (C - B)) + 1;
        }
        System.out.println(BREAK);
    }
}