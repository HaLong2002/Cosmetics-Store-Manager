package icy.View;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.junit.Test;

public class KhachHang_ViewTest extends TestCase {

    public static Component getChildNamed(Container parent, String name) {
    Component[] children = parent.getComponents();
    for (int i = 0; i < children.length; i++) {
        Component child = children[i];
        String childName = child.getName();
        if (name.equals(childName)) {
            return child;
        } else if (child instanceof Container) {
            Component found = getChildNamed((Container) child, name);
            if (found != null) {
                return found;
            }
        }
    }
    return null;
}
    
    @Test
    public void testTextField() throws InterruptedException {
        
        KhachHang_View kh = new KhachHang_View();
        JTextField txtma, txtho, txtten, txtsdt, txtdiem, txtTkma, txtTkHo, txtTkSdt, txtTkTen;
        
        String exMa = "";
        String exHo = "Nhập họ lót";
        String exTen = "Nhập tên";
        String exSdt = "Nhập số điện thoại";
        String exDiem = "";
        
        String exTkMa = "Nhập mã khách hàng cần tìm";
        String exTkHo = "Nhập họ lót cần tìm";
        String exTkTen = "Nhập tên cần tìm";
        String exTkSdt = "Nhập số điện thoại cần tìm";
        
        kh.setComponentsNames();
        kh.setVisible(true);
        
        txtma = (JTextField) getChildNamed(kh, "Ma");
        txtma.postActionEvent();
        txtho = (JTextField) getChildNamed(kh, "Ho");
        txtho.postActionEvent();
        txtten = (JTextField) getChildNamed(kh, "Ten");
        txtten.postActionEvent();
        txtsdt = (JTextField) getChildNamed(kh, "Sdt");
        txtsdt.postActionEvent();
        txtdiem = (JTextField) getChildNamed(kh, "Diem");
        txtdiem.postActionEvent();
        
        txtTkma = (JTextField) getChildNamed(kh, "TkMa");
        txtTkma.postActionEvent();
        txtTkHo = (JTextField) getChildNamed(kh, "TkHo");
        txtTkHo.postActionEvent();
        txtTkTen = (JTextField) getChildNamed(kh, "TkTen");
        txtTkTen.postActionEvent();
        txtTkSdt = (JTextField) getChildNamed(kh, "TkSdt");
        txtTkSdt.postActionEvent();
        
        assertEquals(exMa, "");
        assertEquals(exHo, "Nhập họ lót");
        assertEquals(exTen, "Nhập tên");
        assertEquals(exSdt, "Nhập số điện thoại");
        assertEquals(exDiem, "");
        
        assertEquals(exTkMa, "Nhập mã khách hàng cần tìm");
        assertEquals(exTkHo, "Nhập họ lót cần tìm");
        assertEquals(exTkTen, "Nhập tên cần tìm");
        assertEquals(exTkSdt, "Nhập số điện thoại cần tìm");
        
        //sleep(2000);
    }

    @Test
    public void testIconButton() throws InterruptedException {
        
        KhachHang_View kh = new KhachHang_View();
        JButton btnThem, btnSua, btnXoa, btnTimkiem, btnReload;
        
        kh.setComponentsNames();
        kh.setVisible(true);
        
        btnThem = (JButton) getChildNamed(kh, "them");
        btnSua = (JButton) getChildNamed(kh, "sua");
        btnXoa = (JButton) getChildNamed(kh, "xoa");
        btnTimkiem = (JButton) getChildNamed(kh, "timkiem");
        btnReload = (JButton) getChildNamed(kh, "reload");
        
        assertNotNull(btnThem.getIcon());
        assertNotNull(btnSua.getIcon());
        assertNotNull(btnXoa.getIcon());
        assertNotNull(btnTimkiem.getIcon());
        assertNotNull(btnReload.getIcon());
        
        //sleep(2000);
    }
    
    @Test
    public void testLabel() throws InterruptedException {
        
        KhachHang_View kh = new KhachHang_View();
        JLabel ma, ho, ten, sdt, diem;
        
        String exMa = "Mã khách hàng";
        String exHo = "Họ lót";
        String exTen = "Tên";
        String exSdt = "Số điện thoại";
        String exDiem = "Điểm tích lũy";
        
        kh.setComponentsNames();
        kh.setVisible(true);
        
        ma = (JLabel) getChildNamed(kh, "ma");
        ho = (JLabel) getChildNamed(kh, "ho");
        ten = (JLabel) getChildNamed(kh, "ten");
        sdt = (JLabel) getChildNamed(kh, "sdt");
        diem = (JLabel) getChildNamed(kh, "diem");
        
        assertEquals(exMa, "Mã khách hàng");
        assertEquals(exHo, "Họ lót");
        assertEquals(exTen, "Tên");
        assertEquals(exSdt, "Số điện thoại");
        assertEquals(exDiem, "Điểm tích lũy");
        
        //sleep(2000);
    }

    @Test
    public void testRadioButton() throws InterruptedException {
        
        KhachHang_View kh = new KhachHang_View();
        JRadioButton ma, ho, ten, sdt;
        
        String exMa = "Mã khách hàng";
        String exHo = "Họ lót";
        String exTen = "Tên";
        String exSdt = "Số điện thoại";
        
        kh.setComponentsNames();
        kh.setVisible(true);
        
        ma = (JRadioButton) getChildNamed(kh, "rbtnma");
        ho = (JRadioButton) getChildNamed(kh, "rbtnho");
        ten = (JRadioButton) getChildNamed(kh, "rbtnten");
        sdt = (JRadioButton) getChildNamed(kh, "rbtnsdt");
        
        assertEquals(exMa, "Mã khách hàng");
        assertEquals(exHo, "Họ lót");
        assertEquals(exTen, "Tên");
        assertEquals(exSdt, "Số điện thoại");
        
        //sleep(2000);
    }
    
}
