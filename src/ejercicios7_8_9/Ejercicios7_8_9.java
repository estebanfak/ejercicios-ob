package ejercicios7_8_9;

import ejercicio4.SmartPhone;
import ejercicio4.SmartWatch;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Vector;

public class Ejercicios7_8_9 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("\n1. Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena \"hola mundo\", \n " +
                "debe retornar \"odnum aloh\" \n");
        String hola = "Hola Mundo";

        System.out.println(hola);
        System.out.println(reverse(hola));

        System.out.println("\n2. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores\n");
        String[] array = {"Pepe", "Jose", "Esteban"};
        for (String nombre : array) {
            System.out.println(nombre);
        }
        System.out.println("\n3. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y \n " +
                "el valor de cada elemento en ambas dimensiones\n");
        int[][] arrayBidi = {
                {1, 2, 3},
                {10, 20, 30}
        };
        for (int i = 0; i < arrayBidi.length; i++) {
            for (int j = 0; j < arrayBidi[i].length; j++) {
                System.out.println("Posición i: " + i + ", posición j: " + j + " -> " + "Elemento: " + arrayBidi[i][j]);
            }
        }
        // Opción 2:
//        for(int[] array1 : arrayBidi){
//            for(int numero : array1){
//                System.out.println(numero);
//            }
//        }
        System.out.println("\n4. Crea un \"Vector\" del tipo de dato que prefieras, y añádele 5 elementos. \n " +
                "Elimina el 2o y 3er elemento y muestra el resultado final\n");
        Vector<String> paises = new Vector<>();
        paises.add("Argentina");
        paises.add("España");
        paises.add("Italia");
        paises.add("Alemania");
        paises.add("Brasil");
        System.out.println(paises);
        paises.remove(1);
        paises.remove(2);
        System.out.println(paises);
        System.out.println("\n5. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si \n " +
                "tuviésemos 1000 elementos para ser añadidos al mismo\n");
        Vector<Integer> numeros = new Vector<>();
        System.out.println(numeros.capacity());
        for (int i = 0; i <= 1000; i++) {
            numeros.add(i);
        }
        System.out.println(numeros.capacity());
        System.out.println("\nEl problema es el consumo de memoria cada vez que se completa la capacidad por defecto, ya \n " +
                "que se deben copiar los datos en un nuevo 'array subyacente' con una nueva capacidad y \n " +
                "eso implica mucho consumo de memoria. Por defecto, cada vez que se completa la capacidad, \n " +
                "al agregar un nuevo elemento, dicha capacidad se duplica\n");

        System.out.println("\n6. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre \n " +
                "ambos mostrando únicamente el valor de cada elemento\n");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Procesador");
        arrayList.add("Placa madre");
        arrayList.add("Memoria RAM");
        arrayList.add("Placa de video");

        LinkedList<String> linkedList = new LinkedList<>(arrayList);
//        arrayList.forEach(elemento -> System.out.println("ArrayList: " + elemento));
        for (String elemento : arrayList) {
            System.out.println(elemento);
        }
        for (String elemento : linkedList) {
            System.out.println(elemento);
        }
        System.out.println("\n7. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. \n " +
                "A continuación, con otro bucle, recórrelo y elimina los numeros pares. Por último, vuelve a \n " +
                "recorrerlo y muestra el ArrayList final. Si te atreves, puedes hacerlo en menos pasos, siempre \n " +
                "y cuando cumplas el primer \"for\" de relleno.\n");

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList1.add(i);
        }
        System.out.println(arrayList1);
        for (int i = 0; i < arrayList1.size(); i++) {
            if (arrayList1.get(i) % 2 == 0) {
                arrayList1.remove(i);
            }
        }
        System.out.println(arrayList1);
        System.out.println("\n8. Crea una función DividePorCero. Esta, debe generar una excepción (\"throws\") a su \n " +
                "llamante del tipo ArithmeticException que será capturada por su llamante (desde \"main\", \n " +
                "por ejemplo). Si se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". \n " +
                "Finalmente, mostraremos en cualquier caso: \"Demo de código\".\n");

        System.out.println(dividePorCero(4, 0));

        System.out.println("\n 9. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros:\n" +
                " \"fileIn\" y \"fileOut\". La tarea de la función será realizar la copia del fichero dado en el \n " +
                "parámetro \"fileIn\" al fichero dado en \"fileOut\".\n");

        //Creo un nuevo archivo .txt
        PrintStream in = new PrintStream("ArchivoEntrada.txt");
        //Le agrego contenido
        in.print("Holaaaaa");
        //Creo la variable fuera del try para que tenga alcance global
        FileInputStream fileIn = null;
        //Le asigno el archivo "in" a la variable fileIn
        try {
            fileIn = new FileInputStream("ArchivoEntrada.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //Creo el archivo de salida
        PrintStream fileOut = new PrintStream("ArchivoSalida.txt");

        //Ejecuto la función para copiar el contenido de fileIn a fileOut
        copiarFichero(fileIn, fileOut);


        System.out.println("\n 10. Sorpréndenos creando un programa de tu elección que utilice InputStream, \n " +
                "PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.");

        //Creo el archivo de excel
        PrintStream printStream = new PrintStream("Archivo.xls");

        //Creo comandos auxiliares
        String tab = "\t";
        String enter = "\n";

        //Creo una "base de datos de smartphones"
        SmartPhone smartPhone = new SmartPhone("Apple", "Iphone 8 plus", "Negro", "OLED",  64, "iOS 16");
        SmartPhone smartPhone1 = new SmartPhone("Apple", "Iphone x", "Negro", "OLED", 64, "iOS 16");
        SmartPhone smartPhone2 = new SmartPhone("Apple", "Iphone 12 Pro", "Rojo", "OLED", 64, "iOS 16");
        SmartPhone smartPhone3 = new SmartPhone("Apple", "Iphone 13 Pro", "Plateado", "OLED", 64, "iOS 16");
        SmartPhone smartPhone4 = new SmartPhone("Apple", "Iphone 14 Pro", "lanco", "OLED", 64, "iOS 16");

        //Lleno la "base de datos"
        LinkedList<SmartPhone> smartPhones = new LinkedList<>();
        smartPhones.add(smartPhone);
        smartPhones.add(smartPhone1);
        smartPhones.add(smartPhone2);
        smartPhones.add(smartPhone3);
        smartPhones.add(smartPhone4);

        //Creo la cabecera de la tabla de excel y la imprimo
        String cabecera = "Marca\tModelo\tColor\tTipo de pantalla\tMemoria ram\tSistema Operativo\n";
        printStream.print(cabecera);

        //Recorro la base de datos para llenar la tabla de excel
        for (SmartPhone phone : smartPhones) {
        printStream.print(  phone.getMarca() + tab +
                            phone.getModelo() + tab +
                            phone.getColor() + tab +
                            phone.getTipoPantalla() + tab +
                            phone.getRam() + tab +
                            phone.getSistemaOperativo() + enter);
        }
    }

    public static String reverse(String texto) {
        String a = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            a += texto.charAt(i);
        }
        return a;
    }
    public static int dividePorCero(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        return resultado;
    }
    public static void copiarFichero(FileInputStream input, PrintStream output){
        try{
            byte[] datos = input.readAllBytes();
            output.write(datos);
            System.out.println("Contenido del archivo copiado con éxito");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
