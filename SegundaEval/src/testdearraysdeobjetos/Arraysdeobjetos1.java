package testdearraysdeobjetos;

public class Arraysdeobjetos1 {


	public static void main(String[] args) {
	Producto[] inventario = {
            new Producto("Osito", 15.99, 3),
            new Producto("Conejito", 12.50, 6),
            new Producto("Gato", 20.00, 7),
            new Producto("Panda", 18.75, 2),
            null,
            new Producto("Unicornio", 25.00, 9)
	};

	

	   
	        double total = 0;  
	        for (int i = 0; i < inventario.length; i++) 
	         
	        	if (inventario[i] != null && inventario[i].getStock() % 2 != 0) 
	        		total += inventario[i].getPrecio();
	        System.out.println("Total precios con stock impar: " +total +"€");
	        
	        Producto masCaro = null;
	        for (int i = 0; i < inventario.length; i++) {
	            if (inventario[i] != null && inventario[i].getStock() > 5) {
	                if (masCaro == null || inventario[i].getPrecio() > masCaro.getPrecio()) {
	                    masCaro = inventario[i];
	                }
	            }
	            
	            
	        }

	        if (masCaro != null) {
	            System.out.println("Producto más caro con stock > 5: " +masCaro);
	        } else {
	            System.out.println("No hay productos con stock mayor que 5.");
	        }
}	
}
