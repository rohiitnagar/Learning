package Array.main;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] array = {36,7,23,54,23};
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, 7);
        System.out.println(index);

        index = Arrays.binarySearch(array, 32);
        System.out.println(index);
        int[] array2 = {30,7,23,54,23};

        //IF we don't sort, wronng answer
        index = Arrays.binarySearch(array2,30);
        System.out.println(index);

        index = Arrays.binarySearch(array2,30);
        System.out.println(index);
    }
}
