package libby.stuart.bl.entities.hito;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.reto.Reto;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLHitoDAO implements IHitoDAO{
    @Override
    public void registrarHito(Hito h) throws ClassNotFoundException, SQLException, IOException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Insert into Hitos(nombre, kilometro, descripcion, Reto_codigo)\n" +
                "Values ('"+h.getNombre()+"', "+h.getKilometro()+", '"+h.getDescripcion()+"', '"+h.getCodigo()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    @Override
    public ArrayList<Hito> listarHitos() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs=null;
        ArrayList<Hito> hitos = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "select * from Hitos";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Hito tmpHito = new Hito(rs.getString("nombre"),Integer.parseInt(rs.getString("kilometro")),null,
                    rs.getString("descripcion"),rs.getString("Reto_codigo"));
            hitos.add(tmpHito);
        }
        return hitos;
    }
}
