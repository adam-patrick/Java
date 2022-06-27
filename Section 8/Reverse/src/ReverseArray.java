import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int lastPoint = array.length - 1;
        int halfwayPoint = array.length / 2;
        for (int i = 0; i < halfwayPoint; i++) {
            int temp = array[i];
            array[i] = array[lastPoint - i];
            array[lastPoint - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
