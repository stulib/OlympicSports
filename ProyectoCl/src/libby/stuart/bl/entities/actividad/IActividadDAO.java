package libby.stuart.bl.entities.actividad;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IActividadDAO {
    void  registrarActividad(Actividad a)throws ClassNotFoundException, SQLException, IOException;
    ArrayList<Actividad> listarActividad()throws ClassNotFoundException,SQLException,IOException;
    void eliminarActividad(Actividad a) throws SQLException, ClassNotFoundException;
}
