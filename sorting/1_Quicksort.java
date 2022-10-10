import java.util.*;
public class Quicksorting {
    public static void quicksort(int[]arr,int p, int r){
        if(p<r){
            int q = partition(arr,p,r);
            quicksort(arr,p,q-1);
            quicksort(arr,q+1,r);
        }

    }
    public static int partition(int arr[],int p , int r){
        int x = arr[r];
        int i = p-1;
        for(int j=p;j<r-1;j++){
            if(arr[j]<=x){
                i=i+1;
               int temp= arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[r];
        arr[r]=temp;
        return i+1;
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }



    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements for array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("actual array");
        printArray(arr);
        quicksort(arr,0,n-1);
        System.out.println("sorted array:");
        printArray(arr);
    }

}
