package Controller;

import Beans.EntregadorBeans;
import DAO.EntregadorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class EntregadorController {
    
    EntregadorDAO EntregadorD;
    
    public EntregadorController() {
        EntregadorD = new EntregadorDAO();
    }
    
    public boolean verificarDados(EntregadorBeans Entregador) {
        if(Entregador.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
        
        EntregadorD.cadastrarEntregador(Entregador);
        return true;
    }
    
    public String controleDeCodigo() {
        return EntregadorD.proximoEntregador();
    }
    
    public void controlePesquisa(String Pesquisa, DefaultTableModel Modelo) {
        EntregadorD.buscarEntregador(Pesquisa, Modelo);
    }
    
    public EntregadorBeans controlePreencherCampos(int Codigo) {
        return EntregadorD.PreencherCampos(Codigo);
    }
    
        public boolean verificarDadosEditados(EntregadorBeans Entregador) {
        if(Entregador.getNome().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha o campo nome.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return false;
        }
         
         EntregadorD.editarEntregador(Entregador);
         return true;
    }


        
}
