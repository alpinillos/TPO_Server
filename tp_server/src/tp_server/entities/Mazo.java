package tp_server.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Mazo  {
	
	private List<Carta> cartas;
	
	public Mazo()
	{
		cartas = new ArrayList<Carta>();
	}
	
	public void Mezclar()
	{
		int n = this.cartas.size();
	    Random random = new Random();
	    random.nextInt();
	    for (int i = 0; i < n; i++) {
	      int change = i + random.nextInt(n - i);
	      Carta cartaAux = this.cartas.get(i);
	      this.cartas.set(i, this.cartas.get(change));
	      this.cartas.set(change, cartaAux);
	    }
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
}
