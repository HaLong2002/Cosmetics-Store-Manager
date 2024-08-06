/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package icy.Controller;

import icy.Controller.DangKy_Controller;
import icy.Model.DangKyDTO;
import java.util.ArrayList;
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


public class DangKy_ControllerTest {
   @Test
    public void testDocDSDK() {
        DangKy_Controller bus = new DangKy_Controller();
        bus.DocDSDK();
        assertNotNull(bus);
        System.out.println("Tong so tai khoan trong CO SO DU LIEU: "+bus.dsdk.size());
    }
    @Test
    public void testThemTK() {
        DangKy_Controller bus= new DangKy_Controller();
        bus.DocDSDK();
        int d= bus.dsdk.size();
        DangKyDTO dk = new DangKyDTO();
        dk.MaDK = "QLSP";
        dk.TaiKhoan ="sanpham";
        dk.MatKhau="123";
        dk.ChuVuDK="Quản lý sản phẩm";
        if(bus.ID(dk.MaDK)==false){
          bus.themTK(dk);
          bus.dsdk.add(dk);
        System.out.println("Du lieu vua them: \nMa NV: "+dk.MaDK+"\nMat khau:"+dk.MatKhau+"\nTai khoan:"+dk.TaiKhoan+"\nChuc vu:"+dk.ChuVuDK);
        System.out.println("Tong so tai khoan trong CO SO DU LIEU: "+bus.dsdk.size());
    }
        else  System.out.println("Them khong thanh cong");
        assertEquals(d+1,bus.dsdk.size());
    }

 /*   @Test
    public void testTimTheoMa() {
        System.out.println("timTheoMa");
        String x = "";
        ArrayList<DangKyDTO> expResult = null;
        ArrayList<DangKyDTO> result = DangKy_BUS.timTheoMa(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/

    /*@Test
    public void testXoaTK() {
         DangKy_BUS bus= new DangKy_BUS();
        bus.DocDSDK();
        int d = bus.dsdk.size();
        DangKyDTO dk = new DangKyDTO();
        dk.MaDK = "GD00";
        bus.xoaTK(dk);                          
        bus.dsdk.remove(dk);
      //  System.out.println("Tong so tai khoan trong CO SO DU LIEU: "+bus.dsdk.size());
       // System.out.println(d);
       assertEquals(d-1,bus.dsdk.size()); 
    }*/

    /*@Test
    public void testKtrTK() {
        System.out.println("KtrTK");
        String x = "";
        boolean expResult = false;
        boolean result = DangKy_BUS.KtrTK(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testMaDKy() {
        System.out.println("MaDKy");
        String x = "";
        boolean expResult = false;
        boolean result = DangKy_BUS.MaDKy(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testID() {
        System.out.println("ID");
        String x = "";
        DangKy_BUS instance = new DangKy_BUS();
        boolean expResult = false;
        boolean result = instance.ID(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckID() {
        System.out.println("checkID");
        String x = "";
        DangKy_BUS instance = new DangKy_BUS();
        boolean expResult = false;
        boolean result = instance.checkID(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheckTK() {
        System.out.println("checkTK");
        String x = "";
        DangKy_BUS instance = new DangKy_BUS();
        boolean expResult = false;
        boolean result = instance.checkTK(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testSua() {
        System.out.println("sua");
        DangKyDTO dk = null;
        DangKy_BUS instance = new DangKy_BUS();
        instance.sua(dk);
        fail("The test case is a prototype.");
    }

    @Test
    public void testIDchuaDK() {
        System.out.println("IDchuaDK");
        String x = "";
        DangKy_BUS instance = new DangKy_BUS();
        boolean expResult = false;
        boolean result = instance.IDchuaDK(x);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testCheck_CV() {
        System.out.println("check_CV");
        String x = "";
        String y = "";
        DangKy_BUS instance = new DangKy_BUS();
        boolean expResult = false;
        boolean result = instance.check_CV(x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }*/
    
}
