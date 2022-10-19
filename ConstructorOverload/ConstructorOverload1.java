package ConstructorOverload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




class Bank  {    

    // 14/09/2022 Data member of the class, used to store the bank details for faster access.
    static List<String> branchNames = new ArrayList<>();
    static List<Integer> branchCode = new ArrayList<>();
    static Map<Integer,String> map = new HashMap<>();


    //14/09/2022  Constructor
    public Bank(String name){
        branchNames.add(name);
        map.put((int)Math.random(), name);
        branchCode.add((int) Math.random());   
    }

    public Bank(String name,int code){
        branchNames.add(name);
        branchCode.add(code);
        map.put(code, name);
    }


    /*
        14/09/2022  Thsi method is used to Getting branch name from branchName list, inpu
        for this method is name of the bank 
    */
    public static String getBranchName(String name){

        for(String s:branchNames){
            if(s.equals(name))
                return "> Branch name is"+name.toUpperCase()+" 8975";
        }
        return "Right now this "+ name+"is unavailable!";
    }

    /*
        14/09/2022  Thsi method is used to Getting branch name from branchName list, for this
        method need two parameter one is for branch name and other is branch code for faster search.
    */
    public static String getBranchName(String name,int code){

        boolean isNamePresent = false;
        boolean isCodePresent = false;


        for(String s:branchNames){
            if(s.equals(name))
               isNamePresent = true;
        }

        for(int i:branchCode){
            if(i == code)
              isCodePresent = true;
        }
        
        if(isNamePresent && isCodePresent)  
            return "> Branch name is "+name.toUpperCase()+" and branch code is "+code+"009";

        return "Right now this "+ name+"and "+ code +" is unavailable!";
        
    }

}

public class ConstructorOverload1 {
    
   public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the name: ");
        int code = sc.nextInt();  
        
        Bank b1 = new Bank(name,code);  

        System.out.println(b1.getBranchName(name,code));

    }
}
