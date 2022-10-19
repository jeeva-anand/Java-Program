package ArrayManipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddTwoNumber {    
    
    protected int[] addTwoNumber(int[] arr, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }

        for(int i=0;i<arr.length;i++){
            int targetElement = target - arr[i];
            if(map.containsKey(targetElement) && map.get(targetElement) != i){
                return new int[]{i,map.get(targetElement)};
            }
        }

        return new int[]{-1,-1};
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
        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int res[] = new AddTwoNumber().addTwoNumber(arr,target);

        System.out.println("Index's are : "+Arrays.toString(res));
            

    }


}

