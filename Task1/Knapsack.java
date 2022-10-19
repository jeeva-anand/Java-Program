package Task1;

import java.util.Scanner;

public class Knapsack {

    public static int knapsack(int wt[], int pr[], int c, int n) {

        if (n == 0 || c == 0)
            return 0;
        if (wt[n - 1] > c)
            return knapsack(wt, pr, c, n - 1);

        return Math.max(pr[n - 1] + knapsack(wt, pr, c - wt[n - 1], n - 1), knapsack(wt, pr, c, n - 1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of items: ");
        int val = new Scanner(System.in).nextInt();
        int wt[] = new int[val];
        int pr[] = new int[val];
        System.out.println("Enter the profit: ");

        for (int i = 0; i < val; i++) {
            System.out.print("Enter the profit " + (i + 1) + " :");
            pr[i] = sc.nextInt();
        }
        System.out.println("Enter the weight: ");
        for (int i = 0; i < val; i++) {
            System.out.print("Enter the weight " + (i + 1) + " :");
            wt[i] = sc.nextInt();
        }
        System.out.print("Enter the capacity: ");
        int C = new Scanner(System.in).nextInt();
        int res = knapsack(wt, pr, C, val);
        System.out.println("Maximum Capacity is: " + res);

    }

}
