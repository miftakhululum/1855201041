/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Bukhori
 */
public class KTP extends javax.swing.JFrame {

    /**
     * Creates new form KTP
     */
    public KTP() {
        initComponents();
        this.setLocationRelativeTo(this);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jj = new javax.swing.JPanel();
        tampilgambar = new javax.swing.JLabel();
        tampilnik = new javax.swing.JTextField();
        tampilnama = new javax.swing.JTextField();
        tampiltgl = new javax.swing.JTextField();
        tampilalamat = new javax.swing.JTextField();
        tampilrtrw = new javax.swing.JTextField();
        tampildesa = new javax.swing.JTextField();
        tampilkecamatan = new javax.swing.JTextField();
        tampilagama = new javax.swing.JTextField();
        tampilstatusperkawinan = new javax.swing.JTextField();
        tampilpekerjaan = new javax.swing.JTextField();
        tampilkewarganegaraan = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        path = new javax.swing.JTextField();
        tombolcari = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("PROVINSI JAWA TIMUR");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("KABUPATEN BLITAR");

        jLabel3.setText("NIK");

        jLabel4.setText("Nama");

        jLabel5.setText("Tempat/Tgl Lahir");

        jLabel6.setText("Alamat");

        jLabel7.setText("RT/RW");

        jLabel8.setText("Kel/Desa");

        jLabel9.setText("Kecamatan");

        jLabel10.setText("Agama");

        jLabel11.setText("Status Perkawinan");

        jLabel12.setText("Pekerjaan");

        jLabel13.setText("Kewarganegaraan");

        jj.setBorder(new javax.swing.border.MatteBorder(null));

        tampilgambar.setText("                      foto");

        javax.swing.GroupLayout jjLayout = new javax.swing.GroupLayout(jj);
        jj.setLayout(jjLayout);
        jjLayout.setHorizontalGroup(
            jjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jjLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampilgambar, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jjLayout.setVerticalGroup(
            jjLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jjLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tampilgambar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        tampilstatusperkawinan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilstatusperkawinanActionPerformed(evt);
            }
        });

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilstatusperkawinan)
                                    .addComponent(tampilagama)
                                    .addComponent(tampilalamat)
                                    .addComponent(tampilrtrw)
                                    .addComponent(tampildesa)
                                    .addComponent(tampilkecamatan)
                                    .addComponent(tampilnama)
                                    .addComponent(tampiltgl)
                                    .addComponent(tampilnik)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilpekerjaan)
                                    .addComponent(tampilkewarganegaraan)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tampilnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tampilnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tampiltgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tampilalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tampilrtrw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tampildesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tampilkecamatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tampilagama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(tampilstatusperkawinan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tampilpekerjaan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(tampilkewarganegaraan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        tombolcari.setText("CARI");
        tombolcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolcariActionPerformed(evt);
            }
        });

        jButton1.setText("SIMPAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(tombolcari, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolcari)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolcariActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser("");
        File filenya;

        int buka_dialog = chooser.showOpenDialog(KTP.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            filenya = chooser.getSelectedFile();
            path.setText(filenya.getPath());

            // Read TXT File
            String filename = filenya.getPath(); //path
            String baris = null;

            // filereader adalah class, // objek
            FileReader namaobjek = null;
            try {
                namaobjek = new FileReader(filename);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(KTP.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Menampilkan file
            BufferedReader namaobjek2 = new BufferedReader(namaobjek);

            try {
                int bariske = 0;
                while ((baris = namaobjek2.readLine()) != null) {
                    if (bariske == 0) {
                        tampilnik.setText(baris);
                    } else if (bariske == 1) {
                        tampilnama.setText(baris);
                    } else if (bariske == 2) {
                        tampiltgl.setText(baris);
                    } else if (bariske == 3) {
                        tampilalamat.setText(baris);
                    } else if (bariske == 4) {
                        tampilrtrw.setText(baris);
                    } else if (bariske == 5) {
                        tampildesa.setText(baris);
                    } else if (bariske == 6) {
                        tampilkecamatan.setText(baris);
                    } else if (bariske == 7) {
                        tampilagama.setText(baris);
                    } else if (bariske == 8) {
                        tampilstatusperkawinan.setText(baris);
                    } else if (bariske == 9) {
                        tampilpekerjaan.setText(baris);
                    } else if (bariske == 10) {
                        tampilkewarganegaraan.setText(baris);
                    }
                    bariske++;

                }
            } catch (IOException ex) {
                Logger.getLogger(KTP.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                namaobjek2.close();
            } catch (IOException ex) {
                Logger.getLogger(KTP.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_tombolcariActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser("");
        File filenya;

        int buka_dialog = chooser.showOpenDialog(KTP.this);
        if (buka_dialog == JFileChooser.APPROVE_OPTION) {
            String filepath = String.valueOf(chooser.getSelectedFile().getPath());
            if (!filepath.endsWith(".txt")) {
                filepath = filepath + ".txt";
            }

            File file = new File(filepath);
            FileWriter fw = null;
            BufferedWriter bw = null;

            try {

                fw = new FileWriter(file);
                bw = new BufferedWriter(fw);

                String ambilnik = tampilnik.getText() + System.getProperty("line.separator");
                String ambilnama = tampilnama.getText() + System.getProperty("line.separator");
                String ambiltgl = tampiltgl.getText() + System.getProperty("line.separator");
                String ambilalamat = tampilalamat.getText() + System.getProperty("line.separator");
                String ambilrtrw = tampilrtrw.getText() + System.getProperty("line.separator");
                String ambildesa = tampildesa.getText() + System.getProperty("line.separator");
                String ambilkecamatan = tampilkecamatan.getText() + System.getProperty("line.separator");
                String ambilagama = tampilagama.getText() + System.getProperty("line.separator");
                String ambilstatus = tampilstatusperkawinan.getText() + System.getProperty("line.separator");
                String ambilpekerjaan = tampilpekerjaan.getText() + System.getProperty("line.separator");
                String ambilkewarganegaraan = tampilkewarganegaraan.getText() + System.getProperty("line.separator");

                bw.write(ambilnik);
                bw.write(ambilnama);
                bw.write(ambiltgl);
                bw.write(ambilalamat);
                bw.write(ambilrtrw);
                bw.write(ambildesa);
                bw.write(ambilkecamatan);
                bw.write(ambilagama);
                bw.write(ambilstatus);
                bw.write(ambilpekerjaan);
                bw.write(ambilkewarganegaraan);

            } catch (IOException e) {
            } finally {
                JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
                try {

                    bw.close();
                    fw.close();

                } catch (IOException e) {
                }
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tampilstatusperkawinanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilstatusperkawinanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilstatusperkawinanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int res = chooser.showOpenDialog(KTP.this);
        if (res == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            // mengambil gambar dari file yg dipilih
            ImageIcon gambar = new ImageIcon(file.getAbsolutePath());
            
            // atur lebar & tinggi pada jlabel14gg
            Rectangle rect = tampilgambar.getBounds();
            
            // set gambar agar pas pada jlabel14
            Image scaledimage = gambar.getImage().getScaledInstance(rect.width, rect.height, Image.SCALE_DEFAULT);
            
            // konversi file gambar agar bisa dibaca pada jlabel14
            gambar = new ImageIcon(scaledimage);
            tampilgambar.setIcon(gambar); 
            
            // mnampilkan nama file foto
//            String name = file.getName();
//            jLabel2.setText(name);

        } else {
            JOptionPane.showMessageDialog(this, "Cancelled by user!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KTP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KTP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jj;
    private javax.swing.JTextField path;
    private javax.swing.JTextField tampilagama;
    private javax.swing.JTextField tampilalamat;
    private javax.swing.JTextField tampildesa;
    private javax.swing.JLabel tampilgambar;
    private javax.swing.JTextField tampilkecamatan;
    private javax.swing.JTextField tampilkewarganegaraan;
    private javax.swing.JTextField tampilnama;
    private javax.swing.JTextField tampilnik;
    private javax.swing.JTextField tampilpekerjaan;
    private javax.swing.JTextField tampilrtrw;
    private javax.swing.JTextField tampilstatusperkawinan;
    private javax.swing.JTextField tampiltgl;
    private javax.swing.JButton tombolcari;
    // End of variables declaration//GEN-END:variables

}
