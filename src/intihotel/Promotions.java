/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intihotel;

/**
 *
 * @author osman
 */
public class Promotions extends javax.swing.JFrame {

    /**
     * Creates new form Promotions
     */
    public Promotions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("Back to Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 500, 150, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/50%.jpeg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 170, 230, 170);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/30%%.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 330, 200, 130);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/50%%.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(240, 360, 210, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/20%%%.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(490, 320, 200, 160);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/20%P.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 190, 210, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/30%P.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 170, 160, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/whiteBG.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 160, 710, 440);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/logo.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 180, 210);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/whiteBG.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 530, 200, 80);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel13.setText("INTI HOTEL");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(250, 50, 270, 43);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/whiteBG.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 270, 270);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/intihotel/whiteBG.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, -20, 561, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible (false);
        new Menu().setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Promotions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promotions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promotions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promotions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promotions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}