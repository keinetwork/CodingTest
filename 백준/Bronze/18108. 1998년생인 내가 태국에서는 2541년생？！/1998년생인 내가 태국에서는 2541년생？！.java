import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int buddhist = scanner.nextInt();
        int western = buddhist-543;
        
        System.out.println(western);
    }
}