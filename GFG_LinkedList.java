
package gfg_linkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GFG_LinkedList {
  
    public static void main(String[] args) {
        //Creating object of the class linked list
        LinkedList<String>ll = new LinkedList<String>();
        
        //Adding Elements to the LinkedList
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        
        ll.addFirst("D");
        
        ll.add(2,"E");
        
        JOptionPane.showMessageDialog(null, ll, " LinkedList", JOptionPane.INFORMATION_MESSAGE);
        
        ll.remove("B");
        ll.remove(3);
        
        ll.removeFirst();
        ll.removeLast();
        
        JOptionPane.showMessageDialog(null, ll, "Updated LinkedList", JOptionPane.INFORMATION_MESSAGE);
       
    }
    
}
