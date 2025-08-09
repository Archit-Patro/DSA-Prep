package Strivers.Arrays;

import java.util.*;

public class setZeroMatrix2DMatrix {

    public static void setZeroes(int [][]matrix){

        int n = matrix.length;
        int m = matrix[0].length;

        int row[] = new int[n];
        int col[] = new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println("The set zero matrix output is: ");

        for(int[] ROW : matrix){
            for(int ELE : ROW){
                System.out.print(ELE+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of col: ");
        int col = sc.nextInt();

        int [][]matrix = new int[row][col];

        for(int i = 0; i< row; i++){
            for(int j = 0; j< col; j++){
                System.out.print("Enter the element: ");
                matrix[i][j]=sc.nextInt();
            }
        }

        setZeroes(matrix);

        sc.close();
    }
}