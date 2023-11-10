package libby.stuart.bl.logic;

import libby.stuart.bl.entities.actividad.Actividad;
import libby.stuart.bl.entities.hito.Hito;
import libby.stuart.bl.entities.pais.Pais;
import libby.stuart.bl.entities.reto.Reto;
import libby.stuart.bl.entities.usuario.Usuario;
import libby.stuart.dao.DAOFactory;
import libby.stuart.dl.DBData;
import libby.stuart.dl.Data;

import java.sql.SQLException;
import java.util.ArrayList;

public class Gestor {
    protected DAOFactory factory;

    public Gestor() {
        factory = DAOFactory.getDaoFactory(DAOFactory.SQLSERVER);
    }

}



    /*//Registrar Usuario
    public void registrarUsuario(String nombre, String apellidos, String id, String username, String clave){
        if(buscarUsuario(id) == null){
            Pais tmpPais = new Pais("CR-506","Costa Rica");
            Usuario tmpUsuario = new Usuario(nombre,apellidos,id,username,clave,tmpPais);
            datos.agregarUsuario(tmpUsuario);
        }
    }
    //Listar Usuarios
    public ArrayList<Usuario> listarUsuarios(){
        return  datos.listarUsuarios();

    }
    //Buscar Usuario
    public Usuario buscarUsuario(String id){
        Usuario tmpUsuario = null;
        ArrayList<Usuario> tmpUsuarios = listarUsuarios();
        for(Usuario u: tmpUsuarios){
            if (u.getId().equalsIgnoreCase(id)) {
                return u;
            }
        }
        return tmpUsuario;
    }
    //Registrar Pais
    public void registrarPais(String nombre){
        String codigo = generarCodigo(3);
        Pais tmpPais = new Pais(codigo,nombre);
        datos.agregarPais(tmpPais);
    }
    //Listar paises
    public ArrayList<Pais> listarPaises(){
        return datos.listarPaises();
    }
    //Generar codigo
    private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    public static String generarCodigo(int count) {
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return builder.toString();
    }
    //Registrar Actividad
    public void registrarActividad(String nombre, byte icono){
        String codigo = generarCodigo(3);
        Actividad tmpActividad = new Actividad(codigo,nombre,icono);
        datos.agregarActividad(tmpActividad);
    }
    //Listar Actividad
    public ArrayList<Actividad> listarActividades() {return datos.listarActividades();}
    //Registrar reto
    public void registrarReto(String nombre, String codigo, String descripcion, byte imagen,int cantKilo, String medalla){
        if(buscarReto(codigo) == null){
            Reto tmpReto = new Reto(nombre,codigo,descripcion,imagen,cantKilo,medalla);
            datos.agregarReto(tmpReto);
        }
    }
    //Listar Reto
    public ArrayList<Reto> listarRetos() {return datos.listarRetos();}
    //Buscar Reto
    public Reto buscarReto(String codigo){
        Reto tmpUsuario = null;
        ArrayList<Reto> tmpRetos = listarRetos();
        for(Reto r: tmpRetos){
            if (r.getCodigo().equalsIgnoreCase(codigo)) {
                return r;
            }
        }
        return tmpUsuario;
    }
    //Registar Hito
    public void registrarHito(String codigo,String nombre, int kilometro, String imagen, String descripcion) {
        Reto tmpReto = buscarReto(codigo);
        Hito tmpHito = new Hito(nombre,kilometro,imagen,descripcion);
        tmpReto.agregarHito(tmpHito);
    }

    public void registrarUsuarioBD(String nombre, String apellidos, String id, String username, String clave,int tipoPersistencia) throws SQLException, ClassNotFoundException {
        Usuario tmpUsuario = new Usuario(nombre,apellidos,id,username,clave,null);
        if(tipoPersistencia==2){
            dao.registrarUsuario(tmpUsuario);
        }
    }
    public ArrayList<Usuario> listarClienteDB(int tipoPersistencia){
        ArrayList<Usuario> usuarios = new ArrayList<>();
        if(tipoPersistencia==2){

        }
        return usuarios;
    }*/

