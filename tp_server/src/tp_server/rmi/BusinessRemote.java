package tp_server.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


import java.util.Collections;
import java.util.List;

import dao.*;
import dto.*;
import entities.*;
public class BusinessRemote extends UnicastRemoteObject implements interfaces.InterfaceRemota{

	List<JugadorDTO> jugadores = new ArrayList<JugadorDTO>();	
	private static ArrayList<CartaDTO> cartas;
	
	public BusinessRemote() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = -7128439725795095116L;

	//--------JUGADOR------------//
	public void AltaJugador(JugadorDTO jugador) throws RemoteException {
		
		JugadorDAO.getInstancia().AltaJugador(new JugadorEntity(jugador.getMail(),jugador.getApodo(),jugador.getPassword()));	
				
		this.jugadores.add(jugador);
		
	} 
	
	public boolean Login(String mail, String password) throws RemoteException 
	{
		boolean isAuthenticated = false;
		JugadorDTO j = GetJugadorByMail(mail);
		
		if(j != null)
		{
			isAuthenticated = j.getPassword().equals(password);
			if(isAuthenticated)
				return true;
		}
		
		return JugadorDAO.getInstancia().Login(mail, password);	
	}
	
	private JugadorDTO GetJugadorByMail(String mail)
	{
		for(JugadorDTO jugador : this.jugadores)
		{
			if (jugador.getMail().equals(mail))
				return jugador;			
		}
		
		return null;
	}
	//-------END JUGADOR-------//
	
	public ArrayList<CartaDTO> GetMazo()
	{
		try {
			return GetCartas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	private static ArrayList<CartaDTO> GetCartas() throws Exception
	{
		if(cartas == null)
			cartas = CartaDAO.getInstancia().GetCartas();
		
		return cartas;
	}
	
	public ArrayList<JugadorDTO> GetRanking()
	{
		try {
			ArrayList<JugadorEntity> listaJugadores = JugadorDAO.getInstancia().buscarTodosRanking();
			ArrayList<JugadorDTO> listaDTO = new ArrayList<JugadorDTO>();
			for (JugadorEntity ju : listaJugadores){
				listaDTO.add(ju.toDTO());
			}
			return listaDTO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<JugadorDTO> GetRankingGrupo(int idGrupo)
	{
		try {
			GrupoEntity grupo = (GrupoEntity)GrupoDAO.getInstancia().buscar(GrupoEntity.class.getName(), "id", idGrupo);
			List<ParejaEntity> parejas = grupo.getParejas();
			List<JugadorEntity> jugadores = new ArrayList<JugadorEntity>();
			for(ParejaEntity pareja : parejas){
				for(JugadorEntity jugador : pareja.getJugadores()){
					jugadores.add(jugador);
				}
			}
			Collections.sort(jugadores);
			
			ArrayList<JugadorDTO> listaDTO = new ArrayList<JugadorDTO>();
			for (JugadorEntity ju : jugadores){
				listaDTO.add(ju.toDTO());
			}
			return listaDTO;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public void CrearJugada(JugadaDTO jugada)
	{
		JugadorEntity jugador = (JugadorEntity)JugadorDAO.getInstancia().buscar(JugadorEntity.class.getName(),"id",jugada.jugador.getId());
		CartaEntity carta = (CartaEntity)CartaDAO.getInstancia().buscar(CartaEntity.class.getName() ,new IdCartaEntity(jugada.carta.getNumero(),jugada.carta.getPalo()));
		JugadaDAO.getInstancia().AltaJugada(new JugadaEntity(jugador,carta));	
	}
	
}
