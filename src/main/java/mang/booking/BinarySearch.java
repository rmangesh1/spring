package mang.booking;

/**
 * Created by mrana on 08.02.2018.
 */
//Rewrite this shit
public class BinarySearch {

    private static int low = 0;

    private static int mid;

    private static int high;

    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};

        System.out.println(binarySearch(arr, arr.length, 1));
    }

    private static boolean binarySearch(int[] arr, int length, int value) {
        high = arr.length - 1;
        mid = low + (high - low)/2;

        if(arr[mid] == value)
            return true;
        else if (high == 0) {
            return false;
        } else if(value < arr[mid]) {
            arr = getArray(arr, low, mid-1);
            return binarySearch(arr, arr.length, value);
        } else if(value > arr[mid]) {
            arr = getArray(arr, mid+1, high);
            return binarySearch(arr, arr.length, value);
        } else {
            return false;
        }
    }

    private static int[] getArray(int[] arr, int low, int high) {
        int length = (high-low) + 1;
        int [] arrResult = new int[length];
        int j=0;
        for(int i=low; i<=high; i++) {
            arrResult[j] = arr[i];
            j++;
        }
        return arrResult;
    }

}
