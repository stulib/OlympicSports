package libby.stuart.tl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import libby.stuart.bl.logic.GestorUsuario;

import java.io.IOException;
import java.sql.SQLException;

public class LoginController {
    @FXML
    private Button registerButton;
    @FXML
    private TextField textoUsuario;
    @FXML
    private PasswordField textoPassword;
    @FXML
    private Label mensajeLogin;
    @FXML
    private Button loginButton;

    public void loginButtonOnAction() throws SQLException, IOException, ClassNotFoundException {
        ingresar();
    }
    public void registerButtonOnAction() throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();
        abrirRegistro();
    }

    public void abrirRegistro() {
       try {
           Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/registro.fxml"));
           Stage registroStage = new Stage();
           registroStage.setTitle("Keep Moving");
           registroStage.setScene(new Scene(root, 1366, 768));
           registroStage.show();
       }catch (Exception e) {
           e.printStackTrace();
           e.getCause();
       }
    }

    public void abrirMenuAdmin(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/menuAdmin.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
            Stage stage = (Stage) registerButton.getScene().getWindow();
            stage.close();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void abrirMenuUsuario(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/menuUsuario.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
            Stage stage = (Stage) registerButton.getScene().getWindow();
            stage.close();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void ingresar() throws SQLException, IOException, ClassNotFoundException {
        GestorUsuario gu = new GestorUsuario();
        String username = textoUsuario.getText();
        String clave = textoPassword.getText();
        if (gu.validarLogin(username, clave)){
            mensajeLogin.setText("Usuario o contraseña invalidos, por favor intentelo de nuevo");
        }else{
            if (username.equalsIgnoreCase("Admin")){
                abrirMenuAdmin();
            }else{
                abrirMenuUsuario();
            }

        }

    }
}
