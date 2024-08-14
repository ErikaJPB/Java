package ClasesPOO;

public class Circunferencia {
	
	
	// Static => Los elementos estaticos (o miembros de clase) son aquellos que pertenecen a la clase, 
	// en lugar de pertenecer a un objeto en particular.
	
	private static float pi = 3.1415926535f;
	private float radio = 0f;
	
	
	public Circunferencia(float radio) {
		this.radio = radio;
	}
	
	
	// Metodo no estatico => se hace uso de los atributos.
	
	public float area() {
		return pi * (radio * radio);
	}
	
	
	// Metodo estatico => se hace uso de los parametros y unicamente de los atributos estaticos.
	
//	public static float area(float radio) {
//		return pi * (radio * radio);
//	}
//	


	public static void main(String[] args) {
		
		
		System.out.println(Circunferencia.pi);
		
		// Metodo estatico
		// System.out.println(Circunferencia.area(95f));
		
	

		// Metodo no estatico
		
		Circunferencia Circulo = new Circunferencia(95f);
		System.out.println(Circulo.area());
	}


}