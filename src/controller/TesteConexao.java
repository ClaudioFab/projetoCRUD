package controller;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class TesteConexao {
    public static void main(String[] args) {
        Connection connection = new ConnectionMySql().getConnection();
        
        JOptionPane.showMessageDialog(null,"Conexão Estabelecida!","Aviso!",JOptionPane.WARNING_MESSAGE);
    }
}
