package ejercicio5;

public interface CocheCRUD {
    void save();//Debe recibir un parámetro de tipo coche para poder guardarla en la BD
    void findAll();//Está como void, pero en realidad debería devolver una lista de todos los coches que hay en la BD
    void delete();//Debe recibir un parámetro de tipo coche para poder eliminartlo de la BD
}
