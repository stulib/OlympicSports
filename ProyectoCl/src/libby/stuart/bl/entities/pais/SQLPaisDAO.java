package libby.stuart.bl.entities.pais;

import libby.stuart.accesodatos.Connector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLPaisDAO implements IPaisDAO{
    public SQLPaisDAO(){

    }

    public void registrarPais(Pais p) throws SQLException, ClassNotFoundException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Insert Into Paises(codigo,nombre) values('"+p.getCodigo()+"','"+p.getNombre()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    public ArrayList<Pais> listarPaises() throws SQLException, ClassNotFoundException {
        ResultSet rs=null;
        ArrayList<Pais> paises = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "select * from Paises";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Pais tmpPais = new Pais(rs.getString("codigo"),rs.getString("nombre"));
            paises.add(tmpPais);
        }
        return paises;
    }
}
