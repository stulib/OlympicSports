package libby.stuart.tl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class menuAdminController {
    @FXML
    private Button paisBoton;
    @FXML
    private Button retoBoton;

    public void retoBotonAccion(){
        Stage stage = (Stage) paisBoton.getScene().getWindow();
        stage.close();
        abrirRetos();
    }

    public void paisBotonAccion(){
        Stage stage = (Stage) paisBoton.getScene().getWindow();
        stage.close();
        abrirPaises();

    }
    public void ActBotonAccion(){
        Stage stage = (Stage) paisBoton.getScene().getWindow();
        stage.close();
        abrirActividades();
    }

    public void abrirRetos() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/retos.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void abrirPaises() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/paises.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void abrirActividades() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/actividades.fxml"));
            Stage registroStage = new Stage();
            registroStage.setTitle("Keep Moving");
            registroStage.setScene(new Scene(root, 1366, 768));
            registroStage.show();
        }catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }
}
