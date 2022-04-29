import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        if (A>B) {
            System.out.print(">");
        } else if (A<B) {
            System.out.print("<");
        } else {
            System.out.print("==");
        }
    }
}