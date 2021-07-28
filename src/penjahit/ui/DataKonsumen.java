/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjahit.ui;


import Connection.KoneksiMysql;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dickacahya
 */
public class DataKonsumen extends javax.swing.JFrame {
  
    /**
     * Creates new form DataKonsumen
     */
    DefaultTableModel model;
    public DataKonsumen() {
        initComponents();
        String [] judul= {"ID Konsumen","Nama Konsumen","Alamat","No HP"};
        model = new DefaultTableModel(judul,0);
        tabelKonsumen.setModel(model);
        try {
            tampilkan();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKonsumen = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kembaliBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        tAlamat = new javax.swing.JTextField();
        tNoHp = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        hapusBtn = new javax.swing.JButton();
        tambahBtn = new javax.swing.JButton();
        SimpanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelKonsumen.setBackground(new java.awt.Color(255, 204, 204));
        tabelKonsumen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelKonsumen.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        tabelKonsumen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKonsumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKonsumenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKonsumen);

        jPanel1.setBackground(new java.awt.Color(255, 211, 155));

        jLabel1.setFont(new java.awt.Font("Exotc350 DmBd BT", 0, 36)); // NOI18N
        jLabel1.setText("Data Konsumen");

        kembaliBtn.setBackground(new java.awt.Color(255, 102, 102));
        kembaliBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kembaliBtn.setText("Keluar");
        kembaliBtn.setBorder(null);
        kembaliBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(kembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kembaliBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel2.setText("ID Konsumen");

        jLabel3.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel3.setText("Nama Konsumen");

        jLabel4.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Hobo Std", 0, 18)); // NOI18N
        jLabel5.setText("No. HP");

        tID.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N

        tNama.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N

        tAlamat.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N

        tNoHp.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N

        resetBtn.setBackground(new java.awt.Color(255, 204, 102));
        resetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.setBorder(null);
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 204, 153));
        editBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editBtn.setText("Edit");
        editBtn.setBorder(null);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        hapusBtn.setBackground(new java.awt.Color(255, 204, 153));
        hapusBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hapusBtn.setText("Hapus");
        hapusBtn.setBorder(null);
        hapusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusBtnActionPerformed(evt);
            }
        });

        tambahBtn.setBackground(new java.awt.Color(255, 204, 153));
        tambahBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tambahBtn.setText("Tambah ");
        tambahBtn.setBorder(null);
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        SimpanBtn.setBackground(new java.awt.Color(255, 204, 153));
        SimpanBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SimpanBtn.setText("Simpan");
        SimpanBtn.setBorder(null);
        SimpanBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SimpanBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(tambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tNoHp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNoHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SimpanBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SimpanBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SimpanBtnMouseClicked
        // TODO add your handling code here:
        try{
            String sql = "insert into data_konsumen values"+"('" + tID.getText() +"','"
                    +tNama.getText() + "','" +tAlamat.getText() +"','" +tNoHp.getText() + "')";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            tampilkan();
            
            
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Menyimpan" + e.getMessage());
        }
    }//GEN-LAST:event_SimpanBtnMouseClicked

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        // TODO add your handling code here:
           try{
            //mengkoneksikan ke database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            //pemanggilan untuk menambahkan data
            conn.createStatement().executeUpdate("insert into data_konsumen values"+""
                    + "('"+tID.getText()+"','"+tNama.getText()+"','"+tAlamat.getText()+"','"+tNoHp.getText()+"')");
            
            tampilkan();
            reset();
            
            JOptionPane.showMessageDialog(null, "Berhasil Menambah");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Gagal Menambah" + e.getMessage());
        }
    }//GEN-LAST:event_tambahBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
       
            // TODO add your handling code here:
             try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            conn.createStatement().executeLargeUpdate("update data_konsumen set nama_konsumen ="
                    + "'"+tNama.getText()+"',alamat_konsumen ='"+tAlamat.getText()
                    +"',no_hp ='"+tNoHp.getText()+"' where id_konsumen ='"
                    +tID.getText()+"'");    //untuk mengupdate salah satu data dipatok dari id konsumen
            tampilkan();
          
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void tabelKonsumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKonsumenMouseClicked
        // TODO add your handling code here:
        //jika di klik data keluar supaya bisa diedit
        int i = tabelKonsumen.getSelectedRow();
        if (i>-1){
            tID.setText(model.getValueAt(i, 0).toString());
            tNama.setText(model.getValueAt(i, 1).toString());
            tAlamat.setText(model.getValueAt(i, 2).toString());
            tNoHp.setText(model.getValueAt(i, 3).toString());
        }
    }//GEN-LAST:event_tabelKonsumenMouseClicked

    private void hapusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusBtnActionPerformed
        
            // TODO add your handling code here:
            try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
            conn.createStatement().executeUpdate("delete from data_konsumen where id_konsumen ='"+ tID.getText()+ "'"); 
            
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus", "Pesan", JOptionPane.INFORMATION_MESSAGE);

            tampilkan();
           
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal di hapus" + ex.getMessage(), "Pesan", JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_hapusBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void kembaliBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliBtnActionPerformed
        // TODO add your handling code here:
        //untuk kembali menuju home
       
       home kembali = new home();   //membuat home dengan inisialisasi baru
       kembali.setVisible(true);    //jframe home muncul  
       this.dispose();  //untuk jframe data konsumen tidak muncul
       
    }//GEN-LAST:event_kembaliBtnActionPerformed
//method untuk memanggil reset
    private void reset(){
    tID.setText("");
    tNama.setText("");
    tAlamat.setText("");
    tNoHp.setText("");
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
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataKonsumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SimpanBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton hapusBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kembaliBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField tAlamat;
    private javax.swing.JTextField tID;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNoHp;
    private javax.swing.JTable tabelKonsumen;
    private javax.swing.JButton tambahBtn;
    // End of variables declaration//GEN-END:variables

    //method untuk memanggil data konsumen pada database
    private void tampilkan() throws SQLException {
        int row =tabelKonsumen.getRowCount();
        for(int a= 0; a<row;a++){
            model.removeRow(0);
        }
        try{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/penjahit","root","");
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM data_konsumen");
        while(rs.next()){
            String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)};
            model.addRow(data);
        } 
    } catch (SQLException ex){
        java.util.logging.Logger.getLogger(DataKonsumen.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
        }
}
}

  

 

