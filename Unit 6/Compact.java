public class Compact {

    //Takes an array of ints and returns a new array of ints with the zeroes removed.
    //Precondition: Array a is filled with ints.
    //Postcondition: The returned array is identical to a but has all the zeroes removed.
    public static int[] removeZeroes(int[] a) {
        int counter = 0;
        for(int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                counter++;
            }
        }
        int[] returnArray = new int[a.length - counter];
        int c = 0;
        for(int i = 0; i < a.length; i ++){
            if(a[i] == 0){
                //zero found
            }else {
                returnArray[c] = a[i];
                c++;
            }
        }
        return returnArray;
    }
}