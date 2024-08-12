package ClasesPOO;

public class Carro {

	// Modificadores de acceso => El encapsulamiento busca controlar el acceso a los
	// datos que conforman un objeto o instancia, por ende, una clase y sus objetos
	// que hacen uso
	// de modificadores de acceso especialmente privados, son objetos encapsulados.
	// Dan mayor seguridad al restringir el acceso a diferentes atributos, metodos,
	// constructores y aseguran que el usuario deba seguir una
	// ruta especifica para acceder a la informacion.
	// Se recomienda que los atributos de una clase sean privados y que cada
	// atributos tenga sus propios metodos get and set para obtener y establecer el
	// valor del atributo.

	private String marca;
	private String modelo;
	private String color;
	private boolean enVenta;

	// Parametros => Uso en la declaracion del constructor

	public Carro(String marca, String modelo, String color, boolean enVenta) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.enVenta = enVenta;
	}

	// Getters and Setters

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public boolean isEnVenta() {
		return enVenta;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setIsEnVenta(boolean enVenta) {
		this.enVenta = enVenta;
	}

	public static void main(String[] args) {

		// Argumentos => uso en el paso de datos a metodos desde un objeto

		Carro Tracker = new Carro("Chevrolet", "Negro", "Tracker LT", false);

		System.out.println("Marca: " + Tracker.marca);
		System.out.println("Modelo: " + Tracker.modelo);
		System.out.println("Color: " + Tracker.color);
		System.out.println("En Venta: " + Tracker.enVenta);

	}

}