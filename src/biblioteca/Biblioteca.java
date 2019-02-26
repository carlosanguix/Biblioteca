package biblioteca;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Libro> libros;
	private ArrayList<Revista> revistas;


	public Biblioteca() {

		this.libros   = new ArrayList<Libro>();
		this.revistas = new ArrayList<Revista>();
	}


	public void listarBiblioteca() {

		if (this.libros.size() == 0 && this.revistas.size() == 0) {

			System.out.println("No hay ninguna publicación en la biblioteca.");

		} else if (this.libros.size() == 0) {
			
			System.out.println("	REVISTAS");
			System.out.println("	--------");
			
			for (int i = 0; i < this.revistas.size(); i++) {

				System.out.println(this.revistas.get(i));
			}
			
		} else if (this.revistas.size() == 0) {
			
			System.out.println("	LIBROS");
			System.out.println("	------");
			
			for (int i = 0; i < this.libros.size(); i++) {

				System.out.println(this.libros.get(i));
			}
		} else {
			
			System.out.println("	LIBROS");
			System.out.println("	------");
			
			for (int i = 0; i < this.libros.size(); i++) {

				System.out.println(this.libros.get(i));
			}
			
			System.out.println("	REVISTAS");
			System.out.println("	--------");
			
			for (int i = 0; i < this.revistas.size(); i++) {

				System.out.println(this.revistas.get(i));
			}
		}
		

			
		
	}

	public void añadirLibro(Libro nuevoLibro) {

		this.libros.add(nuevoLibro);
	}

	public void añadirRevista(Revista nuevaRevista) {

		this.revistas.add(nuevaRevista);
	}

	public void eliminarLibro(String codigo) {

		int indice = buscarIndiceDeLibro(codigo);

		if (indice == -1) {

			System.out.println("No existe ningún libro con ese código.");

		} else {

			this.libros.remove(indice);
		}
	}

	public void eliminarRevista(String codigo) {

		int indice = buscarIndiceDeRevista(codigo);

		if (indice == -1) {

			System.out.println("No existe ninguna revista con ese código.");

		} else {

			this.revistas.remove(indice);
		}
	}

	public void pedirPrestadoUnLibro(String codigo) {

		int indice = buscarIndiceDeLibro(codigo);

		if (indice == -1) {

			System.out.println("No existe ningún libro con ese código.");

		} else {

			if (this.libros.get(indice).prestado()) {

				System.out.println("Lo sentimos, ese libro ya ha sido prestado.");

			} else {

				this.libros.get(indice).prestar();
			}
		}
	}

	public void pedirPrestadaUnaRevista(String codigo) {

		int indice = buscarIndiceDeRevista(codigo);

		if (indice == -1) {

			System.out.println("No existe ninguna revista con ese código.");

		} else {

			if (this.revistas.get(indice).prestado()) {

				System.out.println("Lo sentimos, esa revista ya ha sido prestada.");

			} else {

				this.revistas.get(indice).prestar();
			}
		}
	}

	public void devolverLibro(String codigo) {

		int indice = buscarIndiceDeLibro(codigo);

		if (indice == -1) {

			System.out.println("Lo sentimos, ese libro no es de nuestra biblioteca.");

		} else {

			this.libros.get(indice).devolver();
		}
	}

	public void devolverRevista(String codigo) {

		int indice = buscarIndiceDeRevista(codigo);

		if (indice == -1) {

			System.out.println("Lo sentimos, esa revista no es de nuestra biblioteca.");

		} else {

			this.revistas.get(indice).devolver();
		}
	}

	private int buscarIndiceDeLibro(String codigo) {

		int indice = -1;

		for (int i = 0; i < this.libros.size(); i++) {

			if (this.libros.get(i).getCodigo().equals(codigo)) {

				indice =  i;
				break;
			}
		}

		return indice;
	}

	private int buscarIndiceDeRevista(String codigo) {

		int indice = -1;

		for (int i = 0; i < this.revistas.size(); i++) {

			if (this.revistas.get(i).getCodigo().equals(codigo)) {

				indice = i;
				break;
			}
		}

		return indice;
	}

}
