package Aula08;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	private boolean lan�amento;
	
	public Livro() {
	}
	
	

	public Livro(String titulo, String autor, int paginas, boolean lan�amento) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lan�amento = lan�amento;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public boolean isLan�amento() {
		return lan�amento;
	}

	public void setLan�amento(boolean lan�amento) {
		this.lan�amento = lan�amento;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", lan�amento=" + lan�amento
				+ "]";
	}
	
	

}
