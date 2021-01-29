package Aula08;

public class Livro {

	private String titulo;
	private String autor;
	private int paginas;
	private boolean lançamento;
	
	public Livro() {
	}
	
	

	public Livro(String titulo, String autor, int paginas, boolean lançamento) {
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.lançamento = lançamento;
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

	public boolean isLançamento() {
		return lançamento;
	}

	public void setLançamento(boolean lançamento) {
		this.lançamento = lançamento;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", lançamento=" + lançamento
				+ "]";
	}
	
	

}
