package libby.stuart.bl.logic;

import libby.stuart.bl.entities.actividad.Actividad;
import libby.stuart.bl.entities.reto.IRetoDAO;
import libby.stuart.bl.entities.reto.Reto;
import libby.stuart.bl.entities.usuario.Usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorReto extends Gestor{
    private IRetoDAO dao;
    public GestorReto(){
        super();
        dao = factory.getRetoDAO();
    }
    public void registrarReto(String codigo, String nombre, String decripcion, int cantKilo, String medalla) throws SQLException, IOException, ClassNotFoundException {
        Reto tmpReto = new Reto(nombre,codigo,decripcion,null,cantKilo, medalla);
        dao.registrarReto(tmpReto);
    }

    public ArrayList<Reto> listarRetos()throws SQLException, IOException, ClassNotFoundException{
        return dao.listarRetos();
    }
    public Reto buscarCodigo(String codigo) throws SQLException, IOException, ClassNotFoundException {
        Reto tmpReto = null;
        ArrayList<Reto> tmpRetos = listarRetos();
        for(Reto r: tmpRetos){
            if (r.getCodigo().equalsIgnoreCase(codigo)) {
                return r;
            }
        }
        return tmpReto;
    }

}
