import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int prime = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 97) {
                prime += input[i] - 'A' + 27;
            } else {
                prime += input[i] - 'a' + 1;
            }
        }

        boolean[] arr = new boolean[prime + 1];
        arr[0] = true;
        arr[1] = false;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            for (int j = i * i; j < arr.length; j += i) {
                arr[j] = true;
            }
        }
        if (arr[prime]) {
            System.out.println("It is not a prime word.");
        } else {
            System.out.println("It is a prime word.");
        }
    }
}