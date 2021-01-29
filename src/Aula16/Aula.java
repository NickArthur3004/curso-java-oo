package Aula16;

public class Aula {
	
	static String name = "Ana";
	String sobrenome = "monteiro";
	
	void imprimi() {
		System.out.println(name+ " "+ sobrenome);
	}

	public static void main(String[] args) {
		
		new Aula().imprimi();
		//System.out.println(name+ " "+ new Aula().sobrenome);
		
		show();
		
		MyClasse my = new MyClasse();
		my.imprimi();
		
		MyClasse.show();

	}

	static void show() {
		System.out.println(name+ " "+ new Aula().sobrenome);
	}
}
