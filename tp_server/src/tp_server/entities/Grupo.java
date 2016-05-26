package tp_server.entities;

import java.util.ArrayList;

public class Grupo {
	private String nombre;
	private int idgrupo;
	private Administrador admin;
	private ArrayList<Jugador> jugadores; 
	public Grupo(String nombre,Jugador jugador) {
		this.nombre = nombre;
		//this.idgrupo = id;
		this.admin = new Administrador();
		admin.setUsuario(jugador.getUsuario());
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdgrupo() {
		return idgrupo;
	}
	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}
	public Administrador getAdmin() {
		return admin;
	}
	public void setAdmin(Administrador admin) {
		this.admin = admin;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

}
