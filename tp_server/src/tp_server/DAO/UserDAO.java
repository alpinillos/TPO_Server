package tp_server.DAO;

import org.hibernate.*;

import tp_server.hbt.HibernateConfig;
import tp_server.entities.Usuario;
import tp_server.entities.Jugador;

public class UserDAO {
	private static UserDAO instance = null;
	private static SessionFactory sf = null;
	public static UserDAO getInstance(){
		if (instance == null){
			sf = HibernateConfig.getSessionFactory();
			instance = new UserDAO();
		}
		return instance;
	}
	
	public Usuario buscarPorEmail(String email){
		try {
			Session session = sf.openSession();
			Usuario usuario = (Usuario)session.get(Usuario.class,email);
			session.close();
			return usuario;
		}
		catch (Exception e){
			System.out.println(e.getMessage() + "--" + e.getStackTrace());
			return null;
		}
	}
	public Usuario buscarPorApodo(String apodo){
		try {
			Session session = sf.openSession();
			Query q = session.createQuery("from Usuario usu where usu.apodo = ?").setString(0,apodo);
			Usuario usuario = (Usuario) q.uniqueResult();
			session.close();
			return usuario;
		}
		catch (Exception e){
			System.out.println(e.getMessage() + "--" + e.getStackTrace());
			return null;
		}
	}
	public void grabarJugador(Jugador jugador){
		try {
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(jugador);
			tr.commit();
			session.close();
		}
		catch (Exception e){
			System.out.println(e.getMessage() + "--" + e.getStackTrace());
		}
	}
	
}
