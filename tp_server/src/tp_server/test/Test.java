package tp_server.test;

import java.util.ArrayList;

import rmi.BusinessRemote;
import dao.CartaDAO;
import dao.JugadorDAO;
import dto.CartaDTO;
import dto.JugadorDTO;
import entities.CartaEntity;
import entities.JugadorEntity;
import entities.MazoEntity;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JugadorEntity jugador = new JugadorEntity("prueba@gmail.com", "primerapodo", "123456");		
		//JugadorDAO.getInstancia().AltaJugador(jugador);
		
		/*
		MazoEntity m = new MazoEntity();
		CartaEntity c = new CartaEntity();
		c.idCarta.numero=1;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=2;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=3;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=4;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=5;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=6;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=7;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=8;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=9;
		m.cartas.add(c);
		c = new CartaEntity();
		c.idCarta.numero=10;
		m.cartas.add(c);
		m.Mezclar();
		*/
		
		JugadorDAO.getInstancia().buscarTodos(JugadorEntity.class.getName());
		try {
			ArrayList<CartaDTO> cartas = CartaDAO.getInstancia().GetCartas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
