package DAO;

import Beans.ClienteBeans;
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

public class FuncionarioDAO {
    
    public FuncionarioDAO() {
        
    }
    public void cadastrarFuncionario(FuncionarioBeans funcionario) {
        try {
            String SQLInsertion = "insert into funcionarios (fun_nome, fun_cargo, fun_data_cad) values(?,?,?)";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, funcionario.getNome());
            st.setString(2, funcionario.getCargo());
            st.setString(3, Corretores.ConverterParaSQL(funcionario.getDataCad()));
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    
    public String proximoFuncionario() {
        String SQLSelection = "select * from funcionarios order by fun_cod desc limit 1";
        try {
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs =  st.executeQuery();
            if(rs.next()) {
                return (Integer.parseInt(rs.getString("fun_cod")) + 1) + "";
            }else {
                return "1";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
            return "0";
        }
    }
    
    public void buscarFuncionario(String Pesquisa, DefaultTableModel Modelo) {

        try {
            String SQLSelection = "select * from funcionarios where fun_nome like '%" + Pesquisa + "%' ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Modelo.addRow(new Object[] {rs.getString("fun_cod"), rs.getString("fun_nome"), rs.getString("fun_cargo"), Corretores.ConverterParaJava(rs.getString("fun_data_cad"))});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
    public FuncionarioBeans PreencherCampos(int Codigo) {
        FuncionarioBeans Funcionario = new FuncionarioBeans();
        try {
            String SQLSelection = "select * from funcionarios where fun_cod = ?";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLSelection);
            st.setInt(1, Codigo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Funcionario.setCodigo(rs.getInt("fun_cod"));
                Funcionario.setNome(rs.getString("fun_nome"));
                Funcionario.setCargo(rs.getString("fun_cargo"));
                Funcionario.setDataCad(Corretores.ConverterParaJava(rs.getString("fun_data_cad")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar registro.", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
        return Funcionario;
    }
    
    public void editarFuncionario(FuncionarioBeans Funcionario) {
        try {
            String SQLInsertion = "update funcionarios set fun_nome = ?, fun_cargo = ? where fun_cod = ? ";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLInsertion);
            st.setString(1, Funcionario.getNome());
            st.setString(2, Funcionario.getCargo());
            st.setInt(3, Funcionario.getCodigo());
            
            st.execute();
            Conexao.getConnection().commit();
            JOptionPane.showMessageDialog(null, "Funcionário editado com sucesso.", "OK", 1, new ImageIcon("Imagens/ok.png"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar registro!", "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    } 
    
        
}
