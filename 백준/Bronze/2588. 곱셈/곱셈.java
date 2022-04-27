import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int ABC = scanner.nextInt();
        int DEF = scanner.nextInt();
        int ABCF = ABC * (DEF%10);
        int ABCE = ABC * ((DEF/10)%10);
        int ABCD = ABC * (DEF/100);
        System.out.println(ABCF);
        System.out.println(ABCE);
        System.out.println(ABCD);
        System.out.println(ABCF+ABCE*10+ABCD*100);
    }
}