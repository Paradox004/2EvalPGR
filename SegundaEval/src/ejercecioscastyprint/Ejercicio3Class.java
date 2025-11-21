package ejercecioscastyprint;

public class Ejercicio3Class {
    private String expediente;
    private String nombre;
    private int edad;
    private double nota;

    public Ejercicio3Class(String expediente, String nombre, int edad, double nota) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getExpediente() {
        return expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public boolean isAprobado() {
        return nota >= 5.0;
    }

    public char getInicial() {
        return nombre.charAt(0);
    }
}
