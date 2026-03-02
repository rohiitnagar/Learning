package Array.main;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        int totalStudent = 3;
        int totalSubjects = 6;
        String[][] studentMarks = new String[3][7];
        studentMarks[0][0]="rohit";
        studentMarks[0][1]="89";
        studentMarks[0][2]="65";
        studentMarks[0][3]="23";
        studentMarks[0][4]="24";
        studentMarks[0][5]="24";
        studentMarks[0][6]="98";

        studentMarks[1][0]="john";
        studentMarks[1][1]="89";
        studentMarks[1][2]="65";
        studentMarks[1][3]="23";
        studentMarks[1][4]="24";
        studentMarks[1][5]="24";
        studentMarks[1][6]="98";

        studentMarks[2][0]="rohan";
        studentMarks[2][1]="89";
        studentMarks[2][2]="65";
        studentMarks[2][3]="23";
        studentMarks[2][4]="24";
        studentMarks[2][5]="24";
        studentMarks[2][6]="98";

        System.out.println(Arrays.deepToString(studentMarks));
        System.out.println(Arrays.toString(studentMarks)); // Wont give proper output

        for(int i=0; i<studentMarks.length; i++){
            for(int j=0; j<studentMarks[i].length; j++){
                System.out.print(studentMarks[i][j]+" ");
            }
            System.out.println();
        }


    }
}
