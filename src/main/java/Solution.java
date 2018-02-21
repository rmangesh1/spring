import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int [][] arr = new int[][] {{1, 1, 1, 0, 0, 0},{0, 1, 0, 0, 0, 0},{1, 1, 1, 0, 0, 0},{0, 0, 2, 4, 4, 0},{0, 0, 0 ,2, 0, 0},{0, 0 ,1 ,2, 4, 0}};
        /*Scanner sc = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }*/
        int i=0;
        int j=i+2;
        int k=i+1;
        int p=0;
        int m=1;
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int x=0; x<4; x++) {
            for(int y=0; y<4; y++) {
                sum=0;
                for(int z=0; z<3; z++) {
                    sum = sum + arr[i][p];
                    sum = sum + arr[j][p];
                    p++;
                }
                p=p-2;
                sum = sum + arr[m][k];
                k++;
                //System.out.println(sum);
                list.add(sum);
            }
            k=1;
            m++;
            p=0;
            i++;j++;
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}