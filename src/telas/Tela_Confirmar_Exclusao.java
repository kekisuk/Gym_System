package telas;

import DAO.Conexao;
import DAO.UsuarioDAO;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * AUTORES: Francisca Kelen Ferreira dos Santos, Mateus Eugênio de Andrade, Thiago Natalys Ribeiro da Silva, Olavo Cartaxo.
 */

public class Tela_Confirmar_Exclusao extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Confirmar_Exclusao
     */
    public Tela_Confirmar_Exclusao() {
        initComponents();
    }
    
    String CPF;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        TextHeader = new javax.swing.JLabel();
        ContainerButtons = new javax.swing.JPanel();
        BtCancelar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        TextDigiteOCPF = new javax.swing.JLabel();
        TextFieldCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextHeader.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TextHeader.setForeground(new java.awt.Color(0, 0, 0));
        TextHeader.setText("Athletica System | Excluir Cliente");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(TextHeader)
                .addGap(61, 61, 61))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TextHeader)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        ContainerButtons.setBackground(new java.awt.Color(204, 204, 204));
        ContainerButtons.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BtCancelar.setBackground(new java.awt.Color(255, 255, 255));
        BtCancelar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtCancelar.setForeground(new java.awt.Color(0, 0, 0));
        BtCancelar.setText("Cancelar");
        BtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCancelarActionPerformed(evt);
            }
        });

        BtExcluir.setBackground(new java.awt.Color(255, 255, 255));
        BtExcluir.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        BtExcluir.setForeground(new java.awt.Color(0, 0, 0));
        BtExcluir.setText("Excluir");
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });

        TextDigiteOCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextDigiteOCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextDigiteOCPF.setText("Digite novamente o CPF");

        TextFieldCPF.setBackground(new java.awt.Color(255, 255, 255));
        TextFieldCPF.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TextFieldCPF.setForeground(new java.awt.Color(0, 0, 0));
        TextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerButtonsLayout = new javax.swing.GroupLayout(ContainerButtons);
        ContainerButtons.setLayout(ContainerButtonsLayout);
        ContainerButtonsLayout.setHorizontalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerButtonsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtExcluir))
                    .addGroup(ContainerButtonsLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(TextDigiteOCPF)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ContainerButtonsLayout.setVerticalGroup(
            ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TextDigiteOCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ContainerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCancelar)
                    .addComponent(BtExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContainerButtons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainerButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BtCancelarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        // TODO add your handling code here:
        CPF = TextFieldCPF.getText();

        if(CPF.equals("")) {
            JOptionPane.showMessageDialog(null, "O campo não pode estar vazio!", "Athletica System", JOptionPane.WARNING_MESSAGE);
        }else{
            Connection con = (Connection) Conexao.AbrirConexao();
            UsuarioDAO sql = new UsuarioDAO((java.sql.Connection) con);
            
            UsuarioDAO.CPFU = CPF;

            /*System.out.println(UsuarioDAO.nome);
            System.out.println(UsuarioDAO.idade);
            System.out.println(UsuarioDAO.endereco);
            System.out.println(UsuarioDAO.telefone);
            System.out.println(UsuarioDAO.modalidade);
            System.out.println(CPFU);*/

            sql.Excluir_Usuario();
            Conexao.FecharConexao((java.sql.Connection) con);

            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!", "Athletica System", JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void TextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCPFActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_TextFieldCPFActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Confirmar_Exclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Exclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Exclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Confirmar_Exclusao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Confirmar_Exclusao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCancelar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JPanel ContainerButtons;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel TextDigiteOCPF;
    private javax.swing.JTextField TextFieldCPF;
    private javax.swing.JLabel TextHeader;
    // End of variables declaration//GEN-END:variables
}
