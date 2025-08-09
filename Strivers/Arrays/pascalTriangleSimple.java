package Strivers.Arrays;

import java.util.*;

public class pascalTriangleSimple {

    public static void pascal(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1;i<n;i++){
            ans*=(n-i);
            ans/=i;
            System.out.print(ans+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of Pascal Triangle: ");
        int n = sc.nextInt();
        System.out.println("The Pascal Triangle is: ");
        for(int i=1; i<=n; i++){
            pascal(i);
        }
        sc.close();
    }
}
