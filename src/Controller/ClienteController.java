package Controller;

import Beans.ClienteBeans;
import DAO.ClienteDAO;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ClienteController {
    
    ClienteDAO ClienteD;
    
    public ClienteController() {
        ClienteD = new ClienteDAO();
    }
    
    public boolean verificarDados(ClienteBeans Cliente) {
        if(Cliente.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getRua().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo rua.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getBairro().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo bairro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getCidade().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo cidade.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
         if(Cliente.getTelefone().equals("(  )      -    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo telefone.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        ClienteD.cadastrarCliente(Cliente);
        return true;
    }
    
    public String controleDeCodigo() {
        return ClienteD.proximoCliente();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        ClienteD.buscarCliente(Pesquisa, Modelo);
    }
    
    public ClienteBeans controlePreencherCampos(int Codigo) {
        return ClienteD.PreencherCampos(Codigo);
    }
    
        public boolean verificarDadosEditados(ClienteBeans Cliente) {
        if(Cliente.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getRua().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo rua.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getBairro().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo bairro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Cliente.getCidade().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo cidade.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
         if(Cliente.getTelefone().equals("(  )      -    ")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo telefone.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         ClienteD.editarCliente(Cliente);
         return true;
    }

    public void controlePesquisa(String Pesquisa, List<String> Lista) {
        ClienteD.buscarCliente(Pesquisa, Lista);
    }
        
}
