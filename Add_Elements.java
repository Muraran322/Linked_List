
package add_elements;
///Program to add elements onto a LinkedList in JAVA
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Add_Elements {
        //Main Driver method
    public static void main(String[] args) {
       //Creating a LinkedList
        LinkedList<String>list= new LinkedList<String>();
        
        //Adding Elements to the linkedlist using add() method
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        
        //Printing the LinkedList
        JOptionPane.showMessageDialog(null,list,"These are the added elements ",JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
