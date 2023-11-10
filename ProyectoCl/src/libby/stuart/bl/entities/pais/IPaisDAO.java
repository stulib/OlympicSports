package libby.stuart.bl.entities.pais;

import libby.stuart.bl.entities.usuario.Usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IPaisDAO {
    void registrarPais(Pais p)throws ClassNotFoundException, SQLException, IOException;
    ArrayList<Pais> listarPaises() throws ClassNotFoundException,SQLException,IOException;

}
