
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class formulirpendaftaran extends javax.swing.JFrame {
  
   
    

    /**
     * Creates new form formulirpendaftaran
     */
    public formulirpendaftaran() {
        initComponents();


    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jlUniv = new javax.swing.JLabel();
        jlNama = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jlAlamat = new javax.swing.JLabel();
        tfAlamat = new javax.swing.JTextField();
        jlAsal = new javax.swing.JLabel();
        tfAsal = new javax.swing.JTextField();
        jlJenis = new javax.swing.JLabel();
        bPer = new javax.swing.JRadioButton();
        bLaki = new javax.swing.JRadioButton();
        jlTanggal = new javax.swing.JLabel();
        tfTanggal = new javax.swing.JTextField();
        jlFakultas = new javax.swing.JLabel();
        cbFakultas = new javax.swing.JComboBox<>();
        cb = new javax.swing.JCheckBox();
        tfNo = new javax.swing.JTextField();
        jlNo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlTelp = new javax.swing.JLabel();
        jlForm = new javax.swing.JLabel();
        jlJalanRaya = new javax.swing.JLabel();
        bBatal = new javax.swing.JButton();
        bSimpan = new javax.swing.JButton();
        bReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(246, 198, 118));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);

        jlUniv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlUniv.setText("UNIVERSITY OF TRUNOJOYO MADURA");

        jlNama.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlNama.setText("Nama");

        tfNama.setBackground(new java.awt.Color(228, 228, 228));
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jlAlamat.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlAlamat.setText("Alamat");

        tfAlamat.setBackground(new java.awt.Color(228, 228, 228));

        jlAsal.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlAsal.setText("Asal Sekolah");

        tfAsal.setBackground(new java.awt.Color(228, 228, 228));
        tfAsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAsalActionPerformed(evt);
            }
        });

        jlJenis.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlJenis.setText("Jenis Kelamin");

        bPer.setBackground(new java.awt.Color(228, 228, 228));
        buttonGroup1.add(bPer);
        bPer.setText("Perempuan");
        bPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPerActionPerformed(evt);
            }
        });

        bLaki.setBackground(new java.awt.Color(228, 228, 228));
        buttonGroup1.add(bLaki);
        bLaki.setText("Laki - Laki");
        bLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLakiActionPerformed(evt);
            }
        });

        jlTanggal.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlTanggal.setText("Tanggal Lahir");

        tfTanggal.setBackground(new java.awt.Color(228, 228, 228));

        jlFakultas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlFakultas.setText("Fakultas");

        cbFakultas.setBackground(new java.awt.Color(228, 228, 228));
        cbFakultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih Fakultas---", "Fakultas Teknik", "Fakultas Kedokteran", "Fakultas Ekonomi", "Fakultas Pendidikan", "Fakultas Ilmu Politik" }));

        cb.setBackground(new java.awt.Color(255, 255, 255));
        cb.setText("Data yang Saya Masukkan Sudah Benar");

        tfNo.setBackground(new java.awt.Color(228, 228, 228));

        jlNo.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        jlNo.setText("No. Telepon");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\logo2.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jlAsal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlTanggal)
                            .addComponent(jlJenis)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jlFakultas))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jlUniv))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(jlNama)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bLaki)
                                .addGap(141, 141, 141)
                                .addComponent(bPer))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfAsal, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(120, 120, 120)
                                            .addComponent(jlAlamat)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfAlamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlNo)
                        .addGap(192, 192, 192))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlUniv)
                        .addGap(18, 18, 18)
                        .addComponent(jlNama))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAlamat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlAsal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlJenis)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bLaki)
                            .addComponent(bPer)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlTanggal)))
                .addGap(18, 18, 18)
                .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlFakultas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFakultas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jlTelp.setText("Telp. 082361998817");

        jlForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlForm.setText("FORMULIR PENDAFTARAN LOMBA DESAIN UI/UX");

        jlJalanRaya.setText("Jl. Raya Telang, Kamal, Kab. Bangkalan");

        bBatal.setFont(new java.awt.Font("DFGothic-EB", 0, 12)); // NOI18N
        bBatal.setText("Batal");
        bBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBatalActionPerformed(evt);
            }
        });

        bSimpan.setFont(new java.awt.Font("DFGothic-EB", 0, 12)); // NOI18N
        bSimpan.setText("SImpan");
        bSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSimpanActionPerformed(evt);
            }
        });

        bReset.setFont(new java.awt.Font("DFGothic-EB", 0, 12)); // NOI18N
        bReset.setText("Reset");
        bReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlJalanRaya)
                .addGap(156, 156, 156))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jlForm))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jlTelp)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(bBatal)
                .addGap(106, 106, 106)
                .addComponent(bReset)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSimpan)
                .addGap(50, 50, 50))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlJalanRaya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlTelp)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bReset)
                    .addComponent(bBatal)
                    .addComponent(bSimpan))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAsalActionPerformed

    private void bBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBatalActionPerformed
           // Menampilkan dialog konfirmasi dengan JOptionPane
    int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin membatalkan?", "Konfirmasi Pembatalan", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);  
     // Jika pengguna memilih "Yes", maka proses batal dilakukan
    if (response == JOptionPane.YES_OPTION) {
    }   
      // Menghapus item "Pilihan Fakultas" jika ada
    if (cbFakultas.getItemCount() > 0 && cbFakultas.getItemAt(0).equals("Pilihan Fakultas")) {
                cbFakultas.removeItem("Pilihan Fakultas");
    }//GEN-LAST:event_bBatalActionPerformed

        // Menutup Frame yang sedang aktif
            dispose(); // 
    }
           
    private void bSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSimpanActionPerformed
           //ambil data dari form string
           String Nama = tfNama.getText();
           String Alamat= tfAlamat.getText();
           String Asal  = tfAsal.getText();
           String Tanggal = tfTanggal.getText();
           String No = tfNo.getText();
           String Fakultas = cbFakultas.getSelectedItem().toString();
           
          String jlJenis = bLaki.isSelected() ? "Laki - Laki" : (bPer.isSelected() ? "Perempuan" : "");
          
          
          //cek apakah checkbox sudah dicentang
           if(!cb.isSelected()){
               
           JOptionPane.showMessageDialog(this,"Harap centang untuk melanjutkan.","Peringatan",JOptionPane.INFORMATION_MESSAGE);
           return;
           
           }
           //atur combo box agar kosong
           cbFakultas.addItem("");
           cbFakultas.setSelectedIndex(4);
           
           //cek data harus diisi dahulu
           if (tfNama.getText().isEmpty() || 
                tfAlamat.getText().isEmpty() ||
                tfAsal.getText().isEmpty() ||
                tfTanggal.getText().isEmpty() ||
                tfNo.getText().isEmpty() || 
                bLaki.getText().isEmpty() ||
                bPer.getText().isEmpty()) {
    
    // Lakukan tindakan jika ada yang kosong, misalnya:
    JOptionPane.showMessageDialog(this, "Harap diisi terlebih dahulu!!.", "Peringatan", JOptionPane.INFORMATION_MESSAGE);
    return;
} 
   

