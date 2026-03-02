package Array.main;

import java.util.Arrays;

public class FillMethod {

    public static void main(String[] args) {
        int array[] = new int[10];
        Arrays.fill(array, 100);
        System.out.println(Arrays.toString(array));

        int indices[] = new int[10];
        Arrays.setAll(indices, i -> i);
        System.out.println(Arrays.toString(indices));

        int indices2[] = new int[100]; // Compilation errror if dimension is not mentioned
        Arrays.setAll(indices2, i -> i);
        System.out.println(Arrays.toString(indices2));
    }
}
