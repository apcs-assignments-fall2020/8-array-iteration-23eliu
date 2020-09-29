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
        
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > big) {
                second = big;
                big = arr[i];
            }
        }
        return second;
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        return false;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
