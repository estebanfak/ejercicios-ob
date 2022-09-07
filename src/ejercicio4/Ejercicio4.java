package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {
        /**
         * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
         *
         * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
         *
         * Crear constructor vacío y con todos los parámetros para cada clase.
         *
         * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
         */



        SmartPhone smartPhone1 = new SmartPhone("Iphone", "13 pro max", "Negro", "Retina display", 3, "IOS 15");
        SmartPhone smartPhone2 = new SmartPhone("Samsung", "S22 Ultra", "Gris", "OLED", 6, "Android 9");
        SmartWatch smartWatch1 = new SmartWatch("Apple", "Applewatch serie 7", "Azul", 45.00, true);
        SmartWatch smartWatch2 = new SmartWatch("Samsung", "Samsung Watch 3", "Rojo", 40.00, false);

        System.out.println(smartPhone1);
        System.out.println(smartPhone2);
        System.out.println(smartWatch1);
        System.out.println(smartWatch2);

    }

}
