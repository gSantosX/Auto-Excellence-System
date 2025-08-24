package br.com.AutoExcellenceSistema.dao;

import java.sql.*;

public class Conexao {
    public static Connection conexao(){
        java.sql.Connection conexao = null;
        
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdOficina?useSSL=false"
                + "&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "root";
        String password = "Fatalidade1@";
        
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println("DataBase: OK!");
            return conexao;
        } catch (Exception e) {
            System.err.println("Erro ao conectar ao MySQL: " + e);
            return null;
        }
        
    }
    
}
