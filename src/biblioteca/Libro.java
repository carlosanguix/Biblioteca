package biblioteca;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;
	
	
	
	
	
	
	@Override
	public boolean prestar() {
		
		return false;
	}
	
	@Override
	public boolean devolver() {
		
		return false;
	}
	
	@Override
	public String toString() {
		
		return "" + prestado;
	}
}
