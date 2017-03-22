package views;

import java.util.Scanner;

import controller.GerePacote;
import controller.GereParticipante;
import misc.MData;

public class Principal {
	
	GereParticipante gp = new GereParticipante();
	
	public Principal(){
		
		MData.fillData();
		
		boolean sair = true;
		int 	opc	 = 0;
		
		do{
			switch(opc){
				case 1: //Gerir Participantes
					GerirParticipantes();
					opc=0;
					break;
				case 2: //Gerir Tempos
					opc=0;
					break;
				case 3: //Gerir Reservas
					opc=0;
					break;
				case 4: //Obter Total de Receitas
					opc=0;
					break;
				case 5: //Terminar Programa
					sair=false;
					break;
				default:
					System.out.printf("\n\tBem vindo ao Kartei.te \n\n");
					System.out.printf("Menu:\n");
					System.out.printf("\t1 - Gerir Participantes\n");
					System.out.printf("\t2 - Gerir Tempos\n");
					System.out.printf("\t3 - Gerir Reservas\n");
					System.out.printf("\t4 - Obter total de Receitas\n");
					System.out.printf("\t5 - Terminar Programa\n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
		}while(sair);
		
		System.out.printf("\n\n\n\t Kartei.te terminado com Sucesso!");
	}
	
	public void GerirParticipantes(){
		boolean sair = true;
		int 	opc	 = 0;
		
		do{
			switch(opc){
				case 1: //Adicionar Participantes
					adicionar_participante();
					opc=0;
					break;
				case 2: //Listar Participantes
					listar_participante();
					opc=0;
					break;
				case 3: //Procurar Participante
					procurar_participante();
					opc=0;
					break;
				case 4: //Voltar atras
					sair=false;
					break;
				default:
					System.out.printf("\n\tGerir Participantes \n\n");
					System.out.printf("Menu:\n");
					System.out.printf("\t1 - Adicionar Participante\n");
					System.out.printf("\t2 - Listar Participantes\n");
					System.out.printf("\t3 - Procurar Participante\n");
					System.out.printf("\t4 - Voltar ao Menu anterior\n");
					System.out.printf("-> ");
					opc = new Scanner(System.in).nextInt();
			}
		}while(sair);
	}
	
	public void adicionar_participante(){

		/** Nome do Participante **/
		System.out.printf("\nNome do participante: ");
		String nome = new Scanner(System.in).nextLine();
		/** Numero do Kart **/
		System.out.printf("\nNumero do Kart: ");
		int nr_kart = new Scanner(System.in).nextInt();
		/** Array de Pacotes **/
		System.out.printf("\nEscolha um Pacote:");
		
		for (int i=0; i<MData.gp.arPacote.size(); i++){
			System.out.printf("\n\t %d - %s | %s€", i, MData.gp.arPacote.get(i).getTempo(), MData.gp.arPacote.get(i).getPreco());
		}
		System.out.printf("-> ");
		int pac = new Scanner(System.in).nextInt();
		
		gp.addParticipante(nome, nr_kart, pac);
	}
	
	public void listar_participante(){
		System.out.printf("\n%s", gp.showParticipante().getNome());
		System.out.printf("\n%s", gp.showParticipante().getNr_kart());
		System.out.printf("\n%s", gp.showParticipante().getTempo_kart());
		System.out.printf("\n%s", gp.showParticipante().getEscolha_pacote());
	}
	
	public void procurar_participante(){
		System.out.printf("Insira o ID para procura: ");
		int pr = new Scanner(System.in).nextInt();
		
		gp.searchParticipante(pr);
		System.out.printf("\n%s", gp.showParticipante().getNome());
		System.out.printf("\n%s", gp.showParticipante().getNr_kart());
		System.out.printf("\n%s", gp.showParticipante().getTempo_kart());
		System.out.printf("\n%s", gp.showParticipante().getEscolha_pacote());
	}
}
