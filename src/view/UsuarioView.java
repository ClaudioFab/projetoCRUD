package view;

import dao.UsuarioDao;
import javax.swing.JOptionPane;
import java.sql.Connection;
import model.UsuarioModel;
import util.Format;

public class UsuarioView extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UsuarioView.class.getName());

    public UsuarioView() {
        initComponents();
        limpar();
        totalCadastros();
        listaCombobox();
    }

    private Connection connection;

    //ComboBox
    
    public void totalCadastros() {
        jLabelTotalCadastros.setText("Total de cadastros: ??");
    }

    public void listaCombobox(){
        //jComboBoxListagem.addItem(nome);  
    }
    
    public void limpar() {
        jTextFieldNomeUsuario.setText("");
        jFormattedTextCPF.setText("");
        jTextFieldEmail.setText("");
        jFormattedTextTelefone.setText("");
        jFormattedTextDataNascimento.setText("");
    }

    public void errou() {
        JOptionPane.showMessageDialog(null, "Não foi possível cadastrar o usuário!", "Erro!", JOptionPane.ERROR_MESSAGE);
    }

    public void cadastro() {
        String nome = jTextFieldNomeUsuario.getText();
        String cpf = jFormattedTextCPF.getText();
        String email = jTextFieldEmail.getText();
        String telefone = jFormattedTextTelefone.getText();
        String Nascimento = jFormattedTextDataNascimento.getText();

        //Impedir números
        if (nome.matches(".*\\d.*")) {
            errou();
            limpar();
            return;
        }

        if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || telefone.isEmpty() || Nascimento.isEmpty()) {
            errou();
            limpar();
            return;
        }

        UsuarioModel u = new UsuarioModel();

        try {
            u.setNome(nome);
            u.setCpf(cpf);
            u.setEmail(email);
            u.setTelefone(telefone);
            u.setNascimento(Format.converterParaSqlDate(Nascimento));

            UsuarioDao dao = new UsuarioDao(connection);
            dao.adicionar(u);

            JOptionPane.showMessageDialog(null, "Usuário " + nome + " cadastrado com sucesso!\n(Botão View)", "Aviso!", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            errou();
            limpar();
            return;
        }

        limpar();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelNovaTarefa = new javax.swing.JPanel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabelCpf = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelDataNascimento = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jFormattedTextDataNascimento = new javax.swing.JFormattedTextField();
        jFormattedTextTelefone = new javax.swing.JFormattedTextField();
        jFormattedTextCPF = new javax.swing.JFormattedTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jPanelListaTarefa = new javax.swing.JPanel();
        jLabelTotalCadastros = new javax.swing.JLabel();
        jComboBoxListagem = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                saida1(evt);
            }
        });

        jPanelNovaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelNovaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Novo Cadastro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelNovaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeUsuario.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelNomeUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNomeUsuario.setText("Nome de Usuário");

        jTextFieldNomeUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldNomeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldNomeUsuarioKeyPressed(evt);
            }
        });

        jButtonCadastrar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(this::jButtonCadastrarActionPerformed);

        jLabelCpf.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelCpf.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCpf.setText("CPF do Usuário");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("E-mail");

        jLabelTelefone.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelTelefone.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTelefone.setText("Telefone");

        jLabelDataNascimento.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelDataNascimento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDataNascimento.setText("Data de Nascimento");

        jButtonEditar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(this::jButtonEditarActionPerformed);

        jButtonRemover.setBackground(new java.awt.Color(0, 0, 0));
        jButtonRemover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRemover.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemover.setText("Remover");
        jButtonRemover.addActionListener(this::jButtonRemoverActionPerformed);

        jButtonAtualizar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtualizar.setText("Atualizar");
        jButtonAtualizar.addActionListener(this::jButtonAtualizarActionPerformed);

        jButtonLimpar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(this::jButtonLimparActionPerformed);

        jFormattedTextDataNascimento.setBackground(new java.awt.Color(0, 0, 0));
        jFormattedTextDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextDataNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextDataNascimento.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jFormattedTextTelefone.setBackground(new java.awt.Color(0, 0, 0));
        jFormattedTextTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextTelefone.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jFormattedTextCPF.setBackground(new java.awt.Color(0, 0, 0));
        jFormattedTextCPF.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextCPF.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jTextFieldEmail.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelNovaTarefaLayout = new javax.swing.GroupLayout(jPanelNovaTarefa);
        jPanelNovaTarefa.setLayout(jPanelNovaTarefaLayout);
        jPanelNovaTarefaLayout.setHorizontalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jFormattedTextDataNascimento, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(37, 37, 37)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanelNovaTarefaLayout.setVerticalGroup(
            jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNovaTarefaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelNovaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanelListaTarefa.setBackground(new java.awt.Color(255, 255, 255));
        jPanelListaTarefa.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Lista de Cadastros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 15), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanelListaTarefa.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTotalCadastros.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabelTotalCadastros.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTotalCadastros.setText("Total de cadastros: 0");

        jComboBoxListagem.setBackground(new java.awt.Color(0, 0, 0));
        jComboBoxListagem.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jComboBoxListagem.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxListagem.addActionListener(this::jComboBoxListagemActionPerformed);

        javax.swing.GroupLayout jPanelListaTarefaLayout = new javax.swing.GroupLayout(jPanelListaTarefa);
        jPanelListaTarefa.setLayout(jPanelListaTarefaLayout);
        jPanelListaTarefaLayout.setHorizontalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelTotalCadastros)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanelListaTarefaLayout.setVerticalGroup(
            jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaTarefaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelListaTarefaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxListagem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTotalCadastros))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cadastro-60.png"))); // NOI18N
        jLabel1.setText("Cadastro de Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("Sair");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelNovaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelListaTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNomeUsuarioKeyPressed

    }//GEN-LAST:event_jTextFieldNomeUsuarioKeyPressed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        cadastro();
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverActionPerformed

    }//GEN-LAST:event_jButtonRemoverActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jComboBoxListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxListagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxListagemActionPerformed

    private void saida1(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_saida1
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_saida1

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        JOptionPane.showMessageDialog(null, "Programa finalizado.", "Encerrando", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new UsuarioView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JComboBox<String> jComboBoxListagem;
    private javax.swing.JFormattedTextField jFormattedTextCPF;
    private javax.swing.JFormattedTextField jFormattedTextDataNascimento;
    private javax.swing.JFormattedTextField jFormattedTextTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCpf;
    private javax.swing.JLabel jLabelDataNascimento;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTotalCadastros;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelListaTarefa;
    private javax.swing.JPanel jPanelNovaTarefa;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
