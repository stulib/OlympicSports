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
import libby.stuart.bl.entities.reto.Reto;
import libby.stuart.bl.logic.GestorReto;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class RetoController implements Initializable {

    GestorReto gr = new GestorReto();

    @FXML
    private TableView<Reto> tablaRetos;
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
    private TableColumn cKilometros;
    @FXML
    private TableColumn cMedalla;


    ObservableList<Reto> listaRetos = FXCollections.observableArrayList(gr.listarRetos());

    public RetoController() throws SQLException, IOException, ClassNotFoundException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        cCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        cDescripcion.setCellValueFactory(new PropertyValueFactory<>("Descripcion"));
        cKilometros.setCellValueFactory(new PropertyValueFactory<>("cantKilo"));
        cMedalla.setCellValueFactory(new PropertyValueFactory<>("Medalla"));
        tablaRetos.setItems(listaRetos);
    }

    public void botonVolverAccion(){
        abrirMenuAdmin();
    }

    public void botonAgregarAccion() throws SQLException, IOException, ClassNotFoundException {
        abrirRegistroReto();
    }

    public void botonPCDAccion(){
        abrirHitos();
    }

    public void abrirMenuAdmin(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/menuAdmin.fxml"));
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
    public void abrirRegistroReto(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/registroReto.fxml"));
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
    public void abrirHitos(){
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
