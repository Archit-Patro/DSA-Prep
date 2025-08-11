package Strivers.Arrays;

import java.util.Scanner;

public class kadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max=maxSubArray(arr);

        System.out.println("The maximum subarray is: "+ max);

        sc.close();
    }
}
