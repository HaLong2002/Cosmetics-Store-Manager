package icy.View;

import icy.Controller.SanPham_Controller;
import icy.Model.LoaiSP_DTO;
import icy.Model.SanPham_DTO;
import static icy.View.SanPham_View.SP;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SanPham_ViewTest {

    @Test
    public void testThemSP() {
        SP.DocDuLieu();
        int size = SanPham_Controller.dssp.size();
        System.out.println("Size ban dau: " + size);
        String ma = "hhh";
        SanPham_DTO sp = new SanPham_DTO();
        SanPham_Controller Con = new SanPham_Controller();
        if (SP.maDuyNhat(ma) == true) {
            sp.MaSP = ma;
            sp.TenSP = "Gel tri mun";
            sp.MaLoaiSP = "CSD";
            sp.GiaBan = "50000";
            sp.SoLuong = "0";
            sp.DonViTinh = "100 gam";
            Con.them(sp);
            System.out.println("Thong tin san pham sau khi them: \n" + SanPham_Controller.dssp.get(SanPham_Controller.dssp.size() - 1).toString());
        }
        System.out.println("Size sau khi them san pham: " + SanPham_Controller.dssp.size());
        //assertEquals(SP.maDuyNhat(ma), true);
        assertEquals(size + 1, SanPham_Controller.dssp.size());
    }

    /*@Test
    public void TestXoaSP() {
        SP.DocDuLieu();
        int size = SanPham_Controller.dssp.size();
        System.out.println("Size ban dau: " + size);
        int iXoa = 21;
        SanPham_DTO sp = new SanPham_DTO();
        SanPham_Controller Con = new SanPham_Controller();

        sp = SanPham_Controller.dssp.get(iXoa - 1);
        String ma = sp.MaSP;
        System.out.println(ma);
        Con.xoa(ma);
        SanPham_Controller.dssp.remove(iXoa - 1);
        
        System.out.println("Size sau khi xoa san pham: " + String.valueOf(SanPham_Controller.dssp.size()));
        assertEquals(size - 1, SanPham_Controller.dssp.size());
    }*/
}
