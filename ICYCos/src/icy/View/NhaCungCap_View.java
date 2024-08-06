/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package icy.View;

import icy.Controller.NhaCungCap_Controller;
import icy.Model.NhaCungCap_DTO;
import java.awt.Color;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class NhaCungCap_View extends javax.swing.JFrame {
    DefaultTableModel model=new DefaultTableModel();
    public static NhaCungCap_View NCC=new NhaCungCap_View();
    NhaCungCap_Controller bus=new NhaCungCap_Controller();
    NhaCungCap_DTO ncc=new NhaCungCap_DTO();
    NhapHang_View nh =new NhapHang_View();
    /**
     * Creates new form NhaCungCap_GUI
     */
    public NhaCungCap_View() {
        initComponents();
        DocNCC();
    }
public void DocNCC(){
        if (NhaCungCap_Controller.dsncc == null) {
            bus.DocNCC();
        }
        //cập nhật Jtable
        Vector header = new Vector();
        header.add("Mã NCC");//tên cột table
        header.add("Tên NCC");
        header.add("Địa chỉ");
        header.add("SĐT");
        if (model.getRowCount() == 0) {
            model = new DefaultTableModel(header, 0);
        }
        for (NhaCungCap_DTO ncc : NhaCungCap_Controller.dsncc) {
            //nạp dữ liệu cho mỗi row
            Vector row = new Vector();
            row.add(ncc.MaNCC);
            row.add(ncc.TenNCC);
            row.add(ncc.DiaChi);
            row.add(ncc.SDT);
            model.addRow(row); //thêm row dữ liệu vào model
            tblNCC.setModel(model);
        }
    }
    public boolean maDuyNhat(String x){
        for(NhaCungCap_DTO ncc: bus.dsncc){
            if(ncc.MaNCC.equalsIgnoreCase(x))
                return false;
        }
        return true;
    }
    StringBuilder sb = new StringBuilder();
    public boolean KiemTraGiaTri(){
        if (txtMaNCC.getText().equals("") || txtMaNCC.getText().equals("Nhập mã")) {
            sb.append("Mã NCC không được để trống! \n");
            txtMaNCC.setBackground(Color.PINK);
        } else {
            txtMaNCC.setBackground(Color.white);
        }
        if (txtTenNCC.getText().equals("") || txtTenNCC.getText().equals("Nhập tên")) {
            sb.append("Tên NCC không được để trống! \n");
            txtTenNCC.setBackground(Color.PINK);
        } else {
            txtTenNCC.setBackground(Color.white);
        }
        if (txtDiaChi.getText().equals("") || txtDiaChi.getText().equals("Nhập địa chỉ")) {
            sb.append("Địa chỉ không được để trống! \n");
            txtDiaChi.setBackground(Color.PINK);
        } else {
            txtDiaChi.setBackground(Color.white);
        }
        if (txtSDT.getText().equals("") || txtSDT.getText().equals("Nhập SDT")) {
            sb.append("SĐT không được để trống! \n");
            txtSDT.setBackground(Color.PINK);
        } else {
            txtSDT.setBackground(Color.white);
        }
        if (sb.length() > 0) {
            return false;
        }else
        return true;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNCC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenNCC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnChon = new javax.swing.JButton();
        btnTroVe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        tblNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NCC", "Tên NCC", "Địa chỉ", "SĐT"
            }
        ));
        tblNCC.setGridColor(new java.awt.Color(255, 204, 204));
        tblNCC.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tblNCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNCCMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNCC);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 102));
        jLabel1.setText("Danh sách nhà cung cấp");

        jLabel2.setText("Mã NCC");

        jLabel3.setText("Tên NCC");

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("SĐT");

        btnThem.setBackground(new java.awt.Color(255, 204, 102));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 204, 102));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 204, 102));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnChon.setBackground(new java.awt.Color(255, 204, 102));
        btnChon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnChon.setText("Chọn");
        btnChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonActionPerformed(evt);
            }
        });

        btnTroVe.setBackground(new java.awt.Color(153, 153, 153));
        btnTroVe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTroVe.setText("Trở về");
        btnTroVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroVeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaNCC)
                            .addComponent(txtTenNCC)
                            .addComponent(txtDiaChi)
                            .addComponent(txtSDT)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(btnChon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTroVe)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem)
                            .addComponent(btnXoa))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnChon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnTroVe)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if(maDuyNhat(txtMaNCC.getText())==true && KiemTraGiaTri()==true){
        ncc.MaNCC = txtMaNCC.getText();
        ncc.TenNCC = txtTenNCC.getText();
        ncc.DiaChi = txtDiaChi.getText();
        ncc.SDT = txtSDT.getText();
        bus.them(ncc);
        //nạp dữ liệu cho mỗi row
        Vector row = new Vector();
        row.add(ncc.MaNCC);
        row.add(ncc.TenNCC);
        row.add(ncc.DiaChi);
        row.add(ncc.SDT);
        model.addRow(row); //thêm row dữ liệu vào model
        //nạp du lieu cua model vào jtable tblDSSV
        tblNCC.setModel(model);
        JOptionPane.showMessageDialog(this,"thêm thành công!");
        }else{
            if(maDuyNhat(txtMaNCC.getText())==false)
                JOptionPane.showMessageDialog(this,"Mã NCC đã tồn tại!");
            else if(KiemTraGiaTri()==false){
                JOptionPane.showMessageDialog(this, sb.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                sb.delete(0, sb.length());
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //giu lai sp trc khi sua
        NhaCungCap_DTO old = bus.dsncc.set(tblNCC.getSelectedRow(), ncc);
        if (tblNCC.getSelectedRow()>=0){
        ncc.TenNCC = txtTenNCC.getText();
        ncc.DiaChi = txtDiaChi.getText();
        ncc.SDT = txtSDT.getText();
        bus.sua(ncc);
        //cap nhập dssv
        model.setValueAt(ncc.TenNCC, tblNCC.getSelectedRow(), 1);
        model.setValueAt(ncc.DiaChi, tblNCC.getSelectedRow(), 2);
        model.setValueAt(ncc.SDT, tblNCC.getSelectedRow(), 3);
        tblNCC.setModel(model);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int i=tblNCC.getSelectedRow();
        String ma=txtMaNCC.getText();
        if (i == -1) {
            JOptionPane.showMessageDialog(this, "Bạn cần chọn NCC để xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int x = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!");
            if (x == JOptionPane.YES_OPTION) {
                if (i >= 0) {
                    bus.xoa(ma);
                    NhaCungCap_Controller.dsncc.remove(i);
                    model.removeRow(i);
                    tblNCC.setModel(model);
                }
            }
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblNCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNCCMouseClicked
        int i = tblNCC.getSelectedRow();
        if (i >= 0) {
            ncc = bus.dsncc.get(i);
            txtMaNCC.setText(ncc.MaNCC);
            txtTenNCC.setText(ncc.TenNCC);
            txtDiaChi.setText(ncc.DiaChi);
            txtSDT.setText(ncc.SDT);
        }
    }//GEN-LAST:event_tblNCCMouseClicked

    private void btnChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonActionPerformed
        nh.NH.setTextNCC(txtTenNCC.getText());
        NCC.setVisible(false);
    }//GEN-LAST:event_btnChonActionPerformed

    private void btnTroVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroVeActionPerformed
        NCC.setVisible(false);
    }//GEN-LAST:event_btnTroVeActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NhaCungCap_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhaCungCap_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NCC.setVisible(true);
                NCC.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChon;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTroVe;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNCC;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtMaNCC;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNCC;
    // End of variables declaration//GEN-END:variables
}
