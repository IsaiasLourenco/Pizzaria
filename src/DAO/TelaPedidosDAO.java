package DAO;

import Utilitarios.Conexao;
import Utilitarios.Corretores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPedidosDAO {
    public TelaPedidosDAO() {
        
    }
    
    public void MostrarPedidos(DefaultTableModel Modelo) {
        try {
            String SQLPesquisa = "select * from pedidos order by ped_cod desc limit 15";
            PreparedStatement st = Conexao.getConnection().prepareStatement(SQLPesquisa);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                Modelo.addRow(new Object[] {rs.getString("ped_cod"), (Corretores.ConverterParaJava(rs.getString("ped_data"))), rs.getString("ped_hora"), rs.getString("ped_status")});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro", 0, new ImageIcon("Imagens/btn_sair.png"));
        }
    }
}
