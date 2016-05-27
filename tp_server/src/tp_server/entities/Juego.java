package tp_server.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Juego {

	public List<Partida > partidas;

	public List<Partida > getPartidas() {
		return partidas;
	}

	public void setPartidas(List<Partida > partidas) {
		this.partidas = partidas;
	}
	
}
