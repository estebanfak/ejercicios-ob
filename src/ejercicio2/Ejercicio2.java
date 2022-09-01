package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {


        int precioNeto = 100;
        double precioFinal = precioMasIVA(precioNeto);
        System.out.println(precioFinal);
    }



    private static double precioMasIVA(int precio) {
        return precio + (precio*0.21);
    }
}
