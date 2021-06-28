/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dosen;

import Main.MenuDosen;
import config.connectdb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author H P
 */
public class PenilaianPKN extends javax.swing.JFrame {

    String nama_dsn, email_dsn;
    DefaultTableModel tableadmin;
    String id_nim,id_nama,id_nilaiD;
    double id_nilaiP;
    /**
     * Creates new form PenilaianPKN
     */
    public PenilaianPKN() {
        setResizable(false);
        dsnlogin();
        initComponents();
        TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablenilai = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnunduh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnilailaporan = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnilaidsn = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PENILAIAN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton1.setText("Nilai");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jButton1)))
        );

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));

        jLabel7.setFont(new java.awt.Font("NewsGoth Lt BT", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("UMM - 2021");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablenilai.setModel(new javax.swing.table.DefaultTableModel(
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
        tablenilai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenilaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablenilai);

        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariKeyReleased(evt);
            }
        });

        jLabel3.setText("Search");

        btnunduh.setText("Download Laporan");
        btnunduh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnunduhActionPerformed(evt);
            }
        });

        jLabel4.setText("Nilai Laporan");

        jLabel2.setText("Nilai Ujian");

        txtnilaidsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnilaidsnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(btnunduh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnilaidsn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtnilailaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnunduh)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnilailaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnilaidsn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(784, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void TampilData() {
        tableadmin = new DefaultTableModel();
        tableadmin.addColumn("NIM");
        tableadmin.addColumn("NAMA MAHASISWA");
        tableadmin.addColumn("NILAI DOSEN");
        
        tablenilai.setModel(tableadmin);
        Connection conn = connectdb.tryConnect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            String sql = "select * from nilai where dsn_penguji='"+nama_dsn+"'";
            java.sql.ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                tableadmin.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("nilai_dsn")
                });
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        MenuDosen frm = new MenuDosen();
        frm.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtnilaidsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnilaidsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnilaidsnActionPerformed

    private void tablenilaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenilaiMouseClicked
        int baris = tablenilai.getSelectedRow();
        id_nim = tableadmin.getValueAt(baris, 0).toString();
        id_nama = tableadmin.getValueAt(baris, 1).toString();
        id_nilaiD = tableadmin.getValueAt(baris, 2).toString();
        
        Connection conn = connectdb.tryConnect();
        try {
            java.sql.Statement stmt = conn.createStatement();
            String sql = "select * from nilai where nim='"+id_nim+"'";
            java.sql.ResultSet res = stmt.executeQuery(sql);
            while (res.next()) {
                
                id_nilaiP = Double.parseDouble(res.getString("nilai_perusahaan"));
            }
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tablenilaiMouseClicked

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariActionPerformed

    private void cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariKeyReleased
        String key = cari.getText();

        if(key!=""){
            cariData(key);
        }else{
            TampilData();
        }
    }//GEN-LAST:event_cariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        double total;
        double id_nilaiL = Double.parseDouble(txtnilailaporan.getText());
        double id_nilaiU = Double.parseDouble(txtnilaidsn.getText());
        double id_nilaiD = (id_nilaiL+id_nilaiU)/2;
        total = 0.6 * id_nilaiP + 0.4*id_nilaiD;
        
        String nilaiTotal = String.format("%.2f", total);
        String nilaiD = String.format("%.2f", id_nilaiD);
        try {
            Connection conn = connectdb.tryConnect();
            PreparedStatement stmt = conn.prepareStatement("update nilai set nilai_dsn='"+ nilaiD+"', nilai_total='"+nilaiTotal+"' where nim='"+id_nim+"'");
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            TampilData();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnunduhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnunduhActionPerformed
        try {
            Connection conn = connectdb.tryConnect();
            Statement stat = conn.createStatement();
            String sql = "select uploadlaporan from ujian where nim='"+id_nim+"'";
            ResultSet res = stat.executeQuery(sql);
            
            String namafile = String.format("File\\Laporan\\Laporan_%s.pdf",id_nim);
            File file = new File(namafile);
            FileOutputStream output = new FileOutputStream(file);
            
            if(res.next()){
                InputStream input = res.getBinaryStream("uploadlaporan");
                byte[] buffer = new byte[1024];
                
                while(input.read(buffer)>0){
                    output.write(buffer);
                }
            }
            output.close();
            
            JOptionPane.showMessageDialog(null, "File Saved in " + file.getAbsoluteFile(), "pesan", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println(file.getAbsoluteFile());
            
            
        }  catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnunduhActionPerformed

    public void cariData(String key){
        Connection con = connectdb.tryConnect();
        
            tableadmin = new DefaultTableModel();
            tableadmin.addColumn("NIM");
            tableadmin.addColumn("NAMA MAHASISWA");
            tableadmin.addColumn("NILAI DOSEN");
        
            tablenilai.setModel(tableadmin);
        
        try {
            java.sql.Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery("SELECT * from nilai WHERE nim LIKE '%"+key+"%' OR nama LIKE '%"+key+"%' OR nilai_dsn LIKE '%"+key+"%'");  

            while (res.next() && res.getString("dsn_penguji").equals(nama_dsn)) {
               
                tableadmin.addRow(new Object[]{
                    res.getString("nim"),
                    res.getString("nama"),
                    res.getString("nilai_dsn")
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(JadwalUjian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void downloadFile(){
        try {
            Connection conn = connectdb.tryConnect();
            Statement stat = conn.createStatement();
            String sql = "select uploadlaporan from ujian where nim='"+id_nim+"'";
            ResultSet res = stat.executeQuery(sql);
            
            String namafile = String.format("Laporan_%s.pdf",id_nim);
            File file = new File(namafile);
            FileOutputStream output = new FileOutputStream(file);
            
            if(res.next()){
                InputStream input = res.getBinaryStream("uploadlaporan");
                byte[] buffer = new byte[1024];
                
                while(input.read(buffer)>0){
                    output.write(buffer);
                }
            }
            output.close();
            
            JOptionPane.showMessageDialog(null, "File Saved in " + file.getAbsoluteFile(), "pesan", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println(file.getAbsoluteFile());
            
            
        }  catch (Exception ex) {
            ex.printStackTrace();
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
            java.util.logging.Logger.getLogger(PenilaianPKN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenilaianPKN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenilaianPKN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenilaianPKN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenilaianPKN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnunduh;
    private javax.swing.JTextField cari;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablenilai;
    private javax.swing.JTextField txtnilaidsn;
    private javax.swing.JTextField txtnilailaporan;
    // End of variables declaration//GEN-END:variables

    public void dsnlogin(){
        FileReader file;
        BufferedReader buff;
        try {
            file = new FileReader("dsn.txt");
            buff = new BufferedReader(file);
        
            String data = buff.readLine();
            StringTokenizer token = new StringTokenizer(data, ",");
            nama_dsn = token.nextToken();
            email_dsn = token.nextToken();
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MenuDosen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MenuDosen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
