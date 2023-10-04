
//program to find repeated array2
import java.util.*;

public class arr3 {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int[] arr = { 10, 23, 45, 67, 23, 45, 87, 99, 5, 7, 9, 10 };

        int size = arr.length;

        int duplicate[] = new int[size];

        int duplicate_ele = 0;

        for (int i = 0; i < size; i++) {

            if (duplicate[i] > 0) {

                continue;

            }

            int count = 1;

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    duplicate[j] = arr[i];

                    duplicate_ele = arr[i];

                    count++;

                }

            }

            if ((duplicate_ele) > 0) {

                System.out.println(arr[i] + " " + count);

            }

        }

    }

}
