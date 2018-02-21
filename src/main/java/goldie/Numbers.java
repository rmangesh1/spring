package goldie;

import oracle.sql.CHAR;

/**
 * Created by mrana on 21.02.2018.
 */
public class Numbers {

    public static void main(String[] args) {
        int [] arr = {1, 34, 3, 98, 9, 76, 45, 4};
        int temp = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length - i - 1; j++) {
                if(greaterNumberCondition(arr[j], arr[j+1])) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        displayArray(arr);

    }

    private static void displayArray(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static boolean greaterNumberCondition(int prev, int next) {
        //int left = Integer.parseInt(((Character)Integer.valueOf(prev).toString().charAt(0)).toString());
        //int right = Integer.parseInt(((Character)Integer.valueOf(next).toString().charAt(0)).toString());
        String left = Integer.valueOf(prev).toString();
        String right = Integer.valueOf(next).toString();
        int i = 0;
        int j = 0;
        Character lc = null;
        Character rc = null;
        while (i < left.length() && j < right.length()) {
            lc = left.charAt(i);
            rc = right.charAt(j);
            if (Integer.parseInt(lc.toString()) == Integer.parseInt(rc.toString())) {

            } else if (Integer.parseInt(lc.toString()) < Integer.parseInt(rc.toString())) {
                return true;
            }
            i++;
            j++;
        }
        while (i < left.length()) {
            Character c = left.charAt(i);
            if(Integer.parseInt(c.toString()) < Integer.parseInt(rc.toString())) {
                return true;
            } else {
                return false;
            }
        }
        while (j < right.length()) {
            Character c = right.charAt(j);
            if(Integer.parseInt(c.toString()) > Integer.parseInt(lc.toString())) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
