package controller;

import java.util.ArrayList;

import model.Pacote;

public class GerePacote {
	public ArrayList<Pacote> arPacote;
	
	public GerePacote(){
		this.arPacote = new ArrayList<Pacote>();
	}
	
	public void addPacote(Pacote p){
		
		int novoID = arPacote.size();
		p.setId(novoID);
		arPacote.add(p);
	}
	
	public Pacote showPacote(){
		for (Pacote p : arPacote){
			return p;
		}
		
		return null;
	}
}
