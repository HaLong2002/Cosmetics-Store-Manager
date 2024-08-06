/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.Controller;

import icy.Model.DangKyDTO;
import icy.Model.QLNV_DTO;
import icy.DAO.DangKy_DAO;
import java.util.ArrayList;

public class DangKy_Controller {

    public static ArrayList<DangKyDTO> dsdk;
   
    QLNV_Controller nvien = new QLNV_Controller();

    public void DocDSDK() {
        if (dsdk == null) {
            dsdk = new ArrayList<DangKyDTO>();
        }
         DangKy_DAO data = new DangKy_DAO();
        dsdk = data.DocDSDK();
    }

    public void themTK(DangKyDTO dk) {
         DangKy_DAO data = new DangKy_DAO();
        data.themTK(dk);
       dsdk.add(dk);
    }
public static ArrayList<DangKyDTO> timTheoMa(String x) {
        ArrayList<DangKyDTO> kq = new ArrayList<DangKyDTO>();
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.indexOf(x) >= 0) {
                kq.add(dk);
            }
        }
        return kq;

    }
    public void xoaTK(String ma) {
         DangKy_DAO data = new DangKy_DAO();
        data.xoaTK(ma);
        dsdk.remove(ma);

    }

    public static boolean KtrTK(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.TaiKhoan.equals(x)) {
                return false;
            }
        }
        return true;
    }

    public static boolean MaDKy(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                return false;
            }
        }
        return true;

    }

    public boolean ID(String x) {
        for (DangKyDTO dk : dsdk) {
            if (dk.MaDK.equals(x)) {
                return true;
            }
        }
        return false;
    }
   public boolean checkID(String x){
       for(QLNV_DTO nv:nvien.dsnv)
           if(nv.Ma.equals(x)){
               return true;
           }
       return false;
   }
    public boolean checkTK(String x){
       for(DangKyDTO dk : dsdk)
           if(dk.TaiKhoan.equals(x)){
               return false;
           }
       return true;
   }
    public void sua(DangKyDTO dk) {
         DangKy_DAO data = new DangKy_DAO();
        data.sua(dk);
    }
   public boolean IDchuaDK(String x){
        for(QLNV_DTO nv:nvien.dsnv)
           if(nv.Ma.equals(x)){
               return true;
           }
       return false;
   }
   public boolean check_CV(String x,String y){
        for(QLNV_DTO nv:nvien.dsnv)
           if(nv.ChucVu.equals(x)&& nv.Ma.equals(y)){
               return true;
           }
       return false;
   }
   
   
}
