package libby.stuart.tl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import libby.stuart.bl.logic.GestorReto;


import java.io.IOException;
import java.sql.SQLException;

public class RegistroRetoController {

    @FXML
    private Button botonVolver;
    @FXML
    private TextField textoNombre;
    @FXML
    private TextField textoCodigo;
    @FXML
    private TextField textoDescripcion;
    @FXML
    private TextField textoKilometros;
    @FXML
    private TextField textoMedalla;
    @FXML
    private Label registroMensaje;


    public void botonRegistroAccion() throws SQLException, IOException, ClassNotFoundException {
        registrarReto();
    }

    public void  botonVolverAccion(){
        abrirRetos();
    }

    public void registrarReto() throws SQLException, IOException, ClassNotFoundException {
        GestorReto gr = new GestorReto();
        String nombre = textoNombre.getText();
        String codigo = textoCodigo.getText();
        String desc = textoDescripcion.getText();
        int cantKilo = Integer.parseInt(textoKilometros.getText());
        String medalla = textoMedalla.getText();
        if (codigo.equals("")){
            registroMensaje.setText("Por favor llenar todos los campos");
        } else {
            if (gr.buscarCodigo(codigo) == null){
                gr.registrarReto(codigo,nombre,desc,cantKilo,medalla);
                registroMensaje.setText("Registro exitoso");
            } else {
                registroMensaje.setText("El reto ya está registrado");
            }
        }
    }

    public void abrirRetos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/retos.fxml"));
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
