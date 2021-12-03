/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ela
 */
public class Day1 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        int cont=0;
        ArrayList<Integer> list = new ArrayList();
        
        try (Scanner s = new Scanner(new File("C:\\Users\\Ela\\Desktop\\OOP\\Day1\\src\\input.txt"))) {
            while (s.hasNext()){
                if(s.hasNextInt()){
                    list.add(s.nextInt());
                }
            }   }
    System.out.println(list);
    
    for(int i=1; i<= list.size()-1; i++){
        if(list.get(i-1)<list.get(i))
            cont++;
        
    }
    //throw new IndexOutOfBoundsException("Index " + "2000" + " is out of bounds!");
    
    System.out.println(cont);
    
    
}
    
}
