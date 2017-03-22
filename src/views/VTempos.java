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
		
	}

	private void listar_tempos() {
		
	}
	
	private void procurar_tempo() {
		
	}
}
