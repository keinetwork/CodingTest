import java.util.Scanner;

public class Main {
    static int t;
    static String s;
    static char[] arr;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for (int tc = 1; tc <=t; tc++) {
            s=sc.next();
            arr=s.toCharArray();
            int left=0;
            int right=s.length()-1;
            if(check(left,right)) {
                System.out.println(0);
                continue;
            }
            if(checkS(left,right)) {
                System.out.println(1);
            }else {
                System.out.println(2);
            }

        }

    }

    private static boolean check(int left,int right) {
        while(left<=right) {
            if(arr[left]!=arr[right]) {//다름
                return false;
            }
            left+=1;
            right-=1;
        }
        return true;
    }

    private static boolean checkS(int left,int right) {
        while(left<=right) {
            if(arr[left]!=arr[right]) {//다름
                boolean a=check(left+1,right);
                boolean b=check(left,right-1);
                if(a==false && b==false) {
                    return false;
                }else return true;
            }
            left+=1;
            right-=1;
        }
        return true;
    }
}
