import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;
        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);

            /*while(true){
                int x = scanner.nextInt();
                if(x!=0){
                    sum = sum + x;

                }
                else{
                    System.out.println(sum);
                    break;
                }
                if (sum >= 1000) {
                    scanner.close();
                    System.out.println(sum - 1000);

                    break;
                }


            }


    } */
    }}