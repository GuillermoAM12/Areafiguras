
public class Circulo extends Figura{

	// Atributos
	private float radio;
	
	// Constructores	
	public Circulo(float area, float perimetro, float radio) {
		super(area, perimetro);
		this.radio = radio;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}
	
	public Circulo() {
		super();
		this.radio = 0;
	}
	
	// Propiedades
	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
		this.perimetro = this.perimetro();
		this.area = this.area();
	}

	// Metodos Abstract
	@Override
	public float perimetro() {
		this.perimetro = (float) (2*Math.PI*this.radio); 
		return this.perimetro;
	}

	@Override
	public float area() {
		this.area = (float) (Math.PI*this.radio*this.radio);
		return this.area;
	}

}
