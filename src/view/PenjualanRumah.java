/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.KoneksiDB;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.DataRumah;

/**
 *
 * @author andi
 */
public class PenjualanRumah extends javax.swing.JPanel {
    private int luasTanah=0;
    private static final KoneksiDB koneksi=new KoneksiDB();
    static Connection connection; 
    int jml;
    String dt;
    ResultSet rs;
    int hrgTanah=0,hrgBangunan=0,harga=0,PPn=0,cicilanBln=0;
    String tipe;
    /**
     * Creates new form PenjualanRumah
     * @throws java.lang.ClassNotFoundException
     */
    public PenjualanRumah() throws ClassNotFoundException {
        initComponents();
        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        bacaDataComboBox();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        namaPemesanTextField = new javax.swing.JTextField();
        hargaTanahTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        areaComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hargaBangunanTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        radioTipe36 = new javax.swing.JRadioButton();
        radioTipe45 = new javax.swing.JRadioButton();
        radioTipe54 = new javax.swing.JRadioButton();
        luasTanahTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        luasTanahTersedia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hargaTextField = new javax.swing.JTextField();
        DP = new javax.swing.JTextField();
        cicilan = new javax.swing.JTextField();
        ppnTextField = new javax.swing.JTextField();
        cicilanPerBulanTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cek = new javax.swing.JCheckBox();
        buttonProses = new javax.swing.JButton();
        simpanButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelGambar = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(674, 362));

        jLabel1.setText("Nama Pemesan");

        jLabel2.setText("Harga Tanah/m2");

        jLabel3.setText("Area");

        areaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Harga Bangunan");

        jLabel6.setText("Cicilan/bln");

        jLabel7.setText("Lama cicilan");

        jLabel8.setText("PPN (10%)");

        jLabel9.setText("Tipe Rumah");

