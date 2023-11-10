package libby.stuart.bl.entities.reto;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IRetoDAO {
    void registrarReto(Reto r)throws ClassNotFoundException, SQLException, IOException;
    ArrayList<Reto> listarRetos()throws ClassNotFoundException, SQLException, IOException;
}
