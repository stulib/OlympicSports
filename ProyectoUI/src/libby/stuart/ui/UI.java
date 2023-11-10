package libby.stuart.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class UI {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private PrintStream out = System.out;

    public int leerOpcion() throws IOException {
        return Integer.parseInt(in.readLine());
    }
    public void imprimirMensaje(String mensaje) {
        out.println(mensaje);
    }

    public String leerTexto() throws IOException{
        return in.readLine();
    }
    public void mostrarMenu() {
        System.out.println("Bievenido: escoja una opcion:");
        System.out.println("1. Registrar Usuario ");
        System.out.println("2. Registrar Pais ");
        System.out.println("3. Registrar Actividad");
        System.out.println("4. Registrar Reto");
        System.out.println("5. Registrar Hito");
        System.out.println("6. Listar Paises");
        System.out.println("7. Listar Usuarios");
        System.out.println("8. Listar Actividades");
        System.out.println("9. Listar Retos");
        System.out.println("0. Salir");
        imprimirMensaje("Digite la opción que desea");
    }
}
