package libby.stuart.bl.entities.usuario;

import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class TextFileClienteDAO implements IUsuarioDAO{
    private static final String NOMBRE_ARCHIVO="Clientes.txt";
    public TextFileClienteDAO(){

    }
    public void registrarUsuario(Usuario u) throws IOException {
        FileWriter writer = new FileWriter(NOMBRE_ARCHIVO,true);
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write(u.toString());
        buffer.newLine();
        buffer.close();
    }
    public ArrayList<Usuario> listarUsuario() throws ClassNotFoundException, SQLException,IOException{
        ArrayList<Usuario> usuarios = new ArrayList<>();
        FileReader reader = new FileReader(NOMBRE_ARCHIVO);
        BufferedReader buffer = new BufferedReader(reader);
        String infoUsuario;
        while ((infoUsuario = buffer.readLine())!=null){
            String[] datos =infoUsuario.split(",");
            Usuario tmpUsuario = new Usuario(datos[0],datos[1],datos[2],datos[3],datos[4],null );
        }
        return usuarios;
    }
}
