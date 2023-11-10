package libby.stuart.bl.entities.provincia;

import libby.stuart.bl.entities.canton.Canton;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IProvinciaDAO {
    ArrayList<Provincia> listarProvincias()throws ClassNotFoundException, SQLException, IOException;

}
