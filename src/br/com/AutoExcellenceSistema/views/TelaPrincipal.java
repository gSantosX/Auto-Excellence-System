package br.com.AutoExcellenceSistema.views;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class TelaPrincipal extends javax.swing.JFrame {
    
    public TelaPrincipal() {
        initComponents();
        //CODIGO ABAIXO DEIXA TELA CHEIA:
        //setExtendedState(MAXIMIZED_BOTH); 
    }
    
    public void relatorios(){
        
    }
    
    //METODO DA FUNÇÃO CADASTROS:
    public void cadastros() {
        TelaPrincipalCadastros cadastros = new TelaPrincipalCadastros();
        cadastros.setVisible(true);
        desktop.add(cadastros);
    }
    
    //METODO DA FUNÇÃO AJUDA:
    public void ajuda() {
        TelaPrincipalAjuda ajuda = new TelaPrincipalAjuda();
        ajuda.setVisible(true);
        desktop.add(ajuda);
    }
    
    //METODO DA FUNÇÃO OPÇÕES:
    public void opcoes() {
        TelaPrincipalOpcoes opcoes = new TelaPrincipalOpcoes();
        opcoes.setVisible(true);
        desktop.add(opcoes);
    }
    
    //METODO DA FUNÇÃO SAIR:
    public void sair() {
        int sair = JOptionPane.showConfirmDialog(null,"Deseja sair do sistema?","Atenção",JOptionPane.YES_NO_OPTION);
        
        if(sair == JOptionPane.YES_OPTION){
            TelaLogin login = new TelaLogin();
            login.setVisible(true);
            this.dispose();
            }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloUsuario = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        btnCadatros = new javax.swing.JButton();
        btnRelatorios = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnOpcoes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Auto Excellence");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloUsuario.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        lblTituloUsuario.setText("Usuário:");
        lblTituloUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblTituloUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));

        lblUsuarios.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        lblUsuarios.setText("usuario X");
        lblUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 40));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 650));

        btnCadatros.setText("CADASTROS");
        btnCadatros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadatrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadatros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 240, 40));

        btnRelatorios.setText("RELATÓRIOS");
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });
        getContentPane().add(btnRelatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 240, 40));

        btnAjuda.setText("AJUDA");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, 40));

        btnOpcoes.setText("OPÇÕES");
        btnOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 40));

        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 40));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 24)); // NOI18N
        jLabel4.setText("Auto Excellence");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 190, 30));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 3, 14)); // NOI18N
        jLabel5.setText("System");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 610, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pngegg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 220, 230));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSistema2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 240, 340));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSistema2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        setSize(new java.awt.Dimension(1216, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadatrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadatrosActionPerformed
        cadastros();
    }//GEN-LAST:event_btnCadatrosActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        relatorios();
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjudaActionPerformed
        ajuda();
    }//GEN-LAST:event_btnAjudaActionPerformed

    private void btnOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcoesActionPerformed
        opcoes();
    }//GEN-LAST:event_btnOpcoesActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnCadatros;
    private javax.swing.JButton btnOpcoes;
    public static javax.swing.JButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblTituloUsuario;
    public static javax.swing.JLabel lblUsuarios;
    // End of variables declaration//GEN-END:variables
}
