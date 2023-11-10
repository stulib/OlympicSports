package libby.stuart.bl.entities.distrito;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.canton.Canton;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLDistritoDAO implements IDistritoDAO{
    @Override
    public ArrayList<Distrito> listarDistritos() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs=null;
        ArrayList<Distrito> distritos = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Select * from Distritos";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Distrito tmpDistrito = new Distrito(rs.getString("id"),rs.getString("nombre"),rs.getString("codigoCant"));
            distritos.add(tmpDistrito);
        }
        return distritos;
    }
}
