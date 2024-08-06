/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icy.DAO;
import icy.Model.DangKyDTO;
import icy.SQLConnect;
import icy.View.QLNV_View;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangKy_DAO {
    SQLConnect connect ; 

    public DangKy_DAO() {
        connect = new SQLConnect("DESKTOP-K9N8FMA\\SQLEXPRESS", "ICY", "sa", "123456Sa");
    }

    public ArrayList DocDSDK() {
        ArrayList dsdk = new ArrayList<DangKyDTO>();
        try {
            String qry = "select * from NguoiDung";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                DangKyDTO dk = new DangKyDTO();
                dk.MaDK = result.getString(1);
                dk.TaiKhoan = result.getString(2);
                dk.MatKhau = result.getString(3);
                dk.ChuVuDK = result.getString(4);
                dsdk.add(dk);
            }
        } catch (Exception ex) {
           // Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsdk;
    }

    public void themTK(DangKyDTO dk) {
        try {
            String qry = "Insert into NguoiDung Values (";
            qry = qry + " N'" + dk.MaDK + "'";
            qry = qry + ",N" + "'" + dk.TaiKhoan + "'";
            qry = qry + ",N" + "'" + dk.MatKhau + "'";
            qry = qry + ",N" + "'" + dk.ChuVuDK + "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
           // Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void xoaTK(String ma) {
        try {
            String qry = "Delete from NguoiDung WHERE Ma=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
            Logger.getLogger(QLNV_View.class.getName()).log(Level.SEVERE, null, ex);
           // System.out.println("xoa that bai");
        }
    }
     public void sua(DangKyDTO dk) {
        try {
            String qry = "Update NguoiDung Set";
           qry = qry + " " + "Ma=" + "N'" + dk.MaDK + "'";
           qry = qry + "," + "TaiKhoan=" + "N'" + dk.TaiKhoan + "'";
            qry = qry + "," + "MatKhau=" + "N'" + dk.MatKhau + "'";
          qry = qry + "," + "ChucVu=" + "N'" + dk.ChuVuDK + "'";
            qry = qry + " Where Ma=" + "N'" + dk.MaDK + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex) {
          //  Logger.getLogger(QLNV_GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
