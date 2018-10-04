package Algoritmo2;

public class ListaDoble {
	private NodoDoble inicio;
	
	public NodoDoble GetInicio() {
		return this.inicio;
	}
	public void SetInicio(NodoDoble nodo) {
		inicio = nodo;
	}
	
	public ListaDoble() {
		inicio = null;
	}
}
