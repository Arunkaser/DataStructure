package Array;

import java.util.stream.IntStream;

public class ArrayRotation {

    // Java program to rotate an array by
// d elements


    // Driver program to test above functions
    public static void main(String[] args) {
        ArrayRotation rotate = new ArrayRotation();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr, arr.length - 5, arr.length);
        rotate.printArray(arr);
    }

    /*Function to left rotate arr[] of size n by d*/
    void leftRotate(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++)
            leftRotateByOne(arr, n);

    }

    void leftRotateByOne(int[] arr, int n) {
        int temp;
        temp = arr[0];
        IntStream.range(0, n - 1).forEach(i -> arr[i] = arr[i + 1]);
        arr[n - 1] = temp;
        new ArrayRotation();
    }

    /* utility function to print an array */
    void printArray(int[] arr) {
        for (int i = 0; i < 7; i++)
            System.out.print(arr[i] + " ");
    }
}
