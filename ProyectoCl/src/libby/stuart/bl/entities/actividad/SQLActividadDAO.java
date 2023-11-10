package libby.stuart.bl.entities.actividad;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.pais.Pais;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLActividadDAO implements IActividadDAO{
    public SQLActividadDAO(){

    }

    @Override
    public void registrarActividad(Actividad a) throws ClassNotFoundException, SQLException, IOException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Insert Into Actividad(codigo,nombre) values('"+a.getCodigo()+"','"+a.getNombre()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    @Override
    public ArrayList<Actividad> listarActividad() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs = null;
        ArrayList<Actividad> actividades = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "select * from Actividad";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Actividad tmpAct = new Actividad(rs.getString("Codigo"),rs.getString("Nombre"),null);
            actividades.add(tmpAct);
        }
        return actividades;
    }

    @Override
    public void eliminarActividad(Actividad a) throws SQLException, ClassNotFoundException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Delete from Actividad where codigo = '"+a.getCodigo()+"'";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }
}
