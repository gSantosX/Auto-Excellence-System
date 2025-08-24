package br.com.AutoExcellenceSistema.views;

import java.sql.*;
import br.com.AutoExcellenceSistema.dao.Conexao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //METODO DA FUNÇÃO LOGAR:
    public void logar() {
        String sql = "select * from usuarios where login=? and senha=?";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtUsuario.getText());
            String captura = new String(txtSenha.getPassword());
            pst.setString(2, captura);

            rs = pst.executeQuery();

            if (rs.next()) {
                String perfil = rs.getString(6);
                //LINHA ABAIXO TESTE PERFIL:
                //System.out.println(perfil);
                if(perfil.equals("admin")){
                    TelaPrincipal principal = new TelaPrincipal();
                    principal.setVisible(true);
                    TelaPrincipal.btnRelatorios.setEnabled(true);
                    TelaPrincipal.lblUsuarios.setText(rs.getString(2));
                    TelaPrincipal.lblUsuarios.setForeground(Color.red);
                    this.dispose();
                    conexao.close();
                }else{
                    TelaPrincipal principal = new TelaPrincipal();
                    TelaPrincipal.lblUsuarios.setText(rs.getString(2));
                    principal.setVisible(true);
                    this.dispose();
                    conexao.close();
                }
            } else {
                JOptionPane.showMessageDialog(
                    null,
                    "Usuario ou senha incorretos!"
                    + "\nTente novamente!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //METODO DA FUNÇÃO CADASTRAR:
    public void registrar() {
        TelaCadastro cadastro = new TelaCadastro();
        cadastro.setVisible(true);
        this.dispose();
    }
    
    //METODO DA FUNÇÃO RECUPERAR-SENHA:
    public void recuperarSenha() {
        TelaLoginRecuperarSenha recuperarSenha = new TelaLoginRecuperarSenha();
        recuperarSenha.setVisible(true);
        this.dispose();
    }

    //VERIFICAÇÃO DO BANCO DE DADOS DA TELA-LOGIN:TelaRecuperarSenha
    public TelaLogin() {
        initComponents();
        conexao = Conexao.conexao();

        if (conexao == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Falha na conexão com o banco de dados."
                    + "\nContate o programador!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnRecuperarSenha = new javax.swing.JToggleButton();
        btnLogar = new javax.swing.JToggleButton();
        btnRegistrar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Acesso");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 321, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jLabel2.setText("          Tela de Acesso");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 220, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel4.setText("Entre com seu login e senha,");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 170, 20));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel7.setText("Senha:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel5.setText("Login:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 12)); // NOI18N
        jLabel6.setText("caso não tenha clique em \"Registrar\".");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 230, 20));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 160, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 160, -1));

        btnRecuperarSenha.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnRecuperarSenha.setText("Recuperar Senha");
        btnRecuperarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecuperarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 140, -1));

        btnLogar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnLogar.setText("Acessar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 260, 120, -1));

        btnRegistrar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        //FUNÇÃO DO BOTAO "Acessar" DA TELA-LOGIN:
    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        logar();
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRecuperarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperarSenhaActionPerformed
        recuperarSenha();
    }//GEN-LAST:event_btnRecuperarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
    //BOTÕES E CAMPOS DA TELA-LOGIN:
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLogar;
    private javax.swing.JToggleButton btnRecuperarSenha;
    private javax.swing.JToggleButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
