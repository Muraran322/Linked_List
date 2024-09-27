
package linkedlist_toarray;

import java.util.*;
import javax.swing.JOptionPane;

public class LinkedList_toArray {

    public static void main(String[] args) {
        
        LinkedList<Integer>list = new LinkedList<Integer>();
        
        list.add(123);
        list.add(12);
        list.add(11);
        list.add(1134);
       JOptionPane.showMessageDialog(null, list, "LinkedList", JOptionPane.INFORMATION_MESSAGE);
        Object [] a= list.toArray();
        
        JOptionPane.showMessageDialog(null, list, "After Converted LinkedList to array", JOptionPane.INFORMATION_MESSAGE);

        for(Object element : a)
            
            JOptionPane.showMessageDialog(null, element, " ", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
