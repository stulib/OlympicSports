package libby.stuart.dl;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.pais.Pais;
import libby.stuart.bl.entities.usuario.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBData {

    public DBData(){

    }
    public void registrarUsuario(Usuario u) throws SQLException, ClassNotFoundException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=Laboratorio;user=sa;password=1234";
        String query = "insert into Usuario values"+
                " ('"+u.getId()+ "','"+u.getNombre()+"','"+u.getApellidos()+"','"+u.getClave()+"','"+u.getPais()+"','"+u.getUsername()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    public ArrayList<Usuario> listarUsuarios() throws SQLException, ClassNotFoundException {
        ResultSet rs=null;
        ArrayList<Usuario> usuarios = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=Laboratorio;user=sa;password=1234";
        String query = "Select * from Usuario";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Usuario tmpUsuario = new Usuario(rs.getString("nombre"),rs.getString("apellidos"),
                    rs.getString("id"),rs.getString("username"),rs.getString("clave"),null);
            usuarios.add(tmpUsuario);
        }
        return usuarios;
    }
    public void registrarPais(Pais p) throws SQLException, ClassNotFoundException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=Laboratorio;user=sa;password=1234";
        String query = "Insert Into Paises(codigo,nombre) values('"+p.getCodigo()+"','"+p.getNombre()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    public ArrayList<Pais> listarPaises() throws SQLException, ClassNotFoundException {
        ResultSet rs=null;
        ArrayList<Pais> paises = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=Laboratorio;user=sa;password=1234";
        String query = "select * from Paises";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Pais tmpPais = new Pais(rs.getString("codigo"),rs.getString("nombre"));
            paises.add(tmpPais);
        }
        return paises;
    }
}
