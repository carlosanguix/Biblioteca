package biblioteca;

import java.util.Scanner;

public class Principal {

	public static void imprimirCabeceraPrograma() {

		System.out.println("	***********************************");
		System.out.println("	BIENVENIDO A LA BIBLIOTECA NACIONAL");
		System.out.println("	***********************************");
	}

	public static void imprimirCabeceraListarBiblioteca() {
		
		System.out.println("\n	LIBROS Y REVISTAS DE LA BIBLIOTECA");
		System.out.println("	----------------------------------");
	}
	
	public static void imprimirCabeceraAñadirLibro() {

		System.out.println("\n	AÑADIR NUEVO LIBRO A LA BIBLIOTECA");
		System.out.println("	----------------------------------");
	}

	public static void imprimirCabeceraEliminarLibro() {

		System.out.println("\n	ELIMINAR LIBRO DE LA BIBLIOTECA");
		System.out.println("	-------------------------------");
	}

	public static void imprimirCabeceraAñadirRevista() {

		System.out.println("\n	AÑADIR NUEVA REVISTA A LA BIBLIOTECA");
		System.out.println("	------------------------------------");
	}

	public static void imprimirCabeceraEliminarRevista() {

		System.out.println("\n	ELIMINAR REVISTA DE LA BIBLIOTECA");
		System.out.println("	---------------------------------");
	}

	public static void imprimirCabeceraAlquilarLibro() {

		System.out.println("\n	PEDIR PRESTADO UN LIBRO DE LA BIBLIOTECA");
		System.out.println("	----------------------------------------");
	}

	public static void imprimirCabeceraDevolverLibro() {

		System.out.println("\n	DEVOLVER UN LIBRO A LA BIBLIOTECA");
		System.out.println("	---------------------------------");
	}

	public static void imprimirCabeceraAlquilarRevista() {

		System.out.println("\n	PEDIR PRESTADA UNA REVISTA DE LA BIBLIOTECA");
		System.out.println("	-------------------------------------------");
	}

	public static void imprimirCabeceraDevolverRevista() {

		System.out.println("\n	DEVOLVER UNA REVISTA A LA BIBLIOTECA");
		System.out.println("	------------------------------------");
	}
	
	public static void menuPrincipal() {

		System.out.println("\n		MENU");
		System.out.println("		----");
		System.out.println("	1- Listar biblioteca");
		System.out.println("	2- Añadir libro.");
		System.out.println("	3- Eliminar libro.");
		System.out.println("	4- Añadir revista.");
		System.out.println("	5- Eliminar revista.");
		System.out.println("	6- Pedir prestado un libro.");
		System.out.println("	7- Devolver libro.");
		System.out.println("	8- Pedir prestada una revista.");
		System.out.println("	9- Devolver revista.");
		System.out.print("\n	Opción: ");

	}

	public static Libro crearLibro() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Código: ");
		String codigo = sc.nextLine();
		System.out.print("Título: ");
		String titulo = sc.nextLine();
		// TRY, CATCH
		System.out.print("Año de publicación: ");
		int añoPublicacion = sc.nextInt();

		Libro nuevoLibro = new Libro(codigo, titulo, añoPublicacion);

		return nuevoLibro;
	}

	public static Revista crearRevista() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Código: ");
		String codigo = sc.nextLine();
		System.out.print("Título: ");
		String titulo = sc.nextLine();
		// TRY, CATCH
		System.out.print("Año de publicación: ");
		int añoPublicacion = sc.nextInt();

		Revista nuevaRevista = new Revista(codigo, titulo, añoPublicacion);

		return nuevaRevista;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Biblioteca biblioteca = new Biblioteca();
		String codigo;

		imprimirCabeceraPrograma();

		while (true) {

			menuPrincipal();
			int opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:

				imprimirCabeceraListarBiblioteca();
				biblioteca.listarBiblioteca();

				break;

			case 2:

				imprimirCabeceraAñadirLibro();
				Libro nuevoLibro = crearLibro();
				biblioteca.añadirLibro(nuevoLibro);

				break;

			case 3:

				imprimirCabeceraEliminarLibro();
				System.out.print("Código: ");
				codigo = sc.nextLine();
				biblioteca.eliminarLibro(codigo);

				break;

			case 4:

				imprimirCabeceraAñadirRevista();
				Revista nuevaRevista = crearRevista();
				biblioteca.añadirRevista(nuevaRevista);

				break;

			case 5:

				imprimirCabeceraEliminarRevista();
				System.out.print("Código: ");
				codigo = sc.nextLine();
				biblioteca.eliminarRevista(codigo);

				break;

			case 6:

				imprimirCabeceraAlquilarLibro();
				System.out.print("Código: ");
				codigo = sc.nextLine();
				biblioteca.pedirPrestadoUnLibro(codigo);

				break;

			case 7:

				imprimirCabeceraDevolverLibro();
				System.out.print("Código: ");
				codigo = sc.nextLine();
				biblioteca.devolverLibro(codigo);
				
				break;

			case 8:

				imprimirCabeceraAlquilarRevista();
				System.out.print("Código: ");
				codigo = sc.nextLine();
				biblioteca.pedirPrestadaUnaRevista(codigo);

				break;

			case 9:

				imprimirCabeceraDevolverRevista();
				System.out.println("Código: ");
				codigo = sc.nextLine();
				biblioteca.devolverRevista(codigo);

				break;

			case 0:

				System.exit(0);

				break;

			default:



				break;
			}

		}

	}

}
