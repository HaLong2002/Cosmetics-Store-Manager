package icy.View;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.awt.Component;
import java.awt.Container;
import java.awt.Window;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JTextField;
import junit.framework.TestCase;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class TestUtils  {
     static int counter;
public static Component getChildNamed(Container parent, String name) {
    Component[] children = parent.getComponents();
    for (int i = 0; i < children.length; i++) {
        Component child = children[i];
        String childName = child.getName();
        if (name.equals(childName)) {
            return child;
        } else if (child instanceof Container) {
            Component found = getChildNamed((Container) child, name);
            if (found != null) {
                return found;
            }
        }
    }
    return null;
}
   public static Component getChildIndexed(
            Component parent, String klass, int index) {
         counter = 0;
  
        // Step in only owned windows and ignore its components in JFrame
        if (parent instanceof Window) {
            Component[] children = ((Window)parent).getOwnedWindows();
  
            for (int i = 0; i < children.length; ++i) {
               // Take only active windows
               if (children[i] instanceof Window &&
                     !((Window)children[i]).isActive()) { continue; }
   
               Component child = getChildIndexedInternal(
                     children[i], klass, index);
               if (child != null) { return child; }
            }
         }
   
         return null;
      }
   
      private static Component getChildIndexedInternal(
            Component parent, String klass, int index) {
   
         // Debug line
         //System.out.println("Class: " + parent.getClass() +
         //    " Name: " + parent.getName());
   
         if (parent.getClass().toString().endsWith(klass)) {
            if (counter == index) { return parent; }
            ++counter;
         }
   
         if (parent instanceof Container) {

        Component[] children = (parent instanceof JMenu) ?
                  ((JMenu)parent).getMenuComponents() :
                  ((Container)parent).getComponents();
   
            for (int i = 0; i < children.length; ++i) {

        Component child = getChildIndexedInternal(

                
                children[i], klass, index);
               if (child != null) { return child; }
            }
         }
         
         return null;
      }
   
}     