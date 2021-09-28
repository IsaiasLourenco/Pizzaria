package DAO;

import Beans.CardapioBeans;
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

public class CardapioDAO {
    
    public CardapioDAO() {
        
    }
    public void cadastrarCardapio(CardapioBeans cardapio) {
        try {
            String SQLInsertion = "insert into cardapio (car_descricao, car_tipo, car_valor) values(?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, cardapio.getDescricao());
            st.setString(2, cardapio.getTipo());
            st.setDouble(3, cardapio.getValor());
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Item de cardápio cadastrado.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximoCardapio() {
        String SQLSelection = "select * from cardapio order by car_cod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs =  st.executeQuery();
            if(rs.next()) {
                return (Integer.parseInt(rs.getString("car_cod")) + 1) + "";
            }else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }
    
    public void buscarCardapio(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "select * from cardapio where car_descricao like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[] {rs.getString("car_cod"), rs.getString("car_descricao"), rs.getString("car_tipo"), rs.getString("car_valor")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    public CardapioBeans PreencherCampos(int Codigo) {
        CardapioBeans Cardapio = new CardapioBeans();
        try {
            String SQLSelection = "select * from cardapio where car_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Cardapio.setCodigo(rs.getInt("car_cod"));
                Cardapio.setDescricao(rs.getString("car_descricao"));
                Cardapio.setTipo(rs.getString("car_tipo"));
                Cardapio.setValor(rs.getDouble("car_valor"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return Cardapio;
    }
    
    public void editarCardapio(CardapioBeans Cardapio) {
        try {
            String SQLInsertion = "update cardapio set car_descricao = ?, car_tipo = ?, car_valor = ? where car_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cardapio.getDescricao());
            st.setString(2, Cardapio.getTipo());
            st.setDouble(3, Cardapio.getValor());
            st.setInt(4, Cardapio.getCodigo());
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Item de cardápio editado com sucesso.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar registro!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    } 
    
        
}
