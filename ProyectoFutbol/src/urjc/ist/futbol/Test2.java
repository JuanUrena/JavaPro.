package urjc.ist.futbol;

public class Test2 {

	public static void main(String[] args) {
		Futbolista ejemplo = new Futbolista("Jose", "Perez Garcia", 50, 60.78, 90.76, "español",90.0,90.0,90.0,true, "mco", "madrid");
		Persona ejemplo2 = new Persona("Jose", "Perez Garcia", 50, 60.78, 90.76, "español");
		Futbolista ejemplo3 = new Futbolista("Jose", "Perez Garcia", 50, 60.78, 90.76, "español",90.0,90.0,90.0,true, "mco", "madrid");
	
	if (ejemplo.equals(ejemplo3)){
			System.out.println(ejemplo.toString());
	}
	}
}
