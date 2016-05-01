package tp_server.entities;

public class Carta {
	
	private int numero;
	private String palo;
	private int pesoTruco;
	
	public Carta(int numero, String palo, int pesoTruco) {
		super();
		this.numero = numero;
		this.palo = palo;
		this.pesoTruco = pesoTruco;
	}

	public int getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}

	public int getPesoTruco() {
		return pesoTruco;
	}

}
