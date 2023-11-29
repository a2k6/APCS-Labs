public class CompactClient {
    public static void main(String[] args) {
        //Original array
        int[] initial = {0, 1, 3, 0, 4, 6, 0, 0, 13, 25, 0};
        //Save the resulting array from calling the removeZeroes method.
        int[] returned = Compact.removeZeroes(initial);
        System.out.print("Original Array: ");
        //Print the original array
        for (int i = 0; i < initial.length; i++) {
            System.out.print(initial[i] + " ");
        }
        System.out.print("\nNew Array: ");
        for (int i = 0; i < returned.length; i++) {
            System.out.print(returned[i] + " ");
        }
    }
}