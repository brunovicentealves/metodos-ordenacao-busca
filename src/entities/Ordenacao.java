package entities;

import java.util.Random;

public class Ordenacao {
	// Estanciado o random
	Random gerador = new Random();
	public int troca = 0;
	public int compara = 0;

	// Metodo de ordenação selectionSort
	public void metodoselectionSort(int[] vetor) {
		for (int fixo = 0; fixo < vetor.length - 1; fixo++) {
			int menor = fixo;

			for (int i = menor + 1; i < vetor.length; i++) {

				if (vetor[i] < vetor[menor]) {
					compara++;
					menor = i;
				}
			}
			compara++;
			if (menor != fixo) {
				troca++;
				int t = vetor[fixo];
				vetor[fixo] = vetor[menor];
				vetor[menor] = t;
			}
		}
	}

	// metodo de ordenação shellsort
	public void metodoshellsort(int[] vetor) {
		int inner, outer;
		int temp;
		int h = 1;
		while (h <= vetor.length / 3) {
			h = h * 3 + 1;
			compara++;
		}
		while (h > 0) {
			for (outer = h; outer < vetor.length; outer++) {
				temp = vetor[outer];
				inner = outer;

				while (inner > h - 1 && vetor[inner - h] >= temp) {
					troca++;
					vetor[inner] = vetor[inner - h];
					inner -= h;
				}
				vetor[inner] = temp;

			}
			compara++;
			h = (h - 1) / 3;
		}

	}

	// Metodo mergesort
	public void metodomergeSort(int[] vetor, int fim) {
		if (fim < 2) {
			return;
		}
		int mid = fim / 2;
		int[] l = new int[mid];
		int[] r = new int[fim - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = vetor[i];
		}
		for (int i = mid; i < fim; i++) {
			r[i - mid] = vetor[i];
		}
		metodomergeSort(l, mid);
		metodomergeSort(r, fim - mid);

		merge(vetor, l, r, mid, fim - mid);

	}

	public void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				compara++;
				troca++;
				a[k++] = l[i++];
			} else {
				troca++;
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			troca++;
			a[k++] = l[i++];
		}
		while (j < right) {
			troca++;
			a[k++] = r[j++];
		}
	}

	// metodo heapsort
	public void metodoheapsort(int[] vetor, int fim) {
		int i = fim / 2, pai, filho, t;
		while (true) {
			if (i > 0) {
				i--;
				t = vetor[i];
			} else {
				fim--;
				if (fim == 0) {
					return;
				}
				t = vetor[fim];
				vetor[fim] = vetor[0];
			}
			pai = i;
			filho = i * 2 + 1;
			while (filho < fim) {
				compara++;
				if ((filho + 1 < fim) && (vetor[filho + 1] > vetor[filho])) {

					filho++;
				}
				if (vetor[filho] > t) {
					troca++;
					vetor[pai] = vetor[filho];
					pai = filho;
					filho = pai * 2 + 1;
				} else {
					break;
				}
			}
			vetor[pai] = t;
		}

	}

	// Metodo QuickSort
	public void metodoquicksort(int[] vetor, int inicio, int fim) {
		int i, j, meio, aux;

		i = inicio;
		j = fim;
		meio = vetor[(inicio + fim) / 2];

		do {
			while (vetor[i] < meio) {
				compara++;
				i++;
			}
			compara++;
			while (vetor[j] > meio) {
				compara++;
				j--;
			}
			compara++;
			if (i <= j) {
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
				i++;
				j--;
				troca++;
			}

		} while (i <= j);

		if (inicio < j) {
			metodoquicksort(vetor, inicio, j);
		}
		if (i < fim) {
			metodoquicksort(vetor, i, fim);
		}
	}

	// Metodo de ordenação InsertionSort
	public void mentodoInsertionSort(int[] v) {
		int x, j;

		for (int i = 1; i < v.length; i++) {
			x = v[i];

			j = i - 1;
			// empurra o elemento para direita
			while ((j >= 0) && v[j] > x) {
				compara++;
				troca++;
				v[j + 1] = v[j];
				j = j - 1;
			}
			v[j + 1] = x;
		}
	}

	// metodo que mostra lista do estado que esta
	public void listaordenada(int[] vetornumero) {
		for (int i = 0; i < vetornumero.length; i++) {
			System.out.println(vetornumero[i]);

		}

	}

	// metodo para realizar uma copia do array
	public int[] copiaVetor(int[] vet) {
		int[] vetorauxiliar = new int[vet.length];

		for (int i = 0; i < vet.length; i++) {
			vetorauxiliar[i] = vet[i];

		}

		return vetorauxiliar;
	}

	// metodo para poder gerar numeros aleatorios
	public int[] vetor(int random) {
		int teste[] = new int[random];
		for (int i = 0; i < teste.length; i++) {
			teste[i] = (int) (1 + (Math.random() * random));
		}
		return teste;
	}

	// Busca não sequencial
	public void metodoBuscaSequencial(int x, int[] vetor) {
		int cont = 0;
		for (cont = 0; cont < vetor.length; cont++) {
			compara++;
			if (vetor[cont] == x) {
				System.out.println("Encontrou o número : " + x);
				break;
			}
		}
		if (cont >= vetor.length)
			System.out.println("Não encontrou o número : " + x);
	}

	// Busca Binario
	public String metodoBuscaBinaria(int x, int dados[]){     
        int n = dados.length;     
        int aux = 0;     
        for(int i = 0; i < n-1; i++){   
            for(int j = i+1 ; j < n; j++){ 
            	compara++;
                if(dados[i] > dados[j]){   
                    aux = dados[j];     
                    dados[j] = dados[i];     
                    dados[i] = aux;     
                }     
            }     
        }     
        int meio;     
        int inicio = 0;     
        int fim = dados.length-1;     
        while (inicio <= fim) {     
                 meio = (inicio + fim)/2; 
                 compara++;
                 if (x == dados[meio]) {    
                          return "encontrou:"+x;     
                 }
                 compara++;
                 if (x < dados[meio])     
                          fim = meio - 1;     
                 else     
                          inicio = meio + 1;     
        }     
        return "Não encontrou";     
    }     
	
	

}
