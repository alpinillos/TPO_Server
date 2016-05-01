package tp_server.entities;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private int idgrupo;
	private Administrador admin;
	private ArrayList<Jugador> jugadores; 
	public Grupo(String nombre,int id,Administrador admin) {
		this.nombre = nombre;
		this.idgrupo = id;
		this.admin = admin;
	}

}
