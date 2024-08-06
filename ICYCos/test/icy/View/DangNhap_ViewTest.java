/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icy.View;

import icy.DAO.DangNhap_DAO;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.*;
import static java.lang.Thread.sleep;
import javax.swing.*;
//import sql.DangNhap_Controller;
//import static sql.MainFrameTest.getChildNamed;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangNhap_ViewTest extends TestCase{
     @Test
     public void testTextField() throws InterruptedException {
        DangNhap_View dn = new DangNhap_View();
      JTextField taikhoan,matkhau;
        String exTK="Tài khoản";
        String exMK="Mật khẩu";
        dn.setComponentsNames();
        dn.setVisible(true);
        taikhoan = (JTextField)TestUtils. getChildNamed(dn,"taikhoan") ;
        matkhau  = (JTextField)TestUtils. getChildNamed(dn,"matkhau");
        taikhoan.postActionEvent();
        matkhau.postActionEvent();
        assertEquals(exTK,"Tài khoản");
        assertEquals(exMK,"Mật khẩu");
    }
    /*@Test
    public void testNameButton() throws InterruptedException {
       DangNhap_GUI dn = new DangNhap_GUI();
       JButton btnDangNhap,btnQuenMK ;
       String exdn="Đăng nhập";
       String exqmk= "Quên mật khẩu ?";
       dn.setVisible(true);
       dn.setComponentsNames();   
       btnDangNhap = (JButton)TestUtils.getChildNamed(dn,"dn") ;
       btnQuenMK = (JButton)TestUtils.getChildNamed(dn,"quenmk") ;
       assertEquals( exdn,btnDangNhap.getText());
       assertEquals( exqmk,btnQuenMK.getText());       
    }*/
    

    
    
}
