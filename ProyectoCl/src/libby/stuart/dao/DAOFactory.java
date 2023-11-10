package libby.stuart.dao;

import libby.stuart.bl.entities.actividad.IActividadDAO;
import libby.stuart.bl.entities.canton.ICantonDAO;
import libby.stuart.bl.entities.distrito.IDistritoDAO;
import libby.stuart.bl.entities.hito.IHitoDAO;
import libby.stuart.bl.entities.pais.IPaisDAO;
import libby.stuart.bl.entities.provincia.IProvinciaDAO;
import libby.stuart.bl.entities.reto.IRetoDAO;
import libby.stuart.bl.entities.usuario.IUsuarioDAO;

/*
* Fabrica de objetos de tipo fabrica de clases sql.
* @author Stuart
* @version 1.0
* */
public abstract class  DAOFactory {
    /*
    * Constante de tipo entero que identifica al motor de base de datos MYSQL
    * */
    public static final int MYSQL =1;
    /*
    * Constatnte de tipo entero que identifica al motor de base de datos SQLSERVER
    * */
    public static final int SQLSERVER = 2;
    /*
    * Constatnte de tipo entero que identifica el uso de persistencia basada en texto.
    * */
    public static final int TEXTFILE=3;

    /*
    * Fabrica los objetos de la base de datos segun el tipo de persistencia que se está usando
    * */
    public static DAOFactory getDaoFactory(int whichFactory){
        switch (whichFactory){
            case 1:
                return new MySqlDAOFactory();
            case 2:
                return new SqlServerDAOFactory();
            case 3:
                return new TextFileDAOFactory();
            default:
                return null;
        }
    }

    //Definicion de los objetos que tienen persistencia, es decir, a que objeto se les va a hacer persistencia.
    public abstract IUsuarioDAO getUsuarioDAO();
    public abstract IPaisDAO getPaisDAO();
    public abstract IRetoDAO getRetoDAO();
    public abstract IActividadDAO getActividadDAO();
    public abstract IHitoDAO getHitoDAO();
    public abstract IProvinciaDAO getProvincaDAO();
    public abstract ICantonDAO getCantonDAO();
    public abstract IDistritoDAO geDItritoDAO();



}