// Membuat instance Frame2
keluar Keluar = new keluar();

// Mengatur data pada Frame2
Keluar.setData(Nama, Alamat, Asal, Tanggal, No, jlJenis, Fakultas, false);

// Menampilkan Frame2 
Keluar.setVisible(true);

// Menutup Frame yang sedang aktif
dispose(); // Menutup frame saat ini


     
     
    }//GEN-LAST:event_bSimpanActionPerformed

    private void bResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResetActionPerformed
        // TODO add your handling code here:
        //bersihkan field text
           tfNama.setText(null);
           tfAlamat.setText(null);
           tfAsal.setText(null);
           tfTanggal.setText(null);
           tfNo.setText(null);
           
            //Bersikan pilihan dari radio button
           buttonGroup1.clearSelection();
           
           //bersihkan checkbox
           cb.setSelected(false);
           
           //atur combo box
           cbFakultas.setSelectedIndex(0);
           
       
           
//       
        
    }//GEN-LAST:event_bResetActionPerformed

    private void bLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLakiActionPerformed
        //
    }//GEN-LAST:event_bLakiActionPerformed

    private void bPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bPerActionPerformed

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

  
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
            java.util.logging.Logger.getLogger(formulirpendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulirpendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulirpendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulirpendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulirpendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBatal;
    private javax.swing.JRadioButton bLaki;
    private javax.swing.JRadioButton bPer;
    private javax.swing.JButton bReset;
    private javax.swing.JButton bSimpan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb;
    private javax.swing.JComboBox<String> cbFakultas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlAlamat;
    private javax.swing.JLabel jlAsal;
    private javax.swing.JLabel jlFakultas;
    private javax.swing.JLabel jlForm;
    private javax.swing.JLabel jlJalanRaya;
    private javax.swing.JLabel jlJenis;
    private javax.swing.JLabel jlNama;
    private javax.swing.JLabel jlNo;
    private javax.swing.JLabel jlTanggal;
    private javax.swing.JLabel jlTelp;
    private javax.swing.JLabel jlUniv;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfAsal;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfTanggal;
    // End of variables declaration//GEN-END:variables
}