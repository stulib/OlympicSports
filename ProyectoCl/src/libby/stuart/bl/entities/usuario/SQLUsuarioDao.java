package libby.stuart.bl.entities.usuario;

import libby.stuart.accesodatos.Connector;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLUsuarioDao implements IUsuarioDAO{

    public SQLUsuarioDao(){

    }

    public void registrarUsuario(Usuario u) throws SQLException, ClassNotFoundException, IOException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "insert into Usuario values"+
                " ('"+u.getId()+ "','"+u.getNombre()+"','"+u.getApellidos()+"','"+u.getClave()+"','"+u.getPais()+"','"+u.getUsername()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
        //Connector.getConector(driver,strConexion).ejecutar(query);
    }

    public ArrayList<Usuario> listarUsuario() throws SQLException, ClassNotFoundException , IOException{
        ResultSet rs=null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Select * from Usuario";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Usuario tmpUsuario = new Usuario(rs.getString("nombre"),rs.getString("apellidos"),
                    rs.getString("id"),rs.getString("username"),rs.getString("clave"),null);
            usuarios.add(tmpUsuario);
        }
        return usuarios;
    }
}
