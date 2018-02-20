package urjc.ist.futbol;

import java.util.Objects;

public class Entrenador extends Persona {
	
	private int experiencia;
	private int titulos;
	private boolean seleccionador;
	
	
	public int getExperiencia() {
		return experiencia;
	}
	public boolean setExperiencia(int experiencia) {
		this.experiencia = experiencia;
		return true;
	}




	public int getTitulos() {
		return titulos;
	}
	public boolean setTitulos(int titulos) {
		this.titulos = titulos;
		return true;
	}




	public boolean getSeleccionador() {
		return seleccionador;
	}
	public boolean setSeleccionador(boolean seleccionador) {
		this.seleccionador = seleccionador;
		return true;
	}
	
	
	public Entrenador() {
		super();
		this.experiencia=0;
		this.titulos=0;
		this.seleccionador=false;
	}
	
	public Entrenador(String nombre, String apellidos, int edad, double peso, double altura, 
			String nacionalidad, int experiencia, int titulos, boolean seleccionador){
		
		super(nombre, apellidos, edad, peso, altura, nacionalidad);
		this.experiencia=experiencia;
		this.titulos=titulos;
		this.seleccionador=seleccionador;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if (this==otherObject) return true;
		
		if (otherObject==null) return false;
	
		if (getClass()!=otherObject.getClass()) return false;
		
		Entrenador other =(Entrenador) otherObject;
		return experiencia== other.experiencia
				&& titulos== other.titulos
				&& seleccionador== other.seleccionador
				&& super.equals(otherObject);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(experiencia, titulos, seleccionador);
	}
	
	@Override
	public String toString() {
		return super.toString() + ' ' + Integer.toString((int) experiencia) +' '+ 
				Integer.toString((int) titulos)+ Boolean.toString(seleccionador);
	}
}



}
