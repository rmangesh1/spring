package mang.no.study;

/**
 * Created by mrana on 09.11.2017.
 */
public class GoogleQuestion {

    public static void main(String args[]) {
        int[] arrNumber = new int[]{9,2,9};
        System.out.println(printArray(arrNumber));
        System.out.println(printArray(incrementedArray(arrNumber)));
    }

    private static String printArray(int[] arrNumber) {
        String array = "[";
        for(int i=0;i<=arrNumber.length-1;i++) {
            if(i == arrNumber.length-1) {
                array = array + arrNumber[i] + "]";
            } else {
                array = array + arrNumber[i] + ",";
            }
        }
        return array;
    }

    public static int[] incrementedArray(int[] arrNumber) {
        int[] resultNumber = new int[arrNumber.length];
        int indiviualResultDigit = 0;
        for(int i=arrNumber.length-1;i>=0;i--) {
            if(indiviualResultDigit == 0) {
                indiviualResultDigit = resultDigitAfterAddingOne(arrNumber[i]);
                resultNumber[i] = indiviualResultDigit;
                if(i == 0 && indiviualResultDigit == 0) {
                    resultNumber = new int[arrNumber.length + 1];
                    resultNumber[0] = 1;
                }
            } else {
                resultNumber[i] = arrNumber[i];
            }
        }
        return resultNumber;
    }

    private static int resultDigitAfterAddingOne(int i) {
        if(i==9) {
            return 0;
        } else {
            return ++i;
        }
    }
}
