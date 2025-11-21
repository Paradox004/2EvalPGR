package ejercecioscastyprint;

public class Ejercicio3 {
    public static void main(String[] args) {

    	Ejercicio3Class[] personas = {
            new Ejercicio3Class("0001", "Ana", 20, 8.75),
            new Ejercicio3Class("0002", "Luis", 22, 6.30),
            new Ejercicio3Class("0003", "Marta", 19, 4.50)
        };

        System.out.println("Exp  Nombre   Edad   Nota   Aprobado   Inicial");
        System.out.println("-----------------------------------------------------------");
//s = string, d = double, f = float, b = boolean//
        for (Ejercicio3Class p : personas) {
            System.out.printf("%s  %-7s  %3d   %.2f   %-8b   %c\n",
                    p.getExpediente(),
                    p.getNombre(),
                    p.getEdad(),
                    p.getNota(),
                    p.isAprobado(),
                    p.getInicial());
            
/* Salida de texto (Pregunta Chati)
 
%s		Cadena de texto
%-7s	"Juan"	Cadena alineada a la izquierda ocupando 7 espacios
%3d		Número entero que ocupa 3 espacios (alineado a la derecha)
%.2f	8.75	Número decimal con 2 decimales
%-8b	true	Valor booleano alineado a la izquierda a 8 espacios
%c		Un solo carácter
\n		Salto de línea


 */
        }
    }
}
