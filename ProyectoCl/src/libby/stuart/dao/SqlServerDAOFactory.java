package libby.stuart.dao;

import libby.stuart.bl.entities.actividad.IActividadDAO;
import libby.stuart.bl.entities.actividad.SQLActividadDAO;
import libby.stuart.bl.entities.canton.ICantonDAO;
import libby.stuart.bl.entities.distrito.IDistritoDAO;
import libby.stuart.bl.entities.hito.IHitoDAO;
import libby.stuart.bl.entities.hito.SQLHitoDAO;
import libby.stuart.bl.entities.pais.IPaisDAO;
import libby.stuart.bl.entities.pais.SQLPaisDAO;
import libby.stuart.bl.entities.provincia.IProvinciaDAO;
import libby.stuart.bl.entities.reto.IRetoDAO;
import libby.stuart.bl.entities.reto.SQLRetoDAO;
import libby.stuart.bl.entities.usuario.IUsuarioDAO;
import libby.stuart.bl.entities.usuario.SQLUsuarioDao;

public class SqlServerDAOFactory extends DAOFactory{


    @Override
    public IUsuarioDAO getUsuarioDAO() {
        return new SQLUsuarioDao();
    }

    @Override
    public IPaisDAO getPaisDAO() { return new SQLPaisDAO(); }


    public IRetoDAO getRetoDAO() {
        return new SQLRetoDAO();
    }

    @Override
    public IActividadDAO getActividadDAO() {
        return new SQLActividadDAO();
    }

    @Override
    public IHitoDAO getHitoDAO() { return new SQLHitoDAO(); }

    @Override
    public IProvinciaDAO getProvincaDAO() {
        return null;
    }

    @Override
    public ICantonDAO getCantonDAO() {
        return null;
    }

    @Override
    public IDistritoDAO geDItritoDAO() {
        return null;
    }
}
