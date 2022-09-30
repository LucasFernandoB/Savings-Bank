
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadastroGerente extends javax.swing.JFrame {

    //auxiliares pra ver se codigo existe
    int z = 2, a = 3, linhaExcluir;
    //variavel para o array list
    public ArrayList<Gerente> ListaGerentes;
    String salvar;
    String botao;

    public void CarregarTabelaGerente() {
        //criar o metodo da tabela
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Codigo", "Cpf", "Nome", "Funcao", "Salario"}, 0);
        //carregar a tabela
        for (int i = 0; i < ListaGerentes.size(); i++) {
            Object linha[] = new Object[]{
                ListaGerentes.get(i).getCodigo(),
                ListaGerentes.get(i).getCpf(),
                ListaGerentes.get(i).getNome(),
                ListaGerentes.get(i).getFuncao(),
                ListaGerentes.get(i).getSalario()};

            modelo.addRow(linha);
        }
        //tabela recebe modelo
        tblGerentes.setModel(modelo);

        //configurar largura da tabela
        tblGerentes.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblGerentes.getColumnModel().getColumn(1).setPreferredWidth(30);
        tblGerentes.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblGerentes.getColumnModel().getColumn(0).setPreferredWidth(50);

    }

    public CadastroGerente() {
        initComponents();
        setLocationRelativeTo(null);
        //criando o array list
        ListaGerentes = new ArrayList();

        //habilitando e desabilitando btn e txt
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(false);
        btnEditarGerente.setEnabled(false);
        btnExcluirGerente.setEnabled(true);
        btnPesquizarGerente.setEnabled(true);
        btnOk.setEnabled(false);

        txtNomeGerente.setEnabled(false);
        txtCodigoGerente.setEnabled(false);
        txtCpfGerente.setEnabled(false);
        txtFuncaoGerente.setEnabled(false);
        txtSalario.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoGerente = new javax.swing.JTextField();
        txtCpfGerente = new javax.swing.JTextField();
        txtNomeGerente = new javax.swing.JTextField();
        txtFuncaoGerente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGerentes = new javax.swing.JTable();
        btnNovoGerente = new javax.swing.JButton();
        btnSalvarGerente = new javax.swing.JButton();
        btnCancelarGerente = new javax.swing.JButton();
        btnExcluirGerente = new javax.swing.JButton();
        btnPesquizarGerente = new javax.swing.JButton();
        btnSair = new javax.swing.JToggleButton();
        btnEditarGerente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro do  Gerentes");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DADOS DO CLIENTE"));

        jLabel1.setText("Codigo");

        jLabel2.setText("CPF");

        jLabel3.setText("Nome");

        jLabel4.setText("Profissão");

        txtCodigoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoGerenteActionPerformed(evt);
            }
        });

        txtCpfGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfGerenteActionPerformed(evt);
            }
        });

        txtFuncaoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFuncaoGerenteActionPerformed(evt);
            }
        });

        jLabel5.setText("Salario   R$");

        btnOk.setText("Ok");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpfGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOk))
                    .addComponent(txtFuncaoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoGerente)
                        .addComponent(btnOk)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCpfGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFuncaoGerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        tblGerentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "CPF", "Nome", "Função", "Salario  R$"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGerentes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGerentesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGerentes);
        if (tblGerentes.getColumnModel().getColumnCount() > 0) {
            tblGerentes.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblGerentes.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblGerentes.getColumnModel().getColumn(2).setPreferredWidth(200);
            tblGerentes.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblGerentes.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        btnNovoGerente.setText("Novo");
        btnNovoGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoGerenteActionPerformed(evt);
            }
        });

        btnSalvarGerente.setText("Concluir");
        btnSalvarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarGerenteActionPerformed(evt);
            }
        });

        btnCancelarGerente.setText("Cancelar");
        btnCancelarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarGerenteActionPerformed(evt);
            }
        });

        btnExcluirGerente.setText("Excluir");
        btnExcluirGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGerenteActionPerformed(evt);
            }
        });

        btnPesquizarGerente.setText("Pesquizar");
        btnPesquizarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquizarGerenteActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnEditarGerente.setText("Editar");
        btnEditarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarGerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnNovoGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirGerente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquizarGerente)
                .addGap(30, 30, 30)
                .addComponent(btnSair)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoGerente)
                    .addComponent(btnSalvarGerente)
                    .addComponent(btnCancelarGerente)
                    .addComponent(btnExcluirGerente)
                    .addComponent(btnPesquizarGerente)
                    .addComponent(btnEditarGerente)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel1.getAccessibleContext().setAccessibleName("CADASTRO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCpfGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfGerenteActionPerformed

    }//GEN-LAST:event_txtCpfGerenteActionPerformed

    private void txtCodigoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoGerenteActionPerformed

    }//GEN-LAST:event_txtCodigoGerenteActionPerformed

    private void btnNovoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoGerenteActionPerformed

        //habilitando e desabilitando btns e txts
        btnSalvarGerente.setEnabled(true);
        btnCancelarGerente.setEnabled(true);
        btnPesquizarGerente.setEnabled(false);

        txtNomeGerente.setEnabled(true);
        txtCodigoGerente.setEnabled(true);
        txtCpfGerente.setEnabled(true);
        txtFuncaoGerente.setEnabled(true);
        txtSalario.setEnabled(true);

        //limpando os txts
        txtCodigoGerente.setText("");
        txtCpfGerente.setText("");
        txtFuncaoGerente.setText("");
        txtSalario.setText("");
        txtNomeGerente.setText("");

        btnEditarGerente.setEnabled(false);
        btnExcluirGerente.setEnabled(false);

    }//GEN-LAST:event_btnNovoGerenteActionPerformed

    private void btnCancelarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarGerenteActionPerformed
        //habilitando e desabilitando btns e txts
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(false);
        btnEditarGerente.setEnabled(true);
        btnExcluirGerente.setEnabled(true);
        btnNovoGerente.setEnabled(true);
        btnPesquizarGerente.setEnabled(true);
        txtNomeGerente.setEnabled(true);
        btnOk.setEnabled(false);

        //limpando os txts
        txtCodigoGerente.setText("");
        txtCpfGerente.setText("");
        txtFuncaoGerente.setText("");
        txtSalario.setText("");
        txtNomeGerente.setText("");

        txtNomeGerente.setEnabled(false);
        txtCodigoGerente.setEnabled(false);
        txtCpfGerente.setEnabled(false);
        txtFuncaoGerente.setEnabled(false);
        txtSalario.setEnabled(false);

    }//GEN-LAST:event_btnCancelarGerenteActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarGerenteActionPerformed

        // opcao de salvar os dados para novo cliente ou salvar os dados da edicao dos dados do cliente
        if (btnNovoGerente.isEnabled() || btnEditarGerente.isEnabled()) {
            //pra ver se todos os campos foram preeenchidos
            if (txtCodigoGerente.getText().equals("") || txtCpfGerente.getText().equals("") || txtNomeGerente.getText().equals("") || txtSalario.getText().equals("") || txtFuncaoGerente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Todos os codigos devem ser inseridos!", " mensagem", JOptionPane.PLAIN_MESSAGE);
                //condicao de ser o botao editar selecionado e os campos estiverem preenchidos
            } else if (btnEditarGerente.isEnabled() && (!txtCodigoGerente.getText().equals("") || !txtCpfGerente.getText().equals("") || !txtNomeGerente.getText().equals("") || !txtSalario.getText().equals("") || !txtFuncaoGerente.getText().equals(""))) {
                if (txtCodigoGerente.getText().equals("") || txtCpfGerente.getText().equals("") || txtNomeGerente.getText().equals("") || txtSalario.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Todos os codigos devem ser inseridos!", " mensagem", JOptionPane.PLAIN_MESSAGE);
                } else {
                    //os dados estao preeenchidos e eu edito a tabela
                    DefaultTableModel dtm = (DefaultTableModel) tblGerentes.getModel();
                    try {
                        int index = tblGerentes.getSelectedRow();
                        dtm.removeRow(index);
                        ListaGerentes.remove(index);
                        tblGerentes.setModel(dtm);
                        //conversao dos dados que o usuario vai editar
                        int codiEditado = Integer.parseInt(txtCodigoGerente.getText());
                        long cpfEditado = Long.parseLong(txtCpfGerente.getText());
                        String nomeEditado = txtNomeGerente.getText();
                        String funcaoEditado = txtFuncaoGerente.getText();
                        String salarioEditado = txtSalario.getText();
                        Gerente gerente = new Gerente(codiEditado, cpfEditado, nomeEditado, funcaoEditado, salarioEditado);
                        ListaGerentes.add(gerente);
                        CarregarTabelaGerente();
                    } catch (Exception erro) {
                        JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
                    }
                    //limpando os txts
                    txtCodigoGerente.setText("");
                    txtCpfGerente.setText("");
                    txtFuncaoGerente.setText("");
                    txtSalario.setText("");
                    txtNomeGerente.setText("");
                    //habilitando e desabilitando btns e txts  
                    btnSalvarGerente.setEnabled(false);
                    btnCancelarGerente.setEnabled(false);
                    btnEditarGerente.setEnabled(true);
                    btnExcluirGerente.setEnabled(true);
                    btnPesquizarGerente.setEnabled(true);
                    btnNovoGerente.setEnabled(true);

                    txtNomeGerente.setEnabled(false);
                    txtCodigoGerente.setEnabled(false);
                    txtCpfGerente.setEnabled(false);
                    txtFuncaoGerente.setEnabled(false);
                    txtSalario.setEnabled(false);

                }
            } else {
                try {
                    //convertendo os dados do novo cadastro
                    int cod = Integer.parseInt(txtCodigoGerente.getText());
                    long cpf = Long.parseLong(txtCpfGerente.getText());
                    String nome = txtNomeGerente.getText();
                    String funcao = txtFuncaoGerente.getText();
                    String salario = txtSalario.getText();
                    //adicionado na tabela
                    Gerente gerente = new Gerente(cod, cpf, nome, funcao, salario);
                    ListaGerentes.add(gerente);
                    CarregarTabelaGerente();
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
                }

                //limpando os txts
                txtCodigoGerente.setText("");
                txtCpfGerente.setText("");
                txtFuncaoGerente.setText("");
                txtSalario.setText("");
                txtNomeGerente.setText("");

                //habilitando e desabilitando btns e txts  
                btnSalvarGerente.setEnabled(false);
                btnCancelarGerente.setEnabled(false);
                btnEditarGerente.setEnabled(true);
                btnExcluirGerente.setEnabled(true);
                btnPesquizarGerente.setEnabled(true);
                btnNovoGerente.setEnabled(true);

                txtNomeGerente.setEnabled(false);
                txtCodigoGerente.setEnabled(false);
                txtCpfGerente.setEnabled(false);
                txtFuncaoGerente.setEnabled(false);
                txtSalario.setEnabled(false);
            }
        } //se o botao excluir estiver selecionaod e o usuario apertar salvar para ecluir os dados
        else if (btnExcluirGerente.isEnabled()) {
            try {
                //convertendo os dados
                int cod = Integer.parseInt(txtCodigoGerente.getText());
                DefaultTableModel dtm = (DefaultTableModel) tblGerentes.getModel();
                for (int i = 0; i < ListaGerentes.size(); i++) {
                    if (ListaGerentes.get(i).getCodigo() == cod) {

                        //habilitando txts e botoes
                        btnEditarGerente.setEnabled(true);
                        btnExcluirGerente.setEnabled(true);
                        btnPesquizarGerente.setEnabled(true);
                        btnNovoGerente.setEnabled(true);
                        txtCodigoGerente.setEnabled(false);
                        btnOk.setEnabled(false);
                        btnSalvarGerente.setEnabled(false);
                        btnCancelarGerente.setEnabled(false);

                        //removendo da tabela e fisicamente os dados
                        dtm.removeRow(i);
                        ListaGerentes.remove(i);
                        tblGerentes.setModel(dtm);

                        JOptionPane.showMessageDialog(null, "DADOS EXCLUIDOS COM SUCESSO", " mensagem", JOptionPane.PLAIN_MESSAGE);
                        txtCodigoGerente.setText("");
                        txtCpfGerente.setText("");
                        txtFuncaoGerente.setText("");
                        txtSalario.setText("");
                        txtNomeGerente.setText("");
                    }
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
            }
            //habilitando e desabilitando os botoes e txts
            btnEditarGerente.setEnabled(true);
            btnExcluirGerente.setEnabled(true);
            btnPesquizarGerente.setEnabled(true);
            btnNovoGerente.setEnabled(true);
            txtCodigoGerente.setEnabled(false);
            btnOk.setEnabled(false);
            btnSalvarGerente.setEnabled(false);
            btnCancelarGerente.setEnabled(false);
            txtCodigoGerente.setText("");
            txtCpfGerente.setText("");
            txtFuncaoGerente.setText("");
            txtSalario.setText("");
            txtNomeGerente.setText("");
        }


    }//GEN-LAST:event_btnSalvarGerenteActionPerformed

    private void txtFuncaoGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFuncaoGerenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFuncaoGerenteActionPerformed

    private void tblGerentesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGerentesMouseClicked
        //guarda o indice da linha selecionada
        int index = tblGerentes.getSelectedRow();

        if (index >= 0 && index < ListaGerentes.size()) {
            //pegar os dados da tabela(lista) a partir de num 
            Gerente ger = ListaGerentes.get(index);
            txtCodigoGerente.setText(String.valueOf(ger.getCodigo()));
            txtCpfGerente.setText(String.valueOf(ger.getCpf()));
            txtNomeGerente.setText(ger.getNome());
            txtSalario.setText(ger.getSalario());
            txtFuncaoGerente.setText(ger.getFuncao());

            //habilitar e desabilitar os botoes e txts
            btnSalvarGerente.setEnabled(false);
            btnCancelarGerente.setEnabled(false);
            btnEditarGerente.setEnabled(true);
            btnExcluirGerente.setEnabled(true);
            btnPesquizarGerente.setEnabled(true);
            btnNovoGerente.setEnabled(true);

            txtNomeGerente.setEnabled(false);
            txtCodigoGerente.setEnabled(false);
            txtCpfGerente.setEnabled(false);
            txtFuncaoGerente.setEnabled(false);
            txtSalario.setEnabled(false);

        }
    }//GEN-LAST:event_tblGerentesMouseClicked

    private void btnPesquizarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquizarGerenteActionPerformed

