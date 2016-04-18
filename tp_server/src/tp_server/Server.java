
package tp_server;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;

import tp_repositorio.interfaces.InterfaceJugador;


public class Server {
    
	InterfaceJugador objetoRemoto;
	
	public static void main(String[] args)
	{
		new Server();
	}
	
	public Server() {
		iniciar();
	}
	
    public void iniciar() {
    	try {
    		LocateRegistry.createRegistry(1099);	
    		InterfaceJugador gestionJugadores = new InterfazRemotaImpl();
            Naming.rebind ("//localhost/GestionJugadores", gestionJugadores);
            System.out.println("Fijado en //localhost/GestionJugadores");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
