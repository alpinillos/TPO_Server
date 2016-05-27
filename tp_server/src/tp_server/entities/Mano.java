package tp_server.entities;

import java.util.ArrayList;
import java.util.List;

public class Mano {

	private List<Baza> bazas;
	
	public Mano()
	{
		bazas = new ArrayList<Baza>();
	}

	public List<Baza> getBazas() {
		return bazas;
	}

	public void setBazas(List<Baza> bazas) {
		this.bazas = bazas;
	}
}
