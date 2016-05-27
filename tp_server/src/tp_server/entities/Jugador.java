package tp_server.entities;

import javax.persistence.*;

import dto.JugadorDTO;

@Entity
@Table(name="Jugador")

public class Jugador implements Comparable<Jugador>{	
	
	@Column(name = "IdJugador")
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private int IdJugador;
	
	@Column(name = "Apodo")
	private String apodo;
	
	@Column(name = "Mail")
	private String mail;

	@Column(name = "Password")
	private String password;
	
	@Column(name = "Puntaje")
	private int puntaje;
	
	public Jugador(String apodo, String mail, String password, int puntaje)
	{
		this.apodo = apodo;
		this.mail = mail;
		this.password = password;
		this.puntaje = puntaje;
	}
	
	public int getId() {
		return IdJugador;
	}
	public void setId(int id) {
		this.IdJugador = id;
	}
	
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public Jugador(String apodo, String mail,
			String Password) {		
		this.apodo = apodo;
		this.mail = mail;
		this.password = Password;
		this.puntaje = puntaje;
	}	
	
	public void AgregarPuntos(int punto)
	{
		this.puntaje+=punto;
	}
	public int getIdJugador() {
		return IdJugador;
	}
	public void setIdJugador(int idJugador) {
		IdJugador = idJugador;
	}
	public int getPuntaje() {
		return puntaje;
	}
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public JugadorDTO toDTO(){
		return new JugadorDTO(this.mail,this.apodo,this.password);
	}
	
	public int compareTo(Jugador ju) {
		return Integer.compare(this.puntaje, ju.puntaje);
	}
}
