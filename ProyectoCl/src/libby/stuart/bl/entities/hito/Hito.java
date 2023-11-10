package libby.stuart.bl.entities.hito;

import libby.stuart.bl.entities.pais.Pais;

public class Hito {
    private String nombre;
    private int kilometro;
    private String imagen;
    private String descripcion;



    private String codigo;

    public Hito() {
    }

    public Hito(String nombre, int kilometro, String imagen, String descripcion, String codigo) {
        this.nombre = nombre;
        this.kilometro = kilometro;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKilometro() {
        return kilometro;
    }

    public void setKilometro(int kilometro) {
        this.kilometro = kilometro;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public String toString() {
        return "Hito{" +
                "nombre='" + nombre + '\'' +
                ", kilometro=" + kilometro +
                ", imagen=" + imagen +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
