import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        boolean asc;
        boolean desc =false;
        while (true) {
            int currentNumber = sc.nextInt();
            if (currentNumber >= currentNumber -1){
                asc = true;
            }
            else {
                asc = false;
                break;
            }
            if (currentNumber <= currentNumber -1){
                desc = true;
            }
            else {
                desc = false;
                break;
            }

        }
        if (asc || desc){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    }