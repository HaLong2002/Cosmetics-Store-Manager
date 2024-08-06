package icy.View;

import icy.Controller.QLNV_Controller;
import icy.Model.QLNV_DTO;
import icy.*;
import icy.Controller.CTKhuyenMai_Controller;
import icy.Controller.DangKy_Controller;
import icy.Controller.KhuyenMai_Controller;
import icy.Model.CTKhuyenMai_DTO;
import icy.Model.DangKyDTO;
import icy.Model.KhuyenMai_DTO;
import static icy.View.BanHang_View.BH;
import static icy.View.DangNhap_View.DN;
import static icy.View.DoanhThu_View.DT;
import static icy.View.HoTro_View.HT;
import static icy.View.HuongDan_View.HD;
import static icy.View.KhachHang_View.KH;
import static icy.View.NhapHang_View.NH;
import static icy.View.QLNV_View.NV;
import static icy.View.SanPham_View.SP;
import static icy.View.ThongKe_View.TK;
import java.awt.Color;
import java.time.LocalDate;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KhuyenMai_View extends javax.swing.JFrame {

    public static KhuyenMai_View KM = new KhuyenMai_View();

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model1 = new DefaultTableModel();

    public KhuyenMai_View() {
        initComponents();
        createComboD();
        createComboM();
        createComboY();
        DocDSKM();
        DocDSCTKM();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        buttonGroup2 = new javax.swing.ButtonGroup();
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
        jPanel4 = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        btnLienHe = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        tbChitiet = new javax.swing.JTabbedPane();
        panelThongtin = new javax.swing.JPanel();
        panelCTKM = new javax.swing.JPanel();
        lbMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbNgaybd = new javax.swing.JLabel();
        cbboxNgaybd = new javax.swing.JComboBox<>();
        cbboxThangbd = new javax.swing.JComboBox<>();
        cbboxNambd = new javax.swing.JComboBox<>();
        lbNgaykt = new javax.swing.JLabel();
        cbboxNgaykt = new javax.swing.JComboBox<>();
        cbboxThangkt = new javax.swing.JComboBox<>();
        cbboxNamkt = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lbTinhtrang = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbbTinhtrang = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTKM = new javax.swing.JTable();
        btnHienthi = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lbKhoatk = new javax.swing.JLabel();
        txtNhaptk = new javax.swing.JTextField();
        lbNgay = new javax.swing.JLabel();
        cbboxDfirst = new javax.swing.JComboBox<>();
        cbboxMfirst = new javax.swing.JComboBox<>();
        cbboxYfirst = new javax.swing.JComboBox<>();
        btnTimKM = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbbTimKM = new javax.swing.JComboBox<>();
        panelCTCTKM = new javax.swing.JPanel();
        txtMaSP = new javax.swing.JTextField();
        lbMaSP = new javax.swing.JLabel();
        btnThemCT = new javax.swing.JButton();
        btnSuaCT = new javax.swing.JButton();
        btnXoaCT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtGiamgia = new javax.swing.JTextField();
        lbMaCTKM = new javax.swing.JLabel();
        txtMaCTKM = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbMaKM = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCTCTKM = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbKhoa = new javax.swing.JLabel();
        cbboxKhoa = new javax.swing.JComboBox<>();
        txtNhapkhoa = new javax.swing.JTextField();
        btnTimkiemKhoa = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnHienthiCT = new javax.swing.JButton();

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(197, 223, 234));
        jPanel2.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel2.setPreferredSize(new java.awt.Dimension(299, 410));

        btnDangNhap.setBackground(new java.awt.Color(255, 204, 204));
        buttonGroup1.add(btnDangNhap);
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/NguoiDung.png"))); // NOI18N
        btnDangNhap.setText(" Đăng nhập");
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
        btnDangXuat.setText("Đăng xuất");
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
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbChitiet.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        panelThongtin.setPreferredSize(new java.awt.Dimension(953, 600));

        panelCTKM.setBackground(new java.awt.Color(255, 255, 204));
        panelCTKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbMa.setText("Mã chương trình:");

        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        lbTen.setText("Tên chương trình:");

        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKeyPressed(evt);
            }
        });

        lbNgaybd.setText("Ngày bắt đầu:");

        cbboxNgaybd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNgaybd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNgaybdKeyPressed(evt);
            }
        });

        cbboxThangbd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxThangbd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxThangbdKeyPressed(evt);
            }
        });

        cbboxNambd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNambd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNambdKeyPressed(evt);
            }
        });

        lbNgaykt.setText("Ngày kết thúc:");

        cbboxNgaykt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxNgaykt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxNgayktKeyPressed(evt);
            }
        });

        cbboxThangkt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxThangkt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxThangktKeyPressed(evt);
            }
        });

        cbboxNamkt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Them.png"))); // NOI18N
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Sua.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Xoa.png"))); // NOI18N
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        lbTinhtrang.setText("Tình trạng:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("CHƯƠNG TRÌNH KHUYẾN MÃI");

        cbbTinhtrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Chưa bắt đầu", "Đang diễn ra", "Kết thúc" }));

        javax.swing.GroupLayout panelCTKMLayout = new javax.swing.GroupLayout(panelCTKM);
        panelCTKM.setLayout(panelCTKMLayout);
        panelCTKMLayout.setHorizontalGroup(
            panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgaykt)
                    .addComponent(lbTinhtrang))
                .addGap(35, 35, 35)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addComponent(cbboxNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbboxThangkt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbboxNamkt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbTinhtrang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelCTKMLayout.createSequentialGroup()
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCTKMLayout.createSequentialGroup()
                                .addContainerGap(9, Short.MAX_VALUE)
                                .addComponent(lbMa)
                                .addGap(20, 20, 20))
                            .addGroup(panelCTKMLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTen)
                                    .addComponent(lbNgaybd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCTKMLayout.createSequentialGroup()
                                .addComponent(cbboxNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxThangbd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxNambd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTen))
                        .addGap(18, 18, 18)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCTKMLayout.setVerticalGroup(
            panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTKMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMa)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTen)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgaybd)
                            .addComponent(cbboxNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxThangbd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxNambd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgaykt)
                            .addComponent(cbboxNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxThangkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxNamkt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTinhtrang)
                            .addComponent(cbbTinhtrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCTKMLayout.createSequentialGroup()
                        .addComponent(btnSua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        tableCTKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTKMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTKM);

        btnHienthi.setBackground(new java.awt.Color(255, 255, 204));
        btnHienthi.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHienthi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/reload.png"))); // NOI18N
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbKhoatk.setText("Chọn khóa tìm kiếm:");

        txtNhaptk.setForeground(new java.awt.Color(102, 102, 102));
        txtNhaptk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhaptkKeyPressed(evt);
            }
        });

        lbNgay.setText("Ngày:");

        cbboxDfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbboxMfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbboxYfirst.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbboxYfirst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbboxYfirstKeyPressed(evt);
            }
        });

        btnTimKM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Timkiem.png"))); // NOI18N
        btnTimKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKMActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Tìm kiếm tất cả chương trình khuyến mãi theo:");

        cbbTimKM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Mã chương trình", "Tên chương trình", "Ngày khuyến mãi", "Tình trạng" }));
        cbbTimKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTimKMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbKhoatk)
                        .addGap(18, 18, 18)
                        .addComponent(cbbTimKM, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(lbNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbboxDfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(cbboxMfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbboxYfirst, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(txtNhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)
                        .addComponent(btnTimKM, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTimKM)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbKhoatk)
                            .addComponent(cbbTimKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addComponent(txtNhaptk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNgay)
                            .addComponent(cbboxDfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxMfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbboxYfirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelCTCTKM.setBackground(new java.awt.Color(204, 255, 204));
        panelCTCTKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtMaSP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaSPKeyPressed(evt);
            }
        });

        lbMaSP.setText("Mã sản phẩm");

        btnThemCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnThemCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Them.png"))); // NOI18N
        btnThemCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCTActionPerformed(evt);
            }
        });

        btnSuaCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSuaCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Sua.png"))); // NOI18N
        btnSuaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCTActionPerformed(evt);
            }
        });

        btnXoaCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnXoaCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Xoa.png"))); // NOI18N
        btnXoaCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCTActionPerformed(evt);
            }
        });

        jLabel2.setText("% giảm giá");

        lbMaCTKM.setText("Mã chi tiết:");

        txtMaCTKM.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("CHI TIẾT CHƯƠNG TRÌNH KHUYẾN MÃI");

        lbMaKM.setText("Mã chương trình:");

        javax.swing.GroupLayout panelCTCTKMLayout = new javax.swing.GroupLayout(panelCTCTKM);
        panelCTCTKM.setLayout(panelCTCTKMLayout);
        panelCTCTKMLayout.setHorizontalGroup(
            panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaSP)
                            .addComponent(lbMaCTKM)
                            .addComponent(jLabel2))
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtGiamgia, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(txtMaCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbMaKM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThemCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoaCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSuaCT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel9)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        panelCTCTKMLayout.setVerticalGroup(
            panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCTCTKMLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaCTKM)
                    .addComponent(txtMaCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemCT)
                    .addComponent(lbMaKM)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addComponent(btnSuaCT, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoaCT))
                    .addGroup(panelCTCTKMLayout.createSequentialGroup()
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaSP)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelCTCTKMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtGiamgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        tableCTCTKM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableCTCTKM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTCTKMMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableCTCTKM);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("CHƯƠNG TRÌNH KHUYẾN MÃI");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("CHI TIẾT CHƯƠNG TRÌNH KHUYẾN MÃI");

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbKhoa.setText("Chọn khóa tìm kiếm");

        cbboxKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<none>", "Mã khuyến mãi", "Mã chi tiết", "Mã sản phẩm" }));

        txtNhapkhoa.setForeground(new java.awt.Color(102, 102, 102));
        txtNhapkhoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNhapkhoaKeyPressed(evt);
            }
        });

        btnTimkiemKhoa.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnTimkiemKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Timkiem.png"))); // NOI18N
        btnTimkiemKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemKhoaActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Tìm kiếm tất cả chi tiết chương trình khuyến mãi theo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNhapkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lbKhoa)
                                .addGap(18, 18, 18)
                                .addComponent(cbboxKhoa, 0, 149, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTimkiemKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbKhoa)
                    .addComponent(cbboxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNhapkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiemKhoa))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        btnHienthiCT.setBackground(new java.awt.Color(204, 255, 204));
        btnHienthiCT.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnHienthiCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/reload.png"))); // NOI18N
        btnHienthiCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthiCTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelThongtinLayout = new javax.swing.GroupLayout(panelThongtin);
        panelThongtin.setLayout(panelThongtinLayout);
        panelThongtinLayout.setHorizontalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelThongtinLayout.createSequentialGroup()
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelCTCTKM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelCTKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelThongtinLayout.createSequentialGroup()
                                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelThongtinLayout.createSequentialGroup()
                                        .addComponent(btnHienthiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(187, 187, 187)
                                        .addComponent(jLabel8))
                                    .addGroup(panelThongtinLayout.createSequentialGroup()
                                        .addComponent(btnHienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(162, 162, 162)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        panelThongtinLayout.setVerticalGroup(
            panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThongtinLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHienthi)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnHienthiCT)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCTCTKM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelThongtinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tbChitiet.addTab("Thông tin", panelThongtin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbChitiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean Ktra_DeTrong_MaKM(String s) {
        if (s.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Mã khuyến mãi không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_KhongTonTai_MaKM(String s) {
        int d = 0;
        for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
            if (!s.equalsIgnoreCase(km.makm)) {
                d++;
            }
        }
        if (d == KhuyenMai_Controller.dskm.size()) {
            JOptionPane.showMessageDialog(null, "Mã chương trình khuyến mãi không tồn tại!");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_DeTrong_MaSP(String s) {
        if (s.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Mã sản phẩm không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_DeTrong_giamgia(String s) {
        if (s.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "% giảm giá không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_DeTrong_TenKM(String s) {
        if (s.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Tên khuyến mãi không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_NgayBD_Truoc_NgayKT() {
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        int nbd = Integer.parseInt((String) cbboxNgaybd.getSelectedItem());
        int tbd = Integer.parseInt((String) cbboxThangbd.getSelectedItem());
        int nambd = Integer.parseInt((String) cbboxNambd.getSelectedItem());

        int nkt = Integer.parseInt((String) cbboxNgaykt.getSelectedItem());
        int tkt = Integer.parseInt((String) cbboxThangkt.getSelectedItem());
        int namkt = Integer.parseInt((String) cbboxNamkt.getSelectedItem());

        if (namkt < nambd || (namkt == nambd && tkt < tbd) || (namkt == nambd && tkt == tbd && nkt < nbd)) {
            JOptionPane.showMessageDialog(null, "Ngày bắt đầu phải trước ngày kết thúc!");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_DeTrong_TinhTrang() {
        if (cbbTinhtrang.getSelectedItem().equals("<none>")) {
            JOptionPane.showMessageDialog(null, "Tình trạng khuyến mãi không được để trống");
            return false;
        } else {
            return true;
        }
    }

    private boolean KtraSo(String s) {
        boolean k = s.matches("-?\\d+(\\.\\d+)?");
        if (k) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "% giảm giá phải là số!");
            return false;
        }
    }

    
    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("giamdoc");
            sp.setUser(getTenD());
            KM.dispose();
        }
       else if(!getTen("Đăng nhập") && checkQuyenQLSP()== true){
           SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("QLSP");
            sp.setUser(getTenD());
            KM.dispose();
       }
       else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
       if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  KhachHang_View km = KhachHang_View.KH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  KhachHang_View km = KhachHang_View.KH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
          if(!getTen("Đăng nhập") && checkQuyenQLNH()== true){
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
         if(getTen("Đăng nhập")){
             DangNhap_View.DN.setVisible(true);
             DangNhap_View.DN.setLocationRelativeTo(null);
             KM.dispose();
             
         }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            ThongKe_View km = ThongKe_View.TK;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoanhThuActionPerformed
        if (!btnDangNhap.getText().equals(" Đăng nhập") && checkQuyenQLGD() == true) {
            if (btnDoanhThu.isSelected() == true) {
                DT.setVisible(true);
                DT.setLocationRelativeTo(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Bạn không được sử dụng chức năng này!");
        }
    }//GEN-LAST:event_btnDoanhThuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
         if(!btnDangNhap.getText().equals("Đăng nhập")){
        int output = JOptionPane.showConfirmDialog(KM, 
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
            int output = JOptionPane.showConfirmDialog(KM, 
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

    private void btnLienHeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLienHeActionPerformed
        JOptionPane.showMessageDialog(this, "Bạn vui lòng chọn chức năng hỗ trợ để liên hệ!");
    }//GEN-LAST:event_btnLienHeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        KM.setVisible(false);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        if (btnHuongDan.isSelected() == true) {
            HD.setVisible(true);
            HD.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnDonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonHangActionPerformed
         if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  BanHang_View km = BanHang_View.BH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  BanHang_View km = BanHang_View.BH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KM.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnDonHangActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
         if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            QLNV_View nv = QLNV_View.NV;
            nv.setVisible(true);
            System.out.println("giamdoc");
            nv.setUser(getTenD());
            KM.dispose();
        }
       else if(!getTen("Đăng nhập") && checkQuyenQLNV()== true){
           QLNV_View nv = QLNV_View.NV;
            nv.setVisible(true);
             nv.setUser(getTenD());
             KM.dispose();
            System.out.println("QLNV");
       }
       else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHienthiCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiCTActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
        if (CTKhuyenMai_Controller.dstimkiemct != null) {
            CTKhuyenMai_Controller.dstimkiemct.clear();
        }
        if (CTKhuyenMai_Controller.dscttkkm == null) {
            bus.timkiem();
        }
        for (CTKhuyenMai_DTO kh : CTKhuyenMai_Controller.dscttkkm)
            HienthiDSCTKM(kh);
    }//GEN-LAST:event_btnHienthiCTActionPerformed

    private void btnTimkiemKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemKhoaActionPerformed
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        String s = txtNhapkhoa.getText().trim();
        CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
        if (CTKhuyenMai_Controller.dstimkiemct == null) {
            bus.timkiemchitiet();
        }
        if (CTKhuyenMai_Controller.dstimkiemct != null) {
            CTKhuyenMai_Controller.dstimkiemct.clear();
        }
        if (cbboxKhoa.getSelectedItem().equals("<none>"))
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn khóa tìm kiếm!");
        else
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_Controller.dsctkm) {
                if (cbboxKhoa.getSelectedItem().equals("Mã sản phẩm") && s.equalsIgnoreCase(ctkm.masp)) {
                    CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                }
                if (cbboxKhoa.getSelectedItem().equals("Mã chi tiết") && s.equalsIgnoreCase(ctkm.mact)) {
                    CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                }
                if (cbboxKhoa.getSelectedItem().equals("Mã khuyến mãi") && s.equalsIgnoreCase(ctkm.makm)) {
                    CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                    HienthiDSCTKM(ctkm);
                }
            }
    }//GEN-LAST:event_btnTimkiemKhoaActionPerformed

    private void txtNhapkhoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhapkhoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            String s = txtNhapkhoa.getText().trim();
            CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
            if (CTKhuyenMai_Controller.dstimkiemct == null) {
                bus.timkiemchitiet();
            }
            if (CTKhuyenMai_Controller.dstimkiemct != null) {
                CTKhuyenMai_Controller.dstimkiemct.clear();
            }
            if (cbboxKhoa.getSelectedItem().equals("<none>")) {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn khóa tìm kiếm!");
            } else {
                for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_Controller.dsctkm) {
                    if (cbboxKhoa.getSelectedItem().equals("Mã sản phẩm") && s.equalsIgnoreCase(ctkm.masp)) {
                        CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                        HienthiDSCTKM(ctkm);
                    }
                    if (cbboxKhoa.getSelectedItem().equals("Mã chi tiết") && s.equalsIgnoreCase(ctkm.mact)) {
                        CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                        HienthiDSCTKM(ctkm);
                    }
                    if (cbboxKhoa.getSelectedItem().equals("Mã khuyến mãi") && s.equalsIgnoreCase(ctkm.makm)) {
                        CTKhuyenMai_Controller.dstimkiemct.add(ctkm);
                        HienthiDSCTKM(ctkm);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtNhapkhoaKeyPressed

    private void tableCTCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTCTKMMouseClicked
        int i = tableCTCTKM.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            /*if(CTKhuyenMai_BUS.dscttkkm == null || CTKhuyenMai_BUS.dscttkkm.size() == 0)
            km = CTKhuyenMai_BUS.dsctkm.get(i);*/

            if (CTKhuyenMai_Controller.dstimkiemct == null || CTKhuyenMai_Controller.dstimkiemct.size() == 0) {
                km = CTKhuyenMai_Controller.dscttkkm.get(i);
            } else {
                km = CTKhuyenMai_Controller.dstimkiemct.get(i);
            }
            txtMaKM.setText(km.makm);
            txtMaCTKM.setText(km.mact);
            txtMaSP.setText(km.masp);
            txtGiamgia.setText(km.giamgia);
        }
    }//GEN-LAST:event_tableCTCTKMMouseClicked

    private void btnXoaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCTActionPerformed
        int i = tableCTCTKM.getSelectedRow();
        if (i >= 0) {
            CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
            int j = 0;
            for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_Controller.dsctkm) {
                if (CTKhuyenMai_Controller.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                    break;
                }
                j++;
            }
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            km.mact = CTKhuyenMai_Controller.dscttkkm.get(i).mact;
            km.masp = txtMaSP.getText().trim().toUpperCase();
            km.giamgia = txtGiamgia.getText().trim();
            km.makm = txtMaKM.getText().trim().toUpperCase();
            bus.xoa(CTKhuyenMai_Controller.dscttkkm.get(i).mact, j);
            CTKhuyenMai_Controller.dscttkkm.remove(i);
            model1.removeRow(i);
            tableCTCTKM.setModel(model1);
        }
    }//GEN-LAST:event_btnXoaCTActionPerformed

    private void btnSuaCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCTActionPerformed
        int i = tableCTCTKM.getSelectedRow();
        if (i >= 0) {
            String s = CTKhuyenMai_Controller.dscttkkm.get(i).makm;
            CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
            km.mact = CTKhuyenMai_Controller.dscttkkm.get(i).mact;
            km.masp = txtMaSP.getText().trim().toUpperCase();
            km.giamgia = txtGiamgia.getText().trim();
            km.makm = txtMaKM.getText().trim().toUpperCase();
            if (Ktra_DeTrong_MaKM(km.makm) && Ktra_KhongTonTai_MaKM(km.makm) && Ktra_DeTrong_MaSP(km.masp) && Ktra_DeTrong_giamgia(km.giamgia) && KtraSo(km.giamgia)) {
                CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
                if (s.equalsIgnoreCase(km.makm)) {
                    int j = 0;
                    for (CTKhuyenMai_DTO ctkm : CTKhuyenMai_Controller.dsctkm) {
                        if (CTKhuyenMai_Controller.dscttkkm.get(i).mact.equalsIgnoreCase(ctkm.mact)) {
                            break;
                        }
                        j++;
                    }
                    bus.sua(j, km);
                    model1.setValueAt(km.makm, i, 0);
                    model1.setValueAt(km.mact, i, 1);
                    model1.setValueAt(km.masp, i, 2);
                    model1.setValueAt(km.giamgia, i, 3);
                    tableCTCTKM.setModel(model1);
                } else {
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaCTActionPerformed

    private void btnThemCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCTActionPerformed
        CTKhuyenMai_DTO km = new CTKhuyenMai_DTO();
        int num = Integer.parseInt(CTKhuyenMai_Controller.dsctkm.get(CTKhuyenMai_Controller.dsctkm.size() - 1).mact.substring(2));
        String numberMa = String.valueOf(num + 1);
        km.mact = "CT" + numberMa;
        km.masp = txtMaSP.getText().trim().toUpperCase();
        km.giamgia = txtGiamgia.getText().trim();
        km.makm = txtMaKM.getText().trim().toUpperCase();

        if (Ktra_DeTrong_MaKM(km.makm) && Ktra_KhongTonTai_MaKM(km.makm) && Ktra_DeTrong_MaSP(km.masp) && Ktra_DeTrong_giamgia(km.giamgia) && KtraSo(km.giamgia)) {
            CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
            bus.them(km);
            for (int i = model1.getRowCount() - 1; i >= 0; i--) {
                model1.removeRow(i);
            }
            if (CTKhuyenMai_Controller.dscttkkm != null) {
                CTKhuyenMai_Controller.dscttkkm.clear();
            }
            HienthiCTCTKM(km.makm);
        }
    }//GEN-LAST:event_btnThemCTActionPerformed

    private void txtMaSPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaSPKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtGiamgia.requestFocus();
    }//GEN-LAST:event_txtMaSPKeyPressed

    private void btnTimKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKMActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        KhuyenMai_Controller bus = new KhuyenMai_Controller();
        if (KhuyenMai_Controller.dstkkm == null) {
            bus.timkiem();
        }
        if (KhuyenMai_Controller.dstkkm != null) {
            KhuyenMai_Controller.dstkkm.clear();
        }

        if (cbbTimKM.getSelectedItem().equals("Ngày khuyến mãi")) {
            int d = Integer.parseInt((String) cbboxDfirst.getSelectedItem());
            int m = Integer.parseInt((String) cbboxMfirst.getSelectedItem());
            int y = Integer.parseInt((String) cbboxYfirst.getSelectedItem());
            for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
                int d1 = Integer.parseInt(km.ngaybd);
                int m1 = Integer.parseInt(km.thangbd);
                int y1 = Integer.parseInt(km.nambd);
                int d2 = Integer.parseInt(km.ngaykt);// d1/m1/y1  d/m/y  d2/m2/y2
                int m2 = Integer.parseInt(km.thangkt);
                int y2 = Integer.parseInt(km.namkt); //y=y1 y<y2  y=y1=y2  y=y2 y1<y  y1<y<y2
                if (y1 <= y && y <= y2) {
                    if (y1 == y && y < y2) {
                        if (m1 <= m) {
                            if (m1 == m && d1 <= d) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d1 <= d) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y == y1 && y == y2) {
                        if (m1 <= m && m <= m2) {
                            if (m1 == m && m == m2 && d1 <= d && d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else {
                                if (m1 == m && m < m2 && d1 <= d) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m2 == m && m > m1 && d <= d2) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m1 < m && m2 > m) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                            }
                        }
                    }
                    if (y2 == y && y1 < y) {
                        if (m2 >= m) {
                            if (m2 == m && d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y1 < y && y < y2) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                }
            }
        } else {
            if (!cbbTimKM.getSelectedItem().equals("<none>")) {
                String s = txtNhaptk.getText().trim();
                for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
                    if (cbbTimKM.getSelectedItem().equals("Mã chương trình") && s.equalsIgnoreCase(km.makm)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                        break;
                    }
                    if (cbbTimKM.getSelectedItem().equals("Tên chương trình") && s.equalsIgnoreCase(km.ten)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                    if (cbbTimKM.getSelectedItem().equals("Tình trạng") && s.equalsIgnoreCase(km.tinhtrang)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn khóa tìm kiếm");
            }
        }
    }//GEN-LAST:event_btnTimKMActionPerformed

    private void cbboxYfirstKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxYfirstKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            KhuyenMai_Controller bus = new KhuyenMai_Controller();
            if (KhuyenMai_Controller.dstkkm == null) {
                bus.timkiem();
            }
            if (KhuyenMai_Controller.dstkkm != null) {
                KhuyenMai_Controller.dstkkm.clear();
            }
            int d = Integer.parseInt((String) cbboxDfirst.getSelectedItem());
            int m = Integer.parseInt((String) cbboxMfirst.getSelectedItem());
            int y = Integer.parseInt((String) cbboxYfirst.getSelectedItem());
            for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
                int d1 = Integer.parseInt(km.ngaybd);
                int m1 = Integer.parseInt(km.thangbd);
                int y1 = Integer.parseInt(km.nambd);
                int d2 = Integer.parseInt(km.ngaykt);// d1/m1/y1  d/m/y  d2/m2/y2
                int m2 = Integer.parseInt(km.thangkt);
                int y2 = Integer.parseInt(km.namkt); //y=y1 y<y2  y=y1=y2  y=y2 y1<y  y1<y<y2
                if (y1 <= y && y <= y2) {
                    if (y1 == y && y < y2) {
                        if (m1 <= m) {
                            if (m1 == m && d1 <= d) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d1 <= d) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y == y1 && y == y2) {
                        if (m1 <= m && m <= m2) {
                            if (m1 == m && m == m2 && d1 <= d && d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else {
                                if (m1 == m && m < m2 && d1 <= d) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m2 == m && m > m1 && d <= d2) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                                if (m1 < m && m2 > m) {
                                    KhuyenMai_Controller.dstkkm.add(km);
                                    HienthiDSKM(km);
                                }
                            }
                        }
                    }
                    if (y2 == y && y1 < y) {
                        if (m2 >= m) {
                            if (m2 == m && d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            } else if (d <= d2) {
                                KhuyenMai_Controller.dstkkm.add(km);
                                HienthiDSKM(km);
                            }
                        }
                    }
                    if (y1 < y && y < y2) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                }
            }
        }
    }//GEN-LAST:event_cbboxYfirstKeyPressed

    private void txtNhaptkKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhaptkKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            String s = txtNhaptk.getText().trim();
            KhuyenMai_Controller bus = new KhuyenMai_Controller();
            if (KhuyenMai_Controller.dstkkm == null) {
                bus.timkiem();
            }
            if (KhuyenMai_Controller.dstkkm != null) {
                KhuyenMai_Controller.dstkkm.clear();
            }
            if (cbbTimKM.getSelectedItem().equals("<none>")) {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn khóa tìm kiếm");
            } else {
                for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
                    if (cbbTimKM.getSelectedItem().equals("Mã chương trình") && s.equalsIgnoreCase(km.makm)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                        break;
                    }
                    if (cbbTimKM.getSelectedItem().equals("Tên chương trình") && s.equalsIgnoreCase(km.ten)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                    if (cbbTimKM.getSelectedItem().equals("Tình trạng") && s.equalsIgnoreCase(km.tinhtrang)) {
                        KhuyenMai_Controller.dstkkm.add(km);
                        HienthiDSKM(km);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtNhaptkKeyPressed

    private void btnHienthiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthiActionPerformed
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (KhuyenMai_Controller.dstkkm != null) {
            KhuyenMai_Controller.dstkkm.clear();
        }
        for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm)
            HienthiDSKM(km);
    }//GEN-LAST:event_btnHienthiActionPerformed

    private void tableCTKMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTKMMouseClicked
        int i = tableCTKM.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            KhuyenMai_DTO km = new KhuyenMai_DTO();
            if (KhuyenMai_Controller.dstkkm == null || KhuyenMai_Controller.dstkkm.size() == 0) {
                km = KhuyenMai_Controller.dskm.get(i);
            } else {
                km = KhuyenMai_Controller.dstkkm.get(i);
            }
            txtMa.setText(km.makm);
            txtTen.setText(km.ten);
            cbboxNgaybd.setSelectedItem(km.ngaybd);
            cbboxThangbd.setSelectedItem(km.thangbd);
            cbboxNambd.setSelectedItem(km.nambd);
            cbboxNgaykt.setSelectedItem(km.ngaykt);
            cbboxThangkt.setSelectedItem(km.thangkt);
            cbboxNamkt.setSelectedItem(km.namkt);
            cbbTinhtrang.setSelectedItem(km.tinhtrang);
            HienthiCTCTKM(km.makm);
        }
    }//GEN-LAST:event_tableCTKMMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tableCTKM.getSelectedRow();
        if (i >= 0) {
            KhuyenMai_Controller bus = new KhuyenMai_Controller();
            bus.xoa(KhuyenMai_Controller.dskm.get(i).makm, i);
            model.removeRow(i);
            tableCTKM.setModel(model);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int i = tableCTKM.getSelectedRow();
        if (i >= 0) {
            String s = KhuyenMai_Controller.dskm.get(i).makm;
            KhuyenMai_DTO km = new KhuyenMai_DTO();
            km.makm = txtMa.getText().trim();
            km.ten = txtTen.getText().trim();
            km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
            km.thangbd = (String) cbboxThangbd.getSelectedItem();
            km.nambd = (String) cbboxNambd.getSelectedItem();
            km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
            km.thangkt = (String) cbboxThangkt.getSelectedItem();
            km.namkt = (String) cbboxNamkt.getSelectedItem();
            km.tinhtrang = (String) cbbTinhtrang.getSelectedItem();
            if (Ktra_DeTrong_MaKM(km.makm) && Ktra_DeTrong_TenKM(txtTen.getText()) && Ktra_NgayBD_Truoc_NgayKT() && Ktra_DeTrong_TinhTrang()) {
                KhuyenMai_Controller bus = new KhuyenMai_Controller();
                if (s.equalsIgnoreCase(km.makm)) {
                    bus.sua(i, km);
                    model.setValueAt(km.makm, i, 0);
                    model.setValueAt(km.ten, i, 1);
                    model.setValueAt(km.ngaybd + "/" + km.thangbd + "/" + km.nambd, i, 2);
                    model.setValueAt(km.ngaykt + "/" + km.thangkt + "/" + km.namkt, i, 3);
                    model.setValueAt(km.tinhtrang, i, 4);
                    tableCTKM.setModel(model);
                } else {
                    JOptionPane.showMessageDialog(null, "Không được sửa mã khuyến mãi!");
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        KhuyenMai_DTO km = new KhuyenMai_DTO();
        km.makm = txtMa.getText().trim().toUpperCase();
        km.ten = txtTen.getText().trim();
        km.ngaybd = (String) cbboxNgaybd.getSelectedItem();
        km.thangbd = (String) cbboxThangbd.getSelectedItem();
        km.nambd = (String) cbboxNambd.getSelectedItem();
        km.ngaykt = (String) cbboxNgaykt.getSelectedItem();
        km.thangkt = (String) cbboxThangkt.getSelectedItem();
        km.namkt = (String) cbboxNamkt.getSelectedItem();
        km.tinhtrang = (String) cbbTinhtrang.getSelectedItem();
        if (Ktra_DeTrong_MaKM(txtMa.getText()) && Ktra_DeTrong_TenKM(txtTen.getText()) && Ktra_NgayBD_Truoc_NgayKT() && Ktra_DeTrong_TinhTrang()) {
            int d = 0;
            for (KhuyenMai_DTO km1 : KhuyenMai_Controller.dskm) {
                if (km1.makm.equalsIgnoreCase(km.makm)) {
                    d++;
                    break;
                }
            }
            KhuyenMai_Controller bus = new KhuyenMai_Controller();
            bus.them(km);
            if (d == 0) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                if (KhuyenMai_Controller.dstkkm != null) {
                    KhuyenMai_Controller.dstkkm.clear();
                }
                for (KhuyenMai_DTO km1 : KhuyenMai_Controller.dskm) {
                    HienthiDSKM(km1);
                }
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void cbboxThangktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxThangktKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNamkt.requestFocus();
    }//GEN-LAST:event_cbboxThangktKeyPressed

    private void cbboxNgayktKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNgayktKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxThangkt.requestFocus();
    }//GEN-LAST:event_cbboxNgayktKeyPressed

    private void cbboxNambdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNambdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNgaykt.requestFocus();
    }//GEN-LAST:event_cbboxNambdKeyPressed

    private void cbboxThangbdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxThangbdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNambd.requestFocus();
    }//GEN-LAST:event_cbboxThangbdKeyPressed

    private void cbboxNgaybdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbboxNgaybdKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxThangbd.requestFocus();
    }//GEN-LAST:event_cbboxNgaybdKeyPressed

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            cbboxNgaybd.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtMaKeyPressed

    private void cbbTimKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTimKMActionPerformed
        if (cbbTimKM.getSelectedItem().equals("Ngày khuyến mãi")) {
            txtNhaptk.setEditable(false);
            cbboxDfirst.setEditable(true);
            cbboxMfirst.setEditable(true);
            cbboxYfirst.setEditable(true);
        } else {
            txtNhaptk.setEditable(true);
            cbboxDfirst.setEditable(false);
            cbboxMfirst.setEditable(false);
            cbboxYfirst.setEditable(false);
        }
    }//GEN-LAST:event_cbbTimKMActionPerformed

    private void HienthiDSKM(KhuyenMai_DTO km) {
        Vector row = new Vector();
        row.add(km.makm);
        row.add(km.ten);
        row.add(km.ngaybd + "/" + km.thangbd + "/" + km.nambd);
        row.add(km.ngaykt + "/" + km.thangkt + "/" + km.namkt);
        row.add(km.tinhtrang);
        model.addRow(row);
        tableCTKM.setModel(model);
    }

    private void HienthiDSCTKM(CTKhuyenMai_DTO km) {
        Vector row = new Vector();
        row.add(km.makm);
        row.add(km.mact);
        row.add(km.masp);
        row.add(km.giamgia);
        model1.addRow(row);
        tableCTCTKM.setModel(model1);
    }

    private void DocDSKM() {
        KhuyenMai_Controller bus = new KhuyenMai_Controller();
        if (KhuyenMai_Controller.dskm == null) {
            bus.DocDSKM();
        }
        Vector header = new Vector();
        header.add("Mã chương trình");
        header.add("Tên chương trình");
        header.add("Ngày bắt đầu");
        header.add("Ngày kết thúc");
        header.add("Tình trạng");
        model = new DefaultTableModel(header, 0);
        for (KhuyenMai_DTO km : KhuyenMai_Controller.dskm) {
            Vector row = new Vector();
            row.add(km.makm);
            row.add(km.ten);
            row.add(km.ngaybd + "/" + km.thangbd + "/" + km.nambd);
            row.add(km.ngaykt + "/" + km.thangkt + "/" + km.namkt);
            row.add(km.tinhtrang);
            model.addRow(row);
        }
        tableCTKM.setModel(model);
    }

    private void DocDSCTKM() {
        CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
        if (CTKhuyenMai_Controller.dsctkm == null) {
            bus.DocDSCTKM();
        }
        Vector header = new Vector();
        header.add("Mã chương trình");
        header.add("Mã chi tiết");
        header.add("Mã sản phẩm");
        header.add("% Giảm giá");
        model1 = new DefaultTableModel(header, 0);
        tableCTCTKM.setModel(model1);
    }

    private void HienthiCTCTKM(String ma) {
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        CTKhuyenMai_Controller bus = new CTKhuyenMai_Controller();
        if (CTKhuyenMai_Controller.dscttkkm == null) {
            bus.timkiem();
        }
        if (CTKhuyenMai_Controller.dscttkkm != null) {
            CTKhuyenMai_Controller.dscttkkm.clear();
        }
        for (CTKhuyenMai_DTO km : CTKhuyenMai_Controller.dsctkm) {
            //System.out.println(km.mact + " " + km.makm);
            if (km.makm.equalsIgnoreCase(ma)) {
                bus.dscttkkm.add(km);
                Vector row = new Vector();
                row.add(km.makm);
                row.add(km.mact);
                row.add(km.masp);
                row.add(km.giamgia);
                model1.addRow(row);
                //txtNdchitiet.setText(km.noidungct);
            }
        }
        tableCTCTKM.setModel(model1);
    }

    private void createComboD() {
        String[] s = new String[31];
        for (int i = 1; i <= 31; i++) //ngay.addItem(i);
        {
            s[i - 1] = String.format("%02d", i);
        }
        cbboxNgaybd.setModel(new DefaultComboBoxModel(s));
        cbboxNgaykt.setModel(new DefaultComboBoxModel(s));
        cbboxDfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxDlast.setModel(new DefaultComboBoxModel(s));
    }

    private void createComboM() {
        String[] s = new String[12];
        for (int i = 1; i <= 12; i++) //thang.addItem(i);
        {
            s[i - 1] = String.format("%02d", i);
        }
        cbboxThangbd.setModel(new DefaultComboBoxModel(s));
        cbboxThangkt.setModel(new DefaultComboBoxModel(s));
        cbboxMfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxMlast.setModel(new DefaultComboBoxModel(s));
    }

    private void createComboY() {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        //System.out.println(year);
        String[] s = new String[21];
        for (int i = year - 10; i <= year + 10; i++) //year.addItem(i);
        {
            s[i - year + 10] = String.valueOf(i);
        }
        cbboxNambd.setModel(new DefaultComboBoxModel(s));
        cbboxNamkt.setModel(new DefaultComboBoxModel(s));
        cbboxYfirst.setModel(new DefaultComboBoxModel(s));
        //cbboxYlast.setModel(new DefaultComboBoxModel(s));
    }

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
    
    public void setTextTenDN(String s) {
        btnDangNhap.setText(s);
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
            java.util.logging.Logger.getLogger(KhuyenMai_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuyenMai_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KM.setVisible(true);
                KM.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btnHienthiCT;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSuaCT;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemCT;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JButton btnTimKM;
    private javax.swing.JButton btnTimkiemKhoa;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaCT;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbTimKM;
    private javax.swing.JComboBox<String> cbbTinhtrang;
    private javax.swing.JComboBox<String> cbboxDfirst;
    private javax.swing.JComboBox<String> cbboxKhoa;
    private javax.swing.JComboBox<String> cbboxMfirst;
    private javax.swing.JComboBox<String> cbboxNambd;
    private javax.swing.JComboBox<String> cbboxNamkt;
    private javax.swing.JComboBox<String> cbboxNgaybd;
    private javax.swing.JComboBox<String> cbboxNgaykt;
    private javax.swing.JComboBox<String> cbboxThangbd;
    private javax.swing.JComboBox<String> cbboxThangkt;
    private javax.swing.JComboBox<String> cbboxYfirst;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbKhoa;
    private javax.swing.JLabel lbKhoatk;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbMaCTKM;
    private javax.swing.JLabel lbMaKM;
    private javax.swing.JLabel lbMaSP;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JLabel lbNgaybd;
    private javax.swing.JLabel lbNgaykt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTinhtrang;
    private javax.swing.JPanel panelCTCTKM;
    private javax.swing.JPanel panelCTKM;
    private javax.swing.JPanel panelThongtin;
    private javax.swing.JTable tableCTCTKM;
    private javax.swing.JTable tableCTKM;
    private javax.swing.JTabbedPane tbChitiet;
    private javax.swing.JTextField txtGiamgia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtMaCTKM;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtNhapkhoa;
    private javax.swing.JTextField txtNhaptk;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    void setComponentsNames() {
        btnThem.setName("them");
        btnSua.setName("sua");
        btnXoa.setName("xoa");
        btnTimKM.setName("timkiem");
        btnHienthi.setName("reload");
        
        btnThemCT.setName("themct");
        btnSuaCT.setName("suact");
        btnXoaCT.setName("xoact");
        btnTimkiemKhoa.setName("timkiemct");
        btnHienthiCT.setName("reloadct");
        
        cbbTinhtrang.setName("tinhtrang");
    }
}