//abilitando e desabilitando txts e botoes  
        btnOk.setEnabled(true);
        txtCodigoGerente.setEnabled(true);
        btnCancelarGerente.setEnabled(true);
        btnNovoGerente.setEnabled(false);
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(true);
        btnEditarGerente.setEnabled(false);
        btnExcluirGerente.setEnabled(false);
        txtCodigoGerente.setText("");
        txtCpfGerente.setText("");
        txtFuncaoGerente.setText("");
        txtSalario.setText("");
        txtNomeGerente.setText("");
    }//GEN-LAST:event_btnPesquizarGerenteActionPerformed

    private void btnExcluirGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGerenteActionPerformed

        //habilitando e desabilitando txts e botoes
        txtCodigoGerente.setText("");
        txtCpfGerente.setText("");
        txtFuncaoGerente.setText("");
        txtSalario.setText("");
        txtNomeGerente.setText("");
        btnSalvarGerente.setEnabled(false);
        btnCancelarGerente.setEnabled(true);
        btnEditarGerente.setEnabled(false);
        btnPesquizarGerente.setEnabled(false);
        btnNovoGerente.setEnabled(false);
        btnOk.setEnabled(true);

        txtNomeGerente.setEnabled(false);
        txtCodigoGerente.setEnabled(true);
        txtCpfGerente.setEnabled(false);
        txtFuncaoGerente.setEnabled(false);
        txtSalario.setEnabled(false);


    }//GEN-LAST:event_btnExcluirGerenteActionPerformed

    private void btnEditarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarGerenteActionPerformed
        txtNomeGerente.setEnabled(true);
        //abilitando e desabilitando txts e botoes  
        txtCodigoGerente.setEnabled(true);
        txtCpfGerente.setEnabled(true);
        txtFuncaoGerente.setEnabled(true);
        txtSalario.setEnabled(true);
        btnSalvarGerente.setEnabled(true);
        btnCancelarGerente.setEnabled(true);
        btnPesquizarGerente.setEnabled(false);
        btnNovoGerente.setEnabled(false);
        btnOk.setEnabled(false);
        btnExcluirGerente.setEnabled(false);
    }//GEN-LAST:event_btnEditarGerenteActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        if (btnPesquizarGerente.isEnabled()) {

            //convertendo o dado que o usuario digitou
            try {
                int cod = Integer.parseInt(txtCodigoGerente.getText());
                //percorrendo a tabela
                for (int i = 0; i < ListaGerentes.size(); i++) {

                    //condicao de achar na tabela
                    if (ListaGerentes.get(i).getCodigo() == cod) {
                        Gerente ger = ListaGerentes.get(i);
                        txtCodigoGerente.setText(String.valueOf(ger.getCodigo()));
                        txtCpfGerente.setText(String.valueOf(ger.getCpf()));
                        txtNomeGerente.setText(ger.getNome());
                        txtSalario.setText(ger.getSalario());
                        txtFuncaoGerente.setText(ger.getFuncao());
                        z = 1;
                    }
                    //abilitando e desabilitando txts e botoes  
                    btnEditarGerente.setEnabled(false);
                    btnExcluirGerente.setEnabled(false);
                    btnPesquizarGerente.setEnabled(true);
                    btnNovoGerente.setEnabled(false);
                    txtCodigoGerente.setEnabled(false);
                    btnOk.setEnabled(false);
                    btnSalvarGerente.setEnabled(false);
                    btnCancelarGerente.setEnabled(true);
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
            }

            // pra veer se de fato foi encontrado na tabela os mesmos dados
            if (z != 1) {
                //pra ver se existe o usuario
                JOptionPane.showMessageDialog(null, "CLIENTE NAO ENCONTRADO !", " mensagem", JOptionPane.PLAIN_MESSAGE);
                txtCodigoGerente.setText("");
                btnEditarGerente.setEnabled(false);
                btnExcluirGerente.setEnabled(true);
                btnPesquizarGerente.setEnabled(true);
                btnNovoGerente.setEnabled(true);
                txtCodigoGerente.setEnabled(false);
                btnOk.setEnabled(false);
                btnSalvarGerente.setEnabled(false);
                btnCancelarGerente.setEnabled(true);
                txtCodigoGerente.setEnabled(false);
                btnEditarGerente.setEnabled(true);
                z = 2;
            }
            z = 2;
            //pra ver se quer excluir
        } else if (btnExcluirGerente.isEnabled()) {
            try {
                int cod = Integer.parseInt(txtCodigoGerente.getText());
                for (int i = 0; i < ListaGerentes.size(); i++) {
                    //condicao pra subir os dados da tabela pra os txts
                    if (ListaGerentes.get(i).getCodigo() == cod) {
                        Gerente ger = ListaGerentes.get(i);
                        linhaExcluir = i;
                        txtCodigoGerente.setText(String.valueOf(ger.getCodigo()));
                        txtCpfGerente.setText(String.valueOf(ger.getCpf()));
                        txtNomeGerente.setText(ger.getNome());
                        txtSalario.setText(ger.getSalario());
                        txtFuncaoGerente.setText(ger.getFuncao());
                        btnSalvarGerente.setEnabled(true);
                        // JOptionPane.showMessageDialog(null, "CLIENTE que deseja exluir esta na limnha  "
                        //     + ""+i, " mensagem", JOptionPane.PLAIN_MESSAGE);
                        a = 3;
                    }
                }
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "DADOS INCORRETOS", " mensagem", JOptionPane.PLAIN_MESSAGE);
            }

            if (a != 3) {
                //pra ver se existe o usuario
                JOptionPane.showMessageDialog(null, "CLIENTE NAO ENCONTRADO !", " mensagem", JOptionPane.PLAIN_MESSAGE);
                txtCodigoGerente.setText("");
                btnEditarGerente.setEnabled(false);
                btnExcluirGerente.setEnabled(true);
                btnPesquizarGerente.setEnabled(true);
                btnNovoGerente.setEnabled(true);
                txtCodigoGerente.setEnabled(false);
                btnOk.setEnabled(false);
                btnSalvarGerente.setEnabled(false);
                btnCancelarGerente.setEnabled(true);
                txtCodigoGerente.setEnabled(false);
                btnEditarGerente.setEnabled(true);
                a = 2;
            }
            a = 2;
        }
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarGerente;
    private javax.swing.JButton btnEditarGerente;
    private javax.swing.JButton btnExcluirGerente;
    private javax.swing.JButton btnNovoGerente;
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnPesquizarGerente;
    private javax.swing.JToggleButton btnSair;
    private javax.swing.JButton btnSalvarGerente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGerentes;
    private javax.swing.JTextField txtCodigoGerente;
    private javax.swing.JTextField txtCpfGerente;
    private javax.swing.JTextField txtFuncaoGerente;
    private javax.swing.JTextField txtNomeGerente;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
