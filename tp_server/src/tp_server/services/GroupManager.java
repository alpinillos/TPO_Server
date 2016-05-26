package tp_server.services;

import tp_server.DAO.GrupoDAO;
import tp_server.entities.Grupo;
import tp_server.entities.Jugador;

public class GroupManager {
	private static GroupManager instance = null;

	public static GroupManager getManager(){
		if (instance == null) {
			instance = new GroupManager();
		}
		return instance;
	}
	
	public Grupo crearGrupo(String nombre, Jugador jugador){
		Grupo grupo = new Grupo(nombre,jugador);
		GrupoDAO.getInstance().grabarGrupo(grupo);
		return grupo;
	}
	
	public void agregarJugador(Grupo grupo, Jugador jugador){
		grupo.agregarJugador(jugador);
		GrupoDAO.getInstance().grabarGrupo(grupo);
	}
	
}
