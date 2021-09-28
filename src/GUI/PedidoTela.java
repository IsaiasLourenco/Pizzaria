package GUI;

import Beans.ClienteBeans;
import Beans.PedidoBeans;
import Controller.ClienteController;
import Controller.EntregadorController;
import Controller.PedidoController;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class PedidoTela extends javax.swing.JInternalFrame {
    
    ClienteBeans ClienteB;
    ClienteController ClienteC;
    PedidoBeans PedidoB;
    PedidoController PedidoC;
    EntregadorController EnregadorC;
    List<String> Lista;
    List<String> ListaItens;
    MaskFormatter FormatoTel;
    DefaultTableModel Modelo;
    int CodigoFuncionario;
    DecimalFormat nf;
    Date DataAtual;
    SimpleDateFormat FormatoData, FormatoHora;

    public PedidoTela(int CodigoFuncionario) {
        initComponents();
        habilitarCampos(false);
        Lista = new ArrayList<>();
        ListaItens = new ArrayList<>();
        ClienteB = new ClienteBeans();
        ClienteC = new ClienteController();
        PedidoB = new PedidoBeans();
        PedidoC = new PedidoController();
        painelPedidos.setEnabledAt(1, false);
        Modelo = (DefaultTableModel)tblPedidos.getModel();
        tblPedidos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.CodigoFuncionario = CodigoFuncionario;
        FormatoData = new SimpleDateFormat("yyy-MM-dd");
        FormatoHora = new SimpleDateFormat("HH:mm:ss");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPedidos = new javax.swing.JTabbedPane();
        painelClientePedidos = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        cmbCliente = new javax.swing.JComboBox();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        try {
            FormatoTel = new MaskFormatter("(##) #####-####");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir máscara.", "Erro", 0);
        }
        txtTelefone = new JFormattedTextField(FormatoTel);
        lblDataCadastro = new javax.swing.JLabel();
        txtDataCad = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnFechar = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        painelPedidoPedidos = new javax.swing.JPanel();
        txtNomeCliente = new javax.swing.JTextField();
        lblItem = new javax.swing.JLabel();
        txtItemPedido = new javax.swing.JTextField();
        lblSelecionar = new javax.swing.JLabel();
        cmbItemSelecionado = new javax.swing.JComboBox();
        btnValor = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblCodCli = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnFechar2 = new javax.swing.JButton();
        btnFinalizarII = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pedidos");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cmbCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Busque um Cliente ao lado <-" }));
        cmbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClienteActionPerformed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCodigo.setFocusable(false);
        txtCodigo.setNextFocusableComponent(btnBuscar);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCodigoFocusGained(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome:");

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        lblRua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRuaActionPerformed(evt);
            }
        });
        txtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRuaKeyPressed(evt);
            }
        });

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblBairro.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });
        txtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBairroKeyPressed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone:");

        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });

        lblDataCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDataCadastro.setText("Data Cadastro:");

        txtDataCad.setEditable(false);
        txtDataCad.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtDataCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCadActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        txtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCidadeKeyPressed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        btnPedido.setText("Pedido");
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClientePedidosLayout = new javax.swing.GroupLayout(painelClientePedidos);
        painelClientePedidos.setLayout(painelClientePedidosLayout);
        painelClientePedidosLayout.setHorizontalGroup(
            painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientePedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelClientePedidosLayout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClientePedidosLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClientePedidosLayout.createSequentialGroup()
                        .addGap(486, 486, 486)
                        .addComponent(btnPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar))
                    .addGroup(painelClientePedidosLayout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClientePedidosLayout.createSequentialGroup()
                            .addComponent(lblCidade)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTelefone))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClientePedidosLayout.createSequentialGroup()
                            .addComponent(lblNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClientePedidosLayout.createSequentialGroup()
                            .addComponent(lblBairro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBairro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelClientePedidosLayout.createSequentialGroup()
                            .addComponent(lblRua)
                            .addGap(18, 18, 18)
                            .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelClientePedidosLayout.createSequentialGroup()
                        .addComponent(lblDataCadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        painelClientePedidosLayout.setVerticalGroup(
            painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientePedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(cmbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone))
                .addGap(18, 18, 18)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataCadastro)
                    .addComponent(txtDataCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(painelClientePedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnPedido))
                .addGap(51, 51, 51))
        );

        painelPedidos.addTab("Cliente", painelClientePedidos);

        txtNomeCliente.setEditable(false);
        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomeCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNomeCliente.setFocusable(false);

        lblItem.setText("Item:");

        txtItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemPedidoActionPerformed(evt);
            }
        });

        lblSelecionar.setText("Selecionar:");

        cmbItemSelecionado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Procure um item ao lado <-" }));
        cmbItemSelecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbItemSelecionadoActionPerformed(evt);
            }
        });

        btnValor.setText("Valor");
        btnValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorActionPerformed(evt);
            }
        });

        lblValor.setText("Valor:");

        txtValor.setEditable(false);

        lblQuantidade.setText("Quantidade:");

        txtQuantidade.setText("1");
        txtQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantidadeFocusLost(evt);
            }
        });

        lblCodCli.setText("Código:");

        txtCodCli.setEditable(false);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("-");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblTotal.setText("Total:");

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Item", "Descrição", "Valor Unitário", "Quantidade", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPedidos);

        btnFechar2.setText("Fechar");
        btnFechar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar2ActionPerformed(evt);
            }
        });

        btnFinalizarII.setText("Finalizar");
        btnFinalizarII.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarII.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarIIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelPedidoPedidosLayout = new javax.swing.GroupLayout(painelPedidoPedidos);
        painelPedidoPedidos.setLayout(painelPedidoPedidosLayout);
        painelPedidoPedidosLayout.setHorizontalGroup(
            painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoPedidosLayout.createSequentialGroup()
                .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(painelPedidoPedidosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPedidoPedidosLayout.createSequentialGroup()
                                .addComponent(lblItem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtItemPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSelecionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbItemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelPedidoPedidosLayout.createSequentialGroup()
                                .addComponent(btnValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCodCli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoPedidosLayout.createSequentialGroup()
                        .addGap(0, 23, Short.MAX_VALUE)
                        .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoPedidosLayout.createSequentialGroup()
                                .addComponent(btnFinalizarII)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnFechar2)
                                .addGap(502, 502, 502))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPedidoPedidosLayout.createSequentialGroup()
                                .addComponent(lblTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(painelPedidoPedidosLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPedidoPedidosLayout.setVerticalGroup(
            painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPedidoPedidosLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItem)
                    .addComponent(txtItemPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelecionar)
                    .addComponent(cmbItemSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValor)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuantidade)
                    .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodCli)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelPedidoPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar2)
                    .addComponent(btnFinalizarII))
                .addGap(45, 45, 45))
        );

        painelPedidos.addTab("Pedido", painelPedidoPedidos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPedidos)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPedidos)
        );

        setBounds(300, 50, 702, 545);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cmbCliente.removeAllItems();
        Lista.clear();
        String Pesquisa = JOptionPane.showInputDialog(null, "Digite o nome do Cliente:", "Pesquisa", 3);
        ClienteC.controlePesquisa(Pesquisa, Lista);
        for(String i: Lista) {
            cmbCliente.addItem(i);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        CompletarComZeros("", '0', 4);
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtRua.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRuaActionPerformed

    }//GEN-LAST:event_txtRuaActionPerformed

    private void txtRuaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRuaKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtBairro.requestFocus();
        }
    }//GEN-LAST:event_txtRuaKeyPressed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed

    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtBairroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBairroKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtCidade.requestFocus();
        }
    }//GEN-LAST:event_txtBairroKeyPressed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed

    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            btnPedido.requestFocus();        }
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtDataCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCadActionPerformed

    }//GEN-LAST:event_txtDataCadActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtCidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCidadeKeyPressed
        if(evt.getKeyCode() == evt.VK_ENTER) {
            txtTelefone.requestFocus();
        }
    }//GEN-LAST:event_txtCidadeKeyPressed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cmbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClienteActionPerformed
        if(!(cmbCliente.getSelectedItem() == null)) {
            String codigo = cmbCliente.getSelectedItem().toString();
            codigo = codigo.substring(0, codigo.indexOf(" "));
            ClienteB = ClienteC.controlePreencherCampos(Integer.parseInt(codigo));
            habilitarCampos(false);
            txtCodigo.setText(ClienteB.getCodigo() + "");
            txtNome.setText(ClienteB.getNome());
            txtRua.setText(ClienteB.getRua());
            txtBairro.setText(ClienteB.getBairro());
            txtTelefone.setText(ClienteB.getTelefone());
            txtCidade.setText(ClienteB.getCidade());
            txtDataCad.setText(ClienteB.getDataCad());
        }
    }//GEN-LAST:event_cmbClienteActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        painelPedidos.setEnabledAt(1, true);
        painelPedidos.setEnabledAt(0, false);
        painelPedidos.setSelectedIndex(1);
        txtNomeCliente.setText((String) cmbCliente.getSelectedItem());
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void txtItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemPedidoActionPerformed
        txtValor.setText("");   
        txtQuantidade.setText("1");     
        cmbItemSelecionado.removeAllItems();
        ListaItens.clear();
        PedidoC.ControleItens(txtItemPedido.getText(), ListaItens);
        for(String i: ListaItens) {
            cmbItemSelecionado.addItem(i);
        }
        txtItemPedido.requestFocus();
    }//GEN-LAST:event_txtItemPedidoActionPerformed

    private void btnValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorActionPerformed
        txtValor.setText(PedidoC.ControleValor(cmbItemSelecionado.getSelectedItem().toString()) + "");
        txtCodCli.setText(PedidoC.ControleCodigo(cmbItemSelecionado.getSelectedItem().toString()) + "");
    }//GEN-LAST:event_btnValorActionPerformed

    private void cmbItemSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbItemSelecionadoActionPerformed
        txtValor.setText("");  
        txtQuantidade.setText("1");
    }//GEN-LAST:event_cmbItemSelecionadoActionPerformed

    private void txtQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantidadeFocusLost
        try{
            int x = Integer.parseInt(txtQuantidade.getText());
            if(x == 0) {
                JOptionPane.showMessageDialog(null, "A Quantidade não pode ser zero.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
                txtQuantidade.setText("1");
                txtQuantidade.requestFocus();
            }
        }catch(NumberFormatException Ex) {
            JOptionPane.showMessageDialog(null, "Insira um número inteiro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }//GEN-LAST:event_txtQuantidadeFocusLost

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(PedidoC.VerificarItens(txtValor.getText(), txtQuantidade.getText(), txtCodCli.getText(), cmbItemSelecionado.getSelectedItem().toString())) {
            double Total = Double.parseDouble(txtValor.getText()) * Integer.parseInt(txtQuantidade.getText());
            Modelo.addRow(new Object[]{txtCodCli.getText(), cmbItemSelecionado.getSelectedItem(), txtValor.getText(), txtQuantidade.getText(), Total});
        }
        LimparItens();
        CalcularTotal();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnFechar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar2ActionPerformed
        dispose();
    }//GEN-LAST:event_btnFechar2ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        Modelo.removeRow(tblPedidos.getSelectedRow());
        txtItemPedido.requestFocus();
        CalcularTotal();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusGained
        CompletarComZeros("", '0', 4);
    }//GEN-LAST:event_txtCodigoFocusGained

    private void btnFinalizarIIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarIIActionPerformed
        PopulaBeans();
        PedidoC.ControlePedido(txtCodigo.getText()  , CodigoFuncionario + "", txtTotal.getText(), tblPedidos.getRowCount(), PedidoB);
        LimparFinalizar();
        //LimparItens();
        //Modelo.setNumRows(0);
    }//GEN-LAST:event_btnFinalizarIIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    public static javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFechar2;
    private javax.swing.JButton btnFinalizarII;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnValor;
    private javax.swing.JComboBox cmbCliente;
    private javax.swing.JComboBox cmbItemSelecionado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCodCli;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDataCadastro;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSelecionar;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painelClientePedidos;
    private javax.swing.JPanel painelPedidoPedidos;
    private javax.swing.JTabbedPane painelPedidos;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDataCad;
    private javax.swing.JTextField txtItemPedido;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    final void habilitarCampos(boolean valor){
        txtBairro.setEnabled(valor);
        txtRua.setEnabled(valor);
        txtNome.setEnabled(valor);
        txtTelefone.setEnabled(valor);
        txtCidade.setEnabled(valor);
        txtDataCad.setEnabled(valor);     
    }
    
    final void LimparItens(){
        txtItemPedido.setText("");
        cmbItemSelecionado.removeAllItems();
        txtValor.setText("");
        txtQuantidade.setText("1");
        txtCodCli.setText("");
        txtTotal.setText("");
        txtItemPedido.requestFocus();
    }
    
    final void CalcularTotal(){
        double TotalPedido = 0;
        for(int i = 0; i < tblPedidos.getRowCount(); i++) {
            TotalPedido += Double.parseDouble(Modelo.getValueAt(i, 4).toString());
        }
        txtTotal.setText(TotalPedido + "");
    }
    
    final void PopulaBeans() {
        DataAtual = new Date();
        PedidoB.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));
        PedidoB.setCodigoFuncionario(CodigoFuncionario);
        PedidoB.setCodigoEntregador(1);
        PedidoB.setData(FormatoData.format(DataAtual));
        PedidoB.setHora(FormatoHora.format(DataAtual));
        PedidoB.setStatus("Pedido Aberto");
        PedidoB.setValor(Double.parseDouble(txtTotal.getText()));
        for(int i = 0; i < tblPedidos.getRowCount(); i++) {
            PedidoB.setCodCardapio(Integer.parseInt(Modelo.getValueAt(i, 0).toString()));
            PedidoB.setQuantidade(Integer.parseInt(Modelo.getValueAt(i, 3).toString()));
    }
    }
    
    final void LimparFinalizar() {
        txtTotal.setText("");
        btnFinalizarII.setEnabled(false);
        Modelo.setNumRows(0);
        txtNomeCliente.setText("");
    }
    
    public static String CompletarComZeros(String value, char c, int size) {
	String result = value;

	while (result.length() < size) {
		result = c + result;
	}

	return result;
	}
}
