package libby.stuart.bl.entities.distrito;

public class Distrito {
    private String id;
    private String nombre;
    private String codigoCant;

    public Distrito() {
    }

    public Distrito(String id, String nombre, String codigoCant) {
        this.id = id;
        this.nombre = nombre;
        this.codigoCant = codigoCant;
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

    public String getCodigoCant() {
        return codigoCant;
    }

    public void setCodigoCant(String codigoCant) {
        this.codigoCant = codigoCant;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
