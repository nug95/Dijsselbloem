package controller;

import java.util.ArrayList;

import model.Participante;
import model.Reserva;

public class GereReserva {
	ArrayList<Reserva> arReserva;
	
	public GereReserva(){
		this.arReserva = new ArrayList<Reserva>();
	}
	
	public void addReserva(int nr_pessoas, String hora_marcada, String nome, String contacto,
			ArrayList<Participante> arParticipante){
		Reserva r = new Reserva(nr_pessoas, hora_marcada, nome, contacto, arParticipante);
		
		int novoID = arReserva.size();
		r.setId(novoID);
		arReserva.add(r);
	}
}
