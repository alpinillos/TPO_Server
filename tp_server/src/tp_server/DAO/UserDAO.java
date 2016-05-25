package tp_server.DAO;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import tp_server.hbt.HibernateConfig;
import tp_server.entities.Usuario;

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
		Session session = sf.openSession();
		Usuario usuario = (Usuario)session.get(Usuario.class,email);
		session.close();
		return usuario;
	}
	public Usuario buscarPorApodo(String apodo){
		Session session = sf.openSession();
		Query q = session.createQuery("from Usuario usu where usu.apodo = ?").setString(0,apodo);
		Usuario usuario = (Usuario) q.uniqueResult();
		session.close();
		return usuario;
	}
	
}
