package tp_server.hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import tp_server.entities.*;


public class HibernateConfig {
	 private static final SessionFactory sessionFactory;
	    static
	    {
	        try
	        {
	        	 AnnotationConfiguration config = new AnnotationConfiguration();
	             config.addAnnotatedClass(Administrador.class);	 
	             config.addAnnotatedClass(Baza.class);	 
	             config.addAnnotatedClass(Carta.class);	 
	             config.addAnnotatedClass(Cerrado.class);	
	             config.addAnnotatedClass(Grupo.class);	
	             config.addAnnotatedClass(ItemMano.class);	
	             config.addAnnotatedClass(Juego.class);	
	             config.addAnnotatedClass(Jugador.class);	
	             config.addAnnotatedClass(Libre.class);	
	             config.addAnnotatedClass(Mano.class);	
	             config.addAnnotatedClass(Pareja.class);	
	             config.addAnnotatedClass(Partida.class);	
	             config.addAnnotatedClass(Registro.class);
	             config.addAnnotatedClass(Usuario.class);             
	             sessionFactory = config.buildSessionFactory();
	        }
	        catch (Throwable ex)
	        {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory()
	    {
	        return sessionFactory;
	    }
}
