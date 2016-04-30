package tp_server.entities;

public class Pareja {
	private int idpareja;
	private Jugador jugadoruno;
	private Jugador jugadordos;
	private Juego juego;
	public Pareja(int idpareja,Jugador jugadoruno,Jugador jugadordos,Juego juego) {
		this.idpareja=1; /* generar id */
		this.jugadoruno = jugadoruno;
		this.jugadordos = jugadordos;
		this.juego = juego;
	}
	public int getIdpareja() {
		return idpareja;
	}
	public void setIdpareja(int idpareja) {
		this.idpareja = idpareja;
	}
	public Jugador getJugadoruno() {
		return jugadoruno;
	}
	public void setJugadoruno(Jugador jugadoruno) {
		this.jugadoruno = jugadoruno;
	}
	public Jugador getJugadordos() {
		return jugadordos;
	}
	public void setJugadordos(Jugador jugadordos) {
		this.jugadordos = jugadordos;
	}
	public Juego getJuego() {
		return juego;
	}
	public void setJuego(Juego juego) {
		this.juego = juego;
	}

}

