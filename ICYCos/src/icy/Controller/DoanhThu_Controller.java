package icy.Controller;

import icy.DAO.HoaDon_DAO;
import icy.Model.HoaDon_DTO;
import java.util.ArrayList;

public class DoanhThu_Controller {
    
    public static ArrayList<HoaDon_DTO> dsdt;
    HoaDon_DAO data=new HoaDon_DAO();

    public void DocDSDT(){
        if(dsdt==null) dsdt=new ArrayList<HoaDon_DTO>();
        dsdt=data.DocHoaDon();
    }
}
