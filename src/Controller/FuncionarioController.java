package Controller;

import Beans.FuncionarioBeans;
import DAO.FuncionarioDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class FuncionarioController {
    
    FuncionarioDAO FuncionarioD;
    
    public FuncionarioController() {
        FuncionarioD = new FuncionarioDAO();
    }
    
    public boolean verificarDados(FuncionarioBeans Funcionario) {
        if(Funcionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Funcionario.getCargo().equals("Selecione um cargo")) {
            JOptionPane.showMessageDialog(null, "Selecione algum cargo da lista!!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));   
        }
        
        FuncionarioD.cadastrarFuncionario(Funcionario);
        return true;
    }
    
    public String controleDeCodigo() {
        return FuncionarioD.proximoFuncionario();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        FuncionarioD.buscarFuncionario(Pesquisa, Modelo);
    }
    
    public FuncionarioBeans controlePreencherCampos(int Codigo) {
        return FuncionarioD.PreencherCampos(Codigo);
    }
    
        public boolean verificarDadosEditados(FuncionarioBeans Funcionario) {
        if(Funcionario.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        if(Funcionario.getCargo().equals("Selecione um cargo")) {
            JOptionPane.showMessageDialog(null, "Selecione algum cargo da lista!!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         FuncionarioD.editarFuncionario(Funcionario);
         return true;
    }


        
}
