package Array.main;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int oldArray[] = {1,2,3,4,5};
        int newArray[] = new int[oldArray.length+5];
//Method 1: Using For loop
        //copyOldtoNew(oldArray,newArray);

        //Method 2: Using arraycopy
        System.arraycopy(oldArray, 0 , newArray, 0 , oldArray.length);
        for(int num : newArray){
            System.out.println(num);
        }
//Method 3: Using copyOf
       int[] targetArray=  Arrays.copyOf(oldArray, oldArray.length+2);
        for(int num : targetArray){
            System.out.println(num);
        }
//Copy of Range
        int[] rangedArray = Arrays.copyOfRange(oldArray, 3,4);
        for(int num : rangedArray){
            System.out.println(num);
        }
    }


    public static int[] copyOldtoNew(int oldArray[], int[] newArray){
        for(int i=0; i<oldArray.length; i++){
            newArray[i] = oldArray[i];
        }

        return newArray;
    }
}
