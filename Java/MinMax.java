import java.util.*;
public class MinMax {
    public static void FindMin(int[] arr){
        int min = 1000;
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("The Smallest Element in the array is : "+min);
    }
    public static void FindMax(int[] arr){
        int max = -1000;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.println("The Largest Element in the array is : "+max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.print("Array Size : ");
        int n = sc.nextInt();
        System.out.print("Array Elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        FindMin(arr);
        FindMax(arr);
    }
}
