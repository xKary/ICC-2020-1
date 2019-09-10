/**
 * Clase que crear objetos Libro con los atributos titulo,autor y año de publicacion,
 * permite ver el valor de los atributos y modificar dichos valores.
 * @author Prado Oropeza Karina Vianey
 * @version 1.0
 */
public class Libro {
    String titulo, autor;
    int anioPublicacion;

    /**
     * Constructor default.
     */
    public Libro () {
	titulo = autor = "";
	anioPublicacion = 0;
    }

    /**
     * Inicializar objeto con parámetros.
     * @param titulo Titulo que se le asignara 
     * @param autor Autor que se asignara
     * @param anioPublicacion Año de publicación que se asignara
     */
    public Libro(String titulo, String autor, int anioPublicacion){
	this.titulo = titulo;
	this.autor = autor;
	this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtener el titulo del objeto libro.
     * @return titulo Atributo titulo del objeto.
     */
    public String getTitulo(){
	return titulo;
    }

    /**
     * Asignar otro titulo al objeto.
     * @param nuevoTitulo El titulo que se asignara 
     */
    public void setTitulo(String nuevoTitulo){
	titulo = nuevoTitulo;
    }

    /**
     * Obtener el autor.
     * @return autor Valor del atributo autor del objeto
     */

    public String getAutor(){
	return autor;
    }

    /**
     * Asignar otro autor al objeto.
     * @param nuevoAutor Autor que se asignara 
     */
    public void setAutor(String nuevoAutor){
	autor = nuevoAutor;
    }

    /**
     * Obterner año de publicación.
     * @return anioPublicacion Valor del atributo anioPUblicacion
     */ 
    public int getAnioPublicacion(){
	return anioPublicacion;
    }

    /**
     * Asignar otro año de publicación al objeto.
     * @param nuevoAnioPublicacion  Año de publicación que se asignará
     */
    public void setAnioPublicacion(int nuevoAnioPublicacion){
	anioPublicacion = nuevoAnioPublicacion;
    }
}
