package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;

public class CadastroUsuario {

	public void cadastrarUsuario (Usuario usuario) throws SQLException {
		
		//comando para inserir dados no DB
		String sql = "INSERT INTO usuarios (id, login, nome, senha) VALUES (?, ?, ?, ?)";
		
		try {
			
		
		
		//preparando a consulta SQL 
		Connection conn = ConexaoDB.conectar();
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		//Susbstituir as ? pelos dados do objeto usuario
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getLogin());
		stmt.setString(3, usuario.getNome());
		stmt.setString(4, usuario.getSenha());
		
		//executar o comando 
		stmt.executeUpdate();
		
		//Encerro a consulta e a conexão com o DB
		stmt.close();
		conn.close();
		
		//Criar uma janela caso o cadastro tenha sido feito
		Alert alerta = new Alert (Alert.AlertType.INFORMATION);
		alerta.setTitle("Cadastro realizado com sucesso");
		alerta.setHeaderText("Cadastrado com sucesso");
		alerta.setContentText("O novo usuário foi cadastrado com sucesso");
		alerta.showAndWait();
		
		} catch (SQLException e) {
			//criar uma janela caso o login ja exista
			Alert alerta = new Alert (Alert.AlertType.ERROR);
			alerta.setTitle("Erro Cadastro");
			alerta.setHeaderText("Login já existente");
			alerta.setContentText("Este login ja está sendo utilizado");
			alerta.showAndWait();
		}
		
	}
	
}
