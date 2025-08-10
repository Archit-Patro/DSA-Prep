package Strivers.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class nextPermutation {
    public void nextPermutation(int[] nums) {
        int ind=-1; int n=nums.length;
        for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
            else{
                continue;
            }
        }
        if(ind==-1){
            Arrays.sort(nums,0,n);
            return;
        }
        else{
            for(int i=n-1; i>ind; i--){
                if(nums[i] > nums[ind]){
                    int temp=nums[i];
                    nums[i]=nums[ind];
                    nums[ind]=temp;
                    break;
                }
            }
            Arrays.sort(nums,ind+1,n);
        }
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

        nextPermutation obj = new nextPermutation();
        obj.nextPermutation(arr);
        
        System.out.println("Next permutation is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
