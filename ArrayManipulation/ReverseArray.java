package ArrayManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public void reverseArray(int arr[]){

        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>i;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }

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

        new ReverseArray().reverseArray(arr);

        System.out.println(Arrays.toString(arr));
    }
    
}
