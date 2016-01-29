package com.ejercicio.uno;

public class Libro {

	private String titulo;
	private String autor;
	private int anioPublicacion;
	private String editorial;

	public Libro(String titulo, String autor, int anioPublicacion, String editorial) {
		setTitulo(titulo);
		setAnioPublicacion(anioPublicacion);
		setAutor(autor);
		setEditorial(editorial);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getInfo() {
		String info = new String();
		
		info="Título: "+getTitulo()+"\n Autor: "+getAutor()+"\n Año de Publicación: "+getAnioPublicacion()+"\n Editorial: "+getEditorial();
		return info;
	}
}
