package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;

public class AtualizaDados {

	public boolean AtualizarUsuario(Usuario usuario, String login) throws SQLException {
		
		//SQL para atualizar dados do usuario
		String sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ? WHERE login = ?";
		
		try(Connection conn = ConexaoDB.conectar()){
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getLogin());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, login);
			
			stmt.executeUpdate();
			return true;
		
		} catch (SQLException e) {
			
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erroa ao atualizar o Cadastro");
			alerta.setHeaderText("Login já existente");
			alerta.setContentText("Este login já está sendo utilizado");
			alerta.showAndWait();
			return false;
			
		}
		
		
	}
	
	
}
