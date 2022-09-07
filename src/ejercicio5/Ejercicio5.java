package ejercicio5;

public class Ejercicio5 {
    public static void main(String[] args) {
        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}
