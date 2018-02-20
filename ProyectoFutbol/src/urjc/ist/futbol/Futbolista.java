package urjc.ist.futbol;

import java.util.Objects;

public class Futbolista extends Persona {
	
	private double velocidad;
	private double resistencia;
	private double calidad;
	private boolean zurdo;
	private String posicion;
	
	private String equipo;

	public double getVelocidad() {
		return velocidad;
	}
	public boolean setVelocidad(double velocidad) {
		if (velocidad<=100.00 && velocidad>=0.00){
			this.velocidad = velocidad;
			return true;
		}else {
			return false;
		}
	}



	public double getResistencia() {
		return resistencia;
	}
	public boolean setResistencia(double resistencia) {
		if (resistencia<=100.00 && resistencia>=0.00){
			this.resistencia = resistencia;
			return true;
		}else {
			return false;
		}
	}



	public double getCalidad() {
		return calidad;
	}
	public boolean setCalidad(double calidad) {
		if (calidad<=100.00 && calidad>=0.00){
			this.calidad = calidad;
			return true;
		}else {
			return false;
		}
	}



	public boolean isZurdo() {
		return zurdo;
	}
	public boolean setZurdo(boolean zurdo) {
		this.zurdo = zurdo;
		return true;
	}



	public String getPosicion() {
		return posicion;
	}
	public boolean setPosicion(String posicion) {
		this.posicion = posicion;
		return true;
	}
	
	
	public Futbolista() {
		super();
		setVelocidad(0.0);
		setResistencia(0.0);
		setCalidad(0.0);
		this.zurdo=false;
		this.posicion="";
		this.equipo="";
	}
	public Futbolista(String nombre, String apellidos, int edad, double peso, double altura, 
			String nacionalidad, double velocidad, double resistencia, double calidad, 
			boolean zurdo, String posicion, String equipo){
		
		super(nombre, apellidos, edad, peso, altura, nacionalidad);
		setVelocidad(velocidad);
		setResistencia(resistencia);
		setCalidad(calidad);
		this.zurdo=zurdo;
		this.posicion=posicion;
		this.equipo=equipo;
	}
	
	
	@Override
	public boolean equals(Object otherObject) {
		if (this==otherObject) return true;
		
		if (otherObject==null) return false;
	
		if (getClass()!=otherObject.getClass()) return false;
		
		Futbolista other =(Futbolista) otherObject;
		return velocidad== other.velocidad
				&& resistencia== other.resistencia
				&& calidad== other.calidad
				&& zurdo==other.zurdo
				&& Objects.equals(posicion, other.posicion)
				&& Objects.equals(equipo, other.equipo)
				&& super.equals(otherObject);
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(velocidad, resistencia, calidad, zurdo, posicion, equipo);
	}
	
	@Override
	public String toString() {
		return super.toString() + ' ' + Float.toString((float) velocidad) +' '+ Float.toString((float) resistencia) +' ' + Float.toString((float) calidad)+ ' ' + Boolean.toString(zurdo) +' '+ posicion + ' ' + equipo;
	}
}
