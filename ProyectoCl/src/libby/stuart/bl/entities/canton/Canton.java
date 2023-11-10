package libby.stuart.bl.entities.canton;

import libby.stuart.bl.entities.distrito.Distrito;

import java.util.ArrayList;

public class Canton {
    private String id;
    private String nombre;
    private ArrayList<Distrito> distritos;
    private String codigoProv;

    public Canton() {
    }

    public Canton(String id, String nombre, String codigpProvincia) {
        this.id = id;
        this.nombre = nombre;
        this.codigoProv = codigpProvincia;
    }

    public Canton(String id, String nombre, ArrayList<Distrito> distritos) {
        this.id = id;
        this.nombre = nombre;
        this.distritos = distritos;
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

    public ArrayList<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(ArrayList<Distrito> distritos) {
        this.distritos = distritos;
    }

    public String getCodigoProv() {
        return codigoProv;
    }

    public void setCodigoProv(String codigoProv) {
        this.codigoProv = codigoProv;
    }

    @Override
    public String toString() {
        return "Canton{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", distritos=" + distritos +
                '}';
    }
}
