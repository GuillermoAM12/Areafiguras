
public abstract class Figura {
	
	// Atributos
	protected static int num = 1; 
	protected int id;
	protected float area;
	protected float perimetro;
	
	// Constructores
	public Figura(float area, float perimetro) {
		this.area = area;
		this.perimetro = perimetro;
		this.id = num;
		num++;
		
	}
	
	public Figura() {
		this.area = 0;
		this.perimetro = 0;
		this.id = num;
		num++;
	}
	

	// Propiedades
	public float getArea() {
		return area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public int getId() {
		return id;
	}
	
	// Metodos Object
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Figura))
			return false;
		Figura other = (Figura) obj;
		if (id != other.id)
			return false;
		return true;
	}


	// Metodos de la Clase
	public abstract float perimetro();
	
	public abstract float area();
}
