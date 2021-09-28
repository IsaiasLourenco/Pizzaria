
package Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.gjt.mm.mysql.Driver;

public class Conexao {
    /*Banco de dados Local Xampp
    private final String URL = "jdbc:mysql://localhost:3306/pizzaria";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "root";
    private final String Senha = "";
    private static Connection Con;  */
    
    //Banco de dados Hospedado Server
    private final String URL = "jdbc:mysql://br118.hostgator.com.br:3306/makel783_pizzaria";
    private final String Driver = "org.gjt.mm.mysql.Driver";
    private final String Usuario = "makel783_pizza";
    private final String Senha = "hugo123";
    private static Connection Con;
    
    public Conexao(){
        try {
            Con = DriverManager.getConnection(URL, Usuario, Senha);
            Con.setAutoCommit(false);
           // JOptionPane.showMessageDialog(null, "Conectado com Sucesso", "Conectado", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com o Banco", "Erro", 0);
        }
    }
    public static Connection getConnection(){
        if(Con == null){
            new Conexao();
        }
        return Con;
    }
    
    public static void fecharConexao(){
    
        try {
            if(!Con.isClosed()){
                Con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
}
    


public static void main(String args[]){
    Conexao.getConnection();
}
}