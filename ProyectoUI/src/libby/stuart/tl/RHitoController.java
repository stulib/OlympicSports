package libby.stuart.tl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import libby.stuart.bl.logic.GestorHito;

import java.io.IOException;
import java.sql.SQLException;

public class RHitoController {

    @FXML
    private Button botonVolver;
    @FXML
    private TextField textoNombre;
    @FXML
    private TextField textoCodigo;
    @FXML
    private TextField textoDescripcion;
    @FXML
    private TextField textoKilo;
    @FXML
    private Label registroMensaje;

    public void  botonVolverAccion(){
        abrirHitos();
    }

    public void botonRegistroAccion() throws SQLException, IOException, ClassNotFoundException {registrarHito();}

    public void registrarHito() throws SQLException, IOException, ClassNotFoundException {
        GestorHito gh = new GestorHito();
        String nombre = textoNombre.getText();
        String desc = textoDescripcion.getText();
        int kilo = Integer.parseInt(textoKilo.getText());
        String codigo = textoCodigo.getText();
        gh.registrarHito(codigo,nombre,kilo,desc);
        registroMensaje.setText("Registro exitoso");
    }

    public void abrirHitos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/hitos.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
            Stage stage = (Stage) botonVolver.getScene().getWindow();
            stage.close();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

}
