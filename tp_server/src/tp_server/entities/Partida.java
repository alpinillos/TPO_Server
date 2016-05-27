package tp_server.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Partida")
public class Partida  {

	@Column(name = "IdPartida")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPartida;
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="IdPartida")
	private List<Mano > manos;
	
	public Partida ()
	{
		manos = new ArrayList<Mano >();
	}

	public int getIdPartida() {
		return idPartida;
	}

	public void setIdPartida(int idPartida) {
		this.idPartida = idPartida;
	}

	public List<Mano> getManos() {
		return manos;
	}

	public void setManos(List<Mano> manos) {
		this.manos = manos;
	}
}
