package libby.stuart.bl.entities.canton;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ICantonDAO {
    ArrayList<Canton> listarCantones()throws ClassNotFoundException, SQLException, IOException;
}
