package ClasesHerencia;

// Clase Padre => Se encarga de englobar todas las caracteristicas que ambas clases hijas tengan en comun
// para su posterior herencia. 

// Por medio de la clase padre no hay necesidad de crear metodos y atributos independientes de cada clase, dado 
// que la herencia permite englobar aquellas caracteristicas que se comparten en cuanto a la estructura y simplificarlas 
// para ahorrar codigo posteriormente

// Java permite multiples niveles de herencia pero no la herencia multiple es decir, una clase solo puede heredar directamente de una clase
// ascediente, y una clase puede ser ascendiente de tantas clases como se desee.  
public class Vehiculo {

	private String matricula;
	private String modelo;
	private int potencia;

	// getting and setters

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	// Metodos
	public void encenderVehiculo() {
		System.out.println("El vehiculo está encendido");
	}

	public void apagarVehiculo() {
		System.out.println("El vehiculo está apagado");
	}

	public static void main(String[] args) {

	}

}
