package OOPS_1.src.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[n];
        for(int i = 0;i < n; i++){
            a1[i] = sc.nextInt();
        }
        Arrays.sort(a1);
        for(int x : a1){
            System.out.print(x + " ");
        }

    }
}
