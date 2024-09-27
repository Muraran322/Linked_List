
package gfg_iterating_linkedlist;

import java.util.*;

public class GFG_Iterating_LinkedList {
   
  
    public static void main(String[] args) {
        
        LinkedList<String>ll = new LinkedList<>();
        
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1,"For");
        
        //Using the Get method and the For Loop
        for (int i = 0; i < 11.size(); i++)
        {
             System.out.print(11.get(i) + "  ");
        
        }
        System.out.println();
        //Using the for each loop
        for (String str :11)
             System.out.println(str + " ");
    }
    
}
