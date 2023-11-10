package libby.stuart.bl.entities.distrito;

import libby.stuart.bl.entities.canton.Canton;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IDistritoDAO {
    ArrayList<Distrito> listarDistritos()throws ClassNotFoundException, SQLException, IOException;

}
