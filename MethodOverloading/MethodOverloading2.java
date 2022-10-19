package MethodOverloading;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Computer {


    static List<String> listOfComputer = new ArrayList<>();
    static Map<Integer,String> listOfPrcessorSpeed = new HashMap<>();

    public Computer(String name,int speed)    {
        listOfComputer.add(name);
        listOfPrcessorSpeed.put(speed,name);
    }

    public static String getComputerList(String nameOfTheCompter){

        for(String name : listOfComputer){
            if(nameOfTheCompter.equals(name)){
                return "Computer Name is "+name.toUpperCase();
            }
        }

        return "Sorry, Your Requested brand is unavailable right now!";
    }



    public static String getComputerList(String nameOfTheCompter,int processorSpeed){

        if(listOfPrcessorSpeed.containsKey(processorSpeed))
            return "Computer Name is "+nameOfTheCompter.toUpperCase()+" and processor speed is "+processorSpeed;

        return "For this "+processorSpeed+"speed ,right now unavailable";
    }
}

public class MethodOverloading2{

    public static void main(String[] args) {       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the name: ");
        int code = sc.nextInt();
        Computer cp1 = new Computer(name,code);  
        System.out.println(cp1.getComputerList("Lenova"));
        System.out.println(cp1.getComputerList("hp",3));

        
    }


    
}
