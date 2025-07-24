package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexDB {
    public static Connection conectar() throws ClassNotFoundException {
        Connection conexao = null;

        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Dados da conexão
            String url = "jdbc:mysql://localhost:3306/hospital";
            String usuario = "root";
            String senha = "";

            // Estabelece conexão
            conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }

        return conexao;
    }
}
