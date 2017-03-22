package views;

import java.util.Scanner;

import controller.GerePacote;
import controller.GereParticipante;
import misc.MData;

public class Principal {
	
	VParticipante vpac;
	
	public Principal(){
		
		MData.fillData();
		
		boolean sair = true;
		int 	opc	 = 0;
		
		do{
			switch(opc){
				case 1: //Gerir Participantes
					vpac.GerirParticipantes();
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
}
