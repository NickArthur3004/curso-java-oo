package Aula08;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	private boolean lanšamento;
	
	public Livro() {
	}
	
	

	public Livro(String titulo, String autor, int paginas, boolean lanšamento) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lanšamento = lanšamento;
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

	public boolean isLanšamento() {
		return lanšamento;
	}

	public void setLanšamento(boolean lanšamento) {
		this.lanšamento = lanšamento;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", lanšamento=" + lanšamento
				+ "]";
	}
	
	

}
