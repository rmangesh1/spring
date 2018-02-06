package mang.booking;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mrana on 05.02.2018.
 */
public class Question1 {

    public static void main(String[] args) {
        List<String> multipleInputDimensions = Arrays.asList("10 10 10 10","10 20 10 20","10 10 10 30");
        int squares = 0;
        int rectangles = 0;
        int others = 0;

        for(String dimensions : multipleInputDimensions) {
            String [] sides = dimensions.split(" ");
            if(sides[0].equals(sides[1]) && sides[1].equals(sides[2]) && sides[2].equals(sides[3])) {
                squares++;
            } else if (sides[0].equals(sides[2]) && sides[1].equals(sides[3])) {
                rectangles++;
            } else {
                others++;
            }
        }

        System.out.println(squares+" "+rectangles+" "+others);
    }
}
