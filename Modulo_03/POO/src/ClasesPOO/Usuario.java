package ClasesPOO;

public class Usuario {
	
	// Clases anidadas => Es una clase que se declara dentro de otra clase, metodo, asignadas a un atributo o pasadas como parametro o asignadas a una variable local. 
	// No existe independientemente de su clase adjunta, su alcance esta limitado por la clase externa. Se puede declarar private, public, protected o default. 
	// Una clase anidada tiene acceso a los miembros incluidos los miembros privados de la clase en la que esta anidada, pero la clase adjunta no tiene acceso a los miembros de la clase anidada. 
	// Ejemplo, clase usuario - clase anidada administrador.

	
	public String usuario;
	
	// Constructor
	
	public Usuario (String usuario) {
		this.usuario = usuario;
	}
	
	public void establecerRoles() {
		Administrador admin = new Administrador();
		admin.trabajar();
	}
	
	public class Administrador {
		public void trabajar()
		{
			System.out.println("El administrador: " + usuario +  " se encuentra trabajando");
			
		}
	}
	
	
	public static void main(String[] args) {
	

	}

}
