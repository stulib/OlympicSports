package libby.stuart.tl;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import libby.stuart.bl.entities.canton.Canton;
import libby.stuart.bl.entities.distrito.Distrito;
import libby.stuart.bl.entities.provincia.Provincia;
import libby.stuart.bl.logic.GestorPCD;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class PCDController implements Initializable {

    GestorPCD g = new GestorPCD();

    @FXML
    private TableView<Provincia> tablaProvincias;
    @FXML
    private TableView<Canton> tablaCanton;
    @FXML
    private TableView<Distrito> tablaDistrito;
    @FXML
    private TableColumn pNombre;
    @FXML
    private TableColumn pID;
    @FXML
    private TableColumn pPais;
    @FXML
    private TableColumn cNombre;
    @FXML
    private TableColumn cID;
    @FXML
    private TableColumn cProvincia;
    @FXML
    private TableColumn dNombre;
    @FXML
    private TableColumn dID;
    @FXML
    private TableColumn dCanton;

    //ObservableList<Provincia> provincias = FXCollections.observableArrayList(g.listarProvincias());
    ObservableList<Canton> cantones = FXCollections.observableArrayList(g.listarCantones());
    ObservableList<Distrito> distritos = FXCollections.observableArrayList(g.listarDistritos());

    public PCDController() throws SQLException, IOException, ClassNotFoundException {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    pNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    pID.setCellValueFactory(new PropertyValueFactory<>("id"));
    pPais.setCellValueFactory(new PropertyValueFactory<>("codigoPais"));
    //tablaProvincias.setItems(provincias);
    cNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    cID.setCellValueFactory(new PropertyValueFactory<>("ID"));
    cProvincia. setCellValueFactory(new PropertyValueFactory<>("codigpProvincia"));
    tablaCanton.setItems(cantones);
    dNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
    dID.setCellValueFactory(new PropertyValueFactory<>("ID"));
    dCanton.setCellValueFactory(new PropertyValueFactory<>("codigoCant"));
    tablaDistrito.setItems(distritos);
    }

    public void botonVolverAccion(){
        System.out.println("Adios");
    }


}
