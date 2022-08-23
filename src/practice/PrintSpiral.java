package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintSpiral {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str= br.readLine();
        int rows = Integer.parseInt(String.valueOf(str.charAt(0)));
        int cols = Integer.parseInt(String.valueOf(str.charAt(2)));

        System.out.println(rows + " " + cols);

//        int[][] matrix = new int[rows][cols];
//
        char ch = '0';
        System.out.println( Character.getNumericValue(ch) );
//        for(int i = 0; i < rows; i++)
//        {
//            for(int j = 0; j < cols; j++)
//            {
//                matrix[i][j] = Character.getNumericValue(br.read());
//                System.out.print(matrix[i][j] + " ");
//            }
//        }

//        for(int i = 0; i < rows; i++)
//        {
//            for(int j = 0; j < cols; j++)
//            {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
