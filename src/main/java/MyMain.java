import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] reversed = new int[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            reversed[count] = arr[i];
            count++;
        }
        return reversed;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int big = arr[0];
        int second = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > big) {
                second = big;
                big = arr[i];
            }
            else if (arr[i] > second) {
                second = arr[i];
            }
        }
        return second;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        double div = (double) arr[1]/arr[0];
        for (int i = 2; i < arr.length; i++) {
            if ((double) arr[i]/arr[i-1] != div) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 16, 32};

        System.out.println("This is the reversed version of your array: " + Arrays.toString(reverse(arr)));
        System.out.println("This is the second largest value in your array: " + secondLargest(arr));

        if (isGeometric(arr) == false) {
            System.out.println("Your array is not a geometric sequence.");
        }
        else {
            System.out.println("Your array is a geometric sequence.");
        }
        
    }
}
