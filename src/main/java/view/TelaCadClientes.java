package view;


import DAO.ClienteDAO;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Clientes;


public class TelaCadClientes extends javax.swing.JFrame {
    Clientes objClientes = new Clientes();
    /**
     * Creates new form TelaCadClientes
     */
    public TelaCadClientes() {
        initComponents();
    }

    TelaCadClientes(Clientes obj) {
        this.objClientes = obj;
        initComponents();
        
        txtPK_CLIENTE.setText(String.valueOf(obj.getIdCliente()));
        txtDS_NOME.setText(String.valueOf(obj.getNome()));
        txtNR_CPF.setText(String.valueOf(obj.getCpf()));
        txtDT_NASCIMENTO.setText(String.valueOf(obj.getNascimento()));
        txtDS_EMAIL.setText(String.valueOf(obj.getEmail()));
        txtDS_TELEFONE.setText(String.valueOf(obj.getTelefone()));
        txtDS_CEP.setText(String.valueOf(obj.getCep()));
        txtDS_ENDERECO.setText(String.valueOf(obj.getEndereco()));
        txtDS_CIDADE.setText(String.valueOf(obj.getCidade()));
        txtDS_UF.setText(String.valueOf(obj.getUf()));
        txtDS_PAIS.setText(String.valueOf(obj.getPais()));
        
        Clientes objClienteAux = ClienteDAO.buscarDadosClientes(obj.getIdCliente());
                 
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String DataNasc = formato.format(objClienteAux.getNascimento());
        txtDT_NASCIMENTO.setText(DataNasc);
        
        //private JTextField txtNR_CPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
         
        switch(objClienteAux.getSexo()){
            case "M":
                rbMasculino.setSelected(true);
                rbFeminino.setSelected(false);
                break;
            
            case "F":
                rbMasculino.setSelected(false);
                rbFeminino.setSelected(true);
                break;
        }
       
        switch(objClienteAux.getEstadoCivil()){
            case "C":
                rbCasado.setSelected(true);
                rbSolteiro.setSelected(false);
                rbDivorciado.setSelected(false);
                break;
            
            case "S":
                rbCasado.setSelected(false);
                rbSolteiro.setSelected(true);
                rbDivorciado.setSelected(false);
                break;
                
            case "D":
                rbCasado.setSelected(false);
                rbSolteiro.setSelected(false);
                rbDivorciado.setSelected(true);
                break;
        }
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgSexo = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        rbgEstadoCivil = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        txtPK_CLIENTE = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDS_NOME = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDS_EMAIL = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDS_TELEFONE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDS_CEP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDS_ENDERECO = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDS_CIDADE = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        PainelSexo = new javax.swing.JPanel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        PainelEstadoCivil = new javax.swing.JPanel();
        rbCasado = new javax.swing.JRadioButton();
        rbSolteiro = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDS_UF = new javax.swing.JFormattedTextField();
        txtDS_PAIS = new javax.swing.JFormattedTextField();
        txtNR_CPF = new javax.swing.JTextField();
        txtDT_NASCIMENTO = new javax.swing.JFormattedTextField();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setResizable(false);

        jPanel1.setName(""); // NOI18N

        ID.setText("ID:");

        txtPK_CLIENTE.setEditable(false);
        txtPK_CLIENTE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPK_CLIENTEKeyTyped(evt);
            }
        });

        jLabel1.setText("Nome Completo:");

        txtDS_NOME.setBackground(new java.awt.Color(255, 255, 204));
        txtDS_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDS_NOMEActionPerformed(evt);
            }
        });

        CPF.setText("Nro CPF:");

        jLabel2.setText("E-mail:");

        txtDS_EMAIL.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Telefone:");

        jLabel4.setText("CEP:");

        txtDS_CEP.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setText("End. Completo:");

        txtDS_ENDERECO.setBackground(new java.awt.Color(255, 255, 204));
        txtDS_ENDERECO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDS_ENDERECOActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade:");

        txtDS_CIDADE.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("UF:");

        jLabel8.setText("País:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        PainelSexo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        rbgSexo.add(rbMasculino);
        rbMasculino.setText("Masculino");

        javax.swing.GroupLayout PainelSexoLayout = new javax.swing.GroupLayout(PainelSexo);
        PainelSexo.setLayout(PainelSexoLayout);
        PainelSexoLayout.setHorizontalGroup(
            PainelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(rbMasculino)
                .addContainerGap())
        );
        PainelSexoLayout.setVerticalGroup(
            PainelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel9.setText("Sexo:");

        PainelEstadoCivil.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbgEstadoCivil.add(rbCasado);
        rbCasado.setText("Casado(a)");

        rbgEstadoCivil.add(rbSolteiro);
        rbSolteiro.setText("Solteiro");
        rbSolteiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSolteiroActionPerformed(evt);
            }
        });

        rbgEstadoCivil.add(rbDivorciado);
        rbDivorciado.setText("Divorciado");

        javax.swing.GroupLayout PainelEstadoCivilLayout = new javax.swing.GroupLayout(PainelEstadoCivil);
        PainelEstadoCivil.setLayout(PainelEstadoCivilLayout);
        PainelEstadoCivilLayout.setHorizontalGroup(
            PainelEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbCasado)
                .addGap(12, 12, 12)
                .addComponent(rbSolteiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDivorciado)
                .addContainerGap())
        );
        PainelEstadoCivilLayout.setVerticalGroup(
            PainelEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelEstadoCivilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCasado)
                    .addComponent(rbSolteiro)
                    .addComponent(rbDivorciado))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jLabel10.setText("Estado Civil:");

        jLabel11.setText("Data Nasc.");

        txtDS_UF.setBackground(new java.awt.Color(255, 255, 204));
        try {
            txtDS_UF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtDS_PAIS.setBackground(new java.awt.Color(255, 255, 204));
        try {
            txtDS_PAIS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNR_CPF.setBackground(new java.awt.Color(255, 255, 204));
        txtNR_CPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNR_CPFFocusLost(evt);
            }
        });
        txtNR_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNR_CPFActionPerformed(evt);
            }
        });

        try {
            txtDT_NASCIMENTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDT_NASCIMENTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDT_NASCIMENTOActionPerformed(evt);
            }
        });
        txtDT_NASCIMENTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDT_NASCIMENTOKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(46, 46, 46)
                                .addComponent(PainelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtNR_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel11)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDT_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDS_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPK_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDS_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDS_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDS_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDS_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDS_UF, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDS_PAIS, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(PainelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPK_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDS_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtDT_NASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNR_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDS_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDS_TELEFONE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDS_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDS_ENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDS_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtDS_PAIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDS_UF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PainelEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10)))
                        .addContainerGap(96, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PainelEstadoCivil, PainelSexo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbSolteiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSolteiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbSolteiroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if ((txtDS_NOME.getText().isEmpty()) && (txtDS_EMAIL.getText().isEmpty())
            && (txtDS_CEP.getText().isEmpty()) && (txtDS_ENDERECO.getText().isEmpty()) 
            && (txtDS_CIDADE.getText().isEmpty())){
            // && (txtDS_UF.getText().isEmpty()) && (txtDS_PAIS.getText().isEmpty()))           
            this.dispose();
        }else{
            Object[] opcao = { "Sim", "Não" };
            
            int resultado = JOptionPane.showOptionDialog(null, "Tem certeza que deseja cancelar?", "Cadastro de Clientes",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcao, opcao[1]);
            
            if(resultado == 0){
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int id  = 0;
        long Cpf = 0;
        String Nome = "", Email ="", Telefone ="", Cep ="", Endereco ="", Cidade ="";
        String Uf ="", Pais ="", Nascimento ="", Sexo = "",EstadoCivil = "";
        Boolean DtPreenchida = true, retorno = false;
        Date DtNascimento = null;
        
        Nome = txtDS_NOME.getText();
        Cpf = Long.parseLong(txtNR_CPF.getText());
        Email = txtDS_EMAIL.getText();
        Telefone = txtDS_TELEFONE.getText();
        Cep = txtDS_CEP.getText(); 
        Endereco = txtDS_ENDERECO.getText();
        Cidade = txtDS_CIDADE.getText();
        Uf = txtDS_UF.getText();
        Pais = txtDS_PAIS.getText();
        Nascimento = txtDT_NASCIMENTO.getText();
         
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");      
        
        try { 
            DtNascimento = formato.parse(Nascimento);
        } catch (ParseException ex) {
            Logger.getLogger(TelaCadClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(rbFeminino.isSelected()){
            Sexo = "F";
        }else if(rbMasculino.isSelected()){
            Sexo = "M";
        }

        if(rbCasado.isSelected()){
            EstadoCivil = "C";
        }else if(rbSolteiro.isSelected()){
            EstadoCivil = "S";
        }else if(rbDivorciado.isSelected()) {
            EstadoCivil = "D";
        }

        if ((txtDS_NOME.getText().isEmpty()) || (txtNR_CPF.getText().isEmpty())
            || (txtDS_EMAIL.getText().isEmpty()) || (txtDS_CEP.getText().isEmpty())
            || (txtDS_ENDERECO.getText().isEmpty())|| (txtDS_CIDADE.getText().isEmpty())
            || (txtDS_UF.getText().isEmpty())|| (txtDS_PAIS.getText().isEmpty())){

            JOptionPane.showMessageDialog(this,"Campo obrigatório não preenchido!");
            return;
        }
              
        for(int i=0;i<Nascimento.length();i++){
              String  c = String.valueOf(Nascimento.charAt(i));
                if(c.equals(" ")){
                   Nascimento = "";
                   DtPreenchida = false;
                   break;
                }
        }
        
        if(DtPreenchida){
          try {
            formato = new SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            formato.parse(Nascimento);   
            } catch (ParseException ex) {
             JOptionPane.showMessageDialog(this,"Data de Nascimento inválida!"); 
             return;
            }  
        }
        
        if(!rbFeminino.isSelected() && !rbMasculino.isSelected()){

            JOptionPane.showMessageDialog(this,"É necesário informar o sexo.");

            return;
        }
        if (!rbCasado.isSelected() && !rbSolteiro.isSelected()
            && !rbDivorciado.isSelected()) {
            JOptionPane.showMessageDialog(this,"É necessário informar o estado cívil.");

            return;
        }
        
        if(txtPK_CLIENTE.getText().trim().equals("")){
            Clientes objCliente = new Clientes(Nome, Cpf, Email, Telefone, Cep, Endereco,Cidade, Uf,
            Pais,DtNascimento,Sexo, EstadoCivil);
        
            retorno = ClienteDAO.salvar(objCliente);
        
            if(retorno){
                JOptionPane.showMessageDialog(this,"Cliente incluído com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Erro ao incluir Cliente.");
            }
            
        }else{
            id = Integer.parseInt(txtPK_CLIENTE.getText());
            Clientes objCliente = new Clientes(id, Nome, Cpf, Email, Telefone, Cep, Endereco,Cidade, Uf,
            Pais,DtNascimento,Sexo, EstadoCivil);
            
            retorno = ClienteDAO.alterar(objCliente);
        
            if(retorno){
                JOptionPane.showMessageDialog(this,"Cliente alterado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(this,"Erro ao alterar Cliente.");
            }
        }

        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtDS_ENDERECOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDS_ENDERECOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDS_ENDERECOActionPerformed

    private void txtDS_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDS_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDS_NOMEActionPerformed

    private void txtPK_CLIENTEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPK_CLIENTEKeyTyped

    }//GEN-LAST:event_txtPK_CLIENTEKeyTyped

    private void txtNR_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNR_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNR_CPFActionPerformed

    private void txtDT_NASCIMENTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDT_NASCIMENTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDT_NASCIMENTOActionPerformed

    private void txtDT_NASCIMENTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDT_NASCIMENTOKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE) && (c != KeyEvent.VK_SLASH)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDT_NASCIMENTOKeyTyped

    private void txtNR_CPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNR_CPFFocusLost
   
    }//GEN-LAST:event_txtNR_CPFFocusLost

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
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel ID;
    private javax.swing.JPanel PainelEstadoCivil;
    private javax.swing.JPanel PainelSexo;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbSolteiro;
    private javax.swing.ButtonGroup rbgEstadoCivil;
    private javax.swing.ButtonGroup rbgSexo;
    private javax.swing.JTextField txtDS_CEP;
    private javax.swing.JTextField txtDS_CIDADE;
    private javax.swing.JTextField txtDS_EMAIL;
    private javax.swing.JTextField txtDS_ENDERECO;
    private javax.swing.JTextField txtDS_NOME;
    private javax.swing.JFormattedTextField txtDS_PAIS;
    private javax.swing.JTextField txtDS_TELEFONE;
    private javax.swing.JFormattedTextField txtDS_UF;
    private javax.swing.JFormattedTextField txtDT_NASCIMENTO;
    private javax.swing.JTextField txtNR_CPF;
    private javax.swing.JTextField txtPK_CLIENTE;
    // End of variables declaration//GEN-END:variables
}
