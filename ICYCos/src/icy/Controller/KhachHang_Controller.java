package icy.Controller;

import icy.DAO.KhachHang_DAO;
import icy.Model.KhachHang_DTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhachHang_Controller {
    
    public static ArrayList<KhachHang_DTO> dskh;
    public static ArrayList<KhachHang_DTO> dstkkh;

    public KhachHang_Controller() {
    }
        
    public void DocDSKH(){
        KhachHang_DAO data=new KhachHang_DAO();
        if(dskh==null) dskh=new ArrayList<KhachHang_DTO>();
        dskh=data.DocDSKH();
    }
    
    public void them (KhachHang_DTO kh){
        KhachHang_DAO data = new KhachHang_DAO();
        data.them(kh);
        dskh.add(kh);
    }
    
    public void sua(int i, KhachHang_DTO kh){
        KhachHang_DAO data = new KhachHang_DAO();
        data.sua(kh);
        //KhachHang_DTO old = dskh.set(i, kh);
        dskh=data.DocDSKH();
    }
    
    public void xoa(String ma, int i) {
        KhachHang_DAO data = new KhachHang_DAO();
        data.xoa(ma);
        dskh.remove(i);
    }
    
    
    public void timkiem(){
        if(dstkkh==null) dstkkh=new ArrayList<KhachHang_DTO>();
        
    }
}
