package icy.DAO;

import icy.Model.CTKhuyenMai_DTO;
import icy.SQLConnect;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CTKhuyenMai_DAO {
    SQLConnect connect;
    
    public CTKhuyenMai_DAO(){
        connect = new SQLConnect("DESKTOP-K9N8FMA\\SQLEXPRESS", "ICY", "sa", "123456Sa");

    } 
    
    public ArrayList DocDSCTKM(){
        ArrayList dsctkm = new ArrayList<CTKhuyenMai_DTO>();
        try {
            String qry = "select * from CTKhuyenMai";
            ResultSet result = connect.executeQuery(qry);
            while (result.next()) {
                CTKhuyenMai_DTO ctkm = new CTKhuyenMai_DTO();
                ctkm.mact = result.getString(1);
                ctkm.makm = result.getString(2);
                ctkm.masp = result.getString(3);
                ctkm.giamgia = result.getString(4);
                dsctkm.add(ctkm);
            }
        } catch (Exception ex) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsctkm;
    }
    
    public void them(CTKhuyenMai_DTO ctkm){
        try {
            String qry = "INSERT INTO CTKhuyenMai VALUES (";
            qry = qry + "N'" + ctkm.mact + "'";
            qry = qry + ", N'" + ctkm.makm + "'";
            qry = qry + ", N'" + ctkm.masp + "'";
            qry = qry + ", N'" + ctkm.giamgia+ "'";
            qry = qry + ")";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void sua (CTKhuyenMai_DTO ctkm){
        try{
            String qry = "Update CTKhuyenMai Set ";
            qry = qry + "MAKM=" + "N'" + ctkm.makm + "'";
            qry = qry + ", MASP=" + "N'" + ctkm.masp + "'";
            qry = qry + ", GIAMGIA=" + "N'" + ctkm.giamgia + "'";
            qry = qry + " where MACT=" + "N'" + ctkm.mact + "'";
            connect.executeUpdate(qry);
        } catch (Exception ex){
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void xoa (String ma){
        try{
            String qry = "Delete from CTKhuyenMai where MACT=N'" + ma + "'";
            connect.executeUpdate(qry);
        } catch (Exception e) {
            Logger.getLogger(CTKhuyenMai_DAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
