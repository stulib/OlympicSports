package libby.stuart.bl.entities.provincia;

import libby.stuart.bl.entities.canton.Canton;

import java.util.ArrayList;

public class Provincia {
    private String id;
    private String nombre;
    private ArrayList<Canton> cantones;
    private String codigoPais;

    public Provincia() {
    }

//    public Provincia(String id, String nombre, ArrayList<Canton> cantones) {
//        this.id = id;
//        this.nombre = nombre;
//        this.cantones = cantones;
//    }

    public Provincia(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Provincia(String id, String nombre, String codigoPais) {
        this.id = id;
        this.nombre = nombre;
        this.codigoPais = codigoPais;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(ArrayList<Canton> cantones) {
        this.cantones = cantones;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    @Override
    public String toString() {
        return "Provincia{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
