package tp_server.services;

import tp_server.DAO.UserDAO;
import tp_server.entities.Jugador;

public class UserManager {
	private UserManager instance = null;
	
	public UserManager getInstance() {
		if (instance == null) {
			instance = new UserManager();
		}
		return instance;
	}
	public void altaJugador(String email,String apodo){
		if (UserDAO.getInstance().buscarPorApodo(apodo) == null || UserDAO.getInstance().buscarPorEmail(email)== null) {
			Jugador jugador = new Jugador(apodo,email);
			
		}
	}
	
	
}
