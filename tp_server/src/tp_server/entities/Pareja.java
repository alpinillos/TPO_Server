package tp_server.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Pareja")
public class Pareja  {
	@Column(name = "IdPareja")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPareja;
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="IdPareja")
	private List<Jugador> jugadores;

	public int getIdPareja() {
		return idPareja;
	}

	public void setIdPareja(int idPareja) {
		this.idPareja = idPareja;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
}
