import java.util.Scanner;
public class binarySearch {
    static int solve(int a[],int n,int key){
        int start = 0; 
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(a[mid] == key){
                return mid;
            }
            else if(a[mid] > key){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        sc.close();
        int result = solve(a,n,key);
        if(result == -1){
            System.out.println("Searched number doesn't exist");
        }
        else{
            System.out.println("Hurrah! Searched number is found");
        }

    }
    
}