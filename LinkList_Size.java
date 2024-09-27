
package linklist_size;

import java.io.*;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class LinkList_Size {

    public static void main(String[] args) {
        
        LinkedList<String>list = new LinkedList<String>();
        
        list.add("Sometimes ");
        list.add("You have to ");
        list.add("Win ");
        
        //Displaying the size of the list
        JOptionPane.showMessageDialog(null, list.size(), "The size of the LinkedList is ", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("The size of the LinkedList is: "+ list.size());
        
        //REMOVE FIRST OPERATION
        JOptionPane.showMessageDialog(null, list.removeFirst(),"The removed first element is ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("The remove first element is: "+list.removeFirst());
        
        //Displaying the final list
        JOptionPane.showMessageDialog(null, list,"Final LinkedList ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Final LinkedList: "+list);
        
        //REMOVE LAST OPERATION
        JOptionPane.showMessageDialog(null, list.removeLast(),"The Last element is Removed ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("The last element is Removed: "+list.removeLast());
        
        //Displaying the final list
        JOptionPane.showMessageDialog(null, list,"Final LinkedList is ",JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("Final LinkedList is: "+list);
        
    }
    
}
