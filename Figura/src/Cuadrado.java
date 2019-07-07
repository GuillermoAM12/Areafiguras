
public class Cuadrado extends Figura {
	
	// Atributos
	private float lado;
	
	// Costructores
	public Cuadrado(float area, float perimetro, float lado) {
		super(area, perimetro);
		this.lado = lado;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}
	
	public Cuadrado() {
		super();
		this.lado = 0;
	}
	
	// Propiedades
	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}

	// Metodos Abstract
	@Override
	public float perimetro() {
		this.perimetro = 4*this.lado;
		return this.perimetro;
	}

	@Override
	public float area() {
		this.area = (float) Math.pow(this.lado, 2);
		return this.area;
	}
	
}
