package AccessModifier;

import java.util.Arrays;
import java.util.Scanner;

import ArrayManipulation.AddTwoNumber;
import ArrayManipulation.ReverseArray;

public class Main extends AddTwoNumber{
         

    private  int knapsack(int wt[],int val[],int weight,int n){

        if(n == 0 || weight == 0) return 0;


        if(wt[n-1] > weight  ) return knapsack(wt, val, weight, n-1);

        int max = Math.max(val[n-1]+ knapsack(wt, val, weight - wt[n-1], n-1),knapsack(wt, val, weight, n-1));
        

   //     System.out.println("Weight "+wt[n-1] + " Rate "+val[n-1] +" Max "+max);

        return max;        
     }

    public static void main(String[] args) {
   
        /*
            PROGRAM : PRIVATE ACCESS MODIFER
        */
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the size of the weight: ");
        int weights = sc.nextInt();
        int wt[] = new int[weights];

        for(int i=0;i<weights;i++){
            System.out.print("Enter the data into the weight: "+(i+1)+": ");
            wt[i] = sc.nextInt();
        }    
             

        System.out.print("Enter the size of the value: ");
        int value = sc.nextInt();
        int val[] = new int[value];
        for(int i=0;i<value;i++){
            System.out.print("Enter the data into the value: "+(i+1)+": ");
            val[i] = sc.nextInt();
        }       
        

        System.out.print("Enter the capcity of knapsack: ");
        int capcity = sc.nextInt();
        int weight = capcity;
             

        int n = val.length;

        int result = new Main().knapsack(wt,val,weight,value);
        System.out.println(result);

        /*
            PROGRAM : PUBLIC ACCESS MODIFER
        */

        int arr[] = {5,4,3,2,1};
        ReverseArray rn = new ReverseArray();      
        rn.reverseArray(arr);  


         /*
            PROGRAM : PROTECTOR ACCESS MODIFER
        */

        int[] addNumber = new Main().addTwoNumber(arr, 7);
        System.out.println(Arrays.toString(addNumber));
        


    }


    
}
