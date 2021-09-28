package Controller;

import Beans.CardapioBeans;
import DAO.CardapioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CardapioController {
    
    CardapioDAO CardapioD;
    
    public CardapioController() {
        CardapioD = new CardapioDAO();
    }
    
    public boolean verificarDados(CardapioBeans Cardapio) {
        if(Cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cardapio.getTipo().equals("Selecione um tipo")) {
            JOptionPane.showMessageDialog(null, "Selecione algum tipo de item da lista!!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));   
            return false;
        }
        
       if(Cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Adicione o valor do item!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));   
            return false;
        }
        
        CardapioD.cadastrarCardapio(Cardapio);
        return true;
    }
    
    public String controleDeCodigo() {
        return CardapioD.proximoCardapio();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        CardapioD.buscarCardapio(Pesquisa, Modelo);
    }
    
    public CardapioBeans controlePreencherCampos(int Codigo) {
        return CardapioD.PreencherCampos(Codigo);
    }
    
        public boolean verificarDadosEditados(CardapioBeans Cardapio) {
        if(Cardapio.getDescricao().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo descrição.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cardapio.getTipo().equals("Selecione um tipo")) {
            JOptionPane.showMessageDialog(null, "Selecione algum tipo de item da lista!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cardapio.getValor() == 0) {
            JOptionPane.showMessageDialog(null, "Adicione o valor do item!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));   
            return false;
        }
         
         CardapioD.editarCardapio(Cardapio);
         return true;
    }

        
}
