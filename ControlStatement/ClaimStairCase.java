package ControlStatement;

import java.util.Scanner;

public class ClaimStairCase {
    
    public static int claimStairCase(int n){

        int dp[] = new int[n];
        dp[0]=1;
        dp[1]=2;

        for(int i=2;i<n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }

        return dp[n];
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int res = claimStairCase(n);
        System.out.println("Result is :"+res);


    }
}
