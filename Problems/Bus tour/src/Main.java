import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int bridges = scanner.nextInt();
        int bridgeHeight;
        int crashes = 0;

        for (int i = 1; i <= bridges; i++) {
            bridgeHeight = scanner.nextInt();

            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + i);
                crashes++;
                break;
            }
        }

        if (crashes == 0) {
            System.out.println("Will not crash");
        }
    }
}