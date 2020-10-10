import java.util.Scanner;

import static java.lang.Integer.valueOf;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        if(a>=b && a>=c){
            return 1;
        }
        if(b>a && b>=c){
            return 2;
        }
        if(c>b && c>a){
            return 3;
        }
        return 0;
        // d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
       //return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}