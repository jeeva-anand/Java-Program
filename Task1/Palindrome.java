package Task1;

import java.util.Scanner;

public class Palindrome {
    
    public static boolean palindrome(int num){
        int result = 0;
        while(num > result){
            int temp = num % 10;
            result = result * 10 + temp;
            num /= 10;
        }
        
        return num == result || num == result/10;
    }

    public static void main(String[] args) {
        System.out.print("Ente the Number: ");
        boolean res = palindrome(new Scanner(System.in).nextInt());
        if(res)
            System.out.println("It's a Palindrome");
        else
            System.out.println("It's not a Palindrome");
    }
}
