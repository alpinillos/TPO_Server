package tp_server.services;

import tp_server.DAO.UserDAO;
import tp_server.entities.Jugador;
import tp_server.entities.Usuario;

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
			UserDAO.getInstance().grabarJugador(jugador);
		}
	}
	
	public boolean login(String email,String password){
		Usuario user = UserDAO.getInstance().buscarPorEmail(email);
		if (user.getPassword().equals(password)) {
			return true;
		}
		return false;
	}
	
}
