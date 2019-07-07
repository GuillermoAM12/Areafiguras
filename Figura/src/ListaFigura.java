import java.util.*;

public class ListaFigura {
	
	// Atributos
	private ArrayList<Figura> ListF;
	
	// Constructores
	public ListaFigura() {
		ListF = new ArrayList<Figura>();
	}
		
		
	// Propiedades
	public ArrayList<Figura> getListF() {
		return ListF;
	}
	
	// Metodos de Objeto
	
	public void AgregarCirculo(Circulo f) {
		ListF.add(f);
	}
	
	public void AgregarCuadrado(Cuadrado f) {
		ListF.add(f);
	}
	
	public void AgregarTriangulo(Triangulo f) {
		ListF.add(f);
	}
}
