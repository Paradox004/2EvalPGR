package dosejerciciosdeclases;

public class Main {
	
	public static void main(String[] args) {
	        Coche c1 = new Coche("1234ABC", "Rojo", "A3", "Audi");
	        Coche c2 = new Coche("5678DEF", "Negro", "Serie 1", "BMW");

	        System.out.println(c1);
	        System.out.println(c2);
	        System.out.println("Número de coches en el concesionario: " + c1.getContadorCoches());
	    }

}
