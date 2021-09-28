package DAO;

import Beans.EntregadorBeans;
import DAO.EntregadorDAO;
import Beans.FuncionarioBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class EntregadorDAO {
    
    public EntregadorDAO() {
        
    }
    public void cadastrarEntregador(EntregadorBeans Entregador) {
        try {
            String SQLInsertion = "insert into entregador (ent_nome, ent_status, ent_data_cad) values(?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Entregador.getNome());
            st.setString(2, "Livre");
            st.setString(3, Corretores.ConverterParaSQL(Entregador.getDataCad()));
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador cadastrado.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximoEntregador() {
        String SQLSelection = "select * from entregador order by ent_cod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs =  st.executeQuery();
            if(rs.next()) {
                return (Integer.parseInt(rs.getString("ent_cod")) + 1) + "";
            }else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }
    
    public void buscarEntregador(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "select * from entregador where ent_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[] {rs.getString("ent_cod"), rs.getString("ent_nome"),rs.getString("ent_status"), Corretores.ConverterParaJava(rs.getString("ent_data_cad"))});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    public EntregadorBeans PreencherCampos(int Codigo) {
        EntregadorBeans Entregador = new EntregadorBeans();
        try {
            String SQLSelection = "select * from entregador where ent_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Entregador.setCodigo(rs.getInt("ent_cod"));
                Entregador.setNome(rs.getString("ent_nome"));
                Entregador.setDataCad(Corretores.ConverterParaJava(rs.getString("ent_data_cad")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return Entregador;
    }
    
    public void editarEntregador(EntregadorBeans Entregador) {
        try {
            String SQLInsertion = "update entregador set ent_nome = ? where ent_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Entregador.getNome());
            st.setInt(2, Entregador.getCodigo());
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Entregador editado com sucesso.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar registro!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    } 
    
        
}
