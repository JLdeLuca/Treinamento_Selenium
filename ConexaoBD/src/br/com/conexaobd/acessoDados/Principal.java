package br.com.conexaobd.acessoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Principal {

	public static void main(String[] args) throws Exception {

		Connection conexao = ObterConexao();

		Statement statement = conexao.createStatement();

		String query = "SELECT sysdate FROM dual";

		ResultSet resultSet = statement.executeQuery(query);

		if (resultSet.next()) {
			System.out.println(resultSet.getDate("sysdate"));
		}
	}

	private static Connection ObterConexao() {
		Connection conexao = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexao = DriverManager.getConnection(

					"jdbc:oracle:thin:@127.0.0.0:1081:orcl", "admin", "admin");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();
		
		}

		return conexao;
		
	}

}
