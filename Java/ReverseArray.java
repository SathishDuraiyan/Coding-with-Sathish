import java.util.*;
public class ReverseArray {
    public static void reverser(int[] a){
        int[] reverse = new int[a.length];
        for(int i=0;i<a.length;i++){
            reverse[i] = a[a.length - i -1];
        }
        for(int i : reverse){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the arr: ");
        int n = sc.nextInt();
        System.out.print("Array elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Reversed Array: ");
        reverser(arr);
    }
}
