/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungcal;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows10
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    // instance object
    HitungCal Nasi = new HitungCal("Nasi", 204, 1);
    HitungCal Mie = new HitungCal("Mie", 305, 1);
    HitungCal Roti = new HitungCal("Roti", 200, 1);
    HitungCal Sarden = new HitungCal("Sarden", 25, 1);
    HitungCal Tempe = new HitungCal("Tempe", 193, 1);
    HitungCal Kornet = new HitungCal("Kornet", 70, 1);
    HitungCal Burger = new HitungCal("Beef Burger", 258, 1);
    HitungCal Pizza = new HitungCal("Chesse Pizza", 210, 1);
    HitungCal Spaghetti = new HitungCal("Spaghetti", 220, 1);
    HitungCal Lasagna = new HitungCal("Beef Lasagna", 336, 1);
    HitungCal Rendang = new HitungCal("Rendang", 195, 1);
    HitungCal Tortila = new HitungCal("Tortilla chips",130,1);
    HitungCal Kebab = new HitungCal("Beef Kebab",620,1);
    HitungCal HotDog = new HitungCal("Hot Dog",242,1);
    // memasukan object kedalam array agar mudah
    HitungCal[] makanan = { Nasi, Mie, Roti, Sarden, Tempe, Kornet, Burger, Pizza, Spaghetti, Lasagna, Rendang,
                                                    Tortila,Kebab,HotDog};
    // ////////////////////////////
    Random random = new Random();

    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNama = new javax.swing.JLabel();
        lblNamaUser = new javax.swing.JTextField();
        lblCalorie = new javax.swing.JLabel();
        lblLimitCalorie = new javax.swing.JTextField();
        btnHitung = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotalCalorie = new javax.swing.JTextField();
        fldKeputusan = new javax.swing.JTextField();
        lblKeputusan = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblJumlah = new javax.swing.JLabel();
        fldJumlahMakanan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mau Makan apa?");

        lblNama.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblNama.setText("Nama");

        lblNamaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNamaUserActionPerformed(evt);
            }
        });

        lblCalorie.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lblCalorie.setText("Calorie");

        btnHitung.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        btnHitung.setText("Hitung !");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel1.setText("Total calorie makanan");

        fldKeputusan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        fldKeputusan.setText("Silahkan masukan data anda !!");

        lblKeputusan.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        lblKeputusan.setText("Keputusan");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {1, "Nasi", "1 Piring", 204},
                {2, "Mie", "80 gr", 305},
                {3, "Roti", "74 gr", 200},
                {4, "Sarden", "1 kaleng", 25},
                {5,"Tempe","100 gr",193},
                {6,"Kornet","50 gr",70},
                {7,"Beef Burger","1 Pcs",258},
                {8,"Chesse Pizza","1 Slice",210},
                {9,"Spaghetti","1 Piring",220},
                {10,"Beef Lasagna","1 Pan",336},
                {11,"Rendang","100 gr",195},
                {12,"Tortille chips","100 gr",130},
                {13,"Beef Kebab","1 Pcs",620},
                {14,"Hot Dog","1 Pcs",242}
            },
            new String [] {
                "No", "Nama", "Jumlah", "Calorie"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnExit.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblJumlah.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        lblJumlah.setText("Jml Makanan/hari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(lblTotalCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLimitCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblJumlah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fldJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblKeputusan, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fldKeputusan, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNamaUser, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLimitCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fldJumlahMakanan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalCalorie, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblKeputusan))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fldKeputusan, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNamaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNamaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNamaUserActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
//        try{
//                // mendapatkan identitas user
//               String nama = lblNamaUser.getText();
//        }catch(){
//            
//        }
        
        try{
            // mendapatkan identitas user
        String nama = lblNamaUser.getText();
          // mendapatkan limit kalori user
          int    kaloriUser = Integer.parseInt(lblLimitCalorie.getText());
       
        // mendapaatkan jumlah makanan yang ingin dikonsumsi user
        int jumlahMakananPerHari = Integer.parseInt(fldJumlahMakanan.getText());

        // inisialisasi array yg menampung daftar makanan
        ArrayList<HitungCal> makananLolosSeleksi = new ArrayList<HitungCal>();

        // memberikan limit kalori permakanan
        int rateKaloriUserPerMakanan = kaloriUser / jumlahMakananPerHari;

        int totalCalorieMakanan = 0;

        // memasukan makanan kedalam array
        for (int i = 0; i < makanan.length; i++) {
            if (makanan[i].getCalorieMakanan() < rateKaloriUserPerMakanan) {
                makananLolosSeleksi.add(makanan[i]);
            }
        }

        if (makananLolosSeleksi.size() <= jumlahMakananPerHari) {
            lblTotalCalorie.setText(Integer.toString(0));
            fldKeputusan.setText("Jumlah makanan tidak cukup sesuai dengan yang anda harapkan");
        }

        else {
            // ------------------------- masih terdapat bug di area ini
            // ------------------------
            // ArrayList<String> tampilkanMakanan = new ArrayList<String>();
            Set<String> set = new LinkedHashSet<String>();
                while (set.size() < jumlahMakananPerHari) {
                     int rand_int2 = random.nextInt(makananLolosSeleksi.size());
                    set.add(makananLolosSeleksi.get(rand_int2).getMakanan());
                    totalCalorieMakanan += makananLolosSeleksi.get(rand_int2).getCalorieMakanan();
                }
                if(totalCalorieMakanan <= kaloriUser){         
                    lblTotalCalorie.setText(Integer.toString(totalCalorieMakanan));
                    fldKeputusan.setText("Saran Makanan : " + set);
                }else{
                    fldKeputusan.setText("Mohon untuk hitung ulang");
                    lblTotalCalorie.setText("");
                }
            }
       }catch(NumberFormatException  ex){
           JOptionPane.showMessageDialog(null,"Pastikan input anda benar");
            lblLimitCalorie.setText("");
            fldJumlahMakanan.setText("");
       }

    }// GEN-LAST:event_btnHitungActionPerformed

    private JFrame frame;

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("exit");

        if (JOptionPane.showConfirmDialog(frame, "Yakin akan keluar??", "Hitung Calorie",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {

            System.exit(0);
        }
    }// GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        fldKeputusan.setText("");
        lblNamaUser.setText("");
        lblLimitCalorie.setText("");
        lblTotalCalorie.setText("");
        fldJumlahMakanan.setText("");
    }// GEN-LAST:event_btnResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnReset;
    private javax.swing.JTextField fldJumlahMakanan;
    private javax.swing.JTextField fldKeputusan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCalorie;
    private javax.swing.JLabel lblJumlah;
    private javax.swing.JLabel lblKeputusan;
    private javax.swing.JTextField lblLimitCalorie;
    private javax.swing.JLabel lblNama;
    private javax.swing.JTextField lblNamaUser;
    private javax.swing.JTextField lblTotalCalorie;
    // End of variables declaration//GEN-END:variables
}
