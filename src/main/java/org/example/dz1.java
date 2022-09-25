import java.util.Arrays;

public class dz1 {
    public static void main(String[] args) {
        int[] arrayOfInt = {0, 1, 2, 3, 4, 5};
        int temp = arrayOfInt[0];
        arrayOfInt[0] = arrayOfInt[5];
        arrayOfInt[5] = temp;
        System.out.println(Arrays.toString(arrayOfInt));
    }
}
