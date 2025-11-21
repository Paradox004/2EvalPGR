package dosejerciciosdeclases;

public class Empleados {
	
    private String nombre;
    private String apellido;
    private String dni;
    private int idEmpleado;

    private static int contadorId = 100;


    public Empleados(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.idEmpleado = contadorId; 
        contadorId++;                
    }

    
    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getDni() { return dni; }

    public int getIdEmpleado() { return idEmpleado; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public void setDni(String dni) { this.dni = dni; }

    
    @Override
    public String toString() {
        return "Empleado número: " 
        		+ idEmpleado 
        		+", " 
        		+ nombre 
        		+ " " 
        		+ apellido;
    }
}
