/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class q1 
{
    public static void main(String args[])   
    {  
        int number=50;  
        System.out.print("List of even numbers from 1 to "+number+": ");  
        for (int i=1; i<=number; i++)   
        {  
            if (i%2==0)   
            {  
                System.out.print(i + " ");  
            }  
        }  
    }
}
