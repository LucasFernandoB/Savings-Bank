
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {

        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblLogin = new javax.swing.JLabel();
        psfLogin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        rdbGerente = new javax.swing.JRadioButton();
        rdbCliente = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        btnCriarConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblLogin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLogin.setText("LOGIN");

        psfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psfLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText(" SAVINGS  BANK");

        btnEntrar.setForeground(new java.awt.Color(51, 51, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbGerente);
        rdbGerente.setSelected(true);
        rdbGerente.setText("GERENTE");
        rdbGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGerenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbCliente);
        rdbCliente.setText("CLIENTE");
        rdbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbClienteActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCriarConta.setText("CRIAR CONTA");
        btnCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCriarConta)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(psfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbGerente)
                            .addComponent(rdbCliente))
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rdbGerente)
                                .addGap(1, 1, 1)
                                .addComponent(rdbCliente))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(psfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnEntrar)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCriarConta)
                    .addComponent(jButton1))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //crinado as senhas do login
        try {
            String senha = "12345";
            String senhaCliente = "123";

            //conertendo oq o usuario digitou em inteiro
            int senhaTela = Integer.parseInt(psfLogin.getText());

            //condicoes de entrada atraves do login
            if (psfLogin.getText().equals(senha) && rdbGerente.isSelected()) {

                new CadastroGerente().setVisible(true);//pra chamar a tela principal
                psfLogin.setText("");
                JOptionPane.showMessageDialog(rootPane, "SEJA BEM VINDO ROBERTA!");
            } //condicao de escolher a opcao gerente e a senha esta incorreta
            else if ((rdbGerente.isSelected() || psfLogin.getText().equals(senha))) {
                JOptionPane.showMessageDialog(rootPane, "SENHA INCORRETA!");//pra aparecer a mensagem de erro
                psfLogin.setText("");
            } //condicao de ser o cliente e a senha esta correta
            else if (psfLogin.getText().equals(senhaCliente) && rdbCliente.isSelected()) {

                new ConferirMovimentacao().setVisible(true);//pra chamar a tela principal
                psfLogin.setText("");
                JOptionPane.showMessageDialog(rootPane, "SEJA BEM VINDO LUCAS!");
            } //condicao de ser cliente e a senha esta errada
            else if ((rdbCliente.isSelected() || psfLogin.getText().equals(senhaCliente))) {
                JOptionPane.showMessageDialog(rootPane, "SENHA INCORRETA!");//pra aparecer a mensagem de erro
                psfLogin.setText("");
            }

            //tratamento de erros de nao ter digitado nada e querer acessar 
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "DADOS  OU SENHA INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
            psfLogin.setText("");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void rdbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbClienteActionPerformed

        if (rdbCliente.isSelected()) {
            psfLogin.setEnabled(true);
        }


    }//GEN-LAST:event_rdbClienteActionPerformed

    private void rdbGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGerenteActionPerformed
        psfLogin.setEnabled(true);//abilitar botao gerente
    }//GEN-LAST:event_rdbGerenteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);//fechar o programa
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarContaActionPerformed
        //abrir o cadastro dos clientes
        new DadosClientes().setVisible(true);
        psfLogin.setText("");
        JOptionPane.showMessageDialog(rootPane, "SEJA BEM VINDO AO CADASTRO DO SAVINGS BANK!");
    }//GEN-LAST:event_btnCriarContaActionPerformed

    private void psfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psfLoginActionPerformed

    }//GEN-LAST:event_psfLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarConta;
    private javax.swing.JButton btnEntrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JPasswordField psfLogin;
    private javax.swing.JRadioButton rdbCliente;
    private javax.swing.JRadioButton rdbGerente;
    // End of variables declaration//GEN-END:variables
}
