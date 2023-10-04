
//program to find repeated array3
import java.util.*;

public class arr4 {

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 3, 4, 5, 1, 6, 5, 3, 4, 4 };

        int size = arr1.length;

        System.out.println("length of arr1 " + size);

        int arr2[] = new int[size];

        arr2 = arr1;

        for (int k = 0; k < size; k++)

        {

            int temp = 0;

            for (int j = 0; j < size; j++) {

                if (arr1[k] == arr2[j]) {

                    temp = temp + 1;

                }

            }

            System.out.println(arr1[k] + " " + temp);

        }

    }

}
