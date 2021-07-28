/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjahit.ui;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author LENOVO
 */
public class modelPakaian extends javax.swing.JFrame {

    /** Creates new form modelPakaian */
    DefaultTableModel model;
    public modelPakaian() {
        initComponents();
        String [] judul= {"ID Model","Nama","Bahan","Jenis Pakaian"};
        model = new DefaultTableModel(judul,0);
        tabelpesan.setModel(model);
        try {
            tampilkan();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        keluarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpesan = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cbJP = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tbahan = new javax.swing.JTextField();
        tnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tIDpesan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ukuranBtn = new javax.swing.JButton();
        hpsBtn = new javax.swing.JButton();
        tambahBtn = new javax.swing.JButton();
        simpanBtn = new javax.swing.JButton();
        cetakbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(238, 216, 174));

        jLabel1.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 36)); // NOI18N
        jLabel1.setText("Form Pesanan");

        keluarBtn.setBackground(new java.awt.Color(255, 102, 102));
        keluarBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        keluarBtn.setText("Keluar");
        keluarBtn.setBorder(null);
        keluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(keluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(keluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        tabelpesan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpesan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpesanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpesan);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Jenis Pakaian");

        cbJP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbJP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baju", "Celana", "Rok", "Kemeja" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Bahan Kain");

        tbahan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tnama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama ");

        tIDpesan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("ID");

        ukuranBtn.setBackground(new java.awt.Color(255, 204, 153));
        ukuranBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ukuranBtn.setText("Ukuran");
        ukuranBtn.setBorder(null);
        ukuranBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ukuranBtnActionPerformed(evt);
            }
        });

        hpsBtn.setBackground(new java.awt.Color(255, 204, 153));
        hpsBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hpsBtn.setText("Hapus");
        hpsBtn.setBorder(null);
        hpsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsBtnActionPerformed(evt);
            }
        });

        tambahBtn.setBackground(new java.awt.Color(255, 204, 153));
        tambahBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tambahBtn.setText("Tambah");
        tambahBtn.setBorder(null);
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        simpanBtn.setBackground(new java.awt.Color(255, 204, 153));
        simpanBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        simpanBtn.setText("Simpan");
        simpanBtn.setBorder(null);
        simpanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanBtnMouseClicked(evt);
            }
        });

        cetakbtn.setBackground(new java.awt.Color(255, 204, 153));
        cetakbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cetakbtn.setText("Cetak");
        cetakbtn.setBorder(null);
        cetakbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(new java.awt.Color(255, 204, 153));
        editbtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editbtn.setText("Edit");
        editbtn.setBorder(null);
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(83, 83, 83)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbJP, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tnama, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tIDpesan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
                                .addComponent(tbahan, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ukuranBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(hpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(simpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cetakbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tIDpesan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tbahan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cbJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ukuranBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hpsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cetakbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(simpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarBtnActionPerformed
        // TODO add your handling code here:
        home kembali = new home();
        kembali.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_keluarBtnActionPerformed

    private void ukuranBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ukuranBtnActionPerformed
        // TODO add your handling code here:
        ukuran Ukuran = new ukuran();
        Ukuran.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ukuranBtnActionPerformed

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
      
        
         try{
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            conn.createStatement().executeUpdate("insert into model_pakaian values"+"('"+tIDpesan.getText()+"','"+tnama.getText()+"','"+tbahan.getText()+"','"+cbJP.getSelectedItem()+"')");
            tampilkan();
            
            
            JOptionPane.showMessageDialog(null, "Berhasil Menambah");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Menambah" + e.getMessage());
        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void hpsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsBtnActionPerformed

        // TODO add your handling code here:
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            conn.createStatement().executeUpdate("delete from model_pakaian where id_model ='"+ tIDpesan.getText()+ "'");
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);

            tampilkan();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal di hapus" + ex.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_hpsBtnActionPerformed

    private void tabelpesanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpesanMouseClicked
        // TODO add your handling code here:
         int i = tabelpesan.getSelectedRow();
        if (i>-1){
            tIDpesan.setText(model.getValueAt(i, 0).toString());
            tnama.setText(model.getValueAt(i, 1).toString());
            tbahan.setText(model.getValueAt(i, 2).toString());
            cbJP.setSelectedItem(model.getValueAt(i, 3).toString());
        }   
    }//GEN-LAST:event_tabelpesanMouseClicked

    private void simpanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanBtnMouseClicked
        // TODO add your handling code here:
            try{
            String sql = "insert into model_pakaian values"+"('" + tIDpesan.getText() +"','"+tnama.getText()+"','"
                    +"','"+cbJP.getSelectedItem()+"','" +tbahan.getText()  + "')";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            tampilkan();
            
            
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + ex.getMessage());
        }
 
    }//GEN-LAST:event_simpanBtnMouseClicked

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
       try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            conn.createStatement().executeLargeUpdate("update model_pakaian set nama ='"+tnama.getText()+"',bahan_kain ='"+tbahan.getText()+"',jenis_pakaian ='"+cbJP.getSelectedItem()+"' where id_model ='"+tIDpesan.getText()+"'");
            tampilkan();
            //reset();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void cetakbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakbtnActionPerformed
        // TODO add your handling code here:
         try{
          
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
          File file = new File("src/report/pemesanan.jasper");
          JasperReport jr = (JasperReport) JRLoader.loadObject(file);
          JasperPrint jp = JasperFillManager.fillReport(file.getPath(), null, conn);
          JasperViewer.viewReport(jp, false);
         JasperViewer.setDefaultLookAndFeelDecorated(true);
      }catch(Exception e){
          javax.swing.JOptionPane.showMessageDialog(null, "Data Tidak Dapat di Cetak!"+"\n"+ e.getMessage(), "Cetak Data", javax.swing.JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_cetakbtnActionPerformed
  private void tampilkan() throws SQLException {
        int row = tabelpesan.getRowCount();
        for(int a= 0; a<row;a++){
            model.removeRow(0);
        }
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM model_pakaian");
        while(rs.next()){
            String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
            model.addRow(data);
        } 
    } catch (SQLException ex){
        java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
  }
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
            java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modelPakaian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modelPakaian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJP;
    private javax.swing.JButton cetakbtn;
    private javax.swing.JButton editbtn;
    private javax.swing.JButton hpsBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarBtn;
    private javax.swing.JButton simpanBtn;
    private javax.swing.JTextField tIDpesan;
    private javax.swing.JTable tabelpesan;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JTextField tbahan;
    private javax.swing.JTextField tnama;
    private javax.swing.JButton ukuranBtn;
    // End of variables declaration//GEN-END:variables
        }
