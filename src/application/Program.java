package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ArvoreBinaria;
import entities.Ordenacao;


public class Program{

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int[] vetornumero = new int[5];
		int[] vetorauxiliar = new int[5];
		Scanner sc = new Scanner(System.in);
		Ordenacao ordenacao = new Ordenacao();
		ArvoreBinaria binaria = new ArvoreBinaria();
		
		
		

		int escolhe = 0;
		do {

			System.out.println("<-------------------------------------->");
			System.out.println("<[1]Cria lista------------------------->");
			System.out.println("<[2]ordenar Quick Short---------------->");
			System.out.println("<[3]ordenar Merge Sort----------------->");
			System.out.println("<[4]ordenar Heap Sort------------------>");
			System.out.println("<[5]ordenar Shell Sort----------------->");
			System.out.println("<[6]ordenar Selection Sort------------->");
			System.out.println("<[7]ordenar InsertSort----------------->");
			System.out.println("<[8]Mostrar lista original------------->");
			System.out.println("<[9]Buscando Sequencial---------------->");
			System.out.println("<[10]Buscando NãoSequencial------------>");
			System.out.println("<[11]Buscando Binária------------------>");
			System.out.println("<[12]Criar a arvore binaria------------>");
			System.out.println("<[13]Busca Arvore---------------------->");
			System.out.println("<[0]Sair------------------------------->");
			System.out.println("<-------------------------------------->");
			escolhe = sc.nextInt();

			switch (escolhe) {

			case 1:
				System.out.println("Digite a quantidade de massa de dados \n para gerar vetor : ");
				int quantidade = sc.nextInt();
				vetornumero = ordenacao.vetor(quantidade);
				System.out.println("Foi Gerado a lista !!");
				// ordenacao.listaordenada(vetornumero);
				break;
			case 2:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initQuickSort = System.currentTimeMillis();
				ordenacao.metodoquicksort(vetorauxiliar, 0,
						vetorauxiliar.length - 1);
				long endQuickSort = System.currentTimeMillis();
				System.out
						.println("<------------Metodo QuickSort-------------->");
				System.out.println("<-Demorou : "
						+ (endQuickSort - initQuickSort) + " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("<-Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;

				// ordenacao.listaordenada(vetorauxiliar);
				break;
			case 3:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initMergeSort = System.currentTimeMillis();
				ordenacao.metodomergeSort(vetorauxiliar, vetorauxiliar.length);
				long endMergeSort = System.currentTimeMillis();
				System.out
						.println("<------------Metodo MargeSort----------------->");
				System.out.println("<-Demorou :"
						+ (endMergeSort - initMergeSort) + " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("<-Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<--------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;
				// ordenacao.listaordenada(vetorauxiliar);
				break;

			case 4:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initHeadSort = System.currentTimeMillis();
				ordenacao.metodoheapsort(vetorauxiliar, vetorauxiliar.length);
				long endHeadSort = System.currentTimeMillis();
				System.out
						.println("<------------Metodo HeapSort------------------->");
				System.out.println("<-Demorou :" + (endHeadSort - initHeadSort)
						+ " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("<-Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<----------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;
				// ordenacao.listaordenada(vetorauxiliar);
				break;
			case 5:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initShellSort = System.currentTimeMillis();
				ordenacao.metodoshellsort(vetorauxiliar);
				long endShellSort = System.currentTimeMillis();
				System.out
						.println("<------------Metodo Shellsort------------------>");
				System.out.println("<-Demorou :"
						+ (endShellSort - initShellSort) + " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<----------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;
				// ordenacao.listaordenada(vetorauxiliar);
				break;
			case 6:

				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initSelectioSort = System.currentTimeMillis();
				ordenacao.metodoselectionSort(vetorauxiliar);
				long endSelectionShort = System.currentTimeMillis();
				System.out
						.println("<------------Metodo SelectionSort--------------->");
				System.out.println("<-Demorou :"
						+ (endSelectionShort - initSelectioSort)
						+ " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("<-Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<-------------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;
				// ordenacao.listaordenada(vetorauxiliar);
				break;
			case 7:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				long initSelectioSort1 = System.currentTimeMillis();
				ordenacao.mentodoInsertionSort(vetorauxiliar);
				long endSelectionShort1 = System.currentTimeMillis();
				System.out
						.println("<--------------Metodo InsertionSort--------------->");
				System.out.println("<-Demorou :"
						+ (endSelectionShort1 - initSelectioSort1)
						+ " milesegundos");
				System.out.println("<-Comparações Realizadas :"
						+ ordenacao.compara);
				System.out.println("<-Trocas Realizada :" + ordenacao.troca);
				System.out
						.println("<-------------------------------------------------->");
				ordenacao.troca = 0;
				ordenacao.compara = 0;
				// ordenacao.listaordenada(vetorauxiliar);
				break;
			case 8:
				System.out
						.println("<----Mostrando a lista de numeros criada original---->");
				ordenacao.listaordenada(vetornumero);
				break;
			case 9:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				ordenacao.metodoshellsort(vetorauxiliar);
				ordenacao.listaordenada(vetorauxiliar);
				System.out.println("Digite o numero que quer buscar :");
				int numeroBusca = sc.nextInt();
				long iniBuscaSeq = System.currentTimeMillis();
				System.out
						.println("<--------------MetodoBuscaSequencial--------------->");
				ordenacao.metodoBuscaSequencial(numeroBusca, vetornumero);
				long finalBuscaSeq = System.currentTimeMillis();
				System.out.println("Demorou :" + (finalBuscaSeq - iniBuscaSeq)
						+ " milesegundos");
				System.out.println("Comparações :" + ordenacao.compara);
				ordenacao.compara = 0;

				break;

			case 10:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				System.out.println("Digite o numero que quer buscar :");
				int numeroBuscaNaoOrd = sc.nextInt();
				long iniBuscaNaoSeq = System.currentTimeMillis();
				System.out
						.println("<--------------MetodoBuscaSequencial--------------->");
				ordenacao.metodoBuscaSequencial(numeroBuscaNaoOrd,
						vetorauxiliar);
				long finalBuscaNaoSeq = System.currentTimeMillis();
				System.out
						.println("Demorou :"
								+ (finalBuscaNaoSeq - iniBuscaNaoSeq)
								+ " milesegundos");
				System.out.println("Comparações :" + ordenacao.compara);
				ordenacao.compara = 0;

				break;
			case 11:
				vetorauxiliar = ordenacao.copiaVetor(vetornumero);
				ordenacao.metodoshellsort(vetorauxiliar);
				System.out.println("Digite o numero que quer buscar :");
				int numeroBuscaBinaria = sc.nextInt();
				long iniBuscaBin = System.currentTimeMillis();
				String resultado = ordenacao.metodoBuscaBinaria(
						numeroBuscaBinaria, vetorauxiliar);
				long finalBuscaBin = System.currentTimeMillis();
				System.out
						.println("<--------------MetodoBuscaSequencial--------------->");
				System.out.println("Demorou :" + (finalBuscaBin - iniBuscaBin)
						+ " milesegundos");
				System.out.println("Comparações :" + ordenacao.compara);
				System.out.println(resultado);
				ordenacao.compara = 0;

				break;

			case 12:
				System.out.println("Digite a quantidade de massa de dados \n para gerar vetor : ");
				int quantidade2 = sc.nextInt();
				binaria.gerarArvoreBinaria(quantidade2);
				System.out.println("Foi Gerado a ARVORE BINARIA !!");
				

				break;
			case 13:
				System.out.println("Digite a numero que vc queira buscar na arvore binária ");
				int busca = sc.nextInt();
				binaria.buscaBinaria(busca);
				

				break;

			case 0:
				System.out.println("Você saiu do Sistema!");
				break;

			default:
				System.out.println("Opção errada , escolha outra opção!");
				break;
			}
		} while (escolhe != 0);

	}

}
