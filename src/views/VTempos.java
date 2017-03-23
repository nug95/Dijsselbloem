package views;

import java.util.Scanner;

import controller.GereParticipante;

public class VTempos {
	
	GereParticipante gp = new GereParticipante();
	
	public VTempos(){}

	public void GerirTempos(){
		boolean sair = true;
		int 	opc	 = 0;
		
		do{
			switch(opc){
				case 1: //Adicionar Tempo
					adicionar_tempo();
					opc=0;
					break;
				case 2: //Listar Tempos
					listar_tempos();
					opc=0;
					break;
				case 3: //Procurar Tempo
					procurar_tempo();
					opc=0;
					break;
				case 4: //Voltar atras
					sair=false;
					break;
				default:
					System.out.printf("\n\tGerir Tempos \n\n");
					System.out.printf("Menu:\n");
					System.out.printf("\t1 - Adicionar Tempo\n");
					System.out.printf("\t2 - Listar Tempos\n");
					System.out.printf("\t3 - Procurar Tempo\n");
					System.out.printf("\t4 - Voltar ao Menu anterior\n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
		}while(sair);
	}

	private void adicionar_tempo() {
		
		System.out.printf("Qual é o numero do kart que quer adicionar o tempo?");
		int nr_kart = new Scanner(System.in).nextInt();
		
		System.out.printf("Qual é o tempo? [00:00:00]\n");
		String tmp_kart = new Scanner(System.in).nextLine();
		
		gp.addTempo(nr_kart, tmp_kart);
	}

	public void listar_tempos() {
		try	{
			System.out.printf("\nNome do participante: %s", gp.showParticipante().getNome());
			System.out.printf("\nNumero do Kart: %s", gp.showParticipante().getNr_kart());
			System.out.printf("\nTempo do participante: %s", gp.showParticipante().getTempo_kart());
			System.out.printf("\nTipo de pacote: %s", gp.showParticipante().getEscolha_pacote());
			System.out.printf("\n");
		} catch(Exception e){
			System.out.printf("\nNao existem participantes!");
		}
	}
	
	private void procurar_tempo() {
		
	}
}
