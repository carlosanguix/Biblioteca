package biblioteca;

import java.util.Date;

public abstract class Publicacion {


	private String codigo;
	private String titulo;
	private int añoPublicacion;
	
	
	public Publicacion(String codigo, String titulo, int añoPublicacion) {
		
		this.codigo         = codigo;
		this.titulo         = titulo;
		this.añoPublicacion = añoPublicacion;
	}
	
	
	public String getCodigo() {
		
		return codigo;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Código: " + codigo + 
				"\nTítulo: " + titulo + 
				"\nAño de publicación: " + añoPublicacion;
	}
	
	
}
