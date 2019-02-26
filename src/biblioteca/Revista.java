package biblioteca;

public class Revista extends Publicacion implements Prestable{

	private static int numero;
	private boolean prestado;

	public Revista(String codigo, String titulo, int añoPublicacion) {

		super(codigo, titulo, añoPublicacion);
		numero++;
		this.numero = numero;
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

	@Override
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
