package tp_server.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Baza" )
public class Baza {
	@Column(name = "IdPBaza")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idBaza;
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="IdBaza")
	private List<ItemMano> jugadas;

	public int getIdBaza() {
		return idBaza;
	}

	public void setIdBaza(int idBaza) {
		this.idBaza = idBaza;
	}

	public List<ItemMano> getJugadas() {
		return jugadas;
	}

	public void setJugadas(List<ItemMano> jugadas) {
		this.jugadas = jugadas;
	}

}
