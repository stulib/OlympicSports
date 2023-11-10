package libby.stuart.dl;
import libby.stuart.bl.entities.actividad.Actividad;
import libby.stuart.bl.entities.pais.Pais;
import libby.stuart.bl.entities.reto.Reto;
import libby.stuart.bl.entities.usuario.Usuario;

import java.util.ArrayList;

public class Data {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Pais> paises;
    private ArrayList<Actividad> actividades;
    private ArrayList<Reto> retos;
    public Data(){
        usuarios = new ArrayList<>();
        paises = new ArrayList<>();
        actividades = new ArrayList<>();
        retos = new ArrayList<>();
    }
    //Agregar y listar usuarios
    public void agregarUsuario(Usuario tmpUsuario){
        usuarios.add(tmpUsuario);
    }
    public ArrayList<Usuario> listarUsuarios() {
        return (ArrayList<Usuario>) usuarios.clone();
    }

    //Agregar y listar paises
    public void agregarPais(Pais tmpPais){
        paises.add(tmpPais);
    }
    public ArrayList<Pais> listarPaises() {
        return (ArrayList<Pais>) paises.clone();
    }

    //Agregar y listar actividades
    public void agregarActividad(Actividad tmpActividad) {actividades.add(tmpActividad);}
    public ArrayList<Actividad> listarActividades() {return (ArrayList<Actividad>) actividades.clone();}

    //Agregar y listar retos
    public void agregarReto(Reto tmpReto){retos.add(tmpReto);}
    public ArrayList<Reto> listarRetos() {return (ArrayList<Reto>) retos.clone();}

    //Agregar Hitos
}
