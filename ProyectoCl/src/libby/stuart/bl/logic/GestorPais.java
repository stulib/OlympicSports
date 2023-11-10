package libby.stuart.bl.logic;

import libby.stuart.bl.entities.pais.IPaisDAO;
import libby.stuart.bl.entities.pais.Pais;
import libby.stuart.bl.entities.usuario.Usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class GestorPais extends Gestor{
    private IPaisDAO dao;
    public GestorPais(){
        super();
        dao = factory.getPaisDAO();
    }
    public void registrarPais( String nombre) throws SQLException, IOException, ClassNotFoundException {
        String codigo = generarCodigo(nombre);
        Pais tmpPais = new Pais(codigo,nombre);
        if(buscarPais(nombre)==null){
            dao.registrarPais(tmpPais);
        }

    }

    public ArrayList<Pais> listarPaises() throws SQLException, IOException, ClassNotFoundException {
        return dao.listarPaises();
    }

    //Buscar Usuario
    public Pais buscarPais(String nombre) throws SQLException, IOException, ClassNotFoundException {
        Pais tmpPais = null;
        ArrayList<Pais> tmpPaises = listarPaises();
        for(Pais p: tmpPaises){
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return tmpPais;
    }

    public String generarCodigo(String nombre){
        String  codigo;
        Character letra = nombre.charAt(0);
        int numero = ThreadLocalRandom.current().nextInt(100,999);
        codigo = letra+String.valueOf(numero);
        return codigo;
    }
}
