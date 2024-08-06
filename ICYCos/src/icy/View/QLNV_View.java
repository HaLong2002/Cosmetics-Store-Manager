 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.View;

import icy.Controller.DangKy_Controller;
import icy.Controller.QLNV_Controller;
import icy.Model.DangKyDTO;
import icy.Model.Luong_DTO;
import icy.Model.QLNV_DTO;
import static icy.View.BanHang_View.BH;
import static icy.View.DangKy_View.DK;
import static icy.View.DangNhap_View.DN;
import static icy.View.DoanhThu_View.DT;
import static icy.View.HoTro_View.HT;
import static icy.View.HuongDan_View.HD;
import static icy.View.KhachHang_View.KH;
import static icy.View.KhuyenMai_View.KM;
import static icy.View.NhapHang_View.NH;
import static icy.View.SanPham_View.SP;
import static icy.View.ThongKe_View.TK;
import icy.TrangChu_ICY;
import static icy.TrangChu_ICY.TC;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.apache.commons.collections4.comparators.ComparableComparator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.Document;

/**
 *
 * @author HP
 */
public class QLNV_View extends javax.swing.JFrame {
    public static QLNV_View NV = new QLNV_View();
    public static QuanLyTK TK = new QuanLyTK();
    static ArrayList<QLNV_DTO> dsnv = new ArrayList<>();
    static ArrayList<Luong_DTO> dsluong = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
   DefaultTableModel model2 = new DefaultTableModel();
    QLNV_Controller bus = new QLNV_Controller();
    DangKy_Controller busdk = new DangKy_Controller();
    QLNV_DTO nv = new QLNV_DTO();
    String link = "";

    public QLNV_View() {
        initComponents();
        DocDuLieu();
        showcbbChucVu();
        setNullEross();
    }
 public void showcbbChucVu(){
           for(QLNV_DTO nv: bus.dsnv)
             cbbChucVu.addItem(nv.ChucVu);
     }
 
