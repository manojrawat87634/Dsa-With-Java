import java.util.Arrays;

public class SystemArrayCopy {

    public static void main(String[] args) {

        int[] source = {1, 2, 3, 4, 5};
        int[] destination = new int[5];

        // System.arraycopy(source, srcPos, dest, destPos, length)
        System.arraycopy(source, 0, destination, 0, source.length);

        System.out.println("Source Array: " + Arrays.toString(source));
        System.out.println("Destination Array: " + Arrays.toString(destination));
    }
}
