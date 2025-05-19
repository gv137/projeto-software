package controller;

import java.io.IOException;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.LoginUsuario;
import model.Usuario;

public class LoginController {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtSenha;

    @FXML
    void onClickEntrar(ActionEvent event) throws SQLException {
    	String login = this.txtLogin.getText();
    	String senha = this.txtSenha.getText();
    	
    	LoginUsuario loginUsuario = new LoginUsuario();
    	Usuario usuario = loginUsuario.verificarLogin(login, senha);
    	
    	if (usuario == null) {
			Alert alerta = new Alert (Alert.AlertType.ERROR);
			alerta.setTitle("Erro Login");
			alerta.setHeaderText("Login ou senha incorretad");
			alerta.setContentText("Verifique as credenciais novamente");
			alerta.showAndWait();
		} else {
			System.out.println("Acesso liberado");
		}
    }

    @FXML
    void onClickVoltar(ActionEvent event) throws IOException {
    	AlterarTelaController.mudarTela(event, "/view/TelaHome.fxml", "Tela Home");
    }

}
