//package libby.stuart.tl;
//
//import libby.stuart.bl.entities.actividad.Actividad;
//import libby.stuart.bl.entities.pais.Pais;
//import libby.stuart.bl.entities.reto.Reto;
//import libby.stuart.bl.entities.usuario.Usuario;
//import libby.stuart.bl.logic.Gestor;
//import libby.stuart.ui.UI;
//
//import java.io.IOException;
//import java.util.ArrayList;
//
//public class Controller {
//    private UI interfaz = new UI();
//    private Gestor appGestor = new Gestor();
//    public void start() throws IOException {
//        int opcion = -1;
//        do{
//            interfaz.mostrarMenu();
//            opcion = interfaz.leerOpcion();
//            procesarOpcion(opcion);
//        }while(opcion!=0);
//    }
//
//    public void procesarOpcion(int opcion) throws IOException{
//        switch (opcion){
//            case 0:
//                interfaz.imprimirMensaje("Gracias por usar el programa");
//                break;
//            case 1:
//                registrarUsuario();
//                break;
//            case 2:
//                registrarPais();
//                break;
//            case 3:
//                registrarActividad();
//                break;
//            case 4:
//                registrarReto();
//                break;
//            case 5:
//                registrarHito();
//                break;
//            case 6:
//                listarUsuarios();
//                break;
//            case 7:
//                listarPaises();
//                break;
//            case 8:
//                listarActividades();
//                break;
//            case 9:
//                listarRetos();
//                break;
//
//            default:
//                interfaz.imprimirMensaje("Por favor ingrese una opción valida.");
//                break;
//
//        }
//    }
//    public void registrarUsuario() throws IOException{
//        String nombre;
//        String apellidos;
//        String id;
//        String username;
//        String clave;
//        interfaz.imprimirMensaje("Digite el nombre del usuario");
//        nombre = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite los apellidos del usuario");
//        apellidos = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite la identificación del usuario");
//        id = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite el nombre de usuario (El nombre que veran los demas usuarios)");
//        username = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite una nueva contraseña ");
//        clave = interfaz.leerTexto();
//        appGestor.registrarUsuario(nombre, apellidos, id, username, clave);
//    }
//
//    public void listarUsuarios(){
//        ArrayList<Usuario> lista = appGestor.listarUsuarios();
//        for (Usuario tmpUsuario : lista){
//            interfaz.imprimirMensaje(tmpUsuario.toString());
//        }
//    }
//
//    public void registrarPais()throws IOException{
//        String nombre;
//        interfaz.imprimirMensaje("Digite el nombre del pais");
//        nombre = interfaz.leerTexto();
//        appGestor.registrarPais(nombre);
//    }
//    public void listarPaises(){
//        ArrayList<Pais> lista = appGestor.listarPaises();
//        for (Pais tmpPais: lista){
//            interfaz.imprimirMensaje(tmpPais.toString());
//        }
//    }
//    public void registrarActividad()throws IOException{
//        String nombre;
//        byte icono;
//        interfaz.imprimirMensaje("Digite el nombre de la actividad");
//        nombre = interfaz.leerTexto();
//        icono = 120;
//        appGestor.registrarActividad(nombre,icono);
//    }
//    public void listarActividades(){
//        ArrayList<Actividad> lista = appGestor.listarActividades();
//        for(Actividad a: lista){
//            interfaz.imprimirMensaje(a.toString());
//        }
//    }
//    public void registrarReto()throws IOException{
//        String nombre;
//        String codigo;
//        String descripcion;
//        byte imagen;
//        int cantKilo;
//        String medalla;
//        interfaz.imprimirMensaje("Digite el nombre del reto");
//        nombre = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite el codigo del reto");
//        codigo = interfaz.leerTexto();
//        interfaz.imprimirMensaje("Digite la descripcion del reto");
//        descripcion = interfaz.leerTexto();
//        imagen = 120;
//        interfaz.imprimirMensaje("Digite la cantidad de Kilometros");
//        cantKilo = Integer.parseInt(interfaz.leerTexto());
//        interfaz.imprimirMensaje("Digite el tipo de medalla obtenido");
//        medalla = interfaz.leerTexto();
//        appGestor.registrarReto(nombre,codigo,descripcion,imagen,cantKilo,medalla);
//    }
//    public void listarRetos(){
//        ArrayList<Reto> lista = appGestor.listarRetos();
//        for(Reto r: lista){
//            interfaz.imprimirMensaje(r.toString());
//        }
//    }
//    public void registrarHito() throws IOException {
//        String codigo;
//        String nombre;
//        int kilometro;
//        String imagen;
//        String descripcion;
//        listarRetos();
//        interfaz.imprimirMensaje("Ingrese el codigo del Reto al que desee agregarle un hito");
//        codigo = interfaz.leerTexto();
//        if(appGestor.buscarReto(codigo) != null){
//            interfaz.imprimirMensaje("Digite el nombre del hito");
//            nombre = interfaz.leerTexto();
//            interfaz.imprimirMensaje("Digite el Kilometro en que se encuentra el hito");
//            kilometro = Integer.parseInt(interfaz.leerTexto());
//            interfaz.imprimirMensaje("Digite el url de la imagen que representa el hito");
//            imagen = interfaz.leerTexto();
//            interfaz.imprimirMensaje("Digite la descripcion del hito");
//            descripcion = interfaz.leerTexto();
//            appGestor.registrarHito(codigo,nombre,kilometro,imagen,descripcion);
//        }else{
//            interfaz.imprimirMensaje("El codigo ingresado no coincide con ningun reto, vuelva a intentarlo");
//            registrarHito();
//        }
//    }
//
//}
