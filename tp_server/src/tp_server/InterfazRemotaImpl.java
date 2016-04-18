package tp_server;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

import tp_repositorio.dtos.JugadorDTO;
import tp_repositorio.interfaces.InterfaceJugador;



public class InterfazRemotaImpl extends UnicastRemoteObject implements InterfaceJugador {

	private static final long serialVersionUID = 1L;
	private Set<JugadorDTO> jugadores;

	public InterfazRemotaImpl() throws RemoteException {
		super();	
		jugadores = new HashSet<JugadorDTO>();
		jugadores.add(new JugadorDTO(1,"Juan"));
		jugadores.add(new JugadorDTO(2,"Pedro"));
		jugadores.add(new JugadorDTO(3,"Maria2"));
		jugadores.add(new JugadorDTO(4,"Maria"));
		jugadores.add(new JugadorDTO(5,"Ramon"));
	}

	public void envioJugador(JugadorDTO alumno) throws RemoteException 
	{
		jugadores.add(alumno);
	}

	public JugadorDTO obtengoJugador(int nroJugador) throws RemoteException {
		JugadorDTO aux;
		for(Iterator<JugadorDTO> i=jugadores.iterator();i.hasNext();)
		{
			aux = i.next();
			if(aux.getNumeroJugador()==nroJugador)
				return aux;
		}
		throw new RemoteException("No encontre al Jugador");
	}

	public Set<JugadorDTO> obtengoJugador() throws RemoteException 
	{
		return jugadores;
	}

	public int cantidadJugaroes() throws RemoteException {
		
		return jugadores.size();
	}



	@Override
	public int cantidadJugador() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}
}

