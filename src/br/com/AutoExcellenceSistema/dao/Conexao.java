package br.com.AutoExcellenceSistema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection conexao() {
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdOficina?useSSL=false"
                + "&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String user = "root";
        String password = "Fatalidade1@";

        try {
            Class.forName(driver);
            Connection conexao = DriverManager.getConnection(url, user, password);
            System.out.println("DataBase: OK!");
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro ao conectar ao MySQL: " + e);
            return null;
        }
    }
}
