package DAO;

import Beans.ClienteBeans;
import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class ClienteDAO {
    
    public ClienteDAO() {
        
    }
    public void cadastrarCliente(ClienteBeans cliente) {
        try {
            String SQLInsertion = "insert into clientes(cli_nome, cli_rua, cli_bairro, cli_telefone, cli_cidade, cli_data_cad) values(?,?,?,?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, cliente.getNome());
            st.setString(2, cliente.getRua());
            st.setString(3, cliente.getBairro());
            st.setString(4, cliente.getTelefone());
            st.setString(5, cliente.getCidade());
            st.setString(6, Corretores.ConverterParaSQL(cliente.getDataCad()));
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximoCliente() {
        String SQLSelection = "select * from clientes order by cli_cod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs =  st.executeQuery();
            if(rs.next()) {
                return (Integer.parseInt(rs.getString("cli_cod")) + 1) + "";
            }else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }
    
    public void buscarCliente(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "select * from clientes where cli_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[] {rs.getString("cli_cod"), rs.getString("cli_nome"), rs.getString("cli_rua"), rs.getString("cli_bairro"), rs.getString("cli_cidade"), rs.getString("cli_telefone")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    public ClienteBeans PreencherCampos(int Codigo) {
        ClienteBeans Cliente = new ClienteBeans();
        try {
            String SQLSelection = "select * from clientes where cli_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Cliente.setCodigo(rs.getInt("cli_cod"));
                Cliente.setNome(rs.getString("cli_nome"));
                Cliente.setRua(rs.getString("cli_rua"));
                Cliente.setBairro(rs.getString("cli_bairro"));
                Cliente.setTelefone(rs.getString("cli_telefone"));
                Cliente.setCidade(rs.getString("cli_cidade"));
                Cliente.setDataCad(Corretores.ConverterParaJava(rs.getString("cli_data_cad")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return Cliente;
    }
    
    public void editarCliente(ClienteBeans Cliente) {
        try {
            String SQLInsertion = "update clientes set cli_nome = ?, cli_rua = ?, cli_bairro = ?, cli_telefone = ?, cli_cidade = ? where cli_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Cliente.getNome());
            st.setString(2, Cliente.getRua());
            st.setString(3, Cliente.getBairro());
            st.setString(4, Cliente.getTelefone());
            st.setString(5, Cliente.getCidade());
            st.setInt(6, Cliente.getCodigo());
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Cliente editado com sucesso.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    } 
    
    public void buscarCliente(String Pesquisa, List<String> Lista) {
 
        try {
            String SQLSelection = "select * from clientes where cli_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Lista.add(rs.getString("cli_cod") + " - " + rs.getString("cli_nome") + "   - - -   " + rs.getString("cli_telefone"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
        
}
