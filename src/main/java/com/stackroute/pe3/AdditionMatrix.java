//Write a program to compute the addition of two matrix, Read the number of rows and columns
//as input, also the values of each matrix
package com.stackroute.pe3;
import java.util.Scanner;

public class AdditionMatrix {

    public static void main(String args[])
    {
        int m, n, i, j;
        Scanner in = new Scanner(System.in);

        System.out.println("Input number of rows of matrix");
        m = in.nextInt();
        System.out.println("Input number of columns of matrix");
        n  = in.nextInt();

        int first[][] = new int[m][n];
        int second[][] = new int[m][n];
        int sum[][] = new int[m][n];
        //getting the input of first  matrix

        System.out.println("Input elements of first matrix");

        for (i = 0; i < m; i++)
            for (j = 0; j< n; j++)
                first[i][j] = in.nextInt();
            //getting the input of second matrix

        System.out.println("Input elements of second matrix");

        for (i= 0 ; i< m ; i++)
            for (j = 0 ; j < n ; j++)
                second[i][j] = in.nextInt();
//storing the result of the addition of two matrix
        for (i = 0; i < m; i++)
            for (j = 0; j< n; j++)
                sum[i][j] = first[i][j] + second[i][j];  //replace '+' with '-' to subtract matrices

        System.out.println("Sum of the matrices:");
//printing the addition of matrix
        for (i = 0; i < m; i++)
        {
            for (j= 0; j < n; j++)
                System.out.print(sum[i][j]+"\t");

            System.out.println();
        }
    }
}
