package tp_server.entities;

import javax.persistence.*;

@Entity
@Table(name="Jugada" )
public class ItemMano {
	@EmbeddedId
	private IdJugada idJugada;

	public ItemMano(Jugador jugador, Carta carta)
	{
		this.idJugada = new IdJugada(jugador,carta);
	}
	public IdJugada getIdJugada() {
		return idJugada;
	}

	public void setIdJugada(IdJugada idJugada) {
		this.idJugada = idJugada;
	}
}
