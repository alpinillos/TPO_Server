package tp_server.entities;

import javax.persistence.*;

import dto.CartaDTO;
@Entity
@Table(name="Carta")
public class Carta {
	
	@EmbeddedId
	private IdCarta idCarta;
	
	@Column(name = "Valor",nullable=false)
	private int valor;

	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Carta(IdCarta  idCarta, String palo)
	{
		this.idCarta = idCarta;
		this.valor = valor;
	}
	
	public CartaDTO GetDao()
	{
		return new CartaDTO( valor, idCarta.getPalo(), idCarta.getNumero());
	}

	public IdCarta getIdCarta() {
		return idCarta;
	}

	public void setIdCarta(IdCarta idCarta) {
		this.idCarta = idCarta;
	}

}
