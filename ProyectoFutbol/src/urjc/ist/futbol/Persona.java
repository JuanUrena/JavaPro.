package urjc.ist.futbol;
import java.util.Objects;

public class Persona {
	
	private String nombre;
	private String apellidos;
	
	private int edad;
	
	private double peso;
	private double altura;
	
	private String nacionalidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public boolean setNombre(String nombre) {
		this.nombre = nombre;
		return true;
	}

	
	
	public String getApellidos() {
		return apellidos;
	}
	public boolean setApellidos(String apellidos) {
		this.apellidos = apellidos;
		return true;
	}



	public int getEdad() {
		return edad;
	}
	public boolean setEdad(int edad) {
		this.edad = edad;
		return true;
	}



	public double getPeso() {
		return peso;
	}
	public boolean setPeso(double peso) {
		this.peso = peso;
		return true;
	}



	public double getAltura() {
		return altura;
	}
	public boolean setAltura(double altura) {
		this.altura = altura;
		return true;
	}
	
	
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public boolean setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
		return true;
	}
	
	//Constructor por defecto
	public Persona()  {
		this.nombre="";
		this.apellidos="";
		this.edad=0;
		this.peso=0.0;
		this.altura=0.0;
	}
	
	//Constructor con parametros
	public Persona(String nombre, String apellidos, int edad, double peso, double altura, String nacionalidad) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
		this.nacionalidad=nacionalidad;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (this==otherObject) return true;
		
		if (otherObject==null) return false;
	
		if (getClass()!=otherObject.getClass()) return false;
		
		Persona other =(Persona) otherObject;
		return Objects.equals(nombre, other.nombre)
				&& Objects.equals(apellidos, other.apellidos)
				&& edad==other.edad
				&& peso==other.peso
				&& altura==other.altura
				&& Objects.equals(nacionalidad, other.nacionalidad);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, edad, peso, altura, nacionalidad);
	}
	
	@Override
	public String toString() {
		return nombre + ' '  + apellidos + ' ' + Integer.toString(edad) + ' ' + Float.toString((float) peso) +' '+ Float.toString((float) altura) + ' ' + nacionalidad;
	}
	
}
