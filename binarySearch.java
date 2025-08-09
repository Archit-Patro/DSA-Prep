import java.util.*;
public class binarySearch {
    public static int binSearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                left = mid++;
            else
                right = mid--;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int result  = binSearch(arr, target);
        if(result == -1)
        System.out.print("The element is not present");
        else
        System.out.print("The element is present at the index "+ result);
        sc.close();
    }
}