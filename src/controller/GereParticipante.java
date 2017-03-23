package controller;

import java.util.ArrayList;

import model.Participante;

public class GereParticipante {
	ArrayList<Participante> arParticipante;
	
	public GereParticipante(){
		this.arParticipante = new ArrayList<Participante>();
	}
	
	public void addParticipante(String nome, int nr_kart, int escolha_pacote){
		Participante p = new Participante(nome, nr_kart, escolha_pacote);
		
		int novoID = arParticipante.size();
		p.setId(novoID);
		
		arParticipante.add(p);
	}
	
	public Participante showParticipante(){
		
		for (Participante p : arParticipante){
			return p;
		}
		
		return null;
	}
	
	public Participante searchParticipante(int id){
		
		for (Participante p : arParticipante){
			if(p.getId() == id){
				return p;
			}else{
				return null;
			}
		}
		
		return null;
	}
	
	public void addTempo(int nr_kart, String tmp){
		for(Participante p : arParticipante){
			if (p.getNr_kart() == nr_kart){
				p.setTempo_kart(tmp);
				arParticipante.get(p.getId()).setTempo_kart(tmp);
			}else{
				System.out.printf("Nao existe correspondencia");
			}
		}
		
	}
}
