//How To Find Duplicate Elements in Array
public class Duparr {

    public static void main(String[] args) {
        String[] arr = { "java", "C", "C++", "C", "python", "java" };

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Found the duplicate Word:" + arr[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("No duplicates present in array");
        }

    }
}
