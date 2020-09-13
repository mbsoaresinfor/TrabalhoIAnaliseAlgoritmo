package marcelobarbosasoares;


/**
 * Trabalho da disciplina de Analise de Algoritmo
 * @author marcelo.soares
 *
 */
public class Main {

	public static void main(String[] args) {		
		int[] n = criaN(100000000);	
		long tempoInicio = System.currentTimeMillis();
		System.out.println(buscaChave(n,100000000+1));
		System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
	}
	
	private static int buscaChave(int[] vetor, int chave) {
		int chaveEncontrada = -1;							
		for(int i=0; i < vetor.length  ; i++ ) {	
			if(vetor[i] == chave) {					
				chaveEncontrada = i;
				break;				
			}
		}		
		return chaveEncontrada;		
	}								
	
	
	private static int[] criaN(int tamanho) {
		int[] vetor = new int[tamanho];
		for(int i=0; i < tamanho;i++) {
			vetor[i] = i;
		}		
		return vetor;
	}
	
	
	

}
