package Static;
import java.util.LinkedList;
import java.util.zip.ZipFile;
import java.util.Vector;
import java.lang.System;
import java.util.Comparator;
//import java.lang.;


//import java.util.Compa;


public class Static {
    

    // Static variable or Class variable
    static int maxCount;
    static int count;
    static int result;
    int age;


        // Static block
    static{
        
        System.out.println("Static Block 1");
    }

    // Static Method
    public static java.util.Stack<Integer> goodBinary(String str){
        
        for(char c:str.toCharArray()){
            if(c == '1'){
                count++;
            }else{
                count = 0;
            }
            maxCount = Math.max(maxCount,count);
        }

        for(int i=0;i<str.length();){
            int cnt = 0;
            char c = str.charAt(i);
            while( i < str.length() && str.charAt(i) == '0') {
                i++;
                
            }
            while(i < str.length() && str.charAt(i) == '1'){
                cnt+=1;
                i++;
            }

            if(cnt != maxCount){
                result += 1;
            }
        }
        System.out.println("Result: "+result);

        return null;
    }

    // Static Block
    static{
        
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        goodBinary("101110110111");
        System.out.println((System.currentTimeMillis()));
        System.out.println(System.class );
              
    }

 

}
