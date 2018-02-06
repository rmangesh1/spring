package mang.booking;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mrana on 06.02.2018.
 */
public class ArrayAnalyzer {

    public static void main(String[] args) {
        List<Integer> sumAndNumbers = Arrays.asList(66,10,18,11,21,28,31,38,40,55,60,62);
        System.out.println(doesArraySatisfyCondition(sumAndNumbers));
    }

    private static int doesArraySatisfyCondition(List<Integer> sumAndNumbers) {
        Integer sum = sumAndNumbers.get(0);
        Integer calcSum = null;
        Integer [] numbers = new Integer[sumAndNumbers.get(1)];
        for(int i=2; i<sumAndNumbers.size(); i++) {
            numbers[i-2] = sumAndNumbers.get(i);
        }
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i].equals(sum))
                return 1;
            for(int j=i+1; j<numbers.length; j++) {
                calcSum = numbers[i]+numbers[j];
                if(sum.equals(calcSum))
                    return 1;
            }
        }
        return 0;
    }

}
