/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icy.View;

import icy.Model.DangKyDTO;
import java.awt.Component;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//import static sql.MainFrameTest.getChildNamed;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class QuanLyTKTest {
    
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
    
    @Test
    public void testIcon() throws InterruptedException {
        QuanLyTK tk = new QuanLyTK();
        tk.setComponentsNames();
        JButton btnXoa,btnSua,btnThem,btnRe,btnBack;
        JLabel lbRemk,lbMK,lbTK,lbCV,lbMa;
        tk.setVisible(true);
        btnXoa = (JButton)getChildNamed(tk,"xoa");
        btnSua = (JButton)getChildNamed(tk,"them");
        btnThem = (JButton)getChildNamed(tk,"sua");
        lbRemk = (JLabel)getChildNamed(tk,"ReMk");
        lbMK= (JLabel)getChildNamed(tk,"lbmk");
        lbTK = (JLabel)getChildNamed(tk,"lbtk");
        lbCV = (JLabel)getChildNamed(tk,"lbcv");
        lbMa = (JLabel)getChildNamed(tk,"lbma");
        assertNotNull(btnXoa.getIcon());
        System.out.println(btnXoa.getIcon());
        assertNotNull(btnSua.getIcon());
        System.out.println(btnSua.getIcon());
        assertNotNull(btnThem.getIcon());
        System.out.println(btnThem.getIcon());
        assertNotNull(lbMK.getIcon());
        System.out.println(lbMK.getIcon());
        assertNotNull(lbCV.getIcon());
        System.out.println(lbCV.getIcon());
        assertNotNull(lbMa.getIcon());
        System.out.println(lbMa.getIcon());
        assertNotNull(lbTK.getIcon());
        System.out.println(lbTK.getIcon());
    }

  /*  @Test
    public void testShowDSTaiKhoan() {
        System.out.println("ShowDSTaiKhoan");
        ArrayList<DangKyDTO> ds = null;
        QuanLyTK instance = new QuanLyTK();
        instance.ShowDSTaiKhoan(ds);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        QuanLyTK.main(args);
        fail("The test case is a prototype.");
    }*/
    
}
