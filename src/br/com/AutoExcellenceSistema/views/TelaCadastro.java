package br.com.AutoExcellenceSistema.views;

import java.sql.*;
import br.com.AutoExcellenceSistema.dao.Conexao;
import javax.swing.JOptionPane;

public class TelaCadastro extends javax.swing.JFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaCadastro() {
        initComponents();
        conexao = Conexao.conexao(); 
    }
    
    //METODO DA FUNÇÃO REGISTRAR:   
    public void registrar() {
        
        String sql = "insert into usuarios (nome, login, senha, pchave) values (?, ?, ?, ?)"; 
    
        try {
            
            if (txtNovoUsuario.getText().isEmpty() || txtNovoSenhaUsuario.getText().isEmpty()
                    || txtNovoNome.getText().isEmpty() || txtNovoPchave.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return;
            }
            if (!txtNovoSenhaUsuario.getText().equals(txtNovoConfirmarSenha.getText())) {
                JOptionPane.showMessageDialog(null, "Senhas não coincidem!");
                return;
            }

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtNovoNome.getText());
            pst.setString(2, txtNovoUsuario.getText());
            pst.setString(3, txtNovoSenhaUsuario.getText());
            pst.setString(4, txtNovoPchave.getText());

            int linhas = pst.executeUpdate(); 

            if (linhas > 0) {
                JOptionPane.showMessageDialog(null, "Usuário registrado!");
                new TelaLogin().setVisible(true);
                this.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally { 
            try {
                if (conexao != null) conexao.close();
                if (pst != null) pst.close();
                if (rs != null) rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro: " + e);
            }
        }
    }
    
    //METODO DA FUNÇÃO CADASTRAR:
    public void acessar() {
        TelaLogin acessar = new TelaLogin();
        acessar.setVisible(true);
        this.dispose();
    }
    
    //METODO DA FUNÇÃO RECUPERAR-SENHA:
    public void recuperarSenha() {
        
        TelaLoginRecuperarSenha recuperarSenha = new TelaLoginRecuperarSenha();
        recuperarSenha.setVisible(true);
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNovoUsuario = new javax.swing.JTextField();
        txtNovoConfirmarSenha = new javax.swing.JPasswordField();
        txtNovoSenhaUsuario = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnRecuperarSenha = new javax.swing.JToggleButton();
        btnLogar = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        txtNovoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNovoPchave = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 320, 430));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("          Tela de Registro");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 220, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Confirme a senha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Login:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        getContentPane().add(txtNovoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 160, -1));
        getContentPane().add(txtNovoConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 160, -1));
        getContentPane().add(txtNovoSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 160, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel8.setText("Senha:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        btnRecuperarSenha.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnRecuperarSenha.setText("Recuperar Senha");
        btnRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 140, -1));

        btnLogar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnLogar.setText("Acessar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 120, -1));

        btnRegistrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 120, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel9.setText("Nome:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));
        getContentPane().add(txtNovoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 160, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel3.setText("Palavra-chave (segurança):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));
        getContentPane().add(txtNovoPchave, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 160, -1));

        setSize(new java.awt.Dimension(616, 440));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarSenhaActionPerformed
        recuperarSenha();
    }//GEN-LAST:event_btnRecuperarSenhaActionPerformed

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        acessar();
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLogar;
    private javax.swing.JToggleButton btnRecuperarSenha;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField txtNovoConfirmarSenha;
    private javax.swing.JTextField txtNovoNome;
    private javax.swing.JTextField txtNovoPchave;
    private javax.swing.JPasswordField txtNovoSenhaUsuario;
    private javax.swing.JTextField txtNovoUsuario;
    // End of variables declaration//GEN-END:variables
}
