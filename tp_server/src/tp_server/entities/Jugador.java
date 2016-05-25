package tp_server.entities;

import java.util.List;

public class Jugador {

private Usuario usuario;
private String categoria;
private List<Partida> partidasJugadas;
private List<Partida> partidasGanadas;
private int puntos;

public Jugador(String apodo,String email) {
	super();
	usuario = new Usuario();
	usuario.setApodo(apodo);
	usuario.setEmail(email);
	categoria = "ninguna";
	puntos = 0;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public List<Partida> getPartidasJugadas() {
	return partidasJugadas;
}

public void setPartidasJugadas(List<Partida> partidasJugadas) {
	this.partidasJugadas = partidasJugadas;
}

public List<Partida> getPartidasGanadas() {
	return partidasGanadas;
}

public void setPartidasGanadas(List<Partida> partidasGanadas) {
	this.partidasGanadas = partidasGanadas;
}

public int getPuntos() {
	return puntos;
}

public void setPuntos(int puntos) {
	this.puntos = puntos;
}

}

