import java.util.Arrays;
public class MyMain {
    
    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i<arr.length; i++) arr2[(arr.length-1)-i] = arr[i];
        return arr2;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Checks to see if an array contains a geometric series
    public static boolean isGeometric(int[] arr) {
        if (arr.length<=2) return true;
        for (int i = 0; i<arr.length-2; i++) if (((double)arr[i])/((double)arr[i+1])!=((double)arr[i+1])/((double)arr[i+2])) return false;
        return true;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[] {-12, 1,2,5,18,7,-9,9})));
        System.out.println(secondLargest(new int[] {12,-23,-5,-4,-3,3,-42,24,}));
        System.out.println(isGeometric(new int[] {1,-2,4,-8,16,32,64, -128}));
    }
}
