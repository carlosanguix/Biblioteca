package biblioteca;

public class Libro extends Publicacion implements Prestable {

	private boolean prestado;


	public Libro(String codigo, String titulo, int añoPublicacion) {

		this(codigo, titulo, añoPublicacion, false);
	}
	
	public Libro(String codigo, String titulo, int añoPublicacion, boolean prestado) {

		super(codigo, titulo, añoPublicacion);
		this.prestado = false;
	}



	@Override
	public void prestar() {

		this.prestado = true;
	}

	@Override
	public void devolver() {

		this.prestado = false;
	}

	@Override
	public boolean prestado() {

		return this.prestado;
	}

	public String toString() {
		
		String esPrestado;
		
		if (prestado) {
			
			esPrestado = "si";
		} else {
			
			esPrestado = "no";
		}
		
		return super.toString() + "\nPrestado: " + esPrestado + "\n";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
