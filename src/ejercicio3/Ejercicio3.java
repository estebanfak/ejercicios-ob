package ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {


        String[] nombres = {"Alan", "Esteban", "Roberto", "Josefina"};
        String nombresConcatenados = "";
        for (String nombre : nombres) {
            nombresConcatenados = nombresConcatenados.concat(nombre + " ");
        }

        System.out.println(nombresConcatenados);
    }
}
