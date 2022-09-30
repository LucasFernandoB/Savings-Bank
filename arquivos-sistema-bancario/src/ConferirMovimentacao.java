
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConferirMovimentacao extends javax.swing.JFrame {

    //variavel global do valor do saldo 
    float saldoTotal = 2000;

//criacao do array lit e configuracao da tabela
    ArrayList<ClassMovimentacao> listaGe;

    public void CarregarTabela() {
        //criar o metodo da tabela
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"TIPO", "Juros %", "Dia", "Movimentacao", "Saldo R$"}, 0);

        for (int i = 0; i < listaGe.size(); i++) {
            Object linha[] = new Object[]{
                listaGe.get(i).getTipo(),
                listaGe.get(i).getJuros(),
                listaGe.get(i).getDia(),
                listaGe.get(i).getValor(),
                listaGe.get(i).getSaltoTotal()};
            modelo.addRow(linha);
        }
        //tabela recebe modelo
        tblMovimentacao.setModel(modelo);

        //configurar largura da tabela
        tblMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(300);
        tblMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(30);
        tblMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(50);

    }
    //construtor da movimentacao

    public ConferirMovimentacao() {
        //criando o array list
        listaGe = new ArrayList();

        initComponents();
        setLocationRelativeTo(null);
        txtValor.setEnabled(false);
        //txtJuros.setEnabled(false); 
        txtDia.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimentacao = new javax.swing.JTable();
        btnSaque = new javax.swing.JButton();
        btnDeposito = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        btnSaldo = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDia = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMovimentacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TIPO", "Juros  %", "Movimentacao", "Dia", "Saldo R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMovimentacao);
        if (tblMovimentacao.getColumnModel().getColumnCount() > 0) {
            tblMovimentacao.getColumnModel().getColumn(0).setResizable(false);
            tblMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(100);
            tblMovimentacao.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblMovimentacao.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btnSaque.setText("SAQUE");
        btnSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaqueActionPerformed(evt);
            }
        });

        btnDeposito.setText("DEPOSITO");
        btnDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositoActionPerformed(evt);
            }
        });

        btnEmprestimo.setText("EMPRESTIMO");
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });

        btnSaldo.setText("SALDO   ATUAL");
        btnSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaldoActionPerformed(evt);
            }
        });

        jButton5.setText("SAIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("VALOR  R$");

        jLabel3.setText("DIA");

        btnSalvar.setText("CONCLUIR ");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSaque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeposito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmprestimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSaque)
                    .addComponent(btnDeposito)
                    .addComponent(btnEmprestimo)
                    .addComponent(btnSaldo)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaqueActionPerformed
        //abilitando e desabilitando txts e botoes  
        txtValor.setEnabled(true);
        txtDia.setEnabled(true);
        btnDeposito.setEnabled(false);
        btnSaldo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnEmprestimo.setEnabled(false);
        btnCancelar.setEnabled(true);
    }//GEN-LAST:event_btnSaqueActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        //pra conferrir o botao salvar e limpar os campos
        if (txtDia.getText().equals("") || txtValor.getText().equals(""))//)||txtJuros.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "TODOS OS CAMPOS DEVEM SER PREENCHIDOS!");
            // txtJuros.setEnabled(true);  
            txtValor.setEnabled(true);
            txtDia.setEnabled(true);
            btnDeposito.setEnabled(false);
            btnSaldo.setEnabled(false);
            btnSalvar.setEnabled(true);
            btnEmprestimo.setEnabled(false);
            btnCancelar.setEnabled(true);

        } else {
            try {
                //convertendo os dados
                int dia = Integer.parseInt(txtDia.getText());
                float juros;//=Float.parseFloat(txtJuros.getText());
                float valor = Float.parseFloat(txtValor.getText());
                String tipo = "SAQUE";
                String tipo1 = "EMPRESTIMO";
                String tipo2 = "DEPOSITO";
                // float saldoTotal;

                //se o usuario quer fazer um saque
                if (btnSaque.isEnabled()) {
                    juros = 0;
                    if (valor > saldoTotal) {
                        JOptionPane.showMessageDialog(rootPane, "Nao e possivel realizar o saque!\n Voce nao tem saldo suficiente.");
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "OPERACAO REALIZADA!");
                        saldoTotal = saldoTotal - valor;
                        ClassMovimentacao movimentacao = new ClassMovimentacao(tipo, juros, dia, valor, saldoTotal);
                        listaGe.add(movimentacao);
                        CarregarTabela();
                    }
                    //se o usuario quer fazer um emprestimo
                } else if (btnEmprestimo.isEnabled()) {
                    JOptionPane.showMessageDialog(rootPane, "OPERACAO REALIZADA!");
                    juros = 2f;
                    saldoTotal = saldoTotal + valor;
                    ClassMovimentacao movimentacao = new ClassMovimentacao(tipo1, juros, dia, valor, saldoTotal);
                    listaGe.add(movimentacao);
                    CarregarTabela();
                    //se o usuario quer fazer um deposito
                } else {
                    JOptionPane.showMessageDialog(rootPane, "OPERACAO REALIZADA!");
                    juros = 0;
                    saldoTotal = saldoTotal + valor;
                    ClassMovimentacao movimentacao = new ClassMovimentacao(tipo2, juros, dia, valor, saldoTotal);
                    listaGe.add(movimentacao);
                    CarregarTabela();
                }
                //limpando txts e abilitando os botoes
                txtDia.setText("");
                //txtJuros.setText("");
                txtValor.setText("");
                txtValor.setEnabled(false);
                //txtJuros.setEnabled(false);
                txtDia.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnSaldo.setEnabled(true);
                btnEmprestimo.setEnabled(true);
                btnSaque.setEnabled(true);
                btnDeposito.setEnabled(true);
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
            }

        }
        // } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositoActionPerformed
        //abilitando e desabilitando txts e botoes  
        btnSaldo.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnEmprestimo.setEnabled(false);
        btnSaque.setEnabled(false);
        txtValor.setEnabled(true);
        // txtJuros.setEnabled(true); 
        txtDia.setEnabled(true);
    }//GEN-LAST:event_btnDepositoActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        //abilitando e desabilitando txts e botoes  
        btnSaldo.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnDeposito.setEnabled(false);
        btnSaque.setEnabled(false);
        txtValor.setEnabled(true);
        txtDia.setEnabled(true);
        //apenas informar ao usuario que emprestimo cobra juros
        JOptionPane.showMessageDialog(rootPane, "ATENCAO!\n Ao solicitar um emprestimo voce tera ate 100 \ndias úties "
                + " para pagar o valor pedido.\n\n O SAVINGS BANK cobra juros de 2% ao mes.");
        // txtJuros.setEnabled(true);
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaldoActionPerformed
//     btnCancelar.setEnabled(true);
//     btnSalvar.setEnabled(true);
//     btnDeposito.setEnabled(false);
//     btnSaque.setEnabled(false);
//     btnEmprestimo.setEnabled(false);
//     txtDia.setEnabled(false);
//    // txtJuros.setEnabled(false);
//     txtValor.setEnabled(false);
//     btnSalvar.setEnabled(false);

        JOptionPane.showMessageDialog(rootPane, "SALDO ATUAL :  \nR$ " + saldoTotal);


    }//GEN-LAST:event_btnSaldoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        //abilitando e desabilitando txts e botoes  
        btnSaque.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnSaldo.setEnabled(true);
        btnEmprestimo.setEnabled(true);
        btnDeposito.setEnabled(true);
        // txtJuros.setEnabled(false);
        txtValor.setEnabled(false);
        txtDia.setEnabled(false);

        txtDia.setText("");
        txtValor.setText("");
        // txtJuros.setText("");

    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(ConferirMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConferirMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConferirMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConferirMovimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConferirMovimentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeposito;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnSaldo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSaque;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovimentacao;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
