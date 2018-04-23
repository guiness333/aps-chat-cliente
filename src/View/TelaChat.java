/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import chatambiental.Cliente;
import javax.swing.JOptionPane;
import util.Check;

/**
 *
 * @author Aluno
 */
public class TelaChat extends javax.swing.JFrame {

    /**
     * Creates new form TelaChaat
     */
    public TelaChat() {
        initComponents();
    }
    
    public static void atualizar(String msg){
        //if(!Check.checarNull(msg))
        taChat.append("alou");
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
        jButton1 = new javax.swing.JButton();
        JTxtFieldChatInput = new javax.swing.JTextField();
        btnEnviarChat = new javax.swing.JButton();
        btnEnvioArquivo = new javax.swing.JButton();
        BtnAudio = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taChat = new javax.swing.JTextArea();
        btnSettings = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/voltar.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 70, -1, -1));
        jPanel1.add(JTxtFieldChatInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 378, 520, -1));

        btnEnviarChat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/enviar.png"))); // NOI18N
        jPanel1.add(btnEnviarChat, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 378, -1, -1));

        btnEnvioArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/video.png"))); // NOI18N
        btnEnvioArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvioArquivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEnvioArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 172, 89, 96));

        BtnAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Audio.png"))); // NOI18N
        jPanel1.add(BtnAudio, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 89, 96));

        taChat.setColumns(20);
        taChat.setRows(5);
        jScrollPane2.setViewportView(taChat);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 580, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 920, 460));

        btnSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Setting.png"))); // NOI18N
        btnSettings.setToolTipText("Configurações");
        btnSettings.setBorder(null);
        btnSettings.setBorderPainted(false);
        btnSettings.setContentAreaFilled(false);
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 50, 50));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Exit.png"))); // NOI18N
        btnExit.setToolTipText("Encerrar sessão");
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 50, 50));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Home.png"))); // NOI18N
        btnHome.setToolTipText("Menu principal");
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 50, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Linha.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 50, 70));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Local de Acesso:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Nivel de Acesso:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/PainelTop.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnvioArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvioArquivoActionPerformed
        // TODO add your handling code here:
        TelaSelecaoArquivo tsa = new TelaSelecaoArquivo();
        tsa.setVisible(true);
        tsa.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnEnvioArquivoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaChat().setVisible(true);
            }
        });
    }
    
    public class Atualizar implements Runnable {
        public void run() {
            try {
                    Cliente cm = new Cliente();
                    //String text = cm.();                            
                    while(true){
                       // jTxtChatPanel.append(""+text);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,ex);
            }        
        }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAudio;
    private javax.swing.JTextField JTxtFieldChatInput;
    private javax.swing.JButton btnEnviarChat;
    private javax.swing.JButton btnEnvioArquivo;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea taChat;
    // End of variables declaration//GEN-END:variables
}
