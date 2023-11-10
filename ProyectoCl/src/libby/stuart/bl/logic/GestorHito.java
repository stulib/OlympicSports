package libby.stuart.bl.logic;

import libby.stuart.bl.entities.hito.Hito;
import libby.stuart.bl.entities.hito.IHitoDAO;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorHito  extends Gestor{
    private IHitoDAO dao;
    public GestorHito(){
        super();
        dao = factory.getHitoDAO();
    }
    public void registrarHito(String codigo, String nombre, int kilo, String desc) throws SQLException, IOException, ClassNotFoundException {
        Hito tmpHito = new Hito(nombre,kilo,null,desc,codigo);
        dao.registrarHito(tmpHito);
    }

    public ArrayList<Hito> listarHito()throws SQLException, IOException, ClassNotFoundException{
        return dao.listarHitos();
    }
}
