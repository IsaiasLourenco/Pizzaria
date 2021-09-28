package Controller;

import Beans.ClienteBeans;
import DAO.ClienteDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ClienteController {
    
    ClienteDAO ClienteD;
    
    public ClienteController(){
       ClienteD = new ClienteDAO();
       
    }
    
    public boolean verificarDados(ClienteBeans Cliente){
        if(Cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
         if(Cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Bairro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         if(Cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Rua", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
           if(Cliente.getTelefone().equals("(  )      -    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        ClienteD.cadastrarCliente(Cliente);
        return true;
    }
    
    public String controleDeCodigo(){
        return ClienteD.proximoCliente();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo){
        ClienteD.buscarCliente(Pesquisa, Modelo);
    }
    
    public ClienteBeans controlePreencherCampos(int Codigo){
        return ClienteD.PreencherCampos(Codigo);
    }
    
    
     public boolean verificarDadosEditar(ClienteBeans Cliente){
        if(Cliente.getNome().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Nome", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
         if(Cliente.getBairro().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Bairro", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         if(Cliente.getRua().equals("")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Rua", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
           if(Cliente.getTelefone().equals("(  )      -    ")){
            JOptionPane.showMessageDialog(null, "Preencha o campo Telefone", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        ClienteD.editarCliente(Cliente);
        return true;
    }
    
}
