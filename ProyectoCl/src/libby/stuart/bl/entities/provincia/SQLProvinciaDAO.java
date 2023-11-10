package libby.stuart.bl.entities.provincia;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.distrito.Distrito;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLProvinciaDAO implements IProvinciaDAO{
    @Override
    public ArrayList<Provincia> listarProvincias() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs=null;
        ArrayList<Provincia> provincias = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "select * from Provincias";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Provincia tmpProvincia = new Provincia(rs.getString("id"),rs.getString("nombre"),rs.getString("codigoPais"));
            provincias.add(tmpProvincia);
        }
        return provincias;
    }
}
