package libby.stuart.bl.entities.reto;

import libby.stuart.bl.entities.hito.Hito;

import java.util.ArrayList;

public class Reto {
    private String nombre;
    private String codigo;
    private String descripcion;
    private String imagen;
    private int cantKilo;
    private String medalla;
    private ArrayList<Hito> hitosReto;

    public Reto() {
    }

    public Reto(String nombre, String codigo, String descripcion, String imagen, int cantKilo, String medalla) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.cantKilo = cantKilo;
        this.medalla = medalla;
        this.hitosReto = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getCantKilo() {
        return cantKilo;
    }

    public void setCantKilo(int cantKilo) {
        this.cantKilo = cantKilo;
    }

    public String getMedalla() {
        return medalla;
    }

    public void setMedalla(String medalla) {
        this.medalla = medalla;
    }

    public ArrayList<Hito> getHitoReto() {
        return hitosReto;
    }

    public void setHitoReto(ArrayList<Hito> hitoReto) {
        this.hitosReto = hitoReto;
    }

    public void agregarHito(Hito pHito){
        this.hitosReto.add(pHito);
    }

    @Override
    public String toString() {
        return "Reto{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagen=" + imagen +
                ", cantKilo=" + cantKilo +
                ", medalla='" + medalla + '\'' +
                ", hitoReto=" + hitosReto +
                '}';
    }
}
