package libby.stuart.bl.logic;

import libby.stuart.bl.entities.usuario.IUsuarioDAO;
import libby.stuart.bl.entities.usuario.Usuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class GestorUsuario extends Gestor{
    private IUsuarioDAO dao;
    public GestorUsuario(){
        super();
        dao = factory.getUsuarioDAO();
    }
    public void registrarUsuario(String nombre,String apellidos, String id, String username, String clave) throws SQLException, IOException, ClassNotFoundException {
        Usuario tmpUsuario = new Usuario(nombre, apellidos, id,username,clave,null);
        dao.registrarUsuario(tmpUsuario);
    }

    public ArrayList<Usuario> listarUsuarios() throws SQLException, IOException, ClassNotFoundException {
        return dao.listarUsuario();
    }

    public int validarUsuario(String id, String username) throws SQLException, IOException, ClassNotFoundException {
        int error = 1;
        if(buscarUsuarioID(id) != null){
            error = 2;
        }
        if (buscarUsername(username) != null){
            error = 3;
        }
        return error;
    }
    public boolean validarLogin(String username, String clave) throws SQLException, IOException, ClassNotFoundException {
        boolean error = true;
        Usuario tmpUsuario;
        tmpUsuario = buscarUsername(username);
        if (tmpUsuario != null){
            if (clave.equalsIgnoreCase(tmpUsuario.getClave())){
                error = false;
            }
        }

        return error;
    }

    //Buscar Usuario
    public Usuario buscarUsuarioID(String id) throws SQLException, IOException, ClassNotFoundException {
        Usuario tmpUsuario = null;
        ArrayList<Usuario> tmpUsuarios = listarUsuarios();
        for(Usuario u: tmpUsuarios){
            if (u.getId().equalsIgnoreCase(id)) {
                return u;
            }
        }
        return tmpUsuario;
    }
    public Usuario buscarUsername(String username) throws SQLException, IOException, ClassNotFoundException {
        Usuario tmpUsuario = null;
        ArrayList<Usuario> tmpUsuarios = listarUsuarios();
        for(Usuario u: tmpUsuarios){
            if (u.getUsername().equalsIgnoreCase(username)) {
                return u;
            }
        }
        return tmpUsuario;
    }


}
