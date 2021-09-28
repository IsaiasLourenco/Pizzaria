package GUI;

import Beans.ClienteBeans;
import Utilitarios.Conexao;
import Utilitarios.FundoTela;
import java.awt.Frame;
import java.awt.GridLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author José Isaias Lourenço
 */
public class Principal extends javax.swing.JFrame {
    
    FundoTela tela;
    FuncionarioTela funcionarioTela;
    ClienteTela clientetela;
    EntregadorTela entregadorTela;
    CardapioTela cardapioTela;
    PedidoTela pedidoTela;
    Connection conexao = null;
    TelaPedidos telaPedidos;
    
    public Principal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new GridLayout());
        tela = new FundoTela("/Icones/fundo_pizza.jpg");
        getContentPane().add(tela);        
        menuClientes.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_clientes.png")));
        menuFuncionarios.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_func.png")));
        menuCardapio.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_cardapio.png")));
        menuEntregador.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_boy.png")));
        menuCadastro.setIcon(new ImageIcon(getClass().getResource("/Icones/inserir-32.png")));
        menuCaixa.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_caixa.png")));
        menuPedidos.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_order.png")));
        menuRelatorios.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_rel.png")));
        menuRelatorioClientes.setIcon(new ImageIcon(getClass().getResource("/Icones/btn_clientes.png")));
        menuRelatorioPedidos.setIcon(new ImageIcon(getClass().getResource("/Icones/Shopping_Full.png")));
        menuTelaPedidos.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_order.png")));
        menuTela.setIcon(new ImageIcon(getClass().getResource("/Icones/icon_tela_pedidos.png")));
        menuSair.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_sair.png")));
        menuSairSai.setIcon(new ImageIcon(getClass().getResource("/Icones/ico_sair.png")));
        
        ImageIcon icone = new ImageIcon(getClass().getResource("/Icones/ico_cardapio.png"));
        setIconImage(icone.getImage());
        
        conexao = Conexao.getConnection();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuCardapio = new javax.swing.JMenuItem();
        menuEntregador = new javax.swing.JMenuItem();
        menuCaixa = new javax.swing.JMenu();
        menuPedidos = new javax.swing.JMenuItem();
        menuRelatorios = new javax.swing.JMenu();
        menuRelatorioClientes = new javax.swing.JMenuItem();
        menuRelatorioPedidos = new javax.swing.JMenuItem();
        menuTelaPedidos = new javax.swing.JMenu();
        menuTela = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        menuSairSai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzaria");

        menuCadastro.setText("Cadastro");
        menuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroActionPerformed(evt);
            }
        });

        menuClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        menuClientes.setText("Clientes");
        menuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menuClientes);

        menuFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionarios);

        menuCardapio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuCardapio.setText("Cardápio");
        menuCardapio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCardapioActionPerformed(evt);
            }
        });
        menuCadastro.add(menuCardapio);

        menuEntregador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuEntregador.setText("Entregador");
        menuEntregador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuEntregador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEntregadorActionPerformed(evt);
            }
        });
        menuCadastro.add(menuEntregador);

        jMenuBar1.add(menuCadastro);

        menuCaixa.setText("Caixa");
        menuCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        menuPedidos.setText("Pedido");
        menuPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPedidosActionPerformed(evt);
            }
        });
        menuCaixa.add(menuPedidos);

        jMenuBar1.add(menuCaixa);

        menuRelatorios.setText("Relatórios");
        menuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuRelatorioClientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuRelatorioClientes.setText("Clientes");
        menuRelatorioClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelatorioClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioClientesActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorioClientes);

        menuRelatorioPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        menuRelatorioPedidos.setText("Pedidos");
        menuRelatorioPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRelatorioPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioPedidosActionPerformed(evt);
            }
        });
        menuRelatorios.add(menuRelatorioPedidos);

        jMenuBar1.add(menuRelatorios);

        menuTelaPedidos.setText("Tela Pedidos");
        menuTelaPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuTela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        menuTela.setText("Tela");
        menuTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTelaActionPerformed(evt);
            }
        });
        menuTelaPedidos.add(menuTela);

        jMenuBar1.add(menuTelaPedidos);

        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        menuSairSai.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuSairSai.setText("Sair");
        menuSairSai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairSaiActionPerformed(evt);
            }
        });
        menuSair.add(menuSairSai);

        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCadastroActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        clientetela = new ClienteTela();
        tela.add(clientetela);
        clientetela.setVisible(true);
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        funcionarioTela = new FuncionarioTela();
        tela.add(funcionarioTela);
        funcionarioTela.setVisible(true);
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void menuEntregadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEntregadorActionPerformed
        entregadorTela = new EntregadorTela();
        tela.add(entregadorTela);
        entregadorTela.setVisible(true);
    }//GEN-LAST:event_menuEntregadorActionPerformed

    private void menuCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCardapioActionPerformed
        cardapioTela = new CardapioTela();
        tela.add(cardapioTela);
        cardapioTela.setVisible(true);      
    }//GEN-LAST:event_menuCardapioActionPerformed

    private void menuPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPedidosActionPerformed
        pedidoTela = new PedidoTela(1);
        tela.add(pedidoTela);
        pedidoTela.setVisible(true);
    }//GEN-LAST:event_menuPedidosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuRelatorioClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioClientesActionPerformed
        try {
            // Caminho local - Arquivos de relatório não vão para o .JAR
            //JasperPrint print = JasperFillManager.fillReport("Relatorio/RelClientes.jasper", null, conexao);
            
            // Caminho do pacote - Arquivos de relatório vão com o .JAR
            InputStream caminho = getClass().getResourceAsStream("/Relatorio/RelClientes.jasper");
            JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatorioClientesActionPerformed

    private void menuTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTelaActionPerformed
        telaPedidos = new TelaPedidos();      
        telaPedidos.setVisible(true);
    }//GEN-LAST:event_menuTelaActionPerformed

    private void menuSairSaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairSaiActionPerformed
        dispose();
    }//GEN-LAST:event_menuSairSaiActionPerformed

    private void menuRelatorioPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioPedidosActionPerformed
         try {
            // Caminho local - Arquivos de relatório não vão para o .JAR
            //JasperPrint print = JasperFillManager.fillReport("Relatorio/RelClientes.jasper", null, conexao);
            
            // Caminho do pacote - Arquivos de relatório vão com o .JAR
            InputStream caminho = getClass().getResourceAsStream("/Relatorio/RelPedidos.jasper");
            JasperPrint print = JasperFillManager.fillReport(caminho, null, conexao);
            JasperViewer.viewReport(print, false);
        } catch (JRException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuRelatorioPedidosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuCaixa;
    private javax.swing.JMenuItem menuCardapio;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenuItem menuEntregador;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenuItem menuPedidos;
    private javax.swing.JMenuItem menuRelatorioClientes;
    private javax.swing.JMenuItem menuRelatorioPedidos;
    private javax.swing.JMenu menuRelatorios;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem menuSairSai;
    private javax.swing.JMenuItem menuTela;
    private javax.swing.JMenu menuTelaPedidos;
    // End of variables declaration//GEN-END:variables
}