        buttonGroup.add(radioTipe36);
        radioTipe36.setText("Tipe-36");
        radioTipe36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipe36ActionPerformed(evt);
            }
        });

        buttonGroup.add(radioTipe45);
        radioTipe45.setText("Tipe-45");
        radioTipe45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipe45ActionPerformed(evt);
            }
        });

        buttonGroup.add(radioTipe54);
        radioTipe54.setText("Tipe-54");
        radioTipe54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTipe54ActionPerformed(evt);
            }
        });

        jLabel10.setText("Luas Tanah Tersedia");

        jLabel11.setText("Harga");

        jLabel12.setText("DP");

        jLabel13.setText("Bulan");

        cek.setText("Setuju");
        cek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cekMouseClicked(evt);
            }
        });

        buttonProses.setText("Proses");
        buttonProses.setEnabled(false);
        buttonProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonProsesActionPerformed(evt);
            }
        });

        simpanButton.setText("Simpan");
        simpanButton.setEnabled(false);
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel14.setText("Luas Tanah Asli");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaTanahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPemesanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioTipe45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(radioTipe54)
                                    .addGap(21, 21, 21)
                                    .addComponent(jLabel10)
                                    .addGap(65, 65, 65))
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(cicilanPerBulanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cek))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(30, 30, 30)
                                        .addComponent(ppnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cicilan, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(luasTanahTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(radioTipe36))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(buttonProses)
                                .addGap(18, 18, 18)
                                .addComponent(simpanButton)
                                .addGap(17, 17, 17)
                                .addComponent(clearButton)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addGap(236, 236, 236))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hargaBangunanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(luasTanahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(namaPemesanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(hargaBangunanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaTanahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioTipe36)
                                    .addComponent(luasTanahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(radioTipe45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioTipe54)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addComponent(luasTanahTersedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(hargaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cicilan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ppnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cicilanPerBulanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cek))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonProses)
                    .addComponent(simpanButton)
                    .addComponent(clearButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void areaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaComboBoxActionPerformed
        dataComboBox();
    }//GEN-LAST:event_areaComboBoxActionPerformed

    private void radioTipe36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipe36ActionPerformed
       
        luasTanah=90;
        luasTanahTextField.setText(Integer.toString(luasTanah));
        tipe="Tipe-36";
    }//GEN-LAST:event_radioTipe36ActionPerformed

    private void radioTipe45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipe45ActionPerformed
        
        luasTanah=120;
        luasTanahTextField.setText(Integer.toString(luasTanah));
        tipe="T-45";
    }//GEN-LAST:event_radioTipe45ActionPerformed

    private void radioTipe54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTipe54ActionPerformed
       
        luasTanah=140;
        luasTanahTextField.setText(Integer.toString(luasTanah));
        tipe="T-54";
    }//GEN-LAST:event_radioTipe54ActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed

        clear();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekMouseClicked
            cekBox();
    }//GEN-LAST:event_cekMouseClicked

    private void buttonProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonProsesActionPerformed
             hitung();
    }//GEN-LAST:event_buttonProsesActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
             buttonSimpandata();
    }//GEN-LAST:event_simpanButtonActionPerformed
 public void bacaDataComboBox() throws ClassNotFoundException{
        if((connection = koneksi.getConnection()) != null){
            
            try{
                String SQL="select area from data_rumah";
                Statement st=connection.createStatement();
                rs=st.executeQuery(SQL);
                while(rs.next()){
                    dt=rs.getString("area");
                    areaComboBox.addItem(dt);
                    jml= areaComboBox.getItemCount();
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(DataRumah.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.println("error njeng!");
        }
    }
 public void buttonSimpandata(){
     String sql="insert into data_pemesanan values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, namaPemesanTextField.getText());
            ps.setString(2, areaComboBox.getSelectedItem().toString());
            ps.setString(3, tipe);
            ps.setInt(4, Integer.parseInt(luasTanahTextField.getText()));
            ps.setInt(5, Integer.parseInt(hargaTextField.getText()));
            ps.setInt(6, Integer.parseInt(cicilan.getText()));
            ps.setInt(7, Integer.parseInt(cicilanPerBulanTextField.getText()));
            int cek=ps.executeUpdate();
            if(cek==1){
                JOptionPane.showMessageDialog(null,"Pemesanan berhasil disimpan!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error gan");
            }
        } catch (SQLException ex) {
            Logger.getLogger(PenjualanRumah.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public void hitung(){
      harga=(Integer.parseInt(luasTanahTersedia.getText())*Integer.parseInt(hargaTanahTextField.getText()))
                +Integer.parseInt(hargaBangunanTextField.getText());
        PPn=(int) (0.1*harga);
        cicilanBln=(harga+PPn-Integer.parseInt(DP.getText()))/Integer.parseInt(cicilan.getText());
        hargaTextField.setText(Integer.toString(harga));
        ppnTextField.setText(Integer.toString(PPn));
        cicilanPerBulanTextField.setText(Integer.toString(cicilanBln));
 }
 public void cekBox(){
      if(cek.isSelected()==false){
            JOptionPane.showMessageDialog(null,"loh kok ga jadi ?");
            simpanButton.setEnabled(false);
            buttonProses.setEnabled(false);
        }
         else if(cek.isSelected()==true){
            simpanButton.setEnabled(true);
            buttonProses.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Pelanggan konfirmasi/setuju");
        }
 }
 public void dataComboBox(){
     if(areaComboBox.getSelectedItem().toString().equals("")){
            hargaTanahTextField.setText("");
            hargaBangunanTextField.setText("");
            labelGambar.setIcon(null);
        }
        else{
            byte[]gmbar=null;
        String combo=areaComboBox.getSelectedItem().toString();
        String sql="select harga_tanah,harga_bangunan,gambar from data_rumah where area='"+combo+"'";
        try {  
            if((connection=koneksi.getConnection())!=null){
                Statement st=connection.createStatement();
                rs=st.executeQuery(sql);
                if(rs.next()){       
                     hrgTanah=rs.getInt("harga_tanah");
                     hrgBangunan=rs.getInt("harga_bangunan");
                    gmbar=rs.getBytes("gambar");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PenjualanRumah.class.getName()).log(Level.SEVERE, null, ex);
        }
        hargaTanahTextField.setText(Integer.toString(hrgTanah));
        hargaBangunanTextField.setText(Integer.toString(hrgBangunan));
        Image img=Toolkit.getDefaultToolkit().createImage(gmbar).getScaledInstance(350, 172,0);
            ImageIcon icon=new ImageIcon(img);
            labelGambar.setIcon(icon);
        }
 }
 public void clear(){
     DP.setText("");
     cicilan.setText("");
     cicilanPerBulanTextField.setText("");
     hargaBangunanTextField.setText("");
     hargaTanahTextField.setText("");
     hargaTextField.setText("");
     luasTanahTersedia.setText("");
     luasTanahTextField.setText("");
     namaPemesanTextField.setText("");
     ppnTextField.setText("");
     buttonGroup.clearSelection();
     cek.setSelected(false);
     areaComboBox.setSelectedItem("");
     labelGambar.setIcon(null);
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DP;
    public static javax.swing.JComboBox areaComboBox;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton buttonProses;
    private javax.swing.JCheckBox cek;
    private javax.swing.JTextField cicilan;
    private javax.swing.JTextField cicilanPerBulanTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JTextField hargaBangunanTextField;
    private javax.swing.JTextField hargaTanahTextField;
    private javax.swing.JTextField hargaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelGambar;
    private javax.swing.JTextField luasTanahTersedia;
    private javax.swing.JTextField luasTanahTextField;
    private javax.swing.JTextField namaPemesanTextField;
    private javax.swing.JTextField ppnTextField;
    private javax.swing.JRadioButton radioTipe36;
    private javax.swing.JRadioButton radioTipe45;
    private javax.swing.JRadioButton radioTipe54;
    private javax.swing.JButton simpanButton;
    // End of variables declaration//GEN-END:variables
}
