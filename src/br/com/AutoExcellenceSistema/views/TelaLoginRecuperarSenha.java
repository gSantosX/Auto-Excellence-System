package br.com.AutoExcellenceSistema.views;

import java.sql.*;
import br.com.AutoExcellenceSistema.dao.Conexao;
import javax.swing.JOptionPane;

public class TelaLoginRecuperarSenha extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaLoginRecuperarSenha() {
        initComponents();
        conexao = Conexao.conexao();
    }
    
    //METODO DA FUNÇÃO ALTERAR "Alterar":
    public void alterar() {
        
        String sqlVerificarUsuario = "select id from usuarios where login=? and pchave=?";
        String sqlRedefinirSenha = "update usuarios set senha=? where login=?";
        
        try {
            if (txtLogin.getText().trim().isEmpty() || txtPchave.getText().trim().isEmpty() 
                    || txtNovaSenha.getText().trim().isEmpty() || txtConfirmarSenha.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Preencha todos os campos para redefinir a senha!",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
            }
            if (!txtNovaSenha.getText().equals(txtConfirmarSenha.getText())){
                JOptionPane.showMessageDialog(this,
                        "As senhas não coincidem!\nVerifique a senha digitada.",
                        "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            pst = conexao.prepareStatement(sqlVerificarUsuario);
            pst.setString(1, txtLogin.getText().trim());
            pst.setString(2, txtPchave.getText().trim());
            rs = pst.executeQuery();

            if (rs.next()) {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                
                pst = conexao.prepareStatement(sqlRedefinirSenha);
                pst.setString(1, txtNovaSenha.getText().trim());
                pst.setString(2, txtLogin.getText().trim());
                int linhas = pst.executeUpdate();
                
                if (linhas > 0) {
                    JOptionPane.showMessageDialog(this,
                        "Senha redefinida com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    
                    TelaLogin login = new TelaLogin();
                    login.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this,
                        "Erro ao redefinir senha!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                    "Login ou palavra-chave incorretos!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this,
                "Erro ao validar: " + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (conexao != null) conexao.close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao fechar recursos: " + e.getMessage(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    //METODO DA FUNÇÃO ACESSAR "Acessar":
    public void acessar() {
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JToggleButton();
        btnAcessar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        txtPchave = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNovaSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Confirmar login");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 400));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Confirme a nova senha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Nova senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));

        btnAlterar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 120, -1));

        btnAcessar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnAcessar.setText("Acessar");
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcessar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 120, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("           Tela de Recuperação de Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 320, -1));
        getContentPane().add(txtPchave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel9.setText("Login:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel10.setText("Palava-chave:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        getContentPane().add(txtNovaSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 160, -1));
        getContentPane().add(txtConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 160, -1));

        setSize(new java.awt.Dimension(600, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        acessar();
    }//GEN-LAST:event_btnAcessarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TelaLoginRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLoginRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLoginRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLoginRecuperarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLoginRecuperarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAcessar;
    private javax.swing.JToggleButton btnAlterar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtNovaSenha;
    private javax.swing.JPasswordField txtPchave;
    // End of variables declaration//GEN-END:variables
}
