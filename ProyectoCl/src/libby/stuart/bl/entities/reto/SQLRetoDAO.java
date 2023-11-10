package libby.stuart.bl.entities.reto;

import libby.stuart.accesodatos.Connector;
import libby.stuart.bl.entities.pais.SQLPaisDAO;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SQLRetoDAO implements IRetoDAO{

    public SQLRetoDAO(){}


    @Override
    public void registrarReto(Reto r) throws ClassNotFoundException, SQLException, IOException {
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "Insert into Reto(codigo,nombre,descripcion,cantKilo,medalla)\n" +
                "values ('"+r.getCodigo()+"', '"+r.getNombre()+"', '"+r.getDescripcion()+"',"+r.getCantKilo()+",'"+r.getMedalla()+"')";
        Connector.getConector(driver,strConexion).ejecutar(query);
    }

    @Override
    public ArrayList<Reto> listarRetos() throws ClassNotFoundException, SQLException, IOException {
        ResultSet rs=null;
        ArrayList<Reto> retos = new ArrayList<>();
        String driver ="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String strConexion = "jdbc:sqlserver://DESKTOP-92GJOPO;DatabaseName=ProyectoPoo;user=sa;password=1234";
        String query = "select * from Reto";
        rs= Connector.getConector(driver,strConexion).ejecututarQuery(query);
        while (rs.next()){
            Reto tmpReto = new Reto(rs.getString("nombre"),rs.getString("codigo"),
                    rs.getString("descripcion"),null,Integer.parseInt(rs.getString("cantKilo")),rs.getString("medalla"));
            retos.add(tmpReto);

        }
        return retos;
        //public Reto(String nombre, String codigo, String descripcion, byte imagen, int cantKilo, String medalla)
    }
}
