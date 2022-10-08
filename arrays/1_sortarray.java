import java.util.*;    
public class sortarray {       
    public static void main(String[]args){
        System.out.println("enter size of array,n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter elements in array:");
        int arr[]=new int[n];
        int i=0;
        for( i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("unsorted array:");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        System.out.println("sorted array:");
        Arrays.sort(arr);
        for(i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
