package libby.stuart.bl;

import libby.stuart.bl.entities.usuario.Usuario;
import libby.stuart.bl.logic.GestorUsuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException {
        GestorUsuario gu = new GestorUsuario();

        gu.registrarUsuario("Prueba2", "Prueba2","Prueba 2",
                "Prueba2", "Prueba2");
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = gu.listarUsuarios();
        for(Usuario u: usuarios){
            System.out.println(u.toString());
        }
    }
}
