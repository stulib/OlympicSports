package libby.stuart.bl.entities.usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IUsuarioDAO {
    void registrarUsuario(Usuario u)throws ClassNotFoundException, SQLException, IOException;
    ArrayList<Usuario> listarUsuario() throws ClassNotFoundException,SQLException,IOException;
}
