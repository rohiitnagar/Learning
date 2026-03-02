package Array.main;

import java.util.Arrays;

public class AddMatrices {

    public static void main(String[] args) {
        int array1[][] = {{1,2,3}, {4,5,6}};

        int array2[][] = {{1,2,3}, {4,5,6}};

        int sumArray[][] = new int[2][3];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array1[i].length; j++){
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sumArray));
    }
}
