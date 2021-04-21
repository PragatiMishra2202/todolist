/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
import java.util.*;

public class q5 
{ 
   static Map<String, Integer> map = new HashMap<>(); 
    public static void sortbykey()
    { 
        ArrayList<String> sortedKeys = 
                    new ArrayList<String>(map.keySet()); 
        Collections.sort(sortedKeys);  
        for (String x : sortedKeys)  
            System.out.println("Key = " + x +  
                        ", Value = " + map.get(x));      
    } 
    public static void main(String args[]) 
    { 
        map.put(1, "Jayant"); 

        map.put(10, "Abhishek"); 

        map.put(4, "Anushka"); 

        map.put(5, "Amit"); 
 
         sortbykey(); 

    } 
} 

