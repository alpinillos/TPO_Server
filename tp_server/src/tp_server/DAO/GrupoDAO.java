package tp_server.DAO;

import org.hibernate.*;

import tp_server.hbt.HibernateConfig;
import tp_server.entities.Grupo;


public class GrupoDAO {
	private static GrupoDAO instance = null;
	private static SessionFactory sf = null;
	public static GrupoDAO getInstance(){
		if (instance == null){
			sf = HibernateConfig.getSessionFactory();
			instance = new GrupoDAO();
		}
		return instance;
	}
	
	public Grupo buscarGrupo(String nombre){
		try {
			Session session = sf.openSession();
			Grupo grupo = (Grupo)session.get(Grupo.class,nombre);
			session.close();
			return grupo;
		}
		catch (Exception e){
			System.out.println(e.getMessage() + "--" + e.getStackTrace());
			return null;
		}
	}
	
	public void grabarGrupo(Grupo grupo){
		try {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(grupo);
			tr.commit();
			session.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage() + "--" + e.getStackTrace());
		}
	}
	
}
