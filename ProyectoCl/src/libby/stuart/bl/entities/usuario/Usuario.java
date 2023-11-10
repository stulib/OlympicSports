package libby.stuart.bl.entities.usuario;

import libby.stuart.bl.entities.pais.Pais;

public class Usuario {
    private String nombre;
    private String apellidos;
    private String id;
    private String username;
    private String clave;
    private Pais pais;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String id, String username, String clave, Pais pais) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.username = username;
        this.clave = clave;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", clave='" + clave + '\'' +
                ", pais=" + pais +
                '}';
    }
}
