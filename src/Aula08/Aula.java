package Aula08;

public class Aula {

	public static void main(String[] args) {
		
		String titulo = "Java 1";
		String autor = "beltrano";
		int paginas = 50;
		boolean lançamento = false;
		
		Livro l1= new Livro(titulo, autor, paginas, lançamento);
		
		System.out.println(l1);

	}

}
