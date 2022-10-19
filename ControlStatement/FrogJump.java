package ControlStatement;

import java.util.Scanner;

public class FrogJump {


    public int frogJump(int arr[],int n){

        int dp[] = new int[n+1];
        dp[0] = 0;

        for(int i=1;i<n;i++){
            
            int left =  Integer.MAX_VALUE;
            int right =  Integer.MAX_VALUE;

            left = dp[i-1] + Math.abs(arr[i-1] - arr[i]);
            if(i > 1){
                right = dp[i-2] + Math.abs(arr[i-2] - arr[i]);
            }
            dp[i] = Math.min(left, right);
        }
        return dp[n-1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the data into the array: "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }    

        int res = new FrogJump().frogJump(arr, arr.length-1);

        System.out.println("Minimum step is "+res);
    }
    
}
