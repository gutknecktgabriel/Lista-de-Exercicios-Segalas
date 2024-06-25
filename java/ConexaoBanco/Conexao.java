package ConexaoBanco;

import java.sql.*;

public class Conexao {

    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while (rsCliente.next()) {
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver do banco de dados não encontrado");
        } catch (SQLException e) {
            System.out.println("Ocorreu um erro ao acessar o banco: " + e.getMessage());
        }
    }
}