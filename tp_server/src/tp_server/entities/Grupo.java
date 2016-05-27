package tp_server.entities;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Grupo")
public class Grupo {
	@Column(name = "IdGrupo")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idGrupo;
	
	@Column(name = "Nombre",nullable=false)
	private String nombre;
	
	@OneToMany (cascade=CascadeType.ALL)
	@JoinColumn(name="IdGrupo")
	private List<Pareja > parejas;
	
	@OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Jugador  administrador;
	
	public Grupo()
	{
		parejas = new ArrayList<Pareja >();
	}

	public int getIdGrupo() {
		return idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Pareja > getParejas() {
		return parejas;
	}

	public void setParejas(List<Pareja > parejas) {
		this.parejas = parejas;
	}

	public Jugador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Jugador  administrador) {
		this.administrador = administrador;
	}
}
