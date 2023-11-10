package libby.stuart.bl.logic;

import libby.stuart.bl.entities.canton.Canton;
import libby.stuart.bl.entities.canton.ICantonDAO;
import libby.stuart.bl.entities.distrito.Distrito;
import libby.stuart.bl.entities.distrito.IDistritoDAO;
import libby.stuart.bl.entities.provincia.IProvinciaDAO;
import libby.stuart.bl.entities.provincia.Provincia;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorPCD extends Gestor{
    private IProvinciaDAO daop;
    private ICantonDAO daoc;
    private IDistritoDAO daod;

    public GestorPCD(){
        super();
        daop = factory.getProvincaDAO();
        daoc = factory.getCantonDAO();
        daod = factory.geDItritoDAO();
    }

    public ArrayList<Provincia> listarProvincias() throws SQLException, IOException, ClassNotFoundException {
        return daop.listarProvincias();
    }
    public ArrayList<Canton> listarCantones() throws SQLException, IOException, ClassNotFoundException {
        return daoc.listarCantones();
    }
    public ArrayList<Distrito> listarDistritos() throws SQLException, IOException, ClassNotFoundException {
        return daod.listarDistritos();
    }


}
