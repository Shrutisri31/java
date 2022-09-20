import java.util.Scanner;

public class binarysearch {
    public static int Binary_Search(int[]arr,int low , int high , int key){
        int mid = (low+high)/2;
        if(low<=high){                        //base case
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                return Binary_Search(arr,mid+1,high,key);
            }
            else if(arr[mid]>key){
                return Binary_Search(arr,low,mid-1,key);
            }
        }
        return -1;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int n = sc.nextInt();
        System.out.println("enter elements of array:");
        int[]arr=new int[n];   //declare array
        for(int i =0;i<n;i++){
             arr[i]=sc.nextInt();       //take array input
        }
        System.out.println("enter the element to find:");
        int key = sc.nextInt();
        int low = 0;              //set low=0 ; and high = n-1
        int high = arr.length-1;
        int ans = Binary_Search(arr,low,high , key);
        if(ans==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element "+key+" is found at index: "+ans);
        }
    }
}
