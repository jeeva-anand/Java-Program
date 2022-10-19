package ConstructorOverload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Vechile {

    static List<String> carList = new ArrayList<>();
    static Map<String,String> carWithColorList = new HashMap<>();
    static List<String> color = Arrays.asList("Red","Blue","Green");

    public Vechile(String name)    {
        carList.add(name);
        carWithColorList.put(name,color.get(color.size()-1));
    }

    public Vechile(String name,String color)    {
        carList.add(name);
        carWithColorList.put(name,color);
    }

    public static String getNewModelCar(String name){

        for(String s : carList){
            if(name.equals(s)){
                return "New Mode "+name.toUpperCase();
            }
        }

        return name.toUpperCase()+" is unavailable right now!";
    }

    public static String getNewModelCar(String name,String color){

        if(carWithColorList.containsKey(name))
            if(carWithColorList.get(name).equals(color))
                return  "New model  "+name.toUpperCase()+" and "+color + " color car";

        return "For this "+name+" and speed unavailable right now!";
    }
}

public class ConstructorOverload3 {   
     
    public static void main(String[] args) {      

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the name: ");
        String color = sc.nextLine();          
        Vechile v1 = new Vechile(name,color);      
        System.out.println(v1.getNewModelCar(name));
        System.out.println(v1.getNewModelCar(name,color));        
    }
}
