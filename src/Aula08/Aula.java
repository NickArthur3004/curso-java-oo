package Aula08;

public class Aula {

	public static void main(String[] args) {
		
		String titulo = "Java 1";
		String autor = "beltrano";
		int paginas = 50;
		boolean lan�amento = false;
		
		Livro l1= new Livro(titulo, autor, paginas, lan�amento);
		
		System.out.println(l1);

	}

}
