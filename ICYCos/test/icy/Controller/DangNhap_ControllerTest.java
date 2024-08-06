/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icy.Controller;

import icy.Controller.DangNhap_Controller;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangNhap_ControllerTest {
    @Test
    public void testDN() {
        DangNhap_Controller  dn = new DangNhap_Controller();
        dn.DocDSDN();
        String tk = "giamdoc";
        String mk="111";
        dn.DangNhap(tk,mk);
        assertTrue(dn.check(tk, mk));   
        System.out.println("Dang nhap thanh cong voi \nusername :"+tk+"\nPassword: "+mk);        
}
}
