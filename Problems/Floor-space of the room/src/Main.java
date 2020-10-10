import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        switch (input) {
            case "rectangle": {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double rectangle = a * b;
                System.out.println(rectangle);
                break;
            }
            case "circle": {
                double r = scanner.nextDouble();
                double circle = 3.14 * r * r;
                System.out.println(circle);
                break;
            }
            case "triangle": {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double p = (a + b + c) / 2;
                double triangle = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(triangle);
                break;
            }
            default:
                exit(0);

        }
    }
}