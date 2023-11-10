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
import libby.stuart.bl.entities.pais.Pais;
import libby.stuart.bl.logic.GestorPais;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PaisesController implements Initializable {

    GestorPais gp = new GestorPais();

    @FXML
    private TableView<Pais> tablaPaises;
    @FXML
    private TableColumn cNombre;
    @FXML
    private TableColumn cCodigo;
    @FXML
    private TextField textoPais;
    @FXML
    private Button botonAgregar;
    @FXML
    private Button botonVolver;


    ObservableList<Pais> listaPaises = FXCollections.observableArrayList(gp.listarPaises());

    public PaisesController() throws SQLException, IOException, ClassNotFoundException {
    }

    public void initialize(URL url, ResourceBundle resourceBundle){
        cNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        cCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
        tablaPaises.setItems(listaPaises);
    }

    public void botonAgregarAccion() throws SQLException, IOException, ClassNotFoundException {
        registrarPais();
    }

    public void botonVolverAccion(){
        abrirMenuAdmin();
    }

    public void botonPCDAccion(){
        abrirPCD();
    }

    public void registrarPais() throws SQLException, IOException, ClassNotFoundException {
        String pais = textoPais.getText();
        //System.out.println(pais);
        if(pais.equalsIgnoreCase("Agregar país...")){

        } else {
            gp.registrarPais(pais);
            cNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
            cCodigo.setCellValueFactory(new PropertyValueFactory<>("Codigo"));
            listaPaises = FXCollections.observableArrayList(gp.listarPaises());
            tablaPaises.setItems(listaPaises);
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
    public void abrirPCD(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/libby/stuart/ui/pCD.fxml"));
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
