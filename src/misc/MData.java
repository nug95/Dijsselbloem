package misc;

import controller.GerePacote;
import model.Pacote;

public class MData {
	private static Pacote p = new Pacote("15", 12.00);
	private static Pacote p1 = new Pacote("20", 15.00);
	private static Pacote p2 = new Pacote("30", 18.00);
	private static Pacote p3 = new Pacote("60", 22.00);
	
	public static GerePacote gp = new GerePacote();
	
	public static void fillData(){
		gp.addPacote(p);
		gp.addPacote(p1);
		gp.addPacote(p2);
		gp.addPacote(p3);
	}
}
