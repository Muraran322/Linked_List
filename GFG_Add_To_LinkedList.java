//JAVA Program to add elements to a linked list
package gfg_add_to_linkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GFG_Add_To_LinkedList {

    public static void main(String[] args) {
        
        LinkedList<String>ll = new LinkedList<>();
        
        ll.add("Students");
        ll.add("Learn");
        ll.add("Daily");
        
        JOptionPane.showMessageDialog(null, ll, "Initial LinkedList", JOptionPane.INFORMATION_MESSAGE);
        
        ll.set(1,"Never");
        
        JOptionPane.showMessageDialog(null, ll, "Updated LinkedList", JOptionPane.INFORMATION_MESSAGE);
        
        //Program to remove elements in a linkedlist
        
        //Function call
        ll.remove(1);
        
        JOptionPane.showMessageDialog(null, ll, "After the Index Removal", JOptionPane.INFORMATION_MESSAGE);
        
        ll.remove("Daily");
        
        JOptionPane.showMessageDialog(null, ll, "After the Object Removal", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
