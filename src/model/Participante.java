package model;

public class Participante {
	private int 	id;
	private String 	nome;
	private int 	nr_kart;
	private String	tempo_kart;
	private int 	escolha_pacote;

	public Participante(String nome, int nr_kart, int escolha_pacote) {
		super();
		this.nome = nome;
		this.nr_kart = nr_kart;
		this.escolha_pacote = escolha_pacote;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNr_kart() {
		return nr_kart;
	}

	public void setNr_kart(int nr_kart) {
		this.nr_kart = nr_kart;
	}

	public String getTempo_kart() {
		return tempo_kart;
	}

	public void setTempo_kart(String tempo_kart) {
		this.tempo_kart = tempo_kart;
	}

	public int getEscolha_pacote() {
		return escolha_pacote;
	}

	public void setEscolha_pacote(int escolha_pacote) {
		this.escolha_pacote = escolha_pacote;
	}
	
}
