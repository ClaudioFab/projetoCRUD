package controller;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;


public class ConnectionMySql {
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3307/projetoCrud","root","");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Não foi possivel conectar!","Erro!",JOptionPane.ERROR_MESSAGE);
            throw new RuntimeException(e);
        }
    }
    
}
