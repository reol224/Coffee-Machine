import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0; //Idea is to create a counter, and to increment it each time of printing

        for (int i = 0; i <= n; i++) { //Loops n times
            for (int j = 0; j < i; j++) { //Loops i times
                if (count < n) {
                    System.out.print(" "+i+" ");
                    count++; //Prints 1 one time, 2 two times, etc. stops if reached n number
                }
            }
        }
    }
}