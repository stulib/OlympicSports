package libby.stuart.bl.entities.hito;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IHitoDAO {
    void registrarHito(Hito h)throws ClassNotFoundException, SQLException, IOException;
    ArrayList<Hito> listarHitos()throws ClassNotFoundException, SQLException, IOException;
}
