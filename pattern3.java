//Diamond Shape Pattern

import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        int n = 7;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }
}
