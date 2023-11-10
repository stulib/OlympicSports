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
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import libby.stuart.bl.entities.actividad.Actividad;
import libby.stuart.bl.logic.GestorActividad;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ActividadController implements Initializable {

    GestorActividad ga = new GestorActividad();

    @FXML
    private TableView<Actividad> tablaActividad;
    @FXML
    private TableColumn cNombre;
    @FXML
    private TableColumn cCodigo;
    @FXML
    private Button botonVolver;
    @FXML
    private TextField textoAgregar;
    @FXML
    private TextField textoEliminar;


    ObservableList<Actividad> listaAct = FXCollections.observableArrayList(ga.listarActividades());

    public ActividadController() throws SQLException, IOException, ClassNotFoundException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        cCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        tablaActividad.setItems(listaAct);
    }
    public void botonAgregarAccion() throws SQLException, IOException, ClassNotFoundException {
        registrarAct();
    }

    public void botonEliminarAccion() throws SQLException, IOException, ClassNotFoundException {
        eliminarAct();
    }

    public void botonVolverAccion(){
        abrirMenuAdmin();
    }

    public void registrarAct() throws SQLException, IOException, ClassNotFoundException {
        String actividad = textoAgregar.getText();
        if (actividad.equals("")){

        } else {
            ga.registrarAct(actividad);
            listaAct = FXCollections.observableArrayList(ga.listarActividades());
            tablaActividad.setItems(listaAct);
        }
    }
    public void eliminarAct() throws SQLException, IOException, ClassNotFoundException {
        String actividad = textoEliminar.getText();
        if (actividad.equals("")){

        } else {
            ga.eliminarAct(actividad);
            listaAct = FXCollections.observableArrayList(ga.listarActividades());
            tablaActividad.setItems(listaAct);
        }
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


}
