package biblioteca;

public interface Prestable {
	
	// Acción de pedir prestado un libro
	public void prestar();
	
	// Acción de retornar un libro a la biblioteca
	public void devolver();
	
	// Saber si un libro está prestado
	public boolean prestado();
	
}
