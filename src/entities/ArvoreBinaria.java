package entities;



public class ArvoreBinaria {
	
	
	 private class ARVORE {
		 
	        public int num;
	        public ARVORE dir, esq;
	    }
	 ARVORE a = null;
	 
	 
	 public ARVORE inserir(ARVORE aux, int num) {
	        if (aux == null) {
	            aux = new ARVORE();
	            aux.num = num;
	            aux.esq = null;
	            aux.dir = null;
	 
	        } else if (num < aux.num) {
	            aux.esq = inserir(aux.esq, num);
	        } else {
	            aux.dir = inserir(aux.dir, num);
	        }
	        return aux;
	    }
	 
	 public  String imprimir(ARVORE aux) {
	    	String retorno;
	    	retorno = "(";
	        if (aux != null) {
	        	retorno += "C" + aux.num; 
	            retorno += imprimir(aux.esq);
	            retorno += imprimir(aux.dir);
	        }
	        retorno += ")";
	        return retorno;
	    }
	 
	 public  boolean localizar(ARVORE aux, int num, boolean loc) {
	        if (aux != null && loc == false) {
	            if (aux.num == num) {
	                loc = true;
	            } else if (num < aux.num) {
	                loc = localizar(aux.esq, num, loc);
	            } else {
	                loc = localizar(aux.dir, num, loc);
	            }
	        }
	        return loc;
	    }
	 
	 
	 public static ARVORE excluir(ARVORE aux, int num) {
	        ARVORE p, p2, r = null;
	        if (aux.num == num) {
	            if (aux.esq == aux.dir) {
	                return null;
	            } else if (aux.esq == null) {
	                return aux.dir;
	            } else if (aux.dir == null) {
	                return aux.esq;
	            } else {
	                p2 = aux.dir;
	                p = aux.dir;
	                while (p.esq != null) {
	                	r = p;
	                    p = p.esq;
	                }
	                aux.num = p.num;
	                p = null;
	                r.esq = null;
	                return aux;
	            }
	        } else if (aux.num < num) {
	            aux.dir = excluir(aux.dir, num);
	        } else {
	            aux.esq = excluir(aux.esq, num);
	        }
	        return aux;
	 }
	// metodo para poder gerar numeros aleatorios para arvore binaria
			public void  gerarArvoreBinaria(int random) {
				
				for (int i = 0; i < random; i++) {
					int valor = (int) (1 + (Math.random() * random));
					a = inserir(a,valor );
				}
				System.out.println(imprimir(a));
			}
			
			public void  buscaBinaria(int numero) {
				
				
				boolean achou = localizar(a, numero, false);
				if(achou==true)
					System.out.println("Encontrou a valor !!!");
				else
					System.out.println("Não enontrou o valor!!!");
				
				
			}

}


