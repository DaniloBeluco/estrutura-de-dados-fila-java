
public class Fila {
	public No inicio, fim;
	int t = 0;

	public Fila() {
		inicio = fim = null;
	}

	public void insere(String e) {

		No novo = new No(e);
		if (Vazio()) {
			inicio = novo;
			fim = novo;
			t++;
//		} else if (t == 0) {
//			inicio.proximo = novo;
//			fim = novo;
//			t++;
		} else {
			fim.proximo = novo;
			fim = novo;
			t++;
		}
	}

	public String remover() {
		
		String e=inicio.Elemento;
		inicio = inicio.proximo;		
		return e;
	}
	
	public int tamanho() {
		int c = 0;
		No aux = inicio;
		while (aux.proximo!=null) {
			aux = inicio.proximo;
			c++;
		}
		return c;
	}
	
	public void mostraFila() {
		No aux = inicio;
		while (aux != null) {
			System.out.println(aux.Elemento);
			aux=aux.proximo;
			
		}
	}

	public boolean Vazio() {
		return (inicio==null);
	}
	
	
}
