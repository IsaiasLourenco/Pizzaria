package Controller;

import Beans.PedidoBeans;
import DAO.PedidoDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PedidoController {
    
    PedidoDAO PedidoD;
    
    public PedidoController() {
        PedidoD = new PedidoDAO();
    }
    
    public void ControleItens(String Pesquisa, List<String> ListaItens) {
        PedidoD.PesquisaItens(Pesquisa, ListaItens);
    }
    
    public double ControleValor(String Pesquisa) {
        return PedidoD.ValorItem(Pesquisa);
    }
    
    public int ControleCodigo(String Pesquisa) {
        return PedidoD.ValorCodigo(Pesquisa);
    }
    
    public boolean VerificarItens(String Valor, String Codigo, String Item, String Quantidade) {
        if(Valor.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo valor.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Codigo.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo código.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
                 
        if(Item.equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo item.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Quantidade.equals("")) {
        try{
            int x = Integer.parseInt(Quantidade);
            if(x == 0) {
                JOptionPane.showMessageDialog(null, "A Quantidade não pode ser zero.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
   
            }
        }catch(NumberFormatException Ex) {
            JOptionPane.showMessageDialog(null, "Insira um número inteiro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        }
        
        return true;
        
    }
    
    public void ControlePedido(String CodigoCliente, String CodigoFuncionario, String Total, int TamanhoTabela, PedidoBeans PedidoB) {
        PedidoD.CadastrarPedido(CodigoCliente, CodigoFuncionario, Total, TamanhoTabela, PedidoB);
    }   
    
}