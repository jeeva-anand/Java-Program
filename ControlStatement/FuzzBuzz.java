package ControlStatement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FuzzBuzz {

    public List<String> fuzzBuzz(int n,List<String> list){
        int i=1;
        do{
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FUZZBUZZ");
            }else if(i%3 == 0){
                list.add("FUZZ");
            }else if(i%5==0){
                list.add("BUZZ");
            }else{
                list.add(String.valueOf(i));
            }
            i++;
        }while(i<=n);
        return list;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  

        List<String> list = new ArrayList<>();
        List<String> res = new FuzzBuzz().fuzzBuzz(size, list);
        
        for(String s:res){
            System.out.println(s+ " ");
        }

    }
    
}
