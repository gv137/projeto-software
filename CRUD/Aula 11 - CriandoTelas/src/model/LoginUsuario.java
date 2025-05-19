package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginUsuario {
	// Criar um método que retornará o objeto Usuário ou null

	public Usuario verificarLogin(String login, String senha) throws SQLException {

		// Consulta SQL para buscar o usuário
		String SQL = "SELECT * FROM  usuarios WHERE login = ?";

		try (Connection conn = ConexaoDB.conectar(); PreparedStatement stmt = conn.prepareStatement(SQL)) {

			stmt.setString(1, login);
			ResultSet rs = stmt.executeQuery();

			// Validar se a consulta retornou null
			if (!rs.next()) {
				return null;
			}

			// recupera a senha do usuário no BD
			String senhaDB = rs.getString("senha");

			// Comparar a senha digitada com a senha salva no banco de dados
			if (senha.equals(senhaDB)) {

				// instancia o objeto da classe usuario, usando as info retornadas do DB
				Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("nome"),
						rs.getString("senha"));
				return usuario;
			} else {
				return null;
			}

		}

		catch (SQLException e) {
			return null;
		}


	}
}
