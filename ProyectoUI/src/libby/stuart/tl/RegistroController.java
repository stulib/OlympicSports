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


public class RegistroController {

    @FXML
    private Button botonCancelar;
    @FXML
    private Label registroMensaje;
    @FXML
    private PasswordField textoContrasenna;
    @FXML
    private PasswordField textoConfirmacion;
    @FXML
    private Label claveMensaje;
    @FXML
    private TextField textoNombre;
    @FXML
    private TextField textoApellidos;
    @FXML
    private TextField textoID;
    @FXML
    private TextField textoUsername;


    public void botonCancelarOnAction(){
        Stage stage = (Stage) botonCancelar.getScene().getWindow();
        stage.close();
        abrirLogin();
    }

    public void botonRegistroAccion() throws SQLException, IOException, ClassNotFoundException {
        if(textoContrasenna.getText().equals(textoConfirmacion.getText()  )){
            registrarUsuario();
        } else {
            claveMensaje.setText("La contraseña no concuerda");
        }

    }

    public void abrirLogin() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/Login.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void registrarUsuario() throws SQLException, IOException, ClassNotFoundException {
        GestorUsuario gu = new GestorUsuario();
        String nombre = textoNombre.getText();
        String apellidos = textoApellidos.getText();
        String id= textoID.getText();
        String username = textoUsername.getText();
        String clave = textoContrasenna.getText();
        //String confrimacion = textoConfirmacion.getText();
        switch (gu.validarUsuario(id,username)){
            case 1:
                gu.registrarUsuario(nombre,apellidos,id,username,clave);
                registroMensaje.setText("Registro exitoso!");
                break;
            case 2:
                registroMensaje.setText("La identificacion ya existe!");
                break;
            case 3:
                registroMensaje.setText("El nombre de usuario ya existe!");
                break;
        }
        gu.registrarUsuario(nombre,apellidos,id,username,clave);

    }
}
