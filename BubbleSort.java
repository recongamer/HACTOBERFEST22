import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr={34,67,1,95,35};
        int n=arr.length;
        int temp;
       for ( int i = 0; i <n ; i++) {
                for (int j = 1; j < n-i; j++) {
                    if (arr[j-1] > arr[j]) {
                        temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp;
                    }
                    System.out.println(Arrays.toString(arr));
                }
                System.out.println(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
