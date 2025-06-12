package entities;

public class Livro {
	
	private String titulo;
	private String autor;
	private int codigoDoLivro;
	
	public Livro(String titulo, String autor, int codigoDoLivro){
		this.titulo = titulo;
		this.autor = autor;
		this.codigoDoLivro = codigoDoLivro;
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
	
	public int getCodigoDoLivro() {
		return codigoDoLivro;
	}

	public void setCodigoDoLivro(int codigoDoLivro) {
		this.codigoDoLivro = codigoDoLivro;
	}

	@Override
	public String toString() {
		return "Código: " + codigoDoLivro + " | Titulo: " + titulo + " | Autor: " + autor;
	}
}
