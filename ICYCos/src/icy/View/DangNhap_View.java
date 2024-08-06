/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.View;
import icy.Controller.DangKy_Controller;
import icy.Controller.DangNhap_Controller;
import icy.Controller.QLNV_Controller;
import icy.Controller.DangNhap_Controller;
import icy.Controller.QLNV_Controller;
import icy.View.taoMatKhau;
import icy.Model.DangKyDTO;
import icy.Model.QLNV_DTO;
import icy.Model.DangKyDTO;
import icy.Model.QLNV_DTO;
import static icy.View.BanHang_View.BH;
import static icy.View.HoTro_View.HT;
import static icy.View.KhachHang_View.KH;
import static icy.View.KhuyenMai_View.KM;
import static icy.View.NhapHang_View.NH;
import static icy.View.QLNV_View.NV;
import static icy.View.SanPham_View.SP;
import static icy.View.ThongKe_View.TK;
import icy.TrangChu_ICY;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Quan Phat Vinh Thanh
 */
public class DangNhap_View extends javax.swing.JFrame {

    public static DangNhap_View DN = new DangNhap_View();
    public static TrangChu_ICY TC = new TrangChu_ICY();
    public static BanHang_View BH = new BanHang_View();
    public static taoMatKhau MK = new taoMatKhau();
    QLNV_Controller busql = new QLNV_Controller();
    public static String txt;
    DangNhap_Controller bus = new DangNhap_Controller();
    DangKyDTO dk = new DangKyDTO();
    DangNhap_Controller busdk = new DangNhap_Controller();
    QLNV_DTO nv = new QLNV_DTO();
    static ArrayList<QLNV_DTO> dsnv = new ArrayList<>();
    static ArrayList<DangKyDTO> dsdk = new ArrayList<>();
    public DangNhap_View() {
        initComponents();
        if (QLNV_Controller.dsnv == null) {
            busql.docDSNV();
        }
        DocDuLieu();
    }
    public void DocDuLieu() {
        if (busdk.dsdk == null) {
            busdk.DocDSDN();
        }
    }
    public JButton getButton() {
        return btnDangNhap;
    }
    public String getTenTK() {
        return txtTaiKhoan.getText();
    }
    public void setComponentsNames() {
        btnDangNhap.setName("dn");
        txtTaiKhoan.setName("taikhoan");
        txtMatKhau.setName("matkhau");
        btnQuenMK.setName("quenmk");
    }
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        btnQuenMK = new javax.swing.JButton();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        E_tk = new javax.swing.JLabel();
        E_mk = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));

        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyPressed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(255, 204, 255));
        btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnQuenMK.setBackground(new java.awt.Color(255, 255, 204));
        btnQuenMK.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnQuenMK.setForeground(new java.awt.Color(255, 153, 153));
        btnQuenMK.setText("Quên mật khẩu ?");
        btnQuenMK.setBorder(null);
        btnQuenMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuenMKActionPerformed(evt);
            }
        });

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 255));
        jLabel1.setText("LOGIN NOW");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("User name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/TrangChu/TroVe.png"))); // NOI18N
        jButton2.setText("Trở về");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        E_tk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_tk.setForeground(new java.awt.Color(255, 0, 0));

        E_mk.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        E_mk.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(E_mk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                                    .addComponent(E_tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E_tk, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E_mk)
                .addGap(5, 5, 5)
                .addComponent(btnQuenMK, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icy/HinhAnh_ICY/ICY_Hinh_Dang_Nhap.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
         
          busdk.DocDSDN();
        if (txtMatKhau.getText().equals("") && txtTaiKhoan.getText().equals("")) {
            E_mk.setText("Vui lòng nhập đầy đủ thông tin !!! ");
        } //có đếm 
        else {
            E_mk.setText("");
            if (bus.TaiKhoan(txtTaiKhoan.getText()) == false) {
                E_tk.setVisible(true);
                E_tk.setText("Tên đăng nhập không hợp lệ");
            } else {
                E_tk.setText("");
                
                if (bus.MatKhau(txtMatKhau.getText(), txtTaiKhoan.getText()) == false) {
                    E_mk.setVisible(true);
                    E_mk.setText("Mật khẩu sai !!! ");
                } else {
                    E_mk.setText("");
                    bus.DangNhap(txtTaiKhoan.getText(), txtMatKhau.getText());
                    int d = 0;
                    String x = txtTaiKhoan.getText();
                    for (QLNV_DTO nv : QLNV_Controller.dsnv) {
                        if (bus.checkTaiKhoan(nv.Ma) == true) {
                            d++;
                            TrangChu_ICY tc = TrangChu_ICY.TC;
                            tc.setUser(x);
                            tc.setVisible(true);
                        }

                        txtTaiKhoan.setText("");
                        txtMatKhau.setText("");
                        DN.dispose();
                        setNullEross();
                    }
                    if (d == 0) {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy nhân viên");
                        txtTaiKhoan.setText("");
                        txtMatKhau.setText("");
                        System.out.println(d);
                        DN.setVisible(true);
                    }
                }
            }
        }

    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnQuenMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuenMKActionPerformed
        // TODO add your handling code here:
        
        if(txtTaiKhoan.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Để đổi mật khẩu,Tên tài khoản phải nhập đúng");
            setNullEross();
        }
        else if (bus.TaiKhoan(txtTaiKhoan.getText()) == false) {
                E_tk.setVisible(true);
                E_tk.setText("Tên đăng nhập không hợp lệ");
        }
        else if (bus.TaiKhoan(txtTaiKhoan.getText()) == true){
        setNullEross();
        taoMatKhau.MK.setVisible(true);
        taoMatKhau.MK.setLocationRelativeTo(null);
        DN.dispose();
        setNullEross();
        }
    }//GEN-LAST:event_btnQuenMKActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TrangChu_ICY.TC.setVisible(true);
        DN.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            txtMatKhau.requestFocus();
        }
    }//GEN-LAST:event_txtTaiKhoanKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER) {
            btnDangNhap.requestFocus();
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed

    }//GEN-LAST:event_txtTaiKhoanActionPerformed
   public void setNullEross(){
       E_mk.setText("");
       E_tk.setText("");
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DN.setVisible(true);
                DN.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel E_mk;
    private javax.swing.JLabel E_tk;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnQuenMK;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
