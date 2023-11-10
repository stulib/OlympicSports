package libby.stuart.bl.entities.canton;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.pais.Pais;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLCantonDAO implements ICantonDAO{
    @Override
    public ArrayList<Canton> listarCantones() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs=null;
        ArrayList<Canton> cantones = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Select * from Cantones";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Canton tmpCanton = new Canton(rs.getString("id"),rs.getString("nombre"),rs.getString("codigoProv"));
            cantones.add(tmpCanton);
        }
        return cantones;
    }
}
