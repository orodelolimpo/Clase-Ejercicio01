package clases;

public class Persona {
//	Ejercicio 1
//	Vamos a crear una clase llamada Persona. Sus atributos 
//	on: nombre, edad y DNI. Construye los siguientes métodos para la clase:
//	• Un constructor, donde los datos pueden estar vacíos.
//	• Los setters y getters para cada uno de los atributos. Hay que validar las 
//	entradas de datos.
//	• mostrar(): Muestra los datos de la persona.
//	• esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de 
//	edad

	private String nombre;
	private int edad;
	private String dni;
	//constructor
	
	public Persona () {
		this.nombre="";
		this.edad=0;
		this.dni="";
	}
	
	//constructor monstrando datos
	
	public Persona(String nombre, int edad, String dni) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		
		//es más correcto poner setNombre(string nombre) {
	}



	// los setter y getter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if(edad>0) {
			this.edad = edad;
		}
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if (dni.length()==9) {
			if (Character.isLetter(dni.charAt(8))) {
				this.dni = dni;
			}
		}
	}

	//método o función para mostrar los datos de la función
	
	public void mostrar() {
		System.out.println("Nombre: "+ this.nombre+ "Edad: "+this.edad+ "DNI: " +this.dni);
	}
	
	//hacer función es mayor de edad
	
	public boolean esMayorDeEdad () {
		if (this.edad >=18) {
			return true;
		}else {
			return false;
			
		}
	}
	
}
