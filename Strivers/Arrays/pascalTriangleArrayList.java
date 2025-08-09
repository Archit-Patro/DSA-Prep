package Strivers.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangleArrayList {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    list.add(1);
                }
                else{
                    int a = result.get(i-1).get(j-1);
                    int b = result.get(i-1).get(j);
                    list.add(a+b);
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal Triangle: ");
        int n = sc.nextInt();
        System.out.println("The Pascal Triangle is: ");
        pascalTriangleArrayList ob = new pascalTriangleArrayList();
        List<List<Integer>> triangle = ob.generate(n);
        System.out.println(triangle);
    }
}
