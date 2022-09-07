package ejercicio5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Éste es el método para guardar un coche");
    }
    @Override
    public void findAll() {
        System.out.println("Éste es el método para buscar todos los coches");
    }
    @Override
    public void delete() {
        System.out.println("Éste es el método para eliminar un coche");
    }
}
