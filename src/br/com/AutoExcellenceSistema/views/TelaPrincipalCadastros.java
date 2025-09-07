/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.AutoExcellenceSistema.views;

import br.com.AutoExcellenceSistema.dao.Conexao;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaPrincipalCadastros extends javax.swing.JInternalFrame {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public TelaPrincipalCadastros() {
        initComponents();
        conexao = Conexao.conexao();
    }
    
        //METODO DA FUNÇÃO CADASTRAR:
    public void gerarDescricao() {
        
        String sql = "insert into usuarios (veiculo, cor, placa, cliente, telefone, endereco, numero, instagram, email)"
                + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
        try {
            if (txtVeiculo.getText().isEmpty() || txtCorVeiculo.getText().isEmpty() || txtPlacaVeiculo.getText().isEmpty() ||
                    txtCliente.getText().isEmpty() || txtNumeroCliente.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                return;
            }
            
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txtVeiculo.getText());
            pst.setString(2, CorVeiculo.getText());
            pst.setString(3, txtPlacaVeiculo.getText());
            pst.setString(4, txtCliente.getText());
            pst.setString(5, txtNumeroCliente.getText());
            pst.setString(6, txtEnderecoCliente.getText());
            pst.setString(7, txtNumeroEndereco.getText());
            pst.setString(8, txtInstagram.getText());
            pst.setString(9, txtEmailCliente.getText());
        
            TelaGerarDescricao gerarDescricao = new TelaGerarDescricao();
            gerarDescricao.setVisible(true);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Erro ao validar: " + e.getMessage(),
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNumeroCliente = new javax.swing.JTextField();
        txtEmailCliente = new javax.swing.JTextField();
        txtNumeroEndereco = new javax.swing.JTextField();
        txtVeiculo = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        CorVeiculo = new javax.swing.JTextField();
        txtPlacaVeiculo = new javax.swing.JTextField();
        txtEnderecoCliente = new javax.swing.JTextField();
        txtInstagram = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c6 = new javax.swing.JCheckBox();
        c7 = new javax.swing.JCheckBox();
        c8 = new javax.swing.JCheckBox();
        c9 = new javax.swing.JCheckBox();
        c10 = new javax.swing.JCheckBox();
        c11 = new javax.swing.JCheckBox();
        c12 = new javax.swing.JCheckBox();
        c13 = new javax.swing.JCheckBox();
        c14 = new javax.swing.JCheckBox();
        c15 = new javax.swing.JCheckBox();
        c16 = new javax.swing.JCheckBox();
        c17 = new javax.swing.JCheckBox();
        c18 = new javax.swing.JCheckBox();
        c19 = new javax.swing.JCheckBox();
        c20 = new javax.swing.JCheckBox();
        esbocoCarro = new javax.swing.JLabel();
        gerarDescricao = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtCorVeiculo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("GERAR ORÇAMENTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 144, -1));

        jLabel16.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSistema2.jpg"))); // NOI18N
        jLabel16.setText("jLabel10");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 270, 20));
        getContentPane().add(txtNumeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 132, 150, -1));
        getContentPane().add(txtEmailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 244, 280, -1));
        getContentPane().add(txtNumeroEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 186, 150, -1));

        txtVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(txtVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 78, 280, -1));
        getContentPane().add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 132, 280, -1));

        CorVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorVeiculoActionPerformed(evt);
            }
        });
        getContentPane().add(CorVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 76, 150, -1));
        getContentPane().add(txtPlacaVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 76, 150, -1));

        txtEnderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtEnderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 186, 280, -1));

        txtInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstagramActionPerformed(evt);
            }
        });
        getContentPane().add(txtInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 186, 150, -1));

        jLabel2.setText("Veículo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 56, -1, -1));

        jLabel3.setText("Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 110, -1, -1));

        jLabel4.setText("Endereço:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 164, -1, -1));

        jLabel5.setText("Email:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 222, -1, -1));

        jLabel6.setText("Cor:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 56, -1, -1));

        jLabel7.setText("Telefone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel8.setText("Numero:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 164, -1, -1));

        jLabel9.setText("Placa:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 56, -1, -1));

        jLabel10.setText("Instagram: (Não obrigatório)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 164, -1, -1));

        c1.setText("Para-choque dianteiro");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 266, 150, -1));

        c2.setText("Para-choque trasiero");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 266, 150, -1));

        c3.setText("Lateral traseira direita");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 292, 150, -1));

        c4.setText("Lateral traseira esquerda");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 292, -1, -1));

        c5.setText("Porta traseira direita");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 318, -1, -1));

        c6.setText("Porta traseira esquerda");
        getContentPane().add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 318, -1, -1));

        c7.setText("Porta dianteira direita");
        getContentPane().add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 344, -1, -1));

        c8.setText("Porta dianteira esquerda");
        getContentPane().add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 344, -1, -1));

        c9.setText("Paralama direito");
        getContentPane().add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 370, -1, -1));

        c10.setText("Paralama esquerdo");
        getContentPane().add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 370, -1, -1));

        c11.setText("Coluna direita");
        getContentPane().add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 396, -1, -1));

        c12.setText("Coluna esquerda");
        getContentPane().add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 396, -1, -1));

        c13.setText("Caixa de ar direito");
        getContentPane().add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 422, -1, -1));

        c14.setText("Caixa de ar esquerdo");
        getContentPane().add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 422, -1, -1));

        c15.setText("Roda dianteira direita");
        getContentPane().add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 448, -1, -1));

        c16.setText("Roda dianteira esquerda");
        getContentPane().add(c16, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 448, -1, -1));

        c17.setText("Roda traseira direita");
        getContentPane().add(c17, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 474, -1, -1));

        c18.setText("Roda traseira esquerda");
        getContentPane().add(c18, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 474, -1, -1));

        c19.setText("Teto");
        getContentPane().add(c19, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 500, -1, -1));

        c20.setText("Outros");
        getContentPane().add(c20, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 500, -1, -1));

        esbocoCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/esbocoCarro_redimensionada.jpg"))); // NOI18N
        esbocoCarro.setText("IMAGEM \"ESBOÇO CARRO\"");
        esbocoCarro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(esbocoCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 440, 240));

        gerarDescricao.setText("GERAR DESCRIÇÃO");
        gerarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarDescricaoActionPerformed(evt);
            }
        });
        getContentPane().add(gerarDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 565, 153, -1));

        cancelar.setText("CANCELAR");
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 565, 165, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSistema2.jpg"))); // NOI18N
        jLabel15.setText("jLabel10");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 850, 50));

        txtCorVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSistema2.jpg"))); // NOI18N
        txtCorVeiculo.setText("jLabel13");
        txtCorVeiculo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtCorVeiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 850, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoSitema1.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 640));

        setBounds(0, 0, 960, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void txtVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVeiculoActionPerformed

    }//GEN-LAST:event_txtVeiculoActionPerformed

    private void CorVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorVeiculoActionPerformed

    private void txtInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstagramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstagramActionPerformed

    private void txtEnderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoClienteActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void gerarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarDescricaoActionPerformed
        gerarDescricao();
    }//GEN-LAST:event_gerarDescricaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CorVeiculo;
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c10;
    private javax.swing.JCheckBox c11;
    private javax.swing.JCheckBox c12;
    private javax.swing.JCheckBox c13;
    private javax.swing.JCheckBox c14;
    private javax.swing.JCheckBox c15;
    private javax.swing.JCheckBox c16;
    private javax.swing.JCheckBox c17;
    private javax.swing.JCheckBox c18;
    private javax.swing.JCheckBox c19;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c20;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JCheckBox c6;
    private javax.swing.JCheckBox c7;
    private javax.swing.JCheckBox c8;
    private javax.swing.JCheckBox c9;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel esbocoCarro;
    private javax.swing.JButton gerarDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JLabel txtCorVeiculo;
    private javax.swing.JTextField txtEmailCliente;
    private javax.swing.JTextField txtEnderecoCliente;
    private javax.swing.JTextField txtInstagram;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtNumeroEndereco;
    private javax.swing.JTextField txtPlacaVeiculo;
    private javax.swing.JTextField txtVeiculo;
    // End of variables declaration//GEN-END:variables

}
