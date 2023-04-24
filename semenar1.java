
import java.util.Arrays;

public class seminar {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 1, 0, 1, 1};
        System.out.println(Arrays.toString(method(array1, array2)));
        System.out.println(Arrays.toString(method2(array1, array2)));

    }

    public static int[] method(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Different length of arrays");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            array[i] = arr1[i] - arr2[i];
        }
        return array;
    }
       public static int[] method2(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Different length of arrays");
        }
        int[] array = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("You can't divide by zero!");
            }
            array[i] = arr1[i] / arr2[i];
        }
        return array;
    }
}