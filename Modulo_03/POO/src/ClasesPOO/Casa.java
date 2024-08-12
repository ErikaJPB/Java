package ClasesPOO;

public class Casa {

	private String color;
	private int cuartos;
	private int habitantes;
	private String ciudad;
	private int precio;
	private String propietario;

	// METODOS => acciones disponibles para el objeto a partir de una clase
	// La clase puede tener multiples metodos, algunos pueden ser de tipo void que
	// no retornan nada. Otros metodos puede ser
	// de retorno que devuelven strings, int etc. Pueden contener o no parametros.
	// Se recomienda el uso de modificadores de acceso, private.

	// Metodos void => No retornan nada, se centran en realizar acciones que no
	// requieren retornar un valor, tambien suelen ser usados para mostrar mensajes.
	// Estos por lo general no tienen un tipo de dato asociado, usan la palabra
	// void, suelen ser de acceso public, pueden o no recibir parametros.

	public void pintarDeBlanco() {
		color = "Blanco";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public void cambiarPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;

	}

	public String getCiudad() {
		return ciudad;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}

	public void setHabitantes(int habitantes) {
		this.habitantes = habitantes;
	}

	public int getCuartos() {
		return cuartos;
	}

	public int getHabitantes() {
		return habitantes;
	}

	public int cantidadDeCuartosPorHabitante() {
		return cuartos / habitantes;
	}

	// Metodos de tipo => Cuentan con un retorno en base al tipo de dato que fue
	// declarado. El modificador de acceso mas comun es public, puede o no recibir
	// parametros.
	// Los metodos get son un ejemplo de metodos de tipo.

	public int aumentarPrecio(int precio) {
		return this.precio = this.precio + precio;
	}

	public static void main(String[] args) {

		Casa miCasa = new Casa();
		miCasa.setColor("Verde");
		System.out.println(miCasa.getColor());
		miCasa.pintarDeBlanco();
		System.out.println(miCasa.getColor());

		miCasa.setPropietario("Juan");
		System.out.println(miCasa.getPropietario());
		miCasa.cambiarPropietario("Diego");
		System.out.println(miCasa.getPropietario());

		miCasa.setCiudad("Bogota");
		System.out.println(miCasa.getCiudad());

		miCasa.setPrecio(300000000);
		System.out.println(miCasa.getPrecio());
		miCasa.aumentarPrecio(100000000);
		System.out.println(miCasa.getPrecio());

		miCasa.setCuartos(6);
		miCasa.setHabitantes(2);
		System.out.println(miCasa.cantidadDeCuartosPorHabitante());

	}

}