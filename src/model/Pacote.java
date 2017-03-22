package model;

public class Pacote {
	private int 	id;
	private String	tempo;
	private double 	preco;
	
	public Pacote(String tempo, double preco) {
		super();
		this.tempo = tempo;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTempo() {
		return tempo;
	}
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
