/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author VP
 */
public class tela_1_1 extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela_1_1() {
        initComponents();
        this.setSize(1290, 760);
        this.setLocationRelativeTo(this);
        ImageIcon FINAL=new ImageIcon("src/imagens/dds.gif");
        FINAL.setImage(FINAL.getImage().getScaledInstance(jLabel17.getWidth(), jLabel17.getHeight(), 1));
        jLabel17.setIcon(FINAL);
        
          ImageIcon INAL=new ImageIcon("src/imagens/Chips-89628.gif");
        INAL.setImage(INAL.getImage().getScaledInstance(jLabel10.getWidth(), jLabel10.getHeight(), 1));
        jLabel10.setIcon(INAL);
        
          ImageIcon NAL=new ImageIcon("src/imagens/images.png");
        NAL.setImage(NAL.getImage().getScaledInstance(jLabel21.getWidth(), jLabel21.getHeight(), 1));
        jLabel21.setIcon(NAL);
        
          ImageIcon FINA=new ImageIcon("src/imagens/bd.gif");
        FINA.setImage(FINA.getImage().getScaledInstance(jLabel5.getWidth(), jLabel5.getHeight(), 1));
        jLabel5.setIcon(FINA);
        
          ImageIcon FINL=new ImageIcon("src/imagens/aaaa.jpg");
        FINL.setImage(FINL.getImage().getScaledInstance(jLabel19.getWidth(), jLabel19.getHeight(), 1));
        jLabel19.setIcon(FINL);
        
          ImageIcon FIAL=new ImageIcon("src/imagens/mp61137327_1456764094237_2.gif");
        FIAL.setImage(FIAL.getImage().getScaledInstance(jLabel18.getWidth(), jLabel18.getHeight(), 1));
        jLabel18.setIcon(FIAL);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AJS = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        AJS.setText("inicio");
        AJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AJSActionPerformed(evt);
            }
        });
        getContentPane().add(AJS);
        AJS.setBounds(0, 0, 60, 23);

        jButton1.setText("configura????es");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 0, 120, 23);

        jButton2.setText("contatos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 0, 90, 23);

        jButton3.setText("status");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 0, 70, 23);

        jButton5.setText("trofeus");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(340, 0, 67, 23);

        jLabel3.setText("Bressan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 290, 100, 14);

        jLabel4.setText("Cynara");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(610, 290, 80, 14);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 540, 280, 130);

        jLabel6.setText("Iolanda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(230, 510, 70, 14);

        jLabel9.setText("Perfetto");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(990, 510, 90, 14);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 320, 290, 130);

        jLabel11.setText("John");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(1000, 290, 90, 14);
        getContentPane().add(jLabel17);
        jLabel17.setBounds(100, 320, 280, 130);
        getContentPane().add(jLabel18);
        jLabel18.setBounds(880, 540, 290, 130);
        getContentPane().add(jLabel19);
        jLabel19.setBounds(480, 540, 280, 130);

        jLabel20.setText("Antony");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(610, 520, 90, 14);
        getContentPane().add(jLabel21);
        jLabel21.setBounds(880, 320, 290, 130);

        jLabel2.setText("nivel 1");
        jPanel3.add(jLabel2);
        jPanel3.add(jProgressBar1);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1120, 0, 160, 50);

        jLabel7.setText("                    NADA");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 110, 170, 150);

        jLabel8.setText("Meus Status");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 120, 130, 14);

        jButton4.setText("postar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(190, 150, 100, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3254aa65-0c96-4eaa-96b7-cf790d3eabfc.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -6, 1280, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
     }//GEN-LAST:event_formWindowOpened

    private void AJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AJSActionPerformed
        dispose(); 
        tela chame=new tela();
        chame.setVisible(true);    }//GEN-LAST:event_AJSActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose(); 
        tela_1 chame=new tela_1();
        chame.setVisible(true);    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose(); 
        tela_1_1 chame=new tela_1_1();
        chame.setVisible(true);    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose(); 
        tela_2 chame=new tela_2();
        chame.setVisible(true);    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
        trophy chum=new trophy();
        chum.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       try{
            JFileChooser xx=new JFileChooser();
            int res=xx.showOpenDialog(null);
      if(res==JFileChooser.APPROVE_OPTION){
 
      }
      }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AJS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
