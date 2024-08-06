package icy.View;

import icy.Controller.KhachHang_Controller;
import icy.Model.KhachHang_DTO;
import java.awt.Color;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TKKhachHang_View extends javax.swing.JFrame {
    public static TKKhachHang_View TKKH=new TKKhachHang_View();
    DefaultTableModel model = new DefaultTableModel();
    
    public TKKhachHang_View() {
        initComponents();
        DocDSKH();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lbTuade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachhang = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lbMa = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        lbHo = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        lbTen = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        lbSdt = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        lbDiem = new javax.swing.JLabel();
        txtDiem = new javax.swing.JTextField();
        btnTrove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTuade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTuade.setForeground(new java.awt.Color(102, 102, 255));
        lbTuade.setText("Bảng thống kê khách hàng");

        tblKhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachhang);

        lbMa.setText("Mã khách hàng");
        lbMa.setName("lb_Ma"); // NOI18N

        txtMa.setForeground(new java.awt.Color(153, 153, 153));
        txtMa.setText("Nhập mã");
        txtMa.setName("txt_Ma"); // NOI18N
        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });
        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaKeyPressed(evt);
            }
        });

        lbHo.setText("Họ lót");
        lbHo.setName("lb_Ho"); // NOI18N

        txtHo.setForeground(new java.awt.Color(153, 153, 153));
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

        lbTen.setText("Tên");
        lbTen.setName("lb_Ten"); // NOI18N

        txtTen.setForeground(new java.awt.Color(153, 153, 153));
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

        lbSdt.setText("Số điện thoại");
        lbSdt.setName("lb_SDT"); // NOI18N

        txtSDT.setForeground(new java.awt.Color(153, 153, 153));
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

        lbDiem.setText("Điểm tích lũy");
        lbDiem.setName("lb_Diachi"); // NOI18N

        txtDiem.setForeground(new java.awt.Color(153, 153, 153));
        txtDiem.setText("Số nhà");
        txtDiem.setName("txt_Diachi"); // NOI18N
        txtDiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDiemFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbMa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbTen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMa)
                            .addComponent(txtHo, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                            .addComponent(txtDiem))))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMa)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHo)
                    .addComponent(txtHo))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTen)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSdt)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiem)
                    .addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btnTrove.setBackground(new java.awt.Color(204, 204, 204));
        btnTrove.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnTrove.setText("Trở về");
        btnTrove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTroveActionPerformed(evt);
            }
        });
        btnTrove.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTroveKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrove)
                        .addGap(36, 36, 36))))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(lbTuade)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTuade)
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrove)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DocDSKH(){
        KhachHang_Controller bus = new KhachHang_Controller();
        if(KhachHang_Controller.dskh == null) bus.DocDSKH();
        Vector header = new Vector();
        header.add("Mã khách hàng");
        header.add("Họ lót");
        header.add("Tên");
        header.add("Số điện thoại");
        header.add("Địa chỉ");
        model = new DefaultTableModel(header, 0);
        for(KhachHang_DTO kh : KhachHang_Controller.dskh){
            Vector row = new Vector();
            row.add(kh.ma);
            row.add(kh.ho);
            row.add(kh.ten);
            row.add(kh.sdt);
            row.add(kh.diemtichluy);
            model.addRow(row);
        }
        tblKhachhang.setModel(model);
    }
    
    private void txtMaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusGained
        if (txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("");
            txtMa.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtMaFocusGained

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        if (txtMa.getText().trim().equals("") || txtMa.getText().trim().toLowerCase().equals("nhập mã")) {
            txtMa.setText("Nhập mã");
            txtMa.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtMaFocusLost

    private void txtMaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtHo.requestFocus();
    }//GEN-LAST:event_txtMaKeyPressed

    private void txtHoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusGained
        if (txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("");
            txtHo.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtHoFocusGained

    private void txtHoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHoFocusLost
        if (txtHo.getText().trim().equals("") || txtHo.getText().trim().toLowerCase().equals("nhập họ lót")) {
            txtHo.setText("Nhập họ lót");
            txtHo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtHoFocusLost

    private void txtHoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtTen.requestFocus();
    }//GEN-LAST:event_txtHoKeyPressed

    private void txtTenFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusGained
        if (txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("");
            txtTen.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtTenFocusGained

    private void txtTenFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenFocusLost
        if (txtTen.getText().trim().equals("") || txtTen.getText().trim().toLowerCase().equals("nhập tên")) {
            txtTen.setText("Nhập tên");
            txtTen.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtTenFocusLost

    private void txtTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtSDT.requestFocus();
    }//GEN-LAST:event_txtTenKeyPressed

    private void txtSDTFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusGained
        if (txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("");
            txtSDT.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtSDTFocusGained

    private void txtSDTFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSDTFocusLost
        if (txtSDT.getText().trim().equals("") || txtSDT.getText().trim().toLowerCase().equals("nhập số điện thoại")) {
            txtSDT.setText("Nhập số điện thoại");
            txtSDT.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSDTFocusLost

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtDiem.requestFocus();
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtDiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiemFocusGained
        if (txtDiem.getText().trim().toLowerCase().equals("điểm tích lũy")) {
            txtDiem.setText("");
            txtDiem.setForeground(new Color(102, 0, 51));
        }
    }//GEN-LAST:event_txtDiemFocusGained

    private void txtDiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDiemFocusLost
        if (txtDiem.getText().trim().equals("") || txtDiem.getText().trim().toLowerCase().equals("điểm tích lũy")) {
            txtDiem.setText("Điểm tích lũy");
            txtDiem.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDiemFocusLost

    private void btnTroveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTroveKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            txtMa.requestFocus();
    }//GEN-LAST:event_btnTroveKeyPressed

    private void tblKhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachhangMouseClicked
        int i = tblKhachhang.getSelectedRow();
        //JOptionPane.showMessageDialog(null, "row:"+i);
        if (i >= 0) {
            KhachHang_DTO kh = new KhachHang_DTO();
            if(KhachHang_Controller.dstkkh == null || KhachHang_Controller.dstkkh.size() == 0)
                kh = KhachHang_Controller.dskh.get(i);
            else
                kh = KhachHang_Controller.dstkkh.get(i);
            txtMa.setText(kh.ma);
            txtHo.setText(kh.ho);
            txtTen.setText(kh.ten);
            txtSDT.setText(kh.sdt);
            txtDiem.setText(kh.diemtichluy);
            txtMa.setForeground(new Color(102,0,51));
            txtHo.setForeground(new Color(102,0,51));
            txtTen.setForeground(new Color(102,0,51));
            txtSDT.setForeground(new Color(102,0,51));
            txtDiem.setForeground(new Color(102,0,51));
        }
    }//GEN-LAST:event_tblKhachhangMouseClicked

    private void btnTroveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTroveActionPerformed
        TKKH.setVisible(false);
    }//GEN-LAST:event_btnTroveActionPerformed

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
            java.util.logging.Logger.getLogger(TKKhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TKKhachHang_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TKKH.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrove;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDiem;
    private javax.swing.JLabel lbHo;
    private javax.swing.JLabel lbMa;
    private javax.swing.JLabel lbSdt;
    private javax.swing.JLabel lbTen;
    private javax.swing.JLabel lbTuade;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblKhachhang;
    private javax.swing.JTextField txtDiem;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
