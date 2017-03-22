package model;

import java.util.ArrayList;

public class Reserva {
	private int id;
	private int nr_pessoas;
	private String hora_marcada;
	private String nome, contacto;
	
	ArrayList<Participante> arParticipante;

	public Reserva(int nr_pessoas, String hora_marcada, String nome, String contacto,
			ArrayList<Participante> arParticipante) {
		super();
		this.nr_pessoas = nr_pessoas;
		this.hora_marcada = hora_marcada;
		this.nome = nome;
		this.contacto = contacto;
		this.arParticipante = arParticipante;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNr_pessoas() {
		return nr_pessoas;
	}

	public void setNr_pessoas(int nr_pessoas) {
		this.nr_pessoas = nr_pessoas;
	}

	public String getHora_marcada() {
		return hora_marcada;
	}

	public void setHora_marcada(String hora_marcada) {
		this.hora_marcada = hora_marcada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public ArrayList<Participante> getArParticipante() {
		return arParticipante;
	}

	public void setArParticipante(ArrayList<Participante> arParticipante) {
		this.arParticipante = arParticipante;
	}
	
}
