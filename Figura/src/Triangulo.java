/**
 * La Clase triangulo especificada corresponde 
 * a un triangulo rectangulo.
 */

public class Triangulo extends Figura {
	
	
	// Atributos
	private float base;
	private float altura;
	
	// Constructores
	public Triangulo(float area, float perimetro, float base, float altura) {
		super(area, perimetro);
		this.base = base;
		this.altura = altura;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}
	
	public Triangulo() {
		super();
		this.base = 0;
		this.altura = 0;
	}
	
	// Propiedades
	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}

	// Metodos Abstract
	@Override
	public float perimetro() {
		this.perimetro = (float) (this.base + this.altura + Math.sqrt((Math.pow(this.base, 2))+(Math.pow(this.altura, 2))));
		return this.perimetro;
	}

	@Override
	public float area() {
		this.area = (float) (this.base*this.altura*0.5);
		return this.area;
	}
	
}
