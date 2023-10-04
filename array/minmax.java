//Program to find the minimum (or maximum) element of an array
public class minmax {

    public static void main(String[] args) {

        int a[] = { 1, 4, 6, 46, 34, 23, 13, 53, 4 };

        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }

        System.out.println("Maximum number is:" + max);
        System.out.println("Minimum number is:" + min);

    }

}
