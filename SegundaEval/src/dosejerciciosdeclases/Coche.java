package dosejerciciosdeclases;

public class Coche {

	private String matricula;
    private String color;
    private String modelo;
    private String marca;
    private static int contadorCoches = 0;
    
	public Coche(String matricula, String color, String modelo, String marca) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.marca = marca;
		contadorCoches++;
		
		
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public static int getContadorCoches() {
		return contadorCoches;
	}

	public static void setContadorCoches(int contadorCoches) {
		Coche.contadorCoches = contadorCoches;
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula 
				+ ", color=" + color 
				+ ", modelo=" + modelo 
				+ ", marca=" + marca 
				+ "]";
	}
}
