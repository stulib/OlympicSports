package libby.stuart.bl.logic;

import libby.stuart.bl.entities.actividad.Actividad;
import libby.stuart.bl.entities.actividad.IActividadDAO;
import libby.stuart.bl.entities.pais.Pais;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GestorActividad extends Gestor{
    private IActividadDAO dao;
    public GestorActividad(){
        super();
        dao = factory.getActividadDAO();
    }
    public void registrarAct(String nombre) throws SQLException, IOException, ClassNotFoundException {
        String codigo = generarCodigo(nombre);
        Actividad tmpAct = new Actividad(codigo,nombre,null);
        dao.registrarActividad(tmpAct);
    }

    public ArrayList<Actividad> listarActividades() throws SQLException, IOException, ClassNotFoundException {
        return dao.listarActividad();
    }
    public void eliminarAct(String codigo) throws SQLException, IOException, ClassNotFoundException {
        if (buscarAct(codigo)!=null){
            dao.eliminarActividad(buscarAct(codigo));
        }
    }

    public String generarCodigo(String nombre){
        String  codigo;
        Character letra = 'A';
        int numero = ThreadLocalRandom.current().nextInt(1000,9999);
        codigo = letra+String.valueOf(numero);
        return codigo;
    }

    public Actividad buscarAct(String codigo) throws SQLException, IOException, ClassNotFoundException {
        Actividad tmpAct = null;
        ArrayList<Actividad>  tmpActividades = listarActividades();
        for (Actividad a : tmpActividades){
            if(a.getCodigo().equals(codigo)){
                return a;
            }
        }
        return tmpAct;
    }
}
