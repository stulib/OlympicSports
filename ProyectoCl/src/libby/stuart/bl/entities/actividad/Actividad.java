package libby.stuart.bl.entities.actividad;

public class Actividad {
    private String codigo;
    private String nombre;
    private String icono;

    public Actividad() {
    }

    public Actividad(String codigo, String nombre, String icono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.icono = icono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    @Override
    public String toString() {
        return "Actividad{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", icono=" + icono +
                '}';
    }
}
