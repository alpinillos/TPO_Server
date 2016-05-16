package tp_server.hbt;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import entities.CartaEntity;
import entities.JugadorEntity;

public class HibernateConfig {
	 private static final SessionFactory sessionFactory;
	    static
	    {
	        try
	        {
	        	 AnnotationConfiguration config = new AnnotationConfiguration();
	             config.addAnnotatedClass(JugadorEntity.class);	    
	             config.addAnnotatedClass(CartaEntity.class);	    
	             
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
