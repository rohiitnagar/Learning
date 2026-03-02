package Array.main;

import com.sun.security.jgss.GSSUtil;

public class ArrayLength {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        String names[] = {"Rohit", "John"};
        int mobileNum[] = new int[116];

        System.out.println(nums.length);
        System.out.println(names.length);
        System.out.println(mobileNum.length);
//IN won'r create this array since memory not available
       // double[] prices = new double[Integer.MAX_VALUE];

        char[] grades = new char[0];
        System.out.println(grades.length);
    }
}
