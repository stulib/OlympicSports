package libby.stuart.dao;

import libby.stuart.bl.entities.actividad.IActividadDAO;
import libby.stuart.bl.entities.canton.ICantonDAO;
import libby.stuart.bl.entities.distrito.IDistritoDAO;
import libby.stuart.bl.entities.hito.IHitoDAO;
import libby.stuart.bl.entities.pais.IPaisDAO;
import libby.stuart.bl.entities.provincia.IProvinciaDAO;
import libby.stuart.bl.entities.reto.IRetoDAO;
import libby.stuart.bl.entities.usuario.IUsuarioDAO;

public class TextFileDAOFactory extends DAOFactory{
    @Override
    public IUsuarioDAO getUsuarioDAO() {
        return null;
    }

    @Override
    public IPaisDAO getPaisDAO() {
        return null;
    }

    @Override
    public IRetoDAO getRetoDAO() {
        return null;
    }

    @Override
    public IActividadDAO getActividadDAO() {
        return null;
    }

    @Override
    public IHitoDAO getHitoDAO() {
        return null;
    }

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
