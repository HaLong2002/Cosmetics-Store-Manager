/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.Controller;

import icy.DAO.DangNhap_DAO;
import icy.Model.DangKyDTO;
import icy.Model.QLNV_DTO;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DangNhap_Controller {

    public static ArrayList<DangKyDTO> dsdk;
    public static ArrayList<QLNV_DTO> dsnv;
    QLNV_Controller qlnv = new QLNV_Controller();
    DangNhap_DAO data = new DangNhap_DAO();
    public static ArrayList<DangKyDTO> test;
    public static ArrayList<DangKyDTO> login;

    public void DocDSDN() {
        if (dsdk == null) {
            dsdk = new ArrayList<DangKyDTO>();
        }
        dsdk = data.DocDSDN();
    }

    public void DangNhap(String x, String y) {
        if (test == null) {
            test = new ArrayList<DangKyDTO>();
        }
        test = data.DangNhap(x, y);
    }

    public static boolean check(String x, String y) {
        int d = 0;
        for (DangKyDTO dk : test) {
            if (x.equals(dk.TaiKhoan) && y.equals(dk.MatKhau)) {
                d = d + 1;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkDN(String x) {
        int d = 0;
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkTaiKhoan(String x) {
        int d = 0;
        for (DangKyDTO dk : test) {
            if (dk.MaDK.equals(x)) 
               
            return true;
        } 
            return false;
        }
    

    public static boolean checkID(String x) {
        int d = 0;
        for (DangKyDTO dk : dsdk) {
            if (dk.TaiKhoan.equals(x)) {
                System.out.println("DK" + x);
                d++;
            } else {
                d = 0;
            }
        }
        if (d != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIDDK(String x) {
        for (QLNV_DTO nv : QLNV_Controller.dsnv) 
           if(nv.Ma.equals(x)){
               return true;
           }
   
        return false;
    }
    

    public void Sua(String x, String y) {
        data.sua(x, y);
    }
   
    public boolean TaiKhoan(String x){
       for(DangKyDTO dk : dsdk)
           if(dk.TaiKhoan.equals(x)){
               return true;
           }
       return false;
   }
     public boolean MatKhau(String x,String y){
       for(DangKyDTO dk : dsdk)
           if(dk.MatKhau.equals(x)&&dk.TaiKhoan.equals(y)){
               return true;
           }
       return false;
   }
      public boolean Test(String x,String y){
       if(test.size()==0)
           return false;
       return true;
   }
     }