    @SuppressWarnings("unchecked")
    public void DocDuLieu() {
        QLNV_Controller bus = new QLNV_Controller();
        if (QLNV_Controller.dsnv == null) {
            bus.docDSNV();
        }
        Vector header = new Vector();
        header.add("Mã");
        header.add("Họ");
        header.add("Tên");
        header.add("Giới tính");
        header.add("Chức vụ");
        header.add("Ngày sinh");
        header.add("Địa chỉ");
        header.add("SDT");
        header.add("Email");
        header.add("Lương");
        model = new DefaultTableModel(header, 0);
        for (QLNV_DTO nv : QLNV_Controller.dsnv) {
            Vector row = new Vector();
            row.add(nv.Ma);
            row.add(nv.Ho);
            row.add(nv.Ten);
            row.add(nv.GioiTinh);
            row.add(nv.ChucVu);
            row.add(nv.NgaySinh + "/" + nv.ThangSinh + "/" + nv.NamSinh);
            row.add(nv.DiaChi);
            row.add(nv.SDT);
            row.add(nv.Email);
            //row.add(nv.anh);
            row.add(nv.Luong);
            model.addRow(row);

        }
        table.setModel(model);
    }

   
    public ImageIcon ResizeImage(String ImagePath) {
        ImageIcon myIcon = new ImageIcon(ImagePath);
        Image img = myIcon.getImage();
        Image newimg = img.getScaledInstance(lbAnh.getWidth(), lbAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }

    public void showDSNV(ArrayList<QLNV_DTO> ds) {
        Vector header = new Vector();
        header.add("Mã ");
        header.add("Họ ");
        header.add("Tên");
        header.add("Giới tính");
        header.add("Chức vụ");
        header.add("Ngày sinh");
        header.add("Địa chỉ ");
        header.add("SDT");
        header.add("Email");
        header.add("Lương");
        DefaultTableModel m = new DefaultTableModel(header, 0);
       // if (model1.getRowCount() == 0) {
         //   model1 = new DefaultTableModel(header, 0);
        //}

        for (QLNV_DTO nv : ds) {
            Vector row = new Vector();
            row.add(nv.Ma);
            row.add(nv.Ho);
            row.add(nv.Ten);
            row.add(nv.GioiTinh);
            row.add(nv.ChucVu);
            row.add(nv.NgaySinh + "/" + nv.ThangSinh + "/" + nv.NamSinh);
            row.add(nv.DiaChi);
            row.add(nv.SDT);
            row.add(nv.Email);
          

            row.add(String.valueOf(nv.Luong));
            //row.add(nv.anh);
            m.addRow(row);

        }
        table.setModel(m);

    }
     public void showDS(ArrayList<QLNV_DTO> ds) {
        Vector header = new Vector();
        header.add("Mã ");
        header.add("Họ ");
        header.add("Tên");
        header.add("Giới tính");
        header.add("Chức vụ");
        header.add("Ngày sinh");
        header.add("Địa chỉ ");
        header.add("SDT");
        header.add("Email");
        header.add("Lương");
        //DefaultTableModel model2 = new DefaultTableModel(header, 0);
        if (model2.getRowCount() == 0) {
            model2 = new DefaultTableModel(header, 0);
        }

        for (QLNV_DTO nv : ds) {
            Vector row = new Vector();
            row.add(nv.Ma);
            row.add(nv.Ho);
            row.add(nv.Ten);
            row.add(nv.GioiTinh);
            row.add(nv.ChucVu);
            row.add(nv.NgaySinh + "/" + nv.ThangSinh + "/" + nv.NamSinh);
            row.add(nv.DiaChi);
            row.add(nv.SDT);
            row.add(nv.Email);
            // row.add(nv.Email);

            row.add(String.valueOf(nv.Luong));
            //row.add(nv.anh);
            model2.addRow(row);

        }
        table.setModel(model2);

    } 
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JToggleButton();
        btnSanPham = new javax.swing.JToggleButton();
        btnkhuyenMai = new javax.swing.JToggleButton();
        btnNhanVien = new javax.swing.JToggleButton();
        btnKhachHang = new javax.swing.JToggleButton();
        btnDonHang = new javax.swing.JToggleButton();
        btnNhapHang = new javax.swing.JToggleButton();
        btnThongKe = new javax.swing.JToggleButton();
        btnDoanhThu = new javax.swing.JToggleButton();
        btnDangXuat = new javax.swing.JToggleButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        txtTuoiO1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        rdbtnNam = new javax.swing.JRadioButton();
        rdbtnNu = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cbbThang = new javax.swing.JComboBox<>();
        cbbNgay = new javax.swing.JComboBox<>();
        cbbNam = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbbChucVu = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnInDS = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        lbTimKiem = new javax.swing.JLabel();
        btnLamMoi = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        E_email = new javax.swing.JLabel();
        E_Ma = new javax.swing.JLabel();
        E_Dc = new javax.swing.JLabel();
        E_SDT = new javax.swing.JLabel();
        E_NgSinh = new javax.swing.JLabel();
        E_Luong = new javax.swing.JLabel();
        E_Ten = new javax.swing.JLabel();
        E_Ho = new javax.swing.JLabel();
        E_GT = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbbTimCB = new javax.swing.JComboBox<>();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        btnLienHe = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        lbAnh = new javax.swing.JLabel();
        btnAnh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnTK = new javax.swing.JButton();
        E_Anh = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ CỬA HÀNG MỸ PHẨM");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/HinhAnhICY.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/SLogan_ICY.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(197, 223, 234));

        btnDangNhap.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDangNhap);
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NguoiDung.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnSanPham.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnSanPham);
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/SanPham.png"))); // NOI18N
        btnSanPham.setText("Sản phẩm");
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnkhuyenMai.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnkhuyenMai);
        btnkhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnkhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/KhuyenMai.png"))); // NOI18N
        btnkhuyenMai.setText("   Khuyến mãi");
        btnkhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhuyenMaiActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnNhanVien);
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NhanVien.png"))); // NOI18N
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnKhachHang);
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/KhachHang.png"))); // NOI18N
        btnKhachHang.setText("  Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnDonHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDonHang);
        btnDonHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDonHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/DonHang.png"))); // NOI18N
        btnDonHang.setText("Đơn hàng");
        btnDonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonHangActionPerformed(evt);
            }
        });

        btnNhapHang.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnNhapHang);
        btnNhapHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNhapHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NhapHang.png"))); // NOI18N
        btnNhapHang.setText(" Nhập hàng");
        btnNhapHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapHangActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnThongKe);
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/ThongKe.gif"))); // NOI18N
        btnThongKe.setText("Thống kê");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnDoanhThu.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDoanhThu);
        btnDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/DoanhThu.png"))); // NOI18N
        btnDoanhThu.setText(" Doanh thu");
        btnDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoanhThuActionPerformed(evt);
            }
        });

        btnDangXuat.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDangXuat);
        btnDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/HoTro.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất ");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnkhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
            .addComponent(btnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnkhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhapHang, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.setMinimumSize(new java.awt.Dimension(117, 97));

        txtTuoiO1.setBackground(new java.awt.Color(231, 231, 231));
        txtTuoiO1.setPreferredSize(new java.awt.Dimension(1030, 508));

        jPanel8.setBackground(new java.awt.Color(231, 231, 231));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtMa.setForeground(new java.awt.Color(204, 204, 204));
        txtMa.setText("Nhập mã");
        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Mã");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Họ");

        txtHo.setForeground(new java.awt.Color(204, 204, 204));
        txtHo.setText("Nhập họ");
        txtHo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoFocusLost(evt);
            }
        });
        txtHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoActionPerformed(evt);
            }
        });
        txtHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tên");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Giới tính");

        txtTen.setForeground(new java.awt.Color(204, 204, 204));
        txtTen.setText("Nhập tên");
        txtTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenFocusLost(evt);
            }
        });
        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKeyPressed(evt);
            }
        });

        buttonGroup10.add(rdbtnNam);
        rdbtnNam.setText("Nam");
        rdbtnNam.setBorder(null);
        rdbtnNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnNamActionPerformed(evt);
            }
        });
        rdbtnNam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rdbtnNamKeyPressed(evt);
            }
        });

        buttonGroup10.add(rdbtnNu);
        rdbtnNu.setText("Nữ");
        rdbtnNu.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Ngày sinh");

        cbbThang.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbbThang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));
        cbbThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThangActionPerformed(evt);
            }
        });
        cbbThang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbThangKeyPressed(evt);
            }
        });

        cbbNgay.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbbNgay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbbNgay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbNgayKeyPressed(evt);
            }
        });

        cbbNam.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        cbbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1989", "1999", "2000", "2001", "2009", " " }));
        cbbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbNamActionPerformed(evt);
            }
        });
        cbbNam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbNamKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Chức vụ");

        cbbChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChucVuActionPerformed(evt);
            }
        });
        cbbChucVu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbChucVuKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Địa chỉ");

        txtDiaChi.setForeground(new java.awt.Color(204, 204, 204));
        txtDiaChi.setText("Nhập địa chỉ");
        txtDiaChi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiaChiFocusLost(evt);
            }
        });
        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });
        txtDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDiaChiKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("SDT");

        txtSDT.setForeground(new java.awt.Color(204, 204, 204));
        txtSDT.setText("Nhập số điện thoại");
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Email");

        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("Nhập email");
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(231, 231, 231));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(231, 231, 231), new java.awt.Color(231, 231, 231), new java.awt.Color(231, 231, 231), new java.awt.Color(231, 231, 231)));

        btnSua.setBackground(new java.awt.Color(231, 231, 231));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/maintenance.png"))); // NOI18N
        btnSua.setText("SỬA");
        btnSua.setBorder(null);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        btnSua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSuaKeyPressed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(231, 231, 231));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/Xoa1.png"))); // NOI18N
        btnXoa.setText("XÓA");
        btnXoa.setBorder(null);
        btnXoa.setPreferredSize(new java.awt.Dimension(24, 16));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        btnXoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnXoaKeyPressed(evt);
            }
        });

        btnInDS.setBackground(new java.awt.Color(231, 231, 231));
        btnInDS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInDS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/printer.png"))); // NOI18N
        btnInDS.setText("XUẤT ");
        btnInDS.setBorder(null);
        btnInDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInDSActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(231, 231, 231));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/add2.png"))); // NOI18N
        btnThem.setText("THÊM");
        btnThem.setBorder(null);
        btnThem.setPreferredSize(new java.awt.Dimension(24, 16));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        btnThem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThemKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInDS, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInDS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        lbTimKiem.setBackground(new java.awt.Color(255, 255, 204));
        lbTimKiem.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lbTimKiem.setForeground(new java.awt.Color(255, 0, 0));
        lbTimKiem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnLamMoi.setBackground(new java.awt.Color(204, 204, 204));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/tailai1.png"))); // NOI18N
        btnLamMoi.setBorder(null);
        btnLamMoi.setPreferredSize(new java.awt.Dimension(24, 16));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Lương");

        txtLuong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLuongKeyPressed(evt);
            }
        });

        E_email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_email.setForeground(new java.awt.Color(255, 0, 0));
        E_email.setText("/*/////////////////////////////");

        E_Ma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Ma.setForeground(new java.awt.Color(255, 51, 0));
        E_Ma.setText("/*/////////////////////////////");

        E_Dc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Dc.setForeground(new java.awt.Color(255, 0, 0));
        E_Dc.setText("/*/////////////////////////////");

        E_SDT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_SDT.setForeground(new java.awt.Color(255, 0, 0));
        E_SDT.setText("/*/////////////////////////////");

        E_NgSinh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_NgSinh.setForeground(new java.awt.Color(255, 0, 0));
        E_NgSinh.setText("/*/////////////////////////////");

        E_Luong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Luong.setForeground(new java.awt.Color(255, 0, 0));
        E_Luong.setText("/*/////////////////////////////");

        E_Ten.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Ten.setForeground(new java.awt.Color(255, 0, 0));
        E_Ten.setText("/*/////////////////////////////");

        E_Ho.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Ho.setForeground(new java.awt.Color(255, 0, 0));
        E_Ho.setText("/*/////////////////////////////");

        E_GT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_GT.setForeground(new java.awt.Color(255, 0, 0));
        E_GT.setText("/*/////////////////////////////");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setText("Tìm kiếm");

        cbbTimCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã", " ", " ", " " }));
        cbbTimCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTimCBActionPerformed(evt);
            }
        });

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(204, 204, 204));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/tim.png"))); // NOI18N
        btnTimKiem.setBorder(null);
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(E_NgSinh)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(E_Ma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtMa)
                                            .addComponent(E_Ho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtHo)))
                                    .addComponent(jLabel2))
                                .addGap(12, 12, 12)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(E_email))
                                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                                        .addGap(0, 0, Short.MAX_VALUE)
                                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(54, 54, 54))
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(rdbtnNu)
                                                .addGap(36, 36, 36)
                                                .addComponent(rdbtnNam)
                                                .addGap(90, 90, 90)))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(E_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(E_GT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(E_Dc, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(E_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(470, 470, 470)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(E_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(cbbTimCB, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(E_Ma, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(E_email, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E_Dc))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E_Ho, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E_Ten)
                            .addComponent(E_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbThang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rdbtnNu)
                    .addComponent(rdbtnNam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E_GT)
                            .addComponent(E_NgSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(E_Luong)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbbTimCB, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel12.setText("QUẢN    LÝ    NHÂN    VIÊN");

        jPanel4.setBackground(new java.awt.Color(197, 223, 234));

        btnThoat.setBackground(new java.awt.Color(204, 204, 204));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnLienHe.setBackground(new java.awt.Color(204, 204, 204));
        btnLienHe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLienHe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/LienHe.png"))); // NOI18N
        btnLienHe.setText("Liên hệ");
        btnLienHe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLienHeActionPerformed(evt);
            }
        });

        btnHuongDan.setBackground(new java.awt.Color(204, 204, 204));
        btnHuongDan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/HuongDan.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuongDan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLienHe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThoat)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnLienHe)
                    .addComponent(btnHuongDan))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        lbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/AnhNV/BV01.PNG"))); // NOI18N

        btnAnh.setBackground(new java.awt.Color(231, 231, 231));
        btnAnh.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        btnAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/image.png"))); // NOI18N
        btnAnh.setText("CHỌN ẢNH ");
        btnAnh.setBorder(null);
        btnAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        table.setGridColor(new java.awt.Color(0, 153, 255));
        table.setSelectionBackground(new java.awt.Color(153, 204, 255));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
                TimKiem(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btnTK.setBackground(new java.awt.Color(231, 231, 231));
        btnTK.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTK.setForeground(new java.awt.Color(0, 51, 255));
        btnTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/next24ps.png"))); // NOI18N
        btnTK.setText("Quản lý tài khoản");
        btnTK.setBorder(null);
        btnTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKActionPerformed(evt);
            }
        });

        E_Anh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_Anh.setForeground(new java.awt.Color(255, 0, 0));
        E_Anh.setText("                                   ");

        javax.swing.GroupLayout txtTuoiO1Layout = new javax.swing.GroupLayout(txtTuoiO1);
        txtTuoiO1.setLayout(txtTuoiO1Layout);
        txtTuoiO1Layout.setHorizontalGroup(
            txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTuoiO1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(txtTuoiO1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTuoiO1Layout.createSequentialGroup()
                        .addGroup(txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(txtTuoiO1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(btnAnh))
                            .addComponent(E_Anh, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1))
                    .addGroup(txtTuoiO1Layout.createSequentialGroup()
                        .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(436, Short.MAX_VALUE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1023, Short.MAX_VALUE)))
        );
        txtTuoiO1Layout.setVerticalGroup(
            txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTuoiO1Layout.createSequentialGroup()
                .addGroup(txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTK, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(txtTuoiO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtTuoiO1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAnh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(E_Anh, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jTabbedPane1.addTab("Thông tin nhân viên", txtTuoiO1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
           if(getTen("Đăng nhập")){
             DangNhap_View dn = DangNhap_View.DN;
               dn.setVisible(true);
               dn.setLocationRelativeTo(null);
               this.dispose();
         }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
      if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("giamdoc");
            sp.setUser(getTenD());
            NV.dispose();
        }
       else if(!getTen("Đăng nhập") && checkQuyenQLSP()== true){
           SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("QLSP");
            sp.setUser(getTenD());
            NV.dispose();
       }
       else //btnSanPham.setEnabled(false);
       JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void tabpaneTrangChuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabpaneTrangChuAncestorAdded
        if (btnSanPham.isSelected() == true) {
            //tabpaneTrangChu
        }
    }//GEN-LAST:event_tabpaneTrangChuAncestorAdded

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
       if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  KhuyenMai_View km = KhuyenMai_View.KM;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            KhuyenMai_View km = KhuyenMai_View.KM;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnkhuyenMaiActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
       if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  KhachHang_View km = KhachHang_View.KH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  KhachHang_View km = KhachHang_View.KH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
         if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  BanHang_View km = BanHang_View.BH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  BanHang_View km = BanHang_View.BH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnDonHangActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
          if(!getTen("Đăng nhập") && checkQuyenQLNH()== true){
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            ThongKe_View km = ThongKe_View.TK;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  NV.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");       
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        if(!btnDangNhap.getText().equals("Đăng nhập")){
        int output = JOptionPane.showConfirmDialog(NV, 
                        "Bạn muốn đăng xuất ?", "Đăng xuất",
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE);
       
                if (output == JOptionPane.YES_OPTION) {
                          setUser("Đăng nhập");
                        
                } else if (output == JOptionPane.NO_OPTION) {
                   System.out.println("output no");
                } 
        }
        else {
            int output = JOptionPane.showConfirmDialog(NV, 
                        "Bạn chưa đăng nhập,bạn có muốn đến trang Đăng nhập ?", "Đăng xuất",
                        JOptionPane.YES_NO_OPTION, 
                        JOptionPane.INFORMATION_MESSAGE);
       
            if (output == JOptionPane.YES_OPTION) {
                          DangNhap_View dn= DangNhap_View.DN;
                          dn.setVisible(true);
                          dn.setLocationRelativeTo(null);
                          NV.dispose();
                        
                } else if (output == JOptionPane.NO_OPTION) {
                   System.out.println("output no");
                } 
        } 
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKActionPerformed
         if(!getTen("Đăng nhập")){
          QuanLyTK tk = QuanLyTK.DK;
          DangKy_Controller bus = new DangKy_Controller();
          bus.DocDSDK();
          tk.setVisible(true);
          tk.setUser(getTenD());
          tk.setLocationRelativeTo(null);
          NV.dispose();
         }
         else 
             JOptionPane.showMessageDialog(null,"Bạn không thể sử dụng chức năng này");
          
    }//GEN-LAST:event_btnTKActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        txtMa.setForeground(new Color(0, 0, 0));
        txtHo.setForeground(new Color(0, 0, 0));
        txtTen.setForeground(new Color(0, 0, 0));
        txtSDT.setForeground(new Color(0, 0, 0));
        txtDiaChi.setForeground(new Color(0, 0, 0));
        txtEmail.setForeground(new Color(0, 0, 0)); 
        int i = table.getSelectedRow();
        
        if (i >= 0) {
             nv = bus.dsnv.get(i);
            if(bus.kq.size()!=0)
            {
            nv=bus.kq.get(i);
            }
           if( checkQuyenQLGD()==true && nv.ChucVu.equals("Giám đốc")){
            txtMa.setText(nv.Ma);
            txtHo.setText(nv.Ho);
            txtTen.setText(nv.Ten);
            if (nv.GioiTinh.equals("Nữ")) {
                rdbtnNu.setSelected(true);
            } else {
                rdbtnNam.setSelected(true);
            }
            cbbChucVu.setSelectedItem(nv.ChucVu);
            cbbNgay.setSelectedItem(nv.NgaySinh);
            cbbThang.setSelectedItem(nv.ThangSinh);
            cbbNam.setSelectedItem(nv.NamSinh);
            txtDiaChi.setText(nv.DiaChi);
            txtSDT.setText(nv.SDT);
            txtEmail.setText(nv.Email);
            txtLuong.setText(nv.Luong);
            link = nv.anh;
            lbAnh.setIcon(ResizeImage(String.valueOf(link)));
             //cbbChucVu.setEditable(false);
        }
           else if ( checkQuyenQLGD()==false && nv.ChucVu.equals("Giám đốc")){
               txtMa.setText(nv.Ma);
            txtHo.setText(nv.Ho);
            txtTen.setText(nv.Ten);
            if (nv.GioiTinh.equals("Nữ")) {
                rdbtnNu.setSelected(true);
            } else {
                rdbtnNam.setSelected(true);
            }
            cbbChucVu.setSelectedItem(nv.ChucVu);
            cbbNgay.setSelectedItem(nv.NgaySinh);
            cbbThang.setSelectedItem(nv.ThangSinh);
            cbbNam.setSelectedItem(nv.NamSinh);
            txtDiaChi.setText(nv.DiaChi);
            txtSDT.setText(nv.SDT);
            txtEmail.setText(nv.Email);
            txtLuong.setText(nv.Luong);
            link = nv.anh;
            lbAnh.setIcon(ResizeImage(String.valueOf(link)));
            btnSua.setEnabled(false);
            btnXoa.setEnabled(false);
           }
           else if  (!nv.ChucVu.equals("Giám đốc")){
               txtMa.setText(nv.Ma);
            txtHo.setText(nv.Ho);
            txtTen.setText(nv.Ten);
            if (nv.GioiTinh.equals("Nữ")) {
                rdbtnNu.setSelected(true);
            } else {
                rdbtnNam.setSelected(true);
            }
            cbbChucVu.setSelectedItem(nv.ChucVu);
            cbbNgay.setSelectedItem(nv.NgaySinh);
            cbbThang.setSelectedItem(nv.ThangSinh);
            cbbNam.setSelectedItem(nv.NamSinh);
            txtDiaChi.setText(nv.DiaChi);
            txtSDT.setText(nv.SDT);
            txtEmail.setText(nv.Email);
            txtLuong.setText(nv.Luong);
            link = nv.anh;
            lbAnh.setIcon(ResizeImage(String.valueOf(link)));
            btnSua.setEnabled(true);
            btnXoa.setEnabled(true);
               
           }
        }      
    }//GEN-LAST:event_tableMouseClicked

    private void btnAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser f = new JFileChooser("E:\\XayDungPhanMemTheoMoHinhPhanLop\\HinhAnh_ICY\\AnhNV");
            f.setDialogTitle("Open");
            f.showOpenDialog(null);
            File ftenanh = f.getSelectedFile();
            link = ftenanh.getAbsolutePath().replace("\\", "\\\\");
                //if(link !=null)
                lbAnh.setIcon(ResizeImage(String.valueOf(link)));
           
                System.out.println("link");

                System.out.println("Chua nhap anh");

            } catch (Exception e) {
                System.out.println("Chua chon anh");
                System.out.println(link);
            }
    }//GEN-LAST:event_btnAnhActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        if(btnHuongDan.isSelected()==true){
            HD.setVisible(true);
            HD.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this,"Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        NV.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
       //table.setModel(model);
       for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (bus.kq != null) {
            bus.kq.clear();
       showDSNV(bus.dsnv);
       lbTimKiem.setText("");
       setNullEross();
       setNullText();
        }
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
      
    
     if(txtTimKiem.getText().equals(""))
     lbTimKiem.setText("Bạn chưa nhập dữ liệu tìm kiếm !!!");
     else {
         lbTimKiem.setText("");
         bus.kq = bus.timTheoMa(txtTimKiem.getText());
         if (bus.kq.size() != 0){
             showDSNV(bus.kq);
             lbTimKiem.setText("Tìm thây " + bus.kq.size() + " Nhân Viên");
         }
         else 
         {
            lbTimKiem.setText("Mã nhân viên không tồn tại !!!");
            table.setModel(model);
            //lbTimKiem.setText(" ");
         }
     }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (i >= 0) {
            QLNV_DTO nv = new QLNV_DTO();
            nv = bus.kq.get(i);
            txtMa.setText(nv.Ma);
            txtHo.setText(nv.Ho);
            txtTen.setText(nv.Ten);
            if (nv.GioiTinh.equals("Nữ")) {
                rdbtnNu.setSelected(true);

            } else {
                rdbtnNam.setSelected(true);
            }
            cbbChucVu.setSelectedItem(nv.ChucVu);
            cbbNgay.setSelectedItem(nv.NgaySinh);
            cbbThang.setSelectedItem(nv.ThangSinh);
            cbbNam.setSelectedItem(nv.NamSinh);
            txtDiaChi.setText(nv.DiaChi);
            txtSDT.setText(nv.SDT);
            txtEmail.setText(nv.Email);
            link = nv.anh;
            lbAnh.setIcon(ResizeImage(String.valueOf(link)));
        }
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void cbbTimCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTimCBActionPerformed
        // TODO add your handling code here:
        
       
    }//GEN-LAST:event_cbbTimCBActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        Pattern ma =Pattern.compile("^[A-Z0-9]{3,10}$");
     //   Pattern dk =Pattern.compile("^[a-zA-Z0-9]{3,20}$");
        Pattern ho =Pattern.compile("^[a-zA-Z0-9 \\\\t]{3,20}$");
        Pattern ten =Pattern.compile("^[a-zA-Z0-9 \\\\t]{1,20}$");
        Pattern dc =Pattern.compile("^[a-zA-Z0-9 \\\\t]{3,20}$");
        Pattern sdt =Pattern.compile("^[0-9]{10}$");
        Pattern luong =Pattern.compile("^[0-9]{7,10}$");
        Pattern email =Pattern.compile("^(.+)@(\\S+)$");
        String x = cbbNam.getSelectedItem().toString();
        int y = Integer.parseInt(x);
        if(bus.KtrID(txtMa.getText())==false){
            E_Ma.setText("Mã nhân viên đã có sẵn");
        }
        else if (!ma.matcher(txtMa.getText()).find()){
             E_Ma.setText("*Phải in hoa và từ 3 đến 10 ký tự");
        }
        else E_Ma.setText("                                      ");
        if(link==""){
             E_Anh.setText("*Chưa chọn ảnh");
        }
        else E_Anh.setText("                         ");
        if(!ho.matcher(txtHo.getText()).find() ){
             E_Ho.setText("*Phải từ 3 đến 10 ký tự");
        }else 
           E_Ho.setText("                              ");
        if(!ten.matcher(txtTen.getText()).find()){
             E_Ten.setText("*Tên phải nhiều hơn 1 ký tự");
        }else 
            E_Ten.setText("                               ");
         if(!email.matcher(txtEmail.getText()).find()){
             E_email.setText("*Email không đúng định dạng");
        }else 
            E_email.setText("                             ");
         if(!dc.matcher(txtDiaChi.getText()).find()){
             E_Dc.setText("*Phải từ 3 đến 50 ký tự");
        }else 
             E_Dc.setText("                         ");
         if(!sdt.matcher(txtSDT.getText()).find()){
             E_SDT.setText("*Phải đủ 10 số ");
        }else 
             E_SDT.setText("                    ");
         if(!luong.matcher(txtLuong.getText()).find()){
             E_Luong.setText("*Phải từ 7 đến 10 chữ số ");
        }else 
            E_Luong.setText("                           ");

        if(y>2005 || y<1963 )
        {
             E_NgSinh.setText("*Phải từ 18 đến 60 tuổi ");
        }
        else  E_NgSinh.setText("                                  ");
        if(rdbtnNu.isSelected()==false&&rdbtnNam.isSelected()==false)
        {
             E_GT.setText("*Chưa chọn giới tính");
        }else  E_GT.setText("                    ");
        if(bus.KtrID(txtMa.getText()) == true&&ma.matcher(txtMa.getText()).find()==true && ho.matcher(txtHo.getText()).find()==true &&ten.matcher(txtTen.getText()).find()==true
                &&email.matcher(txtEmail.getText()).find()==true && dc.matcher(txtDiaChi.getText()).find()==true &&sdt.matcher(txtSDT.getText()).find()==true
                &&luong.matcher(txtLuong.getText()).find()==true){
            QLNV_DTO nv = new QLNV_DTO();
            nv.Ma = txtMa.getText();
            nv.Ho = txtHo.getText();
            nv.Ten = txtTen.getText();
            if (rdbtnNam.isSelected()) {
                nv.setGioiTinh("Nam");
            } else// if(rdbtnNam.isSelected())
            {
                nv.setGioiTinh("Nữ");
            }
            nv.ChucVu = cbbChucVu.getSelectedItem().toString();
            nv.NgaySinh = cbbNgay.getSelectedItem().toString();
            nv.ThangSinh = cbbThang.getSelectedItem().toString();
            nv.NamSinh = cbbNam.getSelectedItem().toString();
            nv.DiaChi = txtDiaChi.getText();
            nv.SDT = txtSDT.getText();
            nv.Email = txtEmail.getText();
            nv.anh = link;
            nv.Luong = txtLuong.getText();
            bus.themNV(nv);
            dsnv.add(nv);
            Vector header = new Vector();
            header.add("Mã nhân vien");//tua de cot cua jtable
            header.add("Họ ");
            header.add("Tên");
            header.add("Giới tính");//tua de cot cua jtable
            header.add("Chức vụ");
            header.add("Ngày sinh");
       
            header.add("Địa chỉ ");
            header.add("SDT");
            header.add("Email");
            header.add("Lương");
            
            if (model.getRowCount() == 0) {
                model = new DefaultTableModel(header, 0);
            }
            Vector row = new Vector();
            row.add(nv.Ma);
            row.add(nv.Ho);
            row.add(nv.Ten);
            row.add(nv.GioiTinh);
            row.add(nv.ChucVu);
            row.add(nv.NgaySinh + "/" + nv.ThangSinh + "/" + nv.NamSinh);
            row.add(nv.DiaChi);
            row.add(nv.SDT);
            row.add(nv.Email);
            row.add(String.valueOf(nv.Luong));
            model.addRow(row);
            table.setModel(model);
            JOptionPane.showConfirmDialog(this, "Thêm thành công");
        }
     
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnInDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInDSActionPerformed
        // TODO add your handling code here:
        try {
            String s=JOptionPane.showInputDialog(this,"Mời nhập tên file cần xuất");
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.createSheet(s);
            XSSFRow row = null;
            Cell cell = null;
            row = sheet.createRow(3);

            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("Ma");

            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("Ho");

            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("Ten");

            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("GioiTinh");

            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("Chucvu");

            cell = row.createCell(5, CellType.STRING);
            cell.setCellValue("Ngaysinh");

            cell = row.createCell(6, CellType.STRING);
            cell.setCellValue("Diachi");

            cell = row.createCell(7, CellType.STRING);
            cell.setCellValue("SDT");

            cell = row.createCell(8, CellType.STRING);
            cell.setCellValue("Email");

            cell = row.createCell(9, CellType.STRING);
            cell.setCellValue("Luong");

            for (int i = 0; i < bus.dsnv.size(); i++) {
                row = sheet.createRow(4 + i);

                cell = row.createCell(0, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getMa());

                cell = row.createCell(1, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getHo());

                cell = row.createCell(2, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getTen());

                cell = row.createCell(3, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getGioiTinh());

                cell = row.createCell(4, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getChucVu());

                cell = row.createCell(5, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getNgaySinh() + "/" + bus.dsnv.get(i).getThangSinh() + "/" + bus.dsnv.get(i).getNamSinh());

                cell = row.createCell(6, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getDiaChi());

                cell = row.createCell(7, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getSDT());

                cell = row.createCell(8, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getEmail());

                cell = row.createCell(9, CellType.STRING);
                cell.setCellValue(bus.dsnv.get(i).getLuong());

            }
            File f = new File("C:\\IDE java\\NetBeans-13\\JaVa\\ICYCos\\src\\icy\\FileExcel\\"+s+".xlsx");
                try {
                    FileOutputStream fi = new FileOutputStream(f);
                    wb.write(fi);

                    JOptionPane.showConfirmDialog(null, "Thanh cong");
                    fi.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
    }//GEN-LAST:event_btnInDSActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

//        lbThongbao.setVisible(false);
        String ma = txtMa.getText();
        int i = table.getSelectedRow();
        if (i >= 0) {
            bus.xoa(ma);
            QLNV_Controller.dsnv.remove(i);
            model.removeRow(i);
            table.setModel(model);
            lbAnh.setIcon(ResizeImage("E:\\XayDungPhanMemTheoMoHinhPhanLop\\ICYCos\\ICYCos\\src\\icy\\HinhAnh_ICY\\AnhNV\\login3.PNG"));
            JOptionPane.showConfirmDialog(null, "Xoá thành cong");
        }
        
        txtDiaChi.setText("");
        txtHo.setText("");
        txtSDT.setText("");
        txtMa.setText("");
        txtTen.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int i = table.getSelectedRow();
        if (i >= 0) {
            QLNV_DTO nv = new QLNV_DTO();
            nv.Ma = txtMa.getText();
            nv.Ho = txtHo.getText();
            nv.Ten = txtTen.getText();
            if (rdbtnNam.isSelected()) {
                nv.setGioiTinh("Nam");
            } else if (rdbtnNu.isSelected()) {
                nv.setGioiTinh("Nữ");
            }
            nv.ChucVu = cbbChucVu.getSelectedItem().toString();
            nv.NgaySinh = cbbNgay.getSelectedItem().toString();
            nv.ThangSinh = cbbThang.getSelectedItem().toString();
            nv.NamSinh = cbbNam.getSelectedItem().toString();
            nv.DiaChi = txtDiaChi.getText();
            nv.SDT = txtSDT.getText();
            nv.Email = txtEmail.getText();
            nv.anh = link;
            nv.Luong = txtLuong.getText();
            bus.sua(nv);
            JOptionPane.showConfirmDialog(null, "Sửa thành công");
            QLNV_DTO old = bus.dsnv.set(i, nv);
            model.setValueAt(nv.Ma, i, 0);
            model.setValueAt(nv.Ho, i, 1);
            model.setValueAt(nv.Ten, i, 2);
            model.setValueAt(nv.GioiTinh, i, 3);
            model.setValueAt(nv.ChucVu, i, 4);
            model.setValueAt(nv.NgaySinh + "/" + nv.ThangSinh + "/" + nv.NamSinh, i, 5);
            model.setValueAt(nv.DiaChi, i, 6);
            model.setValueAt(nv.SDT, i, 7);
            model.setValueAt(nv.Email, i, 8);
            model.setValueAt(nv.Luong, i, 9);
            lbAnh.setIcon(ResizeImage(String.valueOf(link)));
            table.setModel(model);
        }
        //  }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
           if (evt.getKeyCode() == evt.VK_ENTER) {
            txtDiaChi.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if (txtEmail.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập email")) {
            txtEmail.setText("Nhập email");
            txtEmail.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:
        if (txtEmail.getText().trim().toLowerCase().equals("nhập email")) {
            txtEmail.setText("");
        }
        txtEmail.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbbNgay.requestFocus();
        }
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        // TODO add your handling code here:
        if (txtSDT.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("Nhập số điện thoại");
            txtSDT.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        // TODO add your handling code here:
        if (txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("");
        }
        txtSDT.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtDiaChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaChiKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtHo.requestFocus();
        }
    }//GEN-LAST:event_txtDiaChiKeyPressed

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void txtDiaChiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusLost
        // TODO add your handling code here:
        if (txtDiaChi.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập địa chỉ")) {
            txtDiaChi.setText("Nhập địa chỉ");
            txtDiaChi.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDiaChiFocusLost

    private void txtDiaChiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiaChiFocusGained
        // TODO add your handling code here:
        if (txtDiaChi.getText().trim().toLowerCase().equals("nhập địa chỉ")) {
            txtDiaChi.setText("");
        }
        txtDiaChi.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtDiaChiFocusGained

    private void cbbChucVuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbChucVuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtLuong.requestFocus();
        }
    }//GEN-LAST:event_cbbChucVuKeyPressed

    private void cbbNamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbNamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            rdbtnNu.requestFocus();
        }
    }//GEN-LAST:event_cbbNamKeyPressed

    private void cbbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbNamActionPerformed

    private void cbbNgayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbNgayKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbbThang.requestFocus();
        }
    }//GEN-LAST:event_cbbNgayKeyPressed

    private void cbbThangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbThangKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbbNam.requestFocus();
        }
    }//GEN-LAST:event_cbbThangKeyPressed

    private void rdbtnNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnNamActionPerformed

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtSDT.requestFocus();
        }
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        // TODO add your handling code here:
        if (txtTen.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("Nhập tên");
            txtTen.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        // TODO add your handling code here:
        if (txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("");
        }
        txtTen.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtTenFocusGained

    private void txtHoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtTen.requestFocus();
        }
    }//GEN-LAST:event_txtHoKeyPressed

    private void txtHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusLost
        // TODO add your handling code here:
        if (txtHo.getText().trim().equals("") || txtHo.getText().trim().toLowerCase().equals("nhập họ")) {
            txtHo.setText("Nhập họ");
            txtHo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtHoFocusLost

    private void txtHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusGained
        // TODO add your handling code here:
        if (txtHo.getText().trim().toLowerCase().equals("nhập họ")) {
            txtHo.setText("");
        }
        txtHo.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtHoFocusGained

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtMaKeyPressed

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        // TODO add your handling code here:
        if (txtMa.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("Nhập mã");
            txtMa.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMaFocusLost

    private void txtMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusGained
        // TODO add your handling code here:
        if (txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("");
        }
        txtMa.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_txtMaFocusGained

    private void cbbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChucVuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbChucVuActionPerformed

    private void cbbThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbThangActionPerformed

    private void rdbtnNamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rdbtnNamKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            cbbChucVu.requestFocus();
        }
    }//GEN-LAST:event_rdbtnNamKeyPressed

    private void btnThemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThemKeyPressed
        // TODO add your handling code here:
        
         if (evt.getKeyCode() == evt.VK_ENTER) {
            btnSua.requestFocus();
        }
    }//GEN-LAST:event_btnThemKeyPressed

    private void txtLuongKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLuongKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER) {
            btnThem.requestFocus();
        }
    }//GEN-LAST:event_txtLuongKeyPressed

    private void btnSuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSuaKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER) {
            btnXoa.requestFocus();
        }
    }//GEN-LAST:event_btnSuaKeyPressed

    private void btnXoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnXoaKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode() == evt.VK_ENTER) {
            btnInDS.requestFocus();
        }
    }//GEN-LAST:event_btnXoaKeyPressed

    private void TimKiem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimKiem
       
    }//GEN-LAST:event_TimKiem

    private void txtHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoActionPerformed
  //////////////////////                     CHECK PHAN QUYEN                                  /////////////////////////
    public boolean checkQuyenQLGD() {
         for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Giám đốc")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkQuyenQLDH() {
         for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý đơn hàng")) {
                return true;
            }
        }
        return false;

    }

    public boolean checkQuyenQLNV() {
         for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý nhân viên")) {
               
                return true;
            }
        }
        return false;

    }

    public boolean checkQuyenQLSP() {
         for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý sản phẩm")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkQuyenQLKM() {
        for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý khuyến mãi")) {
                return true;
            }
        }
        return false;
    }
     public boolean checkQuyenQLNH() {
        for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý nhập hàng")) {
                return true;
            }
        }
        return false;
    }
      public boolean checkQuyenQLKH() {
        for (DangKyDTO dk : DangKy_Controller.dsdk) {
            if (getTen(dk.TaiKhoan) && dk.ChuVuDK.equals("Quản lý khách hàng")) {
                return true;
            }
        }
        return false;
    }
    public void setUser(String message) {
        btnDangNhap.setText(message);
    }
    public boolean getTen(String s) {
        if (btnDangNhap.getText().equals(s)) {
            return true;
        } else {
            return false;
        }
    }
    public String getTenD() {
        return btnDangNhap.getText();
    }
    
  //////////////////////                     CHECK PHAN QUYEN                                  /////////////////////////
    public void setNullText(){
        txtDiaChi.setText("");
        txtEmail.setText("");
        txtHo.setText("");
        txtLuong.setText("");
        txtMa.setText("");
        txtTen.setText("");
        txtSDT.setText("");
        lbAnh.setIcon(ResizeImage("C:\\Users\\Quan Phat Vinh Thanh\\Documents\\NetBeansProjects\\sql\\src\\icy\\HinhAnh_ICY\\u1.PNG"));

    }
    public void setNullEross(){
       E_Ho.setText("");
       E_email.setText("");
       E_Dc.setText("");
       E_Luong.setText("");
       E_NgSinh.setText("");
       E_Ten.setText("");
       E_SDT.setText("");
       E_GT.setText("");
       E_Anh.setText("");
       E_Ma.setText("");
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu_ICY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu_ICY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu_ICY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu_ICY.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NV.setVisible(true);
                NV.setLocationRelativeTo(null);
                //NV.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E_Anh;
    private javax.swing.JLabel E_Dc;
    private javax.swing.JLabel E_GT;
    private javax.swing.JLabel E_Ho;
    private javax.swing.JLabel E_Luong;
    private javax.swing.JLabel E_Ma;
    private javax.swing.JLabel E_NgSinh;
    private javax.swing.JLabel E_SDT;
    private javax.swing.JLabel E_Ten;
    private javax.swing.JLabel E_email;
    private javax.swing.JButton btnAnh;
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnInDS;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JComboBox<String> cbbNgay;
    private javax.swing.JComboBox<String> cbbThang;
    private javax.swing.JComboBox<String> cbbTimCB;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAnh;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JRadioButton rdbtnNam;
    private javax.swing.JRadioButton rdbtnNu;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JPanel txtTuoiO1;
    // End of variables declaration//GEN-END:variables
}
