package icy.View;

import icy.Controller.QLNV_Controller;
import icy.Model.QLNV_DTO;
import icy.*;
import icy.Controller.DangKy_Controller;
import icy.Controller.KhachHang_Controller;
import icy.Model.KhachHang_DTO;
import icy.Model.DangKyDTO;
import static icy.View.BanHang_View.BH;
import static icy.View.DangNhap_View.DN;
import static icy.View.DoanhThu_View.DT;
import static icy.View.HoTro_View.HT;
import static icy.View.HuongDan_View.HD;
import static icy.View.KhuyenMai_View.KM;
import static icy.View.NhapHang_View.NH;
import static icy.View.QLNV_View.NV;
import static icy.View.SanPham_View.SP;
import static icy.View.ThongKe_View.TK;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KhachHang_View extends javax.swing.JFrame {

    public static KhachHang_View KH = new KhachHang_View();
    DefaultTableModel model = new DefaultTableModel();
    //static SanPham_GUI sp=new SanPham_GUI();

    public KhachHang_View() {
        initComponents();
        panel_ThongtinKH.setFocusable(true);
        DocDSKH();
        try {
            btnKhachHang.setSelected(true);
        } catch (Exception ex) {
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        GroupTKKH = new javax.swing.ButtonGroup();
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
        tbChitietKH = new javax.swing.JTabbedPane();
        panel_ThongtinKH = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableKhachhang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbHo = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbSdt = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lb_Diem = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnTimkiem = new javax.swing.JButton();
        txtTKTen = new javax.swing.JTextField();
        txtTKSDT = new javax.swing.JTextField();
        lb_TKKH = new javax.swing.JLabel();
        txtTKHo = new javax.swing.JTextField();
        rbtnTKMa = new javax.swing.JRadioButton();
        txtTKMa = new javax.swing.JTextField();
        rbtnTKHo = new javax.swing.JRadioButton();
        rbtnTKTen = new javax.swing.JRadioButton();
        rbtnTKSDT = new javax.swing.JRadioButton();
        btnHienthi = new javax.swing.JButton();

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
            .addComponent(btnkhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhapHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDoanhThu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDonHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        tbChitietKH.setBackground(new java.awt.Color(185, 204, 255));
        tbChitietKH.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        tbChitietKH.setName("tbChitietKH"); // NOI18N

        panel_ThongtinKH.setBackground(new java.awt.Color(216, 240, 240));
        panel_ThongtinKH.setName("panel_Thongtin"); // NOI18N

        tableKhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDSKHMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableKhachhang);

        jPanel6.setBackground(new java.awt.Color(197, 233, 234));

        lbMa.setText("Mã khách hàng:");
        lbMa.setName("lb_Ma"); // NOI18N

        txtMa.setEditable(false);
        txtMa.setName("txt_Ma"); // NOI18N

        lbHo.setText("Họ lót:");
        lbHo.setName("lb_Ho"); // NOI18N

        txtHo.setForeground(new java.awt.Color(102, 102, 102));
        txtHo.setText("Nhập họ lót");
        txtHo.setName("txt_Ho"); // NOI18N
        txtHo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHoFocusLost(evt);
            }
        });
        txtHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtHoKeyPressed(evt);
            }
        });

        lbTen.setText("Tên:");
        lbTen.setName("lb_Ten"); // NOI18N

        txtTen.setForeground(new java.awt.Color(102, 102, 102));
        txtTen.setText("Nhập tên");
        txtTen.setName("txt_Ten"); // NOI18N
        txtTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenFocusLost(evt);
            }
        });
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTenKeyPressed(evt);
            }
        });

        lbSdt.setText("Số điện thoại:");
        lbSdt.setName("lb_SDT"); // NOI18N

        txtSDT.setForeground(new java.awt.Color(102, 102, 102));
        txtSDT.setText("Nhập số điện thoại");
        txtSDT.setName("txt_SDT"); // NOI18N
        txtSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSDTFocusLost(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        lb_Diem.setText("Điểm tích lũy:");
        lb_Diem.setName("lb_Diachi"); // NOI18N

        txtDiem.setEditable(false);

        btnThem.setBackground(new java.awt.Color(0, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Them.png"))); // NOI18N
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

        btnSua.setBackground(new java.awt.Color(0, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Sua.png"))); // NOI18N
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua(evt);
            }
        });
        btnSua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSuaKeyPressed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(0, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Xoa.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHo)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_Diem)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(txtDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Diem)
                            .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHo))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbMa)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbSdt)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        txtMa.getAccessibleContext().setAccessibleName("");

        jPanel5.setBackground(new java.awt.Color(197, 233, 234));

        btnTimkiem.setBackground(new java.awt.Color(0, 204, 204));
        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnTimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/Timkiem.png"))); // NOI18N
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        txtTKTen.setEditable(false);
        txtTKTen.setForeground(new java.awt.Color(102, 102, 102));
        txtTKTen.setText("Nhập tên cần tìm");
        txtTKTen.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTKTenFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTKTenFocusLost(evt);
            }
        });
        txtTKTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TKTen_keyPressed(evt);
            }
        });

        txtTKSDT.setEditable(false);
        txtTKSDT.setForeground(new java.awt.Color(102, 102, 102));
        txtTKSDT.setText("Nhập số điện thoại cần tìm");
        txtTKSDT.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTKSDTFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTKSDTFocusLost(evt);
            }
        });
        txtTKSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TKSdt_keyPressed(evt);
            }
        });

        lb_TKKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lb_TKKH.setText("Hiển thị tất cả khách hàng theo:");

        txtTKHo.setEditable(false);
        txtTKHo.setForeground(new java.awt.Color(102, 102, 102));
        txtTKHo.setText("Nhập họ lót cần tìm");
        txtTKHo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTKHoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTKHoFocusLost(evt);
            }
        });
        txtTKHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TKHo_keyPressed(evt);
            }
        });

        rbtnTKMa.setBackground(new java.awt.Color(197, 233, 234));
        GroupTKKH.add(rbtnTKMa);
        rbtnTKMa.setText("Mã khách hàng");
        rbtnTKMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTKMaActionPerformed(evt);
            }
        });

        txtTKMa.setEditable(false);
        txtTKMa.setForeground(new java.awt.Color(102, 102, 102));
        txtTKMa.setText("Nhập mã khách hàng cần tìm");
        txtTKMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTKMaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTKMaFocusLost(evt);
            }
        });
        txtTKMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TKMa_keyPressed(evt);
            }
        });

        rbtnTKHo.setBackground(new java.awt.Color(197, 233, 234));
        GroupTKKH.add(rbtnTKHo);
        rbtnTKHo.setText("Họ lót");
        rbtnTKHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTKHoActionPerformed(evt);
            }
        });

        rbtnTKTen.setBackground(new java.awt.Color(197, 233, 234));
        GroupTKKH.add(rbtnTKTen);
        rbtnTKTen.setText("Tên");
        rbtnTKTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTKTenActionPerformed(evt);
            }
        });

        rbtnTKSDT.setBackground(new java.awt.Color(197, 233, 234));
        GroupTKKH.add(rbtnTKSDT);
        rbtnTKSDT.setText("Số điện thoại");
        rbtnTKSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTKSDTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rbtnTKMa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnTKHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(rbtnTKSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtnTKTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTKHo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTKMa, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTKTen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTKSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lb_TKKH))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_TKKH)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnTKMa)
                    .addComponent(txtTKMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTKHo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTKTen))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTKSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnTKSDT))
                .addGap(18, 18, 18)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        btnHienthi.setBackground(new java.awt.Color(0, 204, 204));
        btnHienthi.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHienthi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/KhachHang/reload.png"))); // NOI18N
        btnHienthi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienthi(evt);
            }
        });

        javax.swing.GroupLayout panel_ThongtinKHLayout = new javax.swing.GroupLayout(panel_ThongtinKH);
        panel_ThongtinKH.setLayout(panel_ThongtinKHLayout);
        panel_ThongtinKHLayout.setHorizontalGroup(
            panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                        .addGroup(panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                    .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                        .addComponent(btnHienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_ThongtinKHLayout.setVerticalGroup(
            panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ThongtinKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHienthi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ThongtinKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ThongtinKHLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbChitietKH.addTab("Thông tin", panel_ThongtinKH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tbChitietKH, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbChitietKH, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean Ktra_MaKH(String s) {
        if (s.length() >= 3) {
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(s.substring(2));
            if ("KH".equalsIgnoreCase(s.substring(0, 2)) && matcher.matches() == true) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Mã khách hàng phải nhập là: KHxxx.\n Ví dụ: KH1");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Mã khách hàng phải nhập là: KHxxx.\n Ví dụ: KH1");
            return false;
        }
    }

    private boolean Ktra_Ho(String s) {
        if (s.equals("Nhập họ lót") || s.equals("Nhập họ lót cần tìm")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập họ lót!");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_Ten(String s) {
        if (s.equals("Nhập tên") || s.equals("Nhập tên cần tìm")) {
            JOptionPane.showMessageDialog(null, "Bạn phải nhập tên!");
            return false;
        } else {
            return true;
        }
    }

    private boolean Ktra_SoDienThoai(String s) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches() == true && s.length() == 10) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Nhập số điện thoại phải là số và đủ 10 số!");
            return false;
        }
    }

    private boolean Ktra_Trung_SoDienThoai(String s) {
        int d = 0;
        for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
            if (kh.sdt.equals(s)) {
                d++;
            }
        }
        if (d == 0) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Số điện thoại đã sử dụng cho 1 tài khoản khác!");
            return false;
        }
    }

    private void DocDSKH() {
        KhachHang_Controller bus = new KhachHang_Controller();
        if (KhachHang_Controller.dskh == null) {
            bus.DocDSKH();
        }
        Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Họ lót");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Điểm tích lũy");
        model = new DefaultTableModel(header, 0);
        for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
            Vector row = new Vector();
            row.add(kh.ma);
            row.add(kh.ho);
            row.add(kh.ten);
            row.add(kh.sdt);
            row.add(kh.diemtichluy);
            model.addRow(row);
        }
        tableKhachhang.setModel(model);
    }

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        if(getTen("Đăng nhập")){
             DangNhap_View.DN.setVisible(true);
             DangNhap_View.DN.setLocationRelativeTo(null);
             KH.dispose();
             
         }
    }//GEN-LAST:event_btnDangNhapActionPerformed
    
    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("giamdoc");
            sp.setUser(getTenD());
            KH.dispose();
        }
       else if(!getTen("Đăng nhập") && checkQuyenQLSP()== true){
           SanPham_View sp = SanPham_View.SP;
            sp.setVisible(true);
            System.out.println("QLSP");
            sp.setUser(getTenD());
            KH.dispose();
       }
       else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void tabpaneTrangChuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabpaneTrangChuAncestorAdded

    }//GEN-LAST:event_tabpaneTrangChuAncestorAdded

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed
        if (rbtnTKMa.isSelected() || rbtnTKHo.isSelected() || rbtnTKTen.isSelected() || rbtnTKSDT.isSelected()) {
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            String ma = txtTKMa.getText().trim();
            String ho = txtTKHo.getText().trim();
            String ten = txtTKTen.getText().trim();
            String sdt = txtTKSDT.getText().trim();

            KhachHang_Controller bus = new KhachHang_Controller();
            if (KhachHang_Controller.dstkkh == null) {
                bus.timkiem();
            }
            if (KhachHang_Controller.dstkkh != null) {
                KhachHang_Controller.dstkkh.clear();
            }

            for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
                if (rbtnTKMa.isSelected()) {
                    if (Ktra_MaKH(ma) == false) {
                        break;
                    } else if (kh.ma.equalsIgnoreCase(ma)) {
                        KhachHang_Controller.dstkkh.add(kh);
                        HienthiDSKH(kh);
                    }
                }
                if (rbtnTKHo.isSelected()) {
                    if (Ktra_Ho(ho) == false) {
                        break;
                    } else if (kh.ho.equalsIgnoreCase(ho)) {
                        KhachHang_Controller.dstkkh.add(kh);
                        HienthiDSKH(kh);
                    }
                }
                if (rbtnTKTen.isSelected()) {
                    if (Ktra_Ten(ten) == false) {
                        break;
                    } else if (kh.ten.equalsIgnoreCase(ten)) {
                        KhachHang_Controller.dstkkh.add(kh);
                        HienthiDSKH(kh);
                    }
                }
                if (rbtnTKSDT.isSelected()) {
                    if (Ktra_SoDienThoai(sdt) == false) {
                        break;
                    } else if (kh.sdt.equalsIgnoreCase(sdt)) {
                        KhachHang_Controller.dstkkh.add(kh);
                        HienthiDSKH(kh);
                    }
                }
            }
        } else
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục muốn tìm!");
    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void HienthiDSKH(KhachHang_DTO kh) {
        Vector row = new Vector();
        row.add(kh.ma);
        row.add(kh.ho);
        row.add(kh.ten);
        row.add(kh.sdt);
        row.add(kh.diemtichluy);
        model.addRow(row);
        tableKhachhang.setModel(model);
    }

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i = tableKhachhang.getSelectedRow();
        if (i >= 0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            kh.ma = txtMa.getText();
            kh.ho = txtHo.getText().trim();
            kh.ten = txtTen.getText().trim();
            kh.sdt = txtSDT.getText().trim();
            kh.diemtichluy = txtDiem.getText();
            KhachHang_Controller bus = new KhachHang_Controller();
            bus.xoa(txtMa.getText(), i);
            //bus.dskh.remove(i);
            model.removeRow(i);
            tableKhachhang.setModel(model);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        KhachHang_DTO kh = new KhachHang_DTO();
        int num = Integer.parseInt(KhachHang_Controller.dskh.get(KhachHang_Controller.dskh.size() - 1).ma.substring(2));
        String numberMa = String.valueOf(num + 1);
        kh.ma = "KH" + numberMa;
        kh.ho = txtHo.getText().trim();
        kh.ten = txtTen.getText().trim();
        kh.sdt = txtSDT.getText().trim();
        kh.diemtichluy = "0";
        if (Ktra_Ho(kh.ho) == true && Ktra_Ten(kh.ten) == true && Ktra_SoDienThoai(kh.sdt) == true && Ktra_Trung_SoDienThoai(kh.sdt) == true) {
            KhachHang_Controller bus = new KhachHang_Controller();
            bus.them(kh);
            for (int i = model.getRowCount() - 1; i >= 0; i--) {
                model.removeRow(i);
            }
            if (KhachHang_Controller.dstkkh != null) {
                KhachHang_Controller.dstkkh.clear();
            }
            for (KhachHang_DTO kh1 : KhachHang_Controller.dskh) {
                HienthiDSKH(kh1);
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusGained
        if (txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("");
            txtHo.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtHoFocusGained

    private void txtHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusLost
        if (txtHo.getText().trim().equals("") || txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("Nhập họ lót");
            txtHo.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtHoFocusLost

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        if (txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("");
            txtTen.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTenFocusGained

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        if (txtTen.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("Nhập tên");
            txtTen.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        if (txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("");
            txtSDT.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        if (txtSDT.getText().trim().equals("") || txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("Nhập số điện thoại");
            txtSDT.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void btnSua(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua
        int i = tableKhachhang.getSelectedRow();
        if (i >= 0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            kh.ma = txtMa.getText();
            kh.ho = txtHo.getText();
            kh.ten = txtTen.getText();
            kh.sdt = txtSDT.getText();
            kh.diemtichluy = txtDiem.getText();
            if (Ktra_Ho(kh.ho) == true && Ktra_Ten(kh.ten) == true && Ktra_SoDienThoai(kh.sdt) == true) {
                KhachHang_Controller bus = new KhachHang_Controller();
                bus.sua(i, kh);
                model.setValueAt(kh.ma, i, 0);
                model.setValueAt(kh.ho, i, 1);
                model.setValueAt(kh.ten, i, 2);
                model.setValueAt(kh.sdt, i, 3);
                model.setValueAt(kh.diemtichluy, i, 4);
                tableKhachhang.setModel(model);
            }
        }
    }//GEN-LAST:event_btnSua

    private void btnHienthi(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienthi
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        if (KhachHang_Controller.dstkkh != null) {
            KhachHang_Controller.dstkkh.clear();
        }
        for (KhachHang_DTO kh : KhachHang_Controller.dskh)
            HienthiDSKH(kh);
    }//GEN-LAST:event_btnHienthi

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtSDT.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            btnThem.requestFocus();
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtHoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtHoKeyPressed

    private void btnThemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThemKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            KhachHang_DTO kh = new KhachHang_DTO();
            int num = Integer.parseInt(KhachHang_Controller.dskh.get(KhachHang_Controller.dskh.size() - 1).ma.substring(2));
            String numberMa = String.valueOf(num + 1);
            kh.ma = "KH" + numberMa;
            kh.ho = txtHo.getText();
            kh.ten = txtTen.getText();
            kh.sdt = txtSDT.getText();
            kh.diemtichluy = "0";
            if (Ktra_Trung_SoDienThoai(kh.sdt) == true && Ktra_SoDienThoai(kh.sdt) == true && Ktra_Ho(kh.ho) == true && Ktra_Ten(kh.ten) == true) {
                KhachHang_Controller bus = new KhachHang_Controller();
                bus.them(kh);
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                if (KhachHang_Controller.dstkkh != null) {
                    KhachHang_Controller.dstkkh.clear();
                }
                for (KhachHang_DTO kh1 : KhachHang_Controller.dskh) {
                    HienthiDSKH(kh1);
                }
            }
            btnSua.requestFocus();
        }
    }//GEN-LAST:event_btnThemKeyPressed

    private void btnSuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSuaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableKhachhang.getSelectedRow();
            if (i >= 0) {
                KhachHang_DTO kh = new KhachHang_DTO();
                kh.ma = txtMa.getText();
                kh.ho = txtHo.getText();
                kh.ten = txtTen.getText();
                kh.sdt = txtSDT.getText();
                kh.diemtichluy = txtDiem.getText();
                if (Ktra_SoDienThoai(kh.sdt) == true && Ktra_Ho(kh.ho) == true && Ktra_Ten(kh.ten) == true) {
                    KhachHang_Controller bus = new KhachHang_Controller();
                    bus.sua(i, kh);
                    model.setValueAt(kh.ma, i, 0);
                    model.setValueAt(kh.ho, i, 1);
                    model.setValueAt(kh.ten, i, 2);
                    model.setValueAt(kh.sdt, i, 3);
                    model.setValueAt(kh.diemtichluy, i, 4);
                    tableKhachhang.setModel(model);
                }
            }
            btnXoa.requestFocus();
        }
    }//GEN-LAST:event_btnSuaKeyPressed

    private void btnXoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnXoaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            int i = tableKhachhang.getSelectedRow();
            if (i >= 0) {
                KhachHang_DTO kh = new KhachHang_DTO();
                kh.ma = txtMa.getText();
                kh.ho = txtHo.getText().trim();
                kh.ten = txtTen.getText().trim();
                kh.sdt = txtSDT.getText().trim();
                kh.diemtichluy = txtDiem.getText();
                if (Ktra_SoDienThoai(kh.sdt) == true && Ktra_Ho(kh.ho) == true && Ktra_Ten(kh.ten) == true) {
                    KhachHang_Controller bus = new KhachHang_Controller();
                   bus.xoa(txtMa.getText(), i);
                    model.removeRow(i);
                    tableKhachhang.setModel(model);
                }
            }
        }
    }//GEN-LAST:event_btnXoaKeyPressed

    private void txtTKTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKTenFocusGained
        if (txtTKTen.getText().trim().toLowerCase().equals("nhập tên cần tìm")) {
            txtTKTen.setText("");
            txtTKTen.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtTKTenFocusGained

    private void txtTKTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKTenFocusLost
        if (txtTKTen.getText().trim().equals("") || txtTKTen.getText().trim().toLowerCase().equals("nhập tên cần tìm")) {
            txtTKTen.setText("Nhập tên cần tìm");
            txtTKTen.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTKTenFocusLost

    private void txtTKSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKSDTFocusGained
        if (txtTKSDT.getText().trim().toLowerCase().equals("nhập số điện thoại cần tìm")) {
            txtTKSDT.setText("");
            txtTKSDT.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtTKSDTFocusGained

    private void txtTKSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKSDTFocusLost
        if (txtTKSDT.getText().trim().equals("") || txtTKSDT.getText().trim().toLowerCase().equals("nhập số điện thoại cần tìm")) {
            txtTKSDT.setText("Nhập số điện thoại cần tìm");
            txtTKSDT.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTKSDTFocusLost

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
       if(!getTen("Đăng nhập") && checkQuyenQLDH()== true){
                  KhuyenMai_View km = KhuyenMai_View.KM;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            KhuyenMai_View km = KhuyenMai_View.KM;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnkhuyenMaiActionPerformed

    private void btnNhapHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapHangActionPerformed
         if(!getTen("Đăng nhập") && checkQuyenQLNH()== true){
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  NhapHang_View km = NhapHang_View.NH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
        }
              else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");
    }//GEN-LAST:event_btnNhapHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
            ThongKe_View km = ThongKe_View.TK;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
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
        int output = JOptionPane.showConfirmDialog(KH, 
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
            int output = JOptionPane.showConfirmDialog(KH, 
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
        KH.setVisible(false);
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
                  KH.dispose();
              }
              else
                  if(!getTen("Đăng nhập") && checkQuyenQLGD() == true)
        {
                  BanHang_View km = BanHang_View.BH;
                  km.setVisible(true);
                  km.setUser(getTenD());
                  KH.dispose();
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
            KH.dispose();
        }
       else if(!getTen("Đăng nhập") && checkQuyenQLNV()== true){
           QLNV_View nv = QLNV_View.NV;
            nv.setVisible(true);
             nv.setUser(getTenD());
             KH.dispose();
            System.out.println("QLNV");
       }
       else JOptionPane.showMessageDialog(null, "Bạn không được sử dụng chức năng này!");

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void tableDSKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDSKHMouseClicked
        int i = tableKhachhang.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            if (KhachHang_Controller.dstkkh == null || KhachHang_Controller.dstkkh.size() == 0) {
                kh = KhachHang_Controller.dskh.get(i);
            } else {
                kh = KhachHang_Controller.dstkkh.get(i);
            }
            txtMa.setText(kh.ma);
            txtHo.setText(kh.ho);
            txtTen.setText(kh.ten);
            txtSDT.setText(kh.sdt);
            txtDiem.setText(kh.diemtichluy);
            txtMa.setForeground(new Color(102, 0, 51));
            txtHo.setForeground(new Color(102, 0, 51));
            txtTen.setForeground(new Color(102, 0, 51));
            txtSDT.setForeground(new Color(102, 0, 51));
            txtDiem.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_tableDSKHMouseClicked

    private void TKMa_keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKMa_keyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (rbtnTKMa.isSelected() || rbtnTKHo.isSelected() || rbtnTKTen.isSelected() || rbtnTKSDT.isSelected()) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                String ma = txtTKMa.getText().trim();
                String ho = txtTKHo.getText().trim();
                String ten = txtTKTen.getText().trim();
                String sdt = txtTKSDT.getText().trim();

                KhachHang_Controller bus = new KhachHang_Controller();
                if (KhachHang_Controller.dstkkh == null) {
                    bus.timkiem();
                }
                if (KhachHang_Controller.dstkkh != null) {
                    KhachHang_Controller.dstkkh.clear();
                }

                for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
                    if (rbtnTKMa.isSelected()) {
                        if (Ktra_MaKH(ma) == false) {
                            break;
                        } else if (kh.ma.equalsIgnoreCase(ma)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKHo.isSelected()) {
                        if (Ktra_Ho(ho) == false) {
                            break;
                        } else if (kh.ho.equalsIgnoreCase(ho)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKTen.isSelected()) {
                        if (Ktra_Ten(ten) == false) {
                            break;
                        } else if (kh.ten.equalsIgnoreCase(ten)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKSDT.isSelected()) {
                        if (Ktra_SoDienThoai(sdt) == false) {
                            break;
                        } else if (kh.sdt.equalsIgnoreCase(sdt)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục muốn tìm!");
            }
        }
    }//GEN-LAST:event_TKMa_keyPressed

    private void TKHo_keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKHo_keyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (rbtnTKMa.isSelected() || rbtnTKHo.isSelected() || rbtnTKTen.isSelected() || rbtnTKSDT.isSelected()) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                String ma = txtTKMa.getText().trim();
                String ho = txtTKHo.getText().trim();
                String ten = txtTKTen.getText().trim();
                String sdt = txtTKSDT.getText().trim();

                KhachHang_Controller bus = new KhachHang_Controller();
                if (KhachHang_Controller.dstkkh == null) {
                    bus.timkiem();
                }
                if (KhachHang_Controller.dstkkh != null) {
                    KhachHang_Controller.dstkkh.clear();
                }

                for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
                    if (rbtnTKMa.isSelected()) {
                        if (Ktra_MaKH(ma) == false) {
                            break;
                        } else if (kh.ma.equalsIgnoreCase(ma)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKHo.isSelected()) {
                        if (Ktra_Ho(ho) == false) {
                            break;
                        } else if (kh.ho.equalsIgnoreCase(ho)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKTen.isSelected()) {
                        if (Ktra_Ten(ten) == false) {
                            break;
                        } else if (kh.ten.equalsIgnoreCase(ten)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKSDT.isSelected()) {
                        if (Ktra_SoDienThoai(sdt) == false) {
                            break;
                        } else if (kh.sdt.equalsIgnoreCase(sdt)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục muốn tìm!");
            }
        }
    }//GEN-LAST:event_TKHo_keyPressed

    private void TKTen_keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKTen_keyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (rbtnTKMa.isSelected() || rbtnTKHo.isSelected() || rbtnTKTen.isSelected() || rbtnTKSDT.isSelected()) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                String ma = txtTKMa.getText().trim();
                String ho = txtTKHo.getText().trim();
                String ten = txtTKTen.getText().trim();
                String sdt = txtTKSDT.getText().trim();

                KhachHang_Controller bus = new KhachHang_Controller();
                if (KhachHang_Controller.dstkkh == null) {
                    bus.timkiem();
                }
                if (KhachHang_Controller.dstkkh != null) {
                    KhachHang_Controller.dstkkh.clear();
                }

                for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
                    if (rbtnTKMa.isSelected()) {
                        if (Ktra_MaKH(ma) == false) {
                            break;
                        } else if (kh.ma.equalsIgnoreCase(ma)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKHo.isSelected()) {
                        if (Ktra_Ho(ho) == false) {
                            break;
                        } else if (kh.ho.equalsIgnoreCase(ho)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKTen.isSelected()) {
                        if (Ktra_Ten(ten) == false) {
                            break;
                        } else if (kh.ten.equalsIgnoreCase(ten)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKSDT.isSelected()) {
                        if (Ktra_SoDienThoai(sdt) == false) {
                            break;
                        } else if (kh.sdt.equalsIgnoreCase(sdt)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục muốn tìm!");
            }
        }
    }//GEN-LAST:event_TKTen_keyPressed

    private void TKSdt_keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKSdt_keyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (rbtnTKMa.isSelected() || rbtnTKHo.isSelected() || rbtnTKTen.isSelected() || rbtnTKSDT.isSelected()) {
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    model.removeRow(i);
                }
                String ma = txtTKMa.getText().trim();
                String ho = txtTKHo.getText().trim();
                String ten = txtTKTen.getText().trim();
                String sdt = txtTKSDT.getText().trim();

                KhachHang_Controller bus = new KhachHang_Controller();
                if (KhachHang_Controller.dstkkh == null) {
                    bus.timkiem();
                }
                if (KhachHang_Controller.dstkkh != null) {
                    KhachHang_Controller.dstkkh.clear();
                }

                for (KhachHang_DTO kh : KhachHang_Controller.dskh) {
                    if (rbtnTKMa.isSelected()) {
                        if (Ktra_MaKH(ma) == false) {
                            break;
                        } else if (kh.ma.equalsIgnoreCase(ma)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKHo.isSelected()) {
                        if (Ktra_Ho(ho) == false) {
                            break;
                        } else if (kh.ho.equalsIgnoreCase(ho)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKTen.isSelected()) {
                        if (Ktra_Ten(ten) == false) {
                            break;
                        } else if (kh.ten.equalsIgnoreCase(ten)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                    if (rbtnTKSDT.isSelected()) {
                        if (Ktra_SoDienThoai(sdt) == false) {
                            break;
                        } else if (kh.sdt.equalsIgnoreCase(sdt)) {
                            KhachHang_Controller.dstkkh.add(kh);
                            HienthiDSKH(kh);
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Bạn chưa chọn mục muốn tìm!");
            }
        }
    }//GEN-LAST:event_TKSdt_keyPressed

    private void txtTKMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKMaFocusGained
        if (txtTKMa.getText().trim().toLowerCase().equals("nhập mã khách hàng cần tìm")) {
            txtTKMa.setText("");
            txtTKMa.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTKMaFocusGained

    private void txtTKMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKMaFocusLost
        if (txtTKMa.getText().trim().equals("") || txtTKMa.getText().trim().toLowerCase().equals("nhập mã khách hàng cần tìm")) {
            txtTKMa.setText("Nhập mã khách hàng cần tìm");
            txtTKMa.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtTKMaFocusLost

    private void txtTKHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKHoFocusGained
        if (txtTKHo.getText().trim().toLowerCase().equals("nhập họ lót cần tìm")) {
            txtTKHo.setText("");
            txtTKHo.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtTKHoFocusGained

    private void txtTKHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTKHoFocusLost
        if (txtTKHo.getText().trim().equals("") || txtTKHo.getText().trim().toLowerCase().equals("nhập họ lót cần tìm")) {
            txtTKHo.setText("Nhập họ lót cần tìm");
            txtTKHo.setForeground(new Color(102, 102, 102));
        }
    }//GEN-LAST:event_txtTKHoFocusLost

    private void rbtnTKMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTKMaActionPerformed
        if (rbtnTKMa.isSelected()) {
            txtTKMa.setEditable(true);
            txtTKHo.setEditable(false);
            txtTKTen.setEditable(false);
            txtTKSDT.setEditable(false);
        }
    }//GEN-LAST:event_rbtnTKMaActionPerformed

    private void rbtnTKHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTKHoActionPerformed
        if (rbtnTKHo.isSelected()) {
            txtTKMa.setEditable(false);
            txtTKHo.setEditable(true);
            txtTKTen.setEditable(false);
            txtTKSDT.setEditable(false);
        }
    }//GEN-LAST:event_rbtnTKHoActionPerformed

    private void rbtnTKTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTKTenActionPerformed
        if (rbtnTKTen.isSelected()) {
            txtTKMa.setEditable(false);
            txtTKHo.setEditable(false);
            txtTKTen.setEditable(true);
            txtTKSDT.setEditable(false);
        }
    }//GEN-LAST:event_rbtnTKTenActionPerformed

    private void rbtnTKSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTKSDTActionPerformed
        if (rbtnTKSDT.isSelected()) {
            txtTKMa.setEditable(false);
            txtTKHo.setEditable(false);
            txtTKTen.setEditable(false);
            txtTKSDT.setEditable(true);
        }
    }//GEN-LAST:event_rbtnTKSDTActionPerformed

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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                KH.setVisible(true);
                KH.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GroupTKKH;
    private javax.swing.JToggleButton btnDangNhap;
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JToggleButton btnDoanhThu;
    private javax.swing.JToggleButton btnDonHang;
    private javax.swing.JButton btnHienthi;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JToggleButton btnKhachHang;
    private javax.swing.JButton btnLienHe;
    private javax.swing.JToggleButton btnNhanVien;
    private javax.swing.JToggleButton btnNhapHang;
    private javax.swing.JToggleButton btnSanPham;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JToggleButton btnThongKe;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JToggleButton btnkhuyenMai;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lb_Diem;
    private javax.swing.JLabel lb_TKKH;
    private javax.swing.JPanel panel_ThongtinKH;
    private javax.swing.JRadioButton rbtnTKHo;
    private javax.swing.JRadioButton rbtnTKMa;
    private javax.swing.JRadioButton rbtnTKSDT;
    private javax.swing.JRadioButton rbtnTKTen;
    private javax.swing.JTable tableKhachhang;
    private javax.swing.JTabbedPane tbChitietKH;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTKHo;
    private javax.swing.JTextField txtTKMa;
    private javax.swing.JTextField txtTKSDT;
    private javax.swing.JTextField txtTKTen;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables

    void setComponentsNames() {
        txtHo.setName("Ho"); 
        txtMa.setName("Ma");
        txtTen.setName("Ten");
        txtSDT.setName("Sdt");
        txtDiem.setName("Diem");
        
        btnThem.setName("them");
        btnSua.setName("sua");
        btnXoa.setName("xoa");
        btnTimkiem.setName("timkiem");
        btnHienthi.setName("reload");
        
        lbMa.setName("ma");
        lbHo.setName("ho");
        lbTen.setName("ten");
        lbSdt.setName("sdt");
        lb_Diem.setName("diem");
        
        rbtnTKMa.setName("rbtnma");
        rbtnTKHo.setName("rbtnho");
        rbtnTKTen.setName("rbtnten");
        rbtnTKSDT.setName("rbtnsdt");
        
        txtTKMa.setName("TkHo"); 
        txtTKHo.setName("TkMa");
        txtTKTen.setName("TkTen");
        txtTKSDT.setName("TkSdt");
    }
}
