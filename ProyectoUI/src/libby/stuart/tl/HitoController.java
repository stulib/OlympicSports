package libby.stuart.tl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import libby.stuart.bl.entities.hito.Hito;
import libby.stuart.bl.logic.GestorHito;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HitoController implements Initializable {

    GestorHito gh = new GestorHito();

    @FXML
    private TableView<Hito> tablaHitos;
    @FXML
    private Button botonAgregar;
    @FXML
    private Button botonVolver;
    @FXML
    private TableColumn cNombre;
    @FXML
    private TableColumn cCodigo;
    @FXML
    private TableColumn cDescripcion;
    @FXML
    private TableColumn cKilometro;

    ObservableList<Hito> listaHitos = FXCollections.observableArrayList(gh.listarHito());

    public HitoController() throws SQLException, IOException, ClassNotFoundException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        cDescripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
        cKilometro.setCellValueFactory(new PropertyValueFactory<>("kilometro"));
        cCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        tablaHitos.setItems(listaHitos);
    }

    public void botonVolverAccion(){
        abrirRetos();
    }

    public void botonAgregarAccion(){
        abrirRegistro();
    }

    public void abrirRetos(){
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
    public void abrirRegistro(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/registroHito.fxml"));
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
